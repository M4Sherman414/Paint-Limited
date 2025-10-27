package com.example.paintlimited;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    private Parent root;
    private Scene scene;

    @Override
    public void start(Stage stage) throws Exception {

        //Get Resource FILE
        FXMLLoader loader = new FXMLLoader(getClass().getResource("paint-limited.fxml"));

        //Set SCENE
        root = loader.load();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Paint Limited!");
        Image img = new Image("icon.png");
        stage.getIcons().add(img);

        //Show SCENE
        stage.show();
    }

    public static void main(String[] args) {launch();}
}
