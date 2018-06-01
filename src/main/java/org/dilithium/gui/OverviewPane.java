package org.dilithium.gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class OverviewPane extends AnchorPane {
	
	/**
	 * Constructor - Creates the OverviewPane, links it to its fxml
	 */
	public OverviewPane() {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/OverviewPane.fxml"));
		fxmlLoader.setRoot(this);
		
		try {
			fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Give the controller access to the main app.
		OverviewPaneController controller = (OverviewPaneController) fxmlLoader.getController();
		controller.setMainApp(this);

	}
	
}
