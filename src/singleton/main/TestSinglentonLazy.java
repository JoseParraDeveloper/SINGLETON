package singleton.main;

import singleton.implementation.lazy.LoggerLazy;

public class TestSinglentonLazy {

	public static void main(String[] args) {

		LoggerLazy myLogger = LoggerLazy.getLogger();

		myLogger.addLog("STARTING WITH THE TEST");

		myLogger.addLog("ADDING THE LOG NUMBER 1");

		myLogger.addLog("ADDING THE LOG NUMBER 2");

		myLogger.addLog("FINISHED WITH THE TEST");

		String logs = myLogger.getLogs();

		System.out.println(logs);

		LoggerLazy myLogger2 = LoggerLazy.getLogger();

		String logsMyLogger2 = myLogger2.getLogs();

		System.out.println(logsMyLogger2);

		myLogger.clearLogs();

		System.out.println(myLogger.getLogs());

		System.out.println(myLogger2.getLogs());

	}

}
