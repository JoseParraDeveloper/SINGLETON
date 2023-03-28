package singleton.implementation.lazy;

import java.util.ArrayList;
import java.util.List;

public class LoggerLazy {

	private static LoggerLazy logger;

	private List<String> listLogs;

	private LoggerLazy() {
		super();
		this.listLogs = new ArrayList<>();
	}

	public static LoggerLazy getLogger() {

		if (logger == null) {
			logger = new LoggerLazy();
		}

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
