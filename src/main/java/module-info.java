module com.arcticsoft.javafxstarter {
    requires javafx.controls;
    requires javafx.fxml;
    opens arctic.javafx.starter to javafx.fxml;
    exports arctic.javafx.starter;
}