package com.sd.web;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import com.sd.data.Jet;

public class JetsServletTests {
	private JetsServlet servlet;
	
	private MockHttpServletRequest req;
	private MockHttpServletResponse resp;
	
	@Before
	public void setUp(){
		req = new MockHttpServletRequest();
		resp = new MockHttpServletResponse();
		
		servlet = new JetsServlet();
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void test_all_jets_returned_as_jets_requestAttribute_when_id_requestParam_is_null(){
		try {
			servlet.doGet(req, resp);
			
			//Jets have been added as an attribute
			List<Jet> jets = (List<Jet>) req.getAttribute("jets");
			assertNotNull(jets);
			assertEquals(3, jets.size());
			assertEquals("SR-71", jets.get(0).getModel());
			assertEquals("F-16", jets.get(1).getModel());
			assertEquals("ShootyBoomy", jets.get(2).getModel());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}	
	}
	
	@Test
	/**
	 * This could have been included in the previous test, but testing one feature at a time is better.
	 */
	public void test_resultsJSP_forward_returned_when_id_requestParam_is_null(){
		try {
			servlet.doGet(req, resp);
			
			String loc = resp.getForwardedUrl();
			assertEquals("/results.jsp", loc);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void test_list_with_single_jet_returned_as_jets_requestAttribute_when_id_requestParam_is_integer(){
		try {
			req.setParameter("id", "3");
			servlet.doGet(req, resp);
			
			//Expected: list with a single jet
			List<Jet> jets = (List<Jet>) req.getAttribute("jets");
			assertNotNull(jets);
			assertEquals(1, jets.size());
			assertEquals("ShootyBoomy", jets.get(0).getModel());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}	
	}
	
	@Test
	public void test_resultsJSP_forward_returned_when_id_requestParam_is_integer(){
		try {
			req.setParameter("id", "3");
			servlet.doGet(req, resp);
			
			String loc = resp.getForwardedUrl();
			assertEquals("/results.jsp", loc);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void test_nonexistent_jet_id_forward_to_errorsJSP(){
		try {
			req.setParameter("id", "99");
			servlet.doGet(req, resp);
			
			//There should not be a List in the model
			List<Jet> jets = (List<Jet>) req.getAttribute("jets");
			assertNull(jets);
			String loc = resp.getForwardedUrl();
			assertEquals("/error.jsp", loc);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void test_non_integer_jet_id_forward_to_errorsJSP(){
		try {
			req.setParameter("id", "abcd");
			servlet.doGet(req, resp);
			
			//No List in model
			List<Jet> jets = (List<Jet>) req.getAttribute("jets");
			assertNull(jets);
			String loc = resp.getForwardedUrl();
			assertEquals("/error.jsp", loc);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}
	
	@Test
	public void test_post_not_supported_and_returns_405_status(){
		try {
			req.setProtocol("1.1"); //1.1, otherwise 400 is returned
			servlet.doPost(req, resp);
			
			assertEquals(405, resp.getStatus());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}
}
