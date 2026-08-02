module ntu.maicuongtho.HelloJavaFX3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens ntu.maicuongtho.HelloJavaFX3 to javafx.fxml;
    exports ntu.maicuongtho.HelloJavaFX3;
}
