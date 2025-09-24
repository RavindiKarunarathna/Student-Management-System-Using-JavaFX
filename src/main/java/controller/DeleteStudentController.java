package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteStudentController {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnCancel11;

    Stage stage=new Stage();
    @FXML
    void btnCancel(ActionEvent event) {
        try{
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/student_management_main_form.fxml"))));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        stage.show();
    }
}
