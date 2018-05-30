package org.dilithium.gui;


public class SendFundsPaneController {

	private SendFundsPane SendFundsPane;
	
	/**
	 * Is called by the main application to give a reference back to itself.
	 * @param OverviewPane 
	 * 
	 * @param mainApp
	 */
	public void setMainApp(SendFundsPane SendFundsPane) {
		this.SendFundsPane = SendFundsPane;
	}

	public SendFundsPane getSendFundsPane() {
		return SendFundsPane;
	}

	public void setOverviewPane(SendFundsPane sendFundsPane) {
		this.SendFundsPane = sendFundsPane;
	}
	
	
	
	
}
