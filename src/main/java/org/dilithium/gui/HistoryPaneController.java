package org.dilithium.gui;


public class HistoryPaneController {

	private HistoryPane HistoryPane;
	
	/**
	 * Is called by the main application to give a reference back to itself.
	 * @param OverviewPane 
	 * 
	 * @param mainApp
	 */
	public void setMainApp(HistoryPane HistoryPane) {
		this.HistoryPane = HistoryPane;
	}

	public HistoryPane getSendFundsPane() {
		return HistoryPane;
	}

	public void setOverviewPane(HistoryPane historyPane) {
		this.HistoryPane = historyPane;
	}

}
