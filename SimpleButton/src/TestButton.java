import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TestButton extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		VBox root = new VBox(10);
		Scene scene = new Scene(root,400,600,Color.BLUE);
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
