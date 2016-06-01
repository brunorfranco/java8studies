package com.bruno.javafx8;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class MyController implements Initializable {

	@FXML
	private TextField username;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
	
	public void okAction(ActionEvent event){
		System.out.println("Clicked ok");
		System.out.println("username = " + username.getText());
	}

}
