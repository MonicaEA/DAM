module org.example.sistemafichajes {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.sistemafichajes to javafx.fxml;
    exports org.example.sistemafichajes;
}