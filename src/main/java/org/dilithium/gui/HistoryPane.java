package org.dilithium.gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class HistoryPane extends AnchorPane {
	
	/**
	 * Constructor - Creates the Connection Pane, links it to its fxml
	 */
	public HistoryPane() {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/HistoryPane.fxml"));
		fxmlLoader.setRoot(this);
		
		try {
			fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Give the controller access to the main app.
		HistoryPaneController controller = (HistoryPaneController) fxmlLoader.getController();
		controller.setMainApp(this);
		

		System.out.println("HistoryPaneController: Constructor");

	}
	
}
