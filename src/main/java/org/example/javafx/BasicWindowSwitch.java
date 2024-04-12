package org.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BasicWindowSwitch extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label label1 = new Label("Welcome");
        Button button1 = new Button("Scene 2");

        //Scene1
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);

        Scene scene1 = new Scene(layout1, 200, 200);

        Button button2 = new Button("Scene 1");

        //Scene2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);

        Scene scene2 = new Scene(layout2, 600, 200);

        button1.setOnAction(e -> stage.setScene(scene2));
        button2.setOnAction(e -> stage.setScene(scene1));

        stage.setScene(scene1);
        stage.setTitle("Test");
        stage.show();
    }
}
