module org.example.inicio {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.inicio to javafx.fxml;
    exports org.example.inicio;
}