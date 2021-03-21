package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Controller3 {
    @FXML
    private Button but2;
    @FXML
    private Button but1;

    @FXML
    private TextField txt;

    @FXML
    private Label lbl;

    @FXML
    private void minusOne(ActionEvent eventOne) {
        int minus1 = Integer.parseInt(txt.getText());
        txt.setText(Integer.toString(minus1-1));
        int a6 = Integer.parseInt(txt.getText());
        if (a6 == -6){
            txt.setText("0");
        }
    }

    @FXML
    private void plusOne(ActionEvent eventTwo) {
        int plus1 = Integer.parseInt(txt.getText());
        txt.setText(Integer.toString(plus1+1));
        int a4 = Integer.parseInt(txt.getText());
        if (a4 == 4) {
            txt.setText("0");
        }
    }
}
