package com.tiilaz.Demo01;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class HelloController{
	@FXML
	private Button sayHelloButton;
	@FXML
	private TextArea textHello;
	@Override
	 
	public void sayHello(ActionEvent event) {
	textHello.setText("Hello World");
	}

}
