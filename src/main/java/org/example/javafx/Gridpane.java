package org.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class Gridpane extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label label = new Label("Username");
        GridPane.setConstraints(label, 1, 0);

        TextField textField = new TextField("Text");
        GridPane.setConstraints(textField, 0, 0);

        Label label1 = new Label("Password");
        GridPane.setConstraints(label, 0, 1);

        TextField password = new TextField();
        GridPane.setConstraints(textField, 1, 1);
        password.setPromptText("test");

        Button login = new Button("login");
        GridPane.setConstraints(login, 1, 2);

        grid.getChildren().addAll(label, textField, label1, password, login);

        Scene scene = new Scene(grid, 300, 200);

        stage.setScene(scene);
        stage.show();
    }
}
