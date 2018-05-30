package org.dilithium.gui;

import java.awt.Desktop;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

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
		BlockExplorerPane blockExplorerPane;
		BlockExplorerPaneController blockExplorerPaneController;
		SettingsPane settingsPane;
		SettingsPaneController settingsPaneController;
		ConsolePane consolePane;
		ConsolePaneController consolePaneController;
		
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
		
		//Open Github, Twitter or Facebook Links is users default browser
		public static boolean openWebpage(URI uri) {
		    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
		    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
		        try {
		            desktop.browse(uri);
		            return true;
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		    return false;
		}

		public static boolean openWebpage(URL url) {
		    try {
		        return openWebpage(url.toURI());
		    } catch (URISyntaxException e) {
		        e.printStackTrace();
		    }
		    return false;
		}
		
		// Singleton Pattern
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
			if (blockExplorerPane == null) {
				blockExplorerPane = new BlockExplorerPane();
			}
			if (blockExplorerPaneController == null) {
				blockExplorerPaneController = new BlockExplorerPaneController();
			}
			if (settingsPane == null) {
				settingsPane = new SettingsPane();
			}
			if (settingsPaneController == null) {
				settingsPaneController = new SettingsPaneController();
			}
			if (consolePane == null) {
				consolePane = new ConsolePane();
			}
			if (consolePaneController == null) {
				consolePaneController = new ConsolePaneController();
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
	  		mainMenuPane.setCenter(blockExplorerPane); 
		}
	  	
	  	@FXML
		public void onSettingsClick() {
	  		setTextColor("Settings");
	  		mainMenuPane.setCenter(settingsPane); 
		}
	  	
	  	@FXML
		public void onConsoleClick() {
	  		setTextColor("Console");
	  		mainMenuPane.setCenter(consolePane); 
		}
	  	
	  	@FXML
		public void onGithubClick() {
	  		try {
				openWebpage(new URL("https://github.com/CryptoKass/dilithium"));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	  	
	  	@FXML
		public void onTwitterClick() {
	  		try {
				openWebpage(new URL("https://github.com/CryptoKass/dilithium"));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	  	
	  	@FXML
		public void onFacebookClick() {
	  		try {
				openWebpage(new URL("https://github.com/CryptoKass/dilithium"));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	  	
}
