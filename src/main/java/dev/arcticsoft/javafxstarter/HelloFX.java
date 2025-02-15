package dev.arcticsoft.javafxstarter;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloFX extends Application {

	@Override
	public void start(Stage stage) {
		var dukeImage = new ImageView(new Image(HelloFX.class.getResourceAsStream("openduke.png")));
		dukeImage.setFitHeight(200);
		dukeImage.setPreserveRatio(true);

		var jfxVersion = new Label("JavaFX version: " + System.getProperty("java.version"));
		var jdkVersion = new Label("Java version: " + System.getProperty("javafx.version"));
		var root = new VBox(5, dukeImage, jfxVersion, jdkVersion);
		root.setAlignment(Pos.CENTER);

		var scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(HelloFX.class.getResource("styles.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}