package com.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class Controller {

    public static double operationCalculation(String[] operation) {
        switch (operation[1]) {
            case "+":
                return Double.valueOf(operation[0]) + Double.valueOf(operation[2]);
            case "-":
                return Double.valueOf(operation[0]) - Double.valueOf(operation[2]);
            case "x":
                return Double.valueOf(operation[0]) * Double.valueOf(operation[2]);
            case "÷":
                return Double.valueOf(operation[0]) / Double.valueOf(operation[2]);
            case "":
                return Double.valueOf(operation[0]) % Double.valueOf(operation[2]);
        }
        return 0;
    }

    @FXML
    private Button buttonZero;

    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonTwo;

    @FXML
    private Button buttonThree;

    @FXML
    private Button buttonFour;

    @FXML
    private Button buttonFive;

    @FXML
    private Button buttonSix;

    @FXML
    private Button buttonSeven;

    @FXML
    private Button buttonEight;

    @FXML
    private Button buttonNine;

    @FXML
    private Button buttonPlus;

    @FXML
    private Button buttonMinus;

    @FXML
    private Button buttonMultiplication;

    @FXML
    private Button buttonDivision;

    @FXML
    private Button buttonEqual;

    @FXML
    private Button buttonClear;

    @FXML
    private Button buttonRemainder;

    @FXML 
    private Button buttonDecimal;

    @FXML
    private Text textCounter;
    private boolean operationActive = false;

    @FXML
    private void actionClear(ActionEvent event) {
        operationActive = false;
        textCounter.setText("0");
    }

    @FXML
    private void actionOne(ActionEvent event) {
        if (!textCounter.getText().equals("0")) {
            textCounter.setText(textCounter.getText() + "1");
        }  else {
            textCounter.setText("1");
        }
    }

    @FXML
    private void actionTwo(ActionEvent event) {
        if (!textCounter.getText().equals("0")) {
            textCounter.setText(textCounter.getText() + "2");
        }  else {
            textCounter.setText("2");
        }
    }

    @FXML
    private void actionThree(ActionEvent event) {
        if (!textCounter.getText().equals("0")) {
            textCounter.setText(textCounter.getText() + "3");
        }  else {
            textCounter.setText("3");
        }
    }

    @FXML
    private void actionFour(ActionEvent event) {
        if (!textCounter.getText().equals("0")) {
            textCounter.setText(textCounter.getText() + "4");
        }  else {
            textCounter.setText("4");
        }
    }
    
    @FXML
    private void actionFive(ActionEvent event) {
        if (!textCounter.getText().equals("0")) {
            textCounter.setText(textCounter.getText() + "5");
        }  else {
            textCounter.setText("5");
        }
    }

    @FXML
    private void actionSix(ActionEvent event) {
        if (!textCounter.getText().equals("0")) {
            textCounter.setText(textCounter.getText() + "6");
        }  else {
            textCounter.setText("6");
        }
    }

    @FXML
    private void actionSeven(ActionEvent event) {
        if (!textCounter.getText().equals("0")) {
            textCounter.setText(textCounter.getText() + "7");
        }  else {
            textCounter.setText("7");
        }
    }

    @FXML
    private void actionEight(ActionEvent event) {
        if (!textCounter.getText().equals("0")) {
            textCounter.setText(textCounter.getText() + "8");
        }  else {
            textCounter.setText("8");
        }
    }

    @FXML
    private void actionNine(ActionEvent event) {
        if (!textCounter.getText().equals("0")) {
            textCounter.setText(textCounter.getText() + "9");
        }  else {
            textCounter.setText("9");
        }
    }

    @FXML
    private void actionZero(ActionEvent event) {
        if (!textCounter.getText().equals("0")) {
            textCounter.setText(textCounter.getText() + "0");
        }    
    }

    @FXML
    private void actionDecimal(ActionEvent event) {
        String[] operation = textCounter.getText().split("\\s+");
        if (operation.length > 2) {
            if (operation[2].indexOf(".") == -1) {
                textCounter.setText(textCounter.getText() + ".");
            }
        } else if (operation.length == 1){
            if (textCounter.getText().indexOf(".") == -1) {
                textCounter.setText(textCounter.getText() + ".");
            }  
        }
         
    }

    @FXML
    private void actionPlus(ActionEvent event) {
        if (operationActive) {
            String[] operation = textCounter.getText().split("\\s+");
            if (operation.length == 3) {
                textCounter.setText(String.valueOf(operationCalculation(operation)) + " + ");
            }
        } else {
            textCounter.setText(textCounter.getText() + " + ");
            operationActive = true;
        }  
    }

    @FXML
    private void actionMinus(ActionEvent event) {
        if (operationActive) {
            String[] operation = textCounter.getText().split("\\s+");
            if (operation.length == 3) {
                textCounter.setText(String.valueOf(operationCalculation(operation)) + " - ");
            }
        } else {
            textCounter.setText(textCounter.getText() + " - ");
            operationActive = true;
        }  
    }

    @FXML
    private void actionMultiplication(ActionEvent event) {
        if (operationActive) {
            String[] operation = textCounter.getText().split("\\s+");
            if (operation.length == 3) {
                textCounter.setText(String.valueOf(operationCalculation(operation)) + " x ");
            }
        } else {
            textCounter.setText(textCounter.getText() + " x ");
            operationActive = true;
        }  
    }

    @FXML
    private void actionDivision(ActionEvent event) {
        if (operationActive) {
            String[] operation = textCounter.getText().split("\\s+");
            if (operation.length == 3) {
                textCounter.setText(String.valueOf(operationCalculation(operation)) + " ÷ ");
            }
        } else {
            textCounter.setText(textCounter.getText() + " ÷ ");
            operationActive = true;
        }  
    }

    @FXML
    private void actionRemainder(ActionEvent event) {
        if (operationActive) {
            String[] operation = textCounter.getText().split("\\s+");
            if (operation.length == 3) {
                textCounter.setText(String.valueOf(operationCalculation(operation)) + " % ");
            }
        } else {
            textCounter.setText(textCounter.getText() + " % ");
            operationActive = true;
        }  
    }

    @FXML
    private void actionEqual(ActionEvent event) {
        String[] operation = textCounter.getText().split("\\s+");
        if (operation.length == 3) {
            textCounter.setText(String.valueOf(operationCalculation(operation)));
            operationActive = false;
        } 
    }

    @FXML
    public void initialize() {
        textCounter.textProperty().addListener((observable, oldValue, newValue) -> {
            int length = newValue.length();
            
            if (length >= 26) {
                textCounter.setText(newValue.substring(0, 25));
            } else if (length > 18) {
                textCounter.setStyle("-fx-font-size: 25px;");  // Smallest font size for the longest text
            } else if (length > 14) {
                textCounter.setStyle("-fx-font-size: 35px;");  // Small font size for medium-long text
            } else if (length > 9) {
                textCounter.setStyle("-fx-font-size: 45px;");  // Medium font size for mid-range text
            } else {
                textCounter.setStyle("-fx-font-size: 55px;");  // Default largest font size for short text
            }
        });
    }

}
