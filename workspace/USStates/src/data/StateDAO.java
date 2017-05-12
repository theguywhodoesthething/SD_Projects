package data;

public interface StateDAO {
  public State getStateByName(String name);
  public State getStateByAbbreviation(String abbreviation);
  public State getStateById(String id);
  public void addState(State state);
}