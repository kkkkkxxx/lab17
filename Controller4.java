package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller4 {
    @FXML
    private Button buttonClick;
    @FXML
    private Button buttonCalc;

    @FXML
    private TextField textSum;
    @FXML
    private TextField textB;
    @FXML
    private TextField textA;

    @FXML
    private Label labelSum;
    @FXML
    private Label labelB;
    @FXML
    private Label labelA;

    @FXML
    private void clickClear(ActionEvent eventOne) {
        textA.setText("");
        textB.setText("");
        textSum.setText("");
    }

    @FXML
    private void clickCalc(ActionEvent eventTwo) {
        double aNum = Double.parseDouble(textA.getText());
        double bNum = Double.parseDouble(textB.getText());
        textSum.setText(Double.toString(aNum + bNum));
    }
}
