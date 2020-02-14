import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader root = new FXMLLoader(getClass().getResource("root.fxml"));

        primaryStage.setTitle("Basic Example");
        primaryStage.setScene(new Scene(root.load(), 300, 275));
        primaryStage.show();
    }
}
