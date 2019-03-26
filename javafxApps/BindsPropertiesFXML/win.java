import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

public class win extends Application {

   private static boolean response;

   public static boolean view(String title, String message){
       //Setup stage
       Stage stage = new Stage();
       stage.setTitle(title);
       stage.initModality(Modality.APPLICATION_MODAL);

       //Set label
       Label msg = new Label();
       msg.setText(message);
      
       //Initialize buttons
       Button yesBtn = new Button("Yes");
       yesBtn.setOnAction(e -> {
           response = true;
           stage.close();
       });

       Button noBtn = new Button("No");
       noBtn.setOnAction(e -> {
           response = false;
           stage.close();
       });

       //create layout and set it up
       VBox layout = new VBox(10);
       layout.setAlignment(Pos.CENTER);

       layout.getChildren().addAll(msg, yesBtn, noBtn);

       //Create new Scene and set it up
       Scene scene = new Scene(layout, 300, 250);
      
       //Set stage scene
       stage.setScene(scene);
       stage.showAndWait();

       return response;
   }
}



