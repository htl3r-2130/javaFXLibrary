package org.example.javafx.PopUpApplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BorderPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        HBox topMenu = new HBox();
        Button b1 = new Button("File");
        Button b2 = new Button("Edit");
        Button b3 = new Button("View");
        topMenu.getChildren().addAll(b1, b2, b3);

        VBox leftMenu = new VBox();
        Button b4 = new Button("1");
        Button b5 = new Button("2");
        Button b6 = new Button("3");
        leftMenu.getChildren().addAll(b4, b5, b6);

        javafx.scene.layout.BorderPane borderPane = new javafx.scene.layout.BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}
