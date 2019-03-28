import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.util.Duration;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application {

    Stage window;
    Scene mainWindow;


    public static void main(String[] args){
        launch(args);
    }

    public static int tayPoints;


    public static int upgrade1 = 0;
    Timer timer1 = new Timer();


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Big OOOF");

        tayPoints = 0;

        //Objects
        Label label1 = new Label("Taypoints Simulator");

        Button btn2 = new Button("Get Taypoints!");
        Button btn1 = new Button("About!");
        Label label2 = new Label("Taypoints: " + tayPoints);
        Button btn3 = new Button("Farming Robot: " + upgrade1);
        Button btn4 = new Button("Enable Button 3");
        btn1.setOnAction(event -> AboutWindow.display("BIG OOOFERS"));


            Label upgradeLabel = new Label("Upgrades: ");

            //Layout
            BorderPane bPane = new BorderPane();
            HBox hbox = new HBox();
            VBox mainGame = new VBox();
            VBox upgradeWindow = new VBox();


            bPane.setCenter(mainGame);
            bPane.setTop(hbox);
            bPane.setLeft(upgradeWindow);

            hbox.getChildren().add(btn1);
            hbox.setSpacing(10);
            hbox.setPadding(new Insets(10, 10, 10, 10));

            /*new AnimationTimer(){
                public void handle(long now){



                }

            }.start();*/

            final Timeline timeline = new Timeline(new KeyFrame(Duration.ZERO, event -> {
                label2.setText("Taypoints:" + tayPoints);
                btn2.setOnAction(s -> label2.setText("Taypoints: " + ++tayPoints));
                btn3.setOnAction(s -> {tayPoints = tayPoints - 10; upgrade1++; System.out.println(upgrade1); btn4.setText("Farming Robot: " + upgrade1);});
                if (upgrade1 >= 1){
                    tayPoints = tayPoints + upgrade1;
                }
            }), new KeyFrame(Duration.seconds(1)));



            mainGame.getChildren().addAll(label1, label2, btn2);
            mainGame.setAlignment(Pos.CENTER);
            mainGame.setSpacing(10);
            mainGame.setPadding(new Insets(0, 0, 0, -100));

            upgradeWindow.getChildren().addAll(upgradeLabel, btn3);
            upgradeWindow.setPadding(new Insets(10, 10, 10, 10));


            Scene scene = new Scene(bPane, 500, 500);



        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        window.setScene(scene);
        window.show();
    }

    public void gitHub(){
        getHostServices().showDocument("https://github.com/wetpatootie");
    }
}