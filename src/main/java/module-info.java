module com.oop_gui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.oop_gui to javafx.fxml;
    exports com.oop_gui;
}