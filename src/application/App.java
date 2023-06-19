package application;


import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class App extends FlowPane {
	public App() {
		
		initUI();
		setStyle("-fx-background-color: black;");
		setVisible(true);
	}
	
	public void initUI() {
		Label lab = new Label();
		
		Pane pane = new Pane();
		HBox south = new HBox();
		pane.setPrefSize(650, 620);
		
		south.setPrefSize(700, 30);
		//south.setPadding(new Insets(0,10,0,10));
		//south.set;
		south.setStyle("-fx-background-color: red;");
		
		this.getChildren().addAll(pane,south);
		
		
	}

}
