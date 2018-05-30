package org.dilithium.gui;


public class OverviewPaneController {

	private OverviewPane OverviewPane;
	
	/**
	 * Is called by the main application to give a reference back to itself.
	 * @param OverviewPane 
	 * 
	 * @param mainApp
	 */
	public void setMainApp(OverviewPane OverviewPane) {
		this.OverviewPane = OverviewPane;
	}

	public OverviewPane getOverviewPane() {
		return OverviewPane;
	}

	public void setOverviewPane(OverviewPane overviewPane) {
		this.OverviewPane = overviewPane;
	}
	
	
	
	
}
