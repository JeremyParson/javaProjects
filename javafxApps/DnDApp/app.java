package DnDApp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import java.io.File;
import DnDApp.Person;

public class app extends Application {
    public static void main(String[] args){
        launch(args);
    }


    public void start(Stage primaryStage){
        primaryStage.setTitle("Test");

        Person jeremy = new Person();
        jeremy.firstNamProperty().addListener((v, oldvalue, newValue) -> {
            System.out.println("Name change to " + newValue);
            System.out.println("firstNameProperty():" + jeremy.firstNamProperty());
            System.out.println("getFirstName():" + jeremy.getFirstname());
        });
        


        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20,20,20,50));
        grid.setVgap(8);
        grid.setHgap(10);


        Label lblUsername = new Label("Username");
        GridPane.setConstraints(lblUsername, 0, 0);
        

        TextField txtUsername = new TextField();
        txtUsername.setPromptText("Username");
        GridPane.setConstraints(txtUsername, 0, 1);

        Label lblPassword = new Label("Password");
        GridPane.setConstraints(lblPassword, 0, 2);

        TextField txtPassword = new TextField();
        txtPassword.setPromptText("Password");
        GridPane.setConstraints(txtPassword, 0, 3);

        Button btnLogin = new Button("Login");
        GridPane.setConstraints(btnLogin, 0, 4);
        btnLogin.setOnAction(e -> {
            jeremy.setFirstname(txtUsername.getText());
        });

        grid.getChildren().addAll(lblUsername, txtUsername, lblPassword, txtPassword, btnLogin);
        
        Scene scene = new Scene(grid, 300, 300);
        // scene.getStylesheets().add(getClass().getResource("../css/style.css").toExternalForm());

        File tmpDir = new File("Viper.css");
        System.out.println(tmpDir.exists());

        scene.getStylesheets().add("Viper.css");

        primaryStage.setScene(scene);
        

        primaryStage.show();
    }

}