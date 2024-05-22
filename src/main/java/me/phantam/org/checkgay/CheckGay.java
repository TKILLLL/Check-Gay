package me.phantam.org.checkgay;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckGay extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CheckGay.class.getResource("check-gay.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 396, 261);
        stage.setTitle("Phần Mềm Kiểm Tra % Gay | phantam");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}