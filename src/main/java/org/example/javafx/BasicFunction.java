package org.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BasicFunction extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("test");

        Button button1 = new Button("b1");
        button1.setOnAction(e -> System.out.println("test"));

        Button button2 = new Button("b2");
        button2.setOnAction(actionEvent -> {
            System.out.println("test2");
        });


        FlowPane layout = new FlowPane();
        layout.getChildren().addAll(button1, button2);

        Scene scene = new Scene(layout, 200, 100);
        stage.setScene(scene);
        stage.show();
    }


}

