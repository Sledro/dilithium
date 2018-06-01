package org.dilithium.gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class ConsolePane extends AnchorPane {
	
	/**
	 * Constructor - Creates the ConsolePane, links it to its fxml
	 */
	public ConsolePane() {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/ConsolePane.fxml"));
		fxmlLoader.setRoot(this);
		
		try {
			fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Give the controller access to the main app.
		ConsolePaneController controller = (ConsolePaneController) fxmlLoader.getController();
		controller.setMainApp(this);

	}
	
}
