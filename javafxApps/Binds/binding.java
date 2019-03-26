import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import java.io.File;


public class binding extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Binds!");

        TextField input = new TextField();
        input.setPromptText("Type Anything!");

        Label text = new Label();
        text.textProperty().bind(input.textProperty()); //This will monitor the input textfield for changes and will assign those changes too itself

        VBox layout = new VBox(8);
        layout.getChildren().addAll(input, text);
        layout.setPadding(new Insets(30,30,30,30));

        Scene scene = new Scene(layout, 300, 300);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
    

}