
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField ResultField;

    @FXML
    private Button ButtonDivide;
    @FXML
    private Button ButtonMultiply;
    @FXML
    private Button ButtonPlus;
    @FXML
    private Button ButtonMinus;

    boolean errorDisplayed = false;
    boolean calculationsStarted = false;
    double previousNumber;
    double currentNumber;
    double numberNew;
    double result;
    String lastButton = "";



    @FXML
    private void buttonPressed0(){
        if(errorDisplayed){
            ResultField.setText("0");
        }else {
            ResultField.setText(ResultField.getText() + "0");
        }
    }

    @FXML
    private void buttonPressed1(){
        if(errorDisplayed){
            ResultField.setText("1");
        }else {
            ResultField.setText(ResultField.getText() + "1");
        }
    }

    @FXML
    private void buttonPressed2(){
        if(errorDisplayed){
            ResultField.setText("2");
        }else {
            ResultField.setText(ResultField.getText() + "2");
        }
    }

    @FXML
    private void buttonPressed3(){
        if(errorDisplayed){
            ResultField.setText("3");
        }else {
            ResultField.setText(ResultField.getText() + "3");
        }
    }


    @FXML
    private void buttonPressed4(){
        if(errorDisplayed){
            ResultField.setText("4");
        }else {
            ResultField.setText(ResultField.getText() + "4");
        }
    }

    @FXML
    private void buttonPressed5(){
        if(errorDisplayed){
            ResultField.setText("5");
        }else {
            ResultField.setText(ResultField.getText() + "5");
        }
    }

    @FXML
    private void buttonPressed6(){
        if(errorDisplayed){
            ResultField.setText("6");
        }else {
            ResultField.setText(ResultField.getText() + "6");
        }
    }

    @FXML
    private void buttonPressed7(){
        if(errorDisplayed){
            ResultField.setText("7");
        }else {
            ResultField.setText(ResultField.getText() + "7");
        }
    }

    @FXML
    private void buttonPressed8(){
        if(errorDisplayed){
            ResultField.setText("8");
        }else {
            ResultField.setText(ResultField.getText() + "8");
        }
    }


    @FXML
    private void buttonPressed9(){
        if(errorDisplayed){
            ResultField.setText("9");
        }else {
            ResultField.setText(ResultField.getText() + "9");
        }
    }

    @FXML
    private void buttonPressedDivide(){
        if(!ButtonDivide.isDisabled()) {
            if (!ResultField.getText().equals("")) {
                if (Double.parseDouble(ResultField.getText()) != 0) {
                    currentNumber=Double.parseDouble(ResultField.getText());
                    previousNumber=currentNumber;
                    ResultField.setText("");
                } else {
                    ResultField.setText("Can't divide with 0");
                    errorDisplayed = true;
                }
                lastButton = "/";
                ButtonDivide.setDisable(true);
                ButtonMultiply.setDisable(true);
                ButtonPlus.setDisable(true);
                ButtonMinus.setDisable(true);
            }
        }
    }

    @FXML
    private void buttonPressedMultiply(){
        if(!ButtonMultiply.isDisabled()) {
            if (!ResultField.getText().equals("")) {
                currentNumber=Double.parseDouble(ResultField.getText());
                previousNumber=currentNumber;
                ResultField.setText("");
                lastButton = "*";
                ButtonDivide.setDisable(true);
                ButtonMultiply.setDisable(true);
                ButtonPlus.setDisable(true);
                ButtonMinus.setDisable(true);
            }
        }
    }

    @FXML
    private void buttonPressedPlus(){
        if(!ButtonPlus.isDisabled()) {
            if (!ResultField.getText().equals("")) {
                currentNumber=Double.parseDouble(ResultField.getText());
                previousNumber=currentNumber;

                ResultField.setText("");
                lastButton = "+";
                ButtonDivide.setDisable(true);
                ButtonMultiply.setDisable(true);
                ButtonPlus.setDisable(true);
                ButtonMinus.setDisable(true);
            }
        }
    }

    @FXML
    private void buttonPressedMinus(){
        if(!ResultField.getText().equals("")){
            currentNumber=Double.parseDouble(ResultField.getText());
            previousNumber=currentNumber;

            ResultField.setText("");
            lastButton="-";
            ButtonDivide.setDisable(true);
            ButtonMultiply.setDisable(true);
            ButtonPlus.setDisable(true);
            ButtonMinus.setDisable(true);
        }

    }

    @FXML
    private void buttonPressedEquals(){
        if(!ResultField.getText().equals("")) {
            ButtonDivide.setDisable(false);
            ButtonMultiply.setDisable(false);
            ButtonPlus.setDisable(false);
            ButtonMinus.setDisable(false);
            switch (lastButton) {
                case ("/"):
                    currentNumber=Double.parseDouble(ResultField.getText());
                    if(currentNumber!=0) {
                        result = previousNumber / currentNumber;
                        ResultField.setText(String.valueOf(result));
                    }else{
                        ResultField.setText("Can't divide by 0");
                        errorDisplayed=true;
                        ButtonDivide.setDisable(true);
                        ButtonMultiply.setDisable(true);
                        ButtonPlus.setDisable(true);
                        ButtonMinus.setDisable(true);
                    }
                    break;
                case ("*"):
                    currentNumber=Double.parseDouble(ResultField.getText());
                    result=previousNumber*currentNumber;
                    ResultField.setText(String.valueOf(result));
                    break;
                case ("+"):
                    currentNumber=Double.parseDouble(ResultField.getText());
                    result=previousNumber+currentNumber;
                    ResultField.setText(String.valueOf(result));
                    break;
                case ("-"):
                    currentNumber=Double.parseDouble(ResultField.getText());
                    result=previousNumber-currentNumber;
                    ResultField.setText(String.valueOf(result));
                    break;

            }
        }

    }

    @FXML
    private void buttonPressedClear(){
        ResultField.setText("");
        lastButton="";
        numberNew=0;
        currentNumber=0;
        calculationsStarted=false;
        errorDisplayed=false;
        ButtonDivide.setDisable(false);
        ButtonMultiply.setDisable(false);
        ButtonPlus.setDisable(false);
        ButtonMinus.setDisable(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
