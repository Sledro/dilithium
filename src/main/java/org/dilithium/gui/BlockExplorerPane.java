package org.dilithium.gui;

import java.io.IOException;
import java.util.logging.Level;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import org.dilithium.util.Log;

public class BlockExplorerPane extends AnchorPane {
	
	/**
	 * Constructor - Creates the BlockExplorerPane, links it to its fxml
	 */
	public BlockExplorerPane() {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/BlockExplorerPane.fxml"));
		fxmlLoader.setRoot(this);
		
		try {
			fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Give the controller access to the main app.
		BlockExplorerPaneController controller = (BlockExplorerPaneController) fxmlLoader.getController();
		controller.setMainApp(this);
	}
	
}
