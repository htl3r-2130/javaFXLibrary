package org.example.javafx.PopUpApplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Window extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        Button button = new Button("Click");
        button.setOnAction(e -> {
            boolean res = ConfirmBox.display("title", "AlertBox!");
            System.out.println(res);
        });
        //button.setOnAction(e -> AlertBox.display("title", "AlertBox!"));

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button);
        Scene scene = new Scene(stackPane, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}
