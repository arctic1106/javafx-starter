module com.arcticsoft.javafxstarter {
    requires javafx.controls;
    requires javafx.fxml;
    opens com.arcticsoft.fx.starter to javafx.fxml;
    exports com.arcticsoft.fx.starter;
}