package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import javax.xml.soap.Text;
import java.lang.*;
import java.lang.reflect.Array;

public class calc extends Application  {

    long start = System.nanoTime();
    int numclicked = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HBox Experiment 1");
        GridPane canvas = new GridPane();

        Button plus = new Button("+");
        Button minus = new Button("-");
        Button multiply = new Button("*");
        Button divide = new Button("/");
        Button clear = new Button("Clear");
        Button lastInp = new Button("Last");
        Button equals = new Button("=");
        TextField num1 = new TextField();
        TextField num2 = new TextField();

        canvas.add(divide, 0, 0);
        canvas.add(multiply, 1,0);
        canvas.add(plus, 0, 1);
        canvas.add(minus, 1, 1);

        canvas.add(num1,0,2);
        canvas.add(num2,1,2);
        canvas.add(lastInp,0,3,2,1);
        canvas.add(equals,0,3,2,1);
        canvas.add(clear,0,4,2,1);

        num1.setPrefWidth(70);
        num2.setPrefWidth(70);
        divide.setPrefWidth(70);
        multiply.setPrefWidth(70);
        plus.setPrefWidth(70);
        minus.setPrefWidth(70);
        clear.setPrefWidth(140);
        lastInp.setPrefWidth(140);
        equals.setPrefWidth(140);


        Scene scene = new Scene(canvas, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}