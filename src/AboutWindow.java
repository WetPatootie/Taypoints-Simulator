import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class AboutWindow {

    public static void display(String title){
        Stage window = new Stage();
        Main main = new Main();

        window.initModality(Modality.APPLICATION_MODAL); //Blocks other windows untill it closes
        window.setTitle("About!");
        window.setMinWidth(250);

        Label label1 = new Label();
        label1.setText("Taypoints Simulator v0.1");
        Label label2 = new Label("By WetPatootie yay!");

        Button closeButton = new Button("My Github!");
        closeButton.setOnAction(event -> main.gitHub());

        VBox layout1 = new VBox(10);
        layout1.getChildren().addAll(label1, label2, closeButton);
        layout1.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout1, 300, 300);
        window.setScene(scene);
        window.showAndWait();

    }

}
