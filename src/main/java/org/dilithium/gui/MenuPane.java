package org.dilithium.gui;

import java.net.URL;

import javax.swing.ImageIcon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MenuPane extends Application {

	static BorderPane root;
	
	@SuppressWarnings("restriction")
	public void start(Stage stage) throws Exception {

        

	        FXMLLoader loader = new FXMLLoader();
	        loader.setController(new MenuPaneController());
	        loader.setLocation(getClass().getResource("/fxml/MenuPane.fxml"));
	        root = loader.load();

		
		
        Scene scene = new Scene(root, 800, 500);
        //Set Windows & Linux task bar and top app bar icons + top bar icon on OSX
        stage.getIcons().add(new Image(MenuPane.class.getResourceAsStream("/images/icon.png")));
        // Try set OSX taskbar icon
        try {
            URL iconURL = MenuPane.class.getResource("/images/icon.png");
            java.awt.Image image = new ImageIcon(iconURL).getImage();
            com.apple.eawt.Application.getApplication().setDockIconImage(image);
        } catch (Exception e) {
            // Won't work on Windows or Linux.
        }
        
        stage.setTitle("Dilithium");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
	
	static BorderPane getRoot(){
		return root;
	}
}
