package nirvana.solver;

import java.util.Set;

public interface ParameterContainable {
	public <T> void setParameter(String name, Class<T> type, T value);
	public <T> T getParameter(String name, Class<T> type);
	public int getNumberOfParameters();
	public Set<String> getParameterNames();

}
