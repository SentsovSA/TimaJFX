module com.example.timajfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.timajfx to javafx.fxml;
    exports com.example.timajfx;
}