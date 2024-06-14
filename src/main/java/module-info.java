module com.arcticsoft.javafxstarter {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires transitive javafx.graphics;
    opens arctic.javafx.starter to javafx.fxml;
    exports arctic.javafx.starter;
}