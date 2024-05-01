/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//OOP Project Ainsley Plumadore

/**
 *
 * @author ainsl
 */
public class EmpolyeeDemoFX extends Application {
    
    private int size = 0;
    private String employeeName;
    private double employeeSalary = 0;
    private double employeeSales;
    private int yearsWithCompany;
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        
        VBox vBox1 = new VBox();
        VBox vBox2 = new VBox();
        
        TextArea ta = new TextArea();
        ta.setEditable(false);
        ta.setPrefWidth(500);
        ta.setPrefHeight(400);
        
        TextField userInput = new TextField();
        userInput.setPromptText("Enter your text");
        userInput.setPrefHeight(72);
        
        Button submitButton = new Button("Submit");
        submitButton.setOnAction((ActionEvent event) -> {
            String userIn = userInput.getText();
            ta.appendText("User input: " + userIn + "\n");
            System.out.println("User Input: " + userIn);
            processUserInput(userInput, ta);
        });
        
        // Set action on Enter key press
        userInput.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                // Trigger the same action as the submit button
                submitButton.fire();
            }
        });
        
        while (size <= 0) {
            try {
                ta.appendText("Enter the number of employees to poll: \n");
                //Parse the text entered in the TextField to an integer
                size = Integer.parseInt(userInput.getText());

                    if (size <= 0) {
                        ta.appendText("Please enter a valid positive number.\n");
                    }
            } catch (NumberFormatException e) {
                ta.appendText("Please enter a valid number.\n");
            }
        }
        
        vBox1.getChildren().addAll(userInput);
        vBox2.getChildren().addAll(ta);
        
        pane.setBottom(vBox1);
        pane.setCenter(vBox2);
        
        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("Employee Promotion Calculator");
        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void processUserInput(TextField userInput, TextArea ta) {

        while (size <= 0) {
            try {
                ta.appendText("Enter the number of employees to poll: \n");
                //Parse the text entered in the TextField to an integer
                size = Integer.parseInt(userInput.getText());

                    if (size <= 0) {
                        ta.appendText("Please enter a valid positive number.\n");
                    }
            } catch (NumberFormatException e) {
                ta.appendText("Please enter a valid number.\n");
            }
        }

        Employee[] employees = new Employee[size];

        ta.appendText("Loading Employees...\n");

        for (int i = 0; i < size; i++) {
            ta.appendText("Enter employee's first name " + (i + 1) + ": ");
            employeeName = userInput.getText();
            ta.appendText(employeeName + "\n");

            ta.appendText("Enter the salary of employee " + (i + 1) + ": $");
            try {
                // Parse the text entered in the TextField to a double for salary
                employeeSalary = Double.parseDouble(userInput.getText());
                ta.appendText(employeeSalary + "\n");
            } catch (NumberFormatException e) {
                ta.appendText("Please enter a valid number for salary.\n");
                continue; // Skip the current iteration if input is invalid
            }

            ta.appendText("Enter the years with the company of employee " + (i + 1) + ": ");
            try {
                // Parse the text entered in the TextField to an integer for yearsWithCompany
                yearsWithCompany = Integer.parseInt(userInput.getText());
                ta.appendText(yearsWithCompany + "\n");
            } catch (NumberFormatException e) {
                ta.appendText("Please enter a valid number for years with the company.\n");
                continue; // Skip the current iteration if input is invalid
            }

            ta.appendText("Enter the sales of employee " + (i + 1) + ": ");
            try {
                // Parse the text entered in the TextField to a double for sales
                employeeSales = Double.parseDouble(userInput.getText());
                ta.appendText(employeeSales + "\n");
            }catch (NumberFormatException e) {
                ta.appendText("Please enter a valid number for sales.\n");
                continue; // Skip the current iteration if input is invalid
            }

            ta.appendText("\n");

            employees[i] = new Employee(employeeName, employeeSalary, yearsWithCompany, employeeSales);
        }

        ta.appendText("***Congratulations to those eligible for promotion!***\n");

        for (Employee employee : employees) {
            ta.appendText(employee.toString() + "\n\n");

            if (employee.promote()) {
                employeeName = employee.getName();
                double raiseAmount = employee.calculateRaise();
                ta.appendText("Employee " + employeeName + " is eligible for promotion.\n");
                ta.appendText("Current salary: $" + employeeSalary + "\n");
                ta.appendText("New salary after raise: $" + raiseAmount + "\n\n");
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
