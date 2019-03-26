import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

public class Main extends Application{
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Properties... WITH BINDS!!!");


        //Inputs
        TextField userInput = new TextField();
        userInput.setMaxWidth(200);

        Label firstLabel = new Label("Welcome to the site ");
        Label secondLabel = new Label("");
        
        secondLabel.textProperty().bind(userInput.textProperty());

        HBox bottomText = new HBox(firstLabel, secondLabel);
        bottomText.setAlignment(Pos.CENTER);

        Button submit = new Button("Submit");
        submit.setOnAction(e -> {
            Boolean close = win.view("Submit", "Are you finished?");
            if(close){
                primaryStage.close();
            }
        });

        VBox vb = new VBox(10, userInput, bottomText, submit);
        vb.setAlignment(Pos.CENTER);

        

        Scene scene = new Scene(vb, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}