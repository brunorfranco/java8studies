package com.bruno.javafx8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyApplicationLogin extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ihm.fxml")); //the fxml hasn't been create yet
		Parent root = loader.load();
		stage.setScene(new Scene(root));
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
