module org.example.tiendaapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;


    opens org.example.tiendaapp to javafx.fxml;
    exports org.example.tiendaapp;
}