package home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;

public class Main extends Application {

    double x = 0;
    double y = 0;
    @Override
    public void start(Stage stage) throws Exception{

        Image icon = new Image("home/icons/icon.png");

        URL url = getClass().getClassLoader().getResource("home/fxml/Main.fxml");
        Parent root = FXMLLoader.load(Objects.requireNonNull(url));
        Scene sc = new Scene(root);
        stage.setTitle("Animal Choir");
        stage.getIcons().add(icon);
        stage.setScene(sc);
        stage.show();

        // set min size
        stage.setMinWidth(stage.getWidth());
        stage.setMinHeight(stage.getHeight());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
