package SAVE;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.input.MouseDragEvent;

import javafx.scene.input.MouseEvent;

import javafx.scene.canvas.Canvas;

import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseButton;

public class SampleController {
	@FXML
	private Canvas CanvFX;
	@FXML
	private Button but;
	
	@FXML
	public void onMouseDragged(MouseEvent event) {
		// TODO Autogenerated
		System.out.println("MouseD"+event.getButton().toString());
	}
	// Event Listener on ImageView.onMouseClicked
	@FXML
	public void onMonkey(MouseEvent event) {
		// TODO Autogenerated
		if(event.getButton()==MouseButton.PRIMARY){
			System.out.println("LeftMonkey");
		}
		if(event.getButton()==MouseButton.SECONDARY){
			System.out.println("RightMonkey");
		}
	}
	
	// Event Listener on Button[#but].onMouseClicked
	@FXML
	public void onBut(MouseEvent event) {
		// TODO Autogenerated
		System.out.println("ButClick");
	}


}
