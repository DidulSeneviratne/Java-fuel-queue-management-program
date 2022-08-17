package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Objects;

import static com.example.demo4.Main.*;

public class MenuController {
    @FXML
    private TextArea Display;
    @FXML
    private TextField queueEnter;
    @FXML
    private TextField nameEnter;
    @FXML
    protected void onDisplayClick() {
        //Get the exact queue want to display and show it
        String list = queueEnter.getText().toLowerCase();
        switch (list) {
            case "1" -> Display.setText(String.valueOf(Que1));
            case "2" -> Display.setText(String.valueOf(Que2));
            case "3" -> Display.setText(String.valueOf(Que3));
            case "4" -> Display.setText(String.valueOf(Que4));
            case "5" -> Display.setText(String.valueOf(Que5));
            case "wait" -> Display.setText(String.valueOf(Wait));
            default -> Display.setText("Enter a valid queue");
        }
    }
    @FXML
    protected void onSearchClick() {
            //Get the name of customer to display
            String name = nameEnter.getText().toLowerCase();
            for (String result : Que1) {
                if (result.startsWith(name)) {
                    Display.setText(result);
                }
            }
            for (String result : Que2) {
                if (result.startsWith(name)) {
                    Display.setText(result);
                }
            }
            for (String result : Que3) {
                if (result.startsWith(name)) {
                    Display.setText(result);
                }
            }
            for (String result : Que4) {
                if (result.startsWith(name)) {
                    Display.setText(result);
                }
            }
            for (String result : Que5) {
                if (result.startsWith(name)) {
                    Display.setText(result);
                }
            }
            for (String result : Wait) {
                if (result.startsWith(name)) {
                    Display.setText(result);
                }
            }
            if(Objects.equals(Display.getText(), "")){
                Display.setText("Not found in any queue");
            }
    }
}
