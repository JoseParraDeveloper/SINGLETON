package singleton.implementation.eager;

import java.util.ArrayList;
import java.util.List;

public class LoggerEager {

	// Builds the instance variable once loaded the LoggerEager class
	private static LoggerEager logger = new LoggerEager();

	private List<String> listLogs;

	private LoggerEager() {
		super();
		this.listLogs = new ArrayList<>();
	}

	public static LoggerEager getLogger() {
		return logger;
	}

	public void addLog(String log) {
		this.listLogs.add(log);
	}

	public String getLogs() {
		return listLogs.toString();
	}

	public void clearLogs() {
		this.listLogs.clear();
	}

}
