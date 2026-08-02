module com.tiilaz.add {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tiilaz.add to javafx.fxml;
    exports com.tiilaz.add;
}
