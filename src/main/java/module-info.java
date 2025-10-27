module com.example.paintlimited {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.naming;


    opens com.example.paintlimited to javafx.fxml;
    exports com.example.paintlimited;
}