
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
        Image image = new Image("file:C:\\Users\\Marten\\Documents\\GitHub\\MiniCalc\\src\\main\\resources\\calc.png");
        primaryStage.getIcons().add(image);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 300, 350));
        primaryStage.show();

    }


}