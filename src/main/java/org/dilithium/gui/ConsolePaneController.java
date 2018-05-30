package org.dilithium.gui;


public class ConsolePaneController {

	private ConsolePane ConsolePane;
	
	/**
	 * Is called by the main application to give a reference back to itself.
	 * @param OverviewPane 
	 * 
	 * @param mainApp
	 */
	public void setMainApp(ConsolePane ConsolePane) {
		this.ConsolePane = ConsolePane;
	}

	public ConsolePane getConsolePane() {
		return ConsolePane;
	}

	public void setConsolePane(ConsolePane consolePane) {
		this.ConsolePane = consolePane;
	}
	
	
	
	
}
