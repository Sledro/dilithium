package org.dilithium.gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class SendFundsPane extends AnchorPane {
	
	/**
	 * Constructor - Creates the SendFundsPane, links it to its fxml
	 */
	public SendFundsPane() {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/SendFundsPane.fxml"));
		fxmlLoader.setRoot(this);
		
		try {
			fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Give the controller access to the main app.
		SendFundsPaneController controller = (SendFundsPaneController) fxmlLoader.getController();
		controller.setMainApp(this);

	}
	
}
