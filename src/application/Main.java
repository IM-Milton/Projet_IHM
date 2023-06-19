package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.image.Image;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		FlowPane root = new FlowPane();
		App app = new App();
		Image img = new Image("Images/IconFantasy.png") ;
		//app.setStyle("-fx-background-color: black;");
		root.getChildren().add(app);
		primaryStage.getIcons().addAll(img);
		primaryStage.setTitle("Game Fantasys");
		primaryStage.setScene(new Scene(root, 700, 650));
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
