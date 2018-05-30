package org.dilithium.gui;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class MenuPaneController {
	
		@FXML private Text overview, sendFunds, history, blockExplorer, settings, console;
		@FXML private Text[] buttonsArray;
		@FXML BorderPane mainMenuPane;
		OverviewPaneController overviewPaneController;
		OverviewPane overviewPane;
		SendFundsPane sendFundsPane;
		SendFundsPaneController sendFundsPaneController; 
		HistoryPane historyPane;
		HistoryPaneController historyPaneController;
		
		// Sets the selected text white (Active Tab)
		public void setTextColor(String selectedButton){
			buttonsArray = new Text[] {overview,sendFunds,history,blockExplorer,settings,console};
			for (Text button : buttonsArray) {
				  if (button.getText().equals(selectedButton)) {
					  button.setFill(Color.WHITE);
				  }
				  else {
					  button.setFill(Color.DARKGREY);
				  }
				}
		}
		
		public MenuPaneController() {
			if (overviewPane == null) {
				overviewPane = new OverviewPane();
			}
			if (overviewPaneController == null) {
				overviewPaneController = new OverviewPaneController();
			}
			if (sendFundsPane == null) {
				sendFundsPane = new SendFundsPane();
			}
			if (sendFundsPaneController == null) {
				sendFundsPaneController = new SendFundsPaneController();
			}
			if (historyPane == null) {
				historyPane = new HistoryPane();
			}
			if (historyPaneController == null) {
				historyPaneController = new HistoryPaneController();
			}
		}
		
	  	@FXML
		public void onOverviewClick() {
	  		setTextColor("Overview");
	  		mainMenuPane.setCenter(overviewPane); 
		}
	  	
	  	@FXML
		public void onSendFundsClick() {
	  		setTextColor("Send Funds");
	  		mainMenuPane.setCenter(sendFundsPane); 
		}
	 
	  	@FXML
		public void onHistoryClick() {
	  		setTextColor("History");
	  		mainMenuPane.setCenter(historyPane); 
		}
	  	
	  	@FXML
		public void onBlockExplorerClick() {
	  		setTextColor("Block Explorer");
		}
	  	
	  	@FXML
		public void onSettingsClick() {
	  		setTextColor("Settings");
		}
	  	
	  	@FXML
		public void onConsoleClick() {
	  		setTextColor("Console");
		}
}
