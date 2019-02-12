package com.company;

/*
Aaron Jack
Mead Gyawu
Vincent Bondmoore
Nick Porzio
Nusrat Alam
Madhi Ahmed
*/


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
import com.company.CsvWriter;
public class calc extends Application  {

    long start = System.nanoTime();
    int numclicked = 0;
    String problem = "";
    Double Solution = 0.0;

    public String getProblem() {
        return problem;
    }
    public double getSolution(){
        return Solution;
    }

    @Override
    public void start(Stage primaryStage) /*throws Exception*/ {
        primaryStage.setTitle("HBox Experiment 1");
        TilePane canvas = new TilePane();

        Button plus = new Button("+");
        Button minus = new Button("-");
        Button multiply = new Button("*");
        Button divide = new Button("/");
        Button clear = new Button("Clear");
        Button lastInp = new Button("Last");
        Button equals = new Button("=");
        TextField num1 = new TextField();
        TextField num2 = new TextField();
        Label answer = new Label("Answer");

        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                problem = ""+num1.getText()+" + "+num2.getText();
                Solution = Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText());
                System.out.println(getProblem());
                String check = problem;
                CsvWriter.problemLogger(check);
            }
        });
        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                problem = ""+num1.getText()+" - "+num2.getText();
                Solution = Double.parseDouble(num1.getText()) - Double.parseDouble(num2.getText());
                System.out.println(getProblem());
                String check = problem;
                CsvWriter.problemLogger(check);

            }
        });
        multiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                problem = ""+num1.getText()+" * "+num2.getText();
                Solution = Double.parseDouble(num1.getText()) * Double.parseDouble(num2.getText());
                System.out.println(getProblem());
                String check = problem;
                CsvWriter.problemLogger(check);

            }
        });
        divide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                problem = ""+num1.getText()+" / "+num2.getText();
                Solution = Double.parseDouble(num1.getText()) / Double.parseDouble(num2.getText());
                System.out.println(getProblem());
                String check = problem;
                CsvWriter.problemLogger(check);

            }
        });
        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                num1.setText("");
                num2.setText("");
                CsvWriter.clearLogger();
            }
        });
        equals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(getSolution());
                Double log = getSolution();
                String xyz = Solution.toString();
                CsvWriter.solutionWriter(xyz);
            }


        });

        canvas.getChildren().add(divide);
        canvas.getChildren().add(multiply);
        canvas.getChildren().add(plus);
        canvas.getChildren().add(minus);

        canvas.getChildren().add(num1);
        canvas.getChildren().add(num2);
        canvas.getChildren().add(lastInp);
        canvas.getChildren().add(clear);

        canvas.getChildren().add(equals);
        canvas.getChildren().add(answer);

        num1.setPrefWidth(35);
        num2.setPrefWidth(35);
        divide.setPrefWidth(70);
        multiply.setPrefWidth(70);
        plus.setPrefWidth(70);
        minus.setPrefWidth(70);
        clear.setPrefWidth(70);
        lastInp.setPrefWidth(70);
        equals.setPrefWidth(70);
        answer.setPrefWidth(140);

        //Left Column
        num1.setTranslateX(43);
        divide.setTranslateX(43);
        plus.setTranslateX(43);
        lastInp.setTranslateX(43);

        //Right Column
        num2.setTranslateX(-23);
        multiply.setTranslateX(-23);
        minus.setTranslateX(-23);
        clear.setTranslateX(-23);

        //Equals Button and Answer Label
        equals.setTranslateX(43);
        answer.setTranslateX(30);

        num1.setMaxSize(70.0, Double.MAX_VALUE);
        num2.setMaxSize(70.0, Double.MAX_VALUE);

        Scene scene = new Scene(canvas, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }



    public static void main(String[] args) {
        Application.launch(args);
    }
}