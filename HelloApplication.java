package com.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;


public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        KorisnikModel model = new KorisnikModel();
        HelloController ctrl = new HelloController(model);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        loader.setController(ctrl);
        Parent root = loader.load();
        primaryStage.setTitle("Tutorijal7");
        primaryStage.setScene(new Scene(root, 473, 279));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}