package org.dilithium.gui;


public class SettingsPaneController {

	private SettingsPane SettingsPane;
	
	/**
	 * Is called by the main application to give a reference back to itself.
	 * @param OverviewPane 
	 * 
	 * @param mainApp
	 */
	public void setMainApp(SettingsPane SettingsPane) {
		this.SettingsPane = SettingsPane;
	}

	public SettingsPane getSettingsPane() {
		return SettingsPane;
	}

	public void setSettingsPane(SettingsPane settingsPane) {
		this.SettingsPane = settingsPane;
	}
	
	
	
	
}
