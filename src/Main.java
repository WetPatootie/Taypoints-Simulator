import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Main extends Application {

    Stage window;
    Scene mainWindow;


    public static void main(String[] args){
        launch(args);
    }

    public static int tayPoints = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Big OOOF");


        Label label1 = new Label("Taypoints Simulator");
        Label label2 = new Label("Taypoints: " + tayPoints);
        Button btn2 = new Button("Get Taypoints!");
        Button btn1 = new Button("About!");
        btn1.setOnAction(event -> AboutWindow.display("BIG OOOFERS"));
        btn2.setOnAction(event -> label2.setText("Taypoints: " + tayPoints++));



        VBox layout = new VBox();
        layout.getChildren().addAll(label1,label2, btn1, btn2);
        layout.setAlignment(Pos.CENTER);
        Scene scene1 = new Scene(layout, 300, 300);
        window.setScene(scene1);
        window.show();
    }



    public void gitHub(){
        getHostServices().showDocument("https://github.com/wetpatootie");
    }

}


