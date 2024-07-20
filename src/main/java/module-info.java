module com.Login_GUI {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.Login_GUI to javafx.fxml;
    exports com.Login_GUI;
}