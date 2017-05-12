package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

public class StateDAOImpl implements StateDAO {
  private static final String FILE_NAME="/WEB-INF/states.csv";
  private List<State> states = new ArrayList<>();
  /*
   * Use Autowired to have Spring inject an instance
   * of a WebApplicationContext into this object after
   * creation.  We will use the WebApplicationContext to
   * retrieve an ServletContext so we can read from a 
   * file.
   */
  @Autowired 
  private WebApplicationContext wac;

  /*
   * The @PostConstruct method is called by Spring after 
   * object creation and dependency injection
   */
  @PostConstruct
  public void init() {
    // Retrieve an input stream from the servlet context
    // rather than directly from the file system
    try (
        InputStream is = wac.getServletContext().getResourceAsStream(FILE_NAME);
        BufferedReader buf = new BufferedReader(new InputStreamReader(is));
      ) {
      String line = buf.readLine();
      while ((line = buf.readLine()) != null) {
        String[] tokens = line.split(",");
        String id = tokens[0];
        String abbrev = tokens[1];
        String name = tokens[2];
        String capital = tokens[3];
        String latitude = tokens[4];
        String longitude = tokens[5];
        int population = Integer.parseInt(tokens[6]);
        String bird = tokens[7];
        states.add(new State(id, abbrev, name, capital, latitude, longitude, population, bird));
      }
    } catch (Exception e) {
      System.err.println(e);
    }
  }

  @Override
  public State getStateByName(String name) {
    // TODO : Implement method
	  State state = null;
	  
	  for(State s : states){
		  if (s.getName().equals(name)){
			  state = s;
		  }
	  }
      
    return state;
  }
  @Override
  public State getStateByAbbreviation(String abbrev) {
	    // TODO : Implement method
		  State state = null;
		  
		  for(State s : states){
			  if (s.getAbbreviation().equals(abbrev)){
				  state = s;
			  }
		  }
	      
	    return state;
  }
  @Override
  public State getStateById(String id) {
	  // TODO : Implement method
	  State state = null;
	  Integer numId = Integer.parseInt(id);
	  
	  if(numId > states.size()) {
		  numId = 1;
	  } else if (numId < 1 ) {
		  numId = states.size();
	  }
	  
	  for(State s : states){
		  if (s.getId().equals(numId)){
			  state = s;
		  }
	  }
	  
	  return state;
  }
  @Override
  public void addState(State state) {
	  
	  this.states.add(state);

  }
}
