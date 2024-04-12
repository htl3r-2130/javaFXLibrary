module org.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafx to javafx.fxml;
    exports org.example.javafx;
    exports org.example.javafx.PopUpApplication;
    opens org.example.javafx.PopUpApplication to javafx.fxml;
}