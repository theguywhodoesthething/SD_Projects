package controllers;

import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import data.State;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "StateControllerTests-context.xml" })
@WebAppConfiguration
public class StateControllerTests {
	MockMvc mockMvc;

	@Autowired
	WebApplicationContext wc;

	@Autowired
	StateController controller;

	MockStateDAO mockDAO;

	@Before
	public void setUp() {
		mockDAO = wc.getBean(MockStateDAO.class);

		// TODO - uncomment below to add a Mock object, which we control
		
		 controller.setStateDao(mockDAO);
		
		// TODO - build the MockMvc object with MockMvcBuilders
		 
		 this.mockMvc = MockMvcBuilders.webAppContextSetup(wc).build();

	}

	@After
	public void tearDown(){
		mockDAO.loadStates(); //cleanup
	}

	@Test
	public void test_GET_GetStateData_do_with_valid_name_param_returns_State() {
		try {
			MvcResult result = mockMvc.perform(get("/GetStateData.do").param("name", "Colorado"))
					.andExpect(status().isOk()).andReturn();
			ModelAndView mv = result.getModelAndView();
			assertEquals("result", mv.getViewName());
			ModelMap map = mv.getModelMap();
			assertNotNull(map.get("state"));

			State st = (State) map.get("state");
			assertEquals("Colorado", st.getName());
			assertEquals("CO", st.getAbbreviation());
			assertEquals("Denver", st.getCapital());
			assertEquals("3", st.getLatitude());
			assertEquals("4", st.getLongitude());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}

	@Test
	public void test_GET_GetStateData_do_with_invalid_name_param_returns_null() {
		try {
			MvcResult result = mockMvc.perform(get("/GetStateData.do").param("name", "Oklarado"))
					.andExpect(status().isOk()).andReturn();
			ModelAndView mv = result.getModelAndView();
			assertEquals("result", mv.getViewName());
			ModelMap map = mv.getModelMap();
			assertNull(map.get("state"));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}

	@Test
	public void test_GET_GetStateData_do_with_valid_abbr_param_returns_State() {
		try {
			MvcResult result = mockMvc.perform(get("/GetStateData.do").param("abbr", "CO"))
					.andExpect(status().isOk()).andReturn();
			ModelAndView mv = result.getModelAndView();
			assertEquals("result", mv.getViewName());
			ModelMap map = mv.getModelMap();
			assertNotNull(map.get("state"));

			State st = (State) map.get("state");
			assertEquals("Colorado", st.getName());
			assertEquals("CO", st.getAbbreviation());
			assertEquals("Denver", st.getCapital());
			assertEquals("3", st.getLatitude());
			assertEquals("4", st.getLongitude());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}

	@Test
	public void test_GET_GetStateData_do_with_invalid_abbr_param_returns_null() {
		try {
			MvcResult result = mockMvc.perform(get("/GetStateData.do").param("abbr", "XX"))
					.andExpect(status().isOk()).andReturn();
			ModelAndView mv = result.getModelAndView();
			assertEquals("result", mv.getViewName());
			ModelMap map = mv.getModelMap();
			assertNull(map.get("state"));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}

	@Test
	public void test_POST_NewState_do_adds_state() {
		try {
			MvcResult result = mockMvc.perform(post("/NewState.do").param("abbreviation", "PR")
					.param("name", "Puerto Rico").param("capital", "San Juan"))
					.andExpect(status().isOk()).andReturn();
			ModelAndView mv = result.getModelAndView();
			assertEquals("result", mv.getViewName());
			ModelMap map = mv.getModelMap();
			assertNotNull(map.get("state"));

			State st = (State) map.get("state");
			assertEquals("Puerto Rico", st.getName());
			assertEquals("PR", st.getAbbreviation());
			assertEquals("San Juan", st.getCapital());
			assertEquals(null, st.getLatitude());
			assertEquals(null, st.getLongitude());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}
}