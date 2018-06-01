package org.dilithium.gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class SettingsPane extends AnchorPane {
	
	/**
	 * Constructor - Creates the SettingsPane, links it to its fxml
	 */
	public SettingsPane() {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/SettingsPane.fxml"));
		fxmlLoader.setRoot(this);
		
		try {
			fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Give the controller access to the main app.
		SettingsPaneController controller = (SettingsPaneController) fxmlLoader.getController();
		controller.setMainApp(this);

	}
	
}
