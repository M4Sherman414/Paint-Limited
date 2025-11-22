package com.example.paintlimited;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import javax.naming.spi.InitialContextFactory;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    //Grid resolution is 640X640 so if we want a grid with 16X16 cells we need to divide resolution with 40
    int gridSize = 40;
    @FXML
    private AnchorPane map;
    @FXML
    private GridPane grid;
    @FXML
    private ChoiceBox colors;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Definition of colors into choice box
        colors.getItems().add("Black");
        colors.getItems().add("Red");
        colors.getItems().add("Green");
        colors.getItems().add("Blue");
        colors.getItems().add("Yellow");
        colors.getItems().add("White");
        colors.getItems().add("None");

        //Setting default value to black
        colors.setValue("Black");
    }

    public void position(MouseEvent event){

        //Getting coordinates of where mouse clicked in
        double X = event.getSceneX();
        double Y = event.getSceneY();

        //Printing values into terminal to test
        System.out.printf("X : %f\nY : %f\n",X,Y);

        //Deciding which cell clicked
        int x = (int)X/gridSize;
        int y = (int)Y/gridSize;

        System.out.println("You clicked X : "+x+" Y : "+y+"\n");

        //Defining colored cell
        AnchorPane black = new AnchorPane();
        black.setStyle("-fx-background-color: black");
        AnchorPane green = new AnchorPane();
        green.setStyle("-fx-background-color: green");
        AnchorPane blue = new AnchorPane();
        blue.setStyle("-fx-background-color: blue");
        AnchorPane red = new AnchorPane();
        red.setStyle("-fx-background-color: red");
        AnchorPane yellow = new AnchorPane();
        yellow.setStyle("-fx-background-color: yellow");
        AnchorPane white = new AnchorPane();
        white.setStyle("-fx-background-color: white");
        AnchorPane none = new AnchorPane();

        //Coloring selected cell
        if (colors.getValue()=="Black"){
            grid.add(black,x,y);
        } else if (colors.getValue()=="Red") {
            grid.add(red,x,y);
        } else if (colors.getValue()=="Green") {
            grid.add(green,x,y);
        } else if (colors.getValue()=="Blue") {
            grid.add(blue,x,y);
        } else if (colors.getValue()=="Yellow") {
            grid.add(yellow,x,y);
        }else if (colors.getValue()=="White") {
            grid.add(white,x,y);
        }else if (colors.getValue()=="None") {
            grid.add(white,x,y);
        }

    }
}
