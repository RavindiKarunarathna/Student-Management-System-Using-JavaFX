package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentManagementMainFormController {

    @FXML
    private Button btnAddStudent;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnDeleteStudent;

    @FXML
    private Button btnUpdateStudent;

    @FXML
    private Button btnViewStudent;

    Stage stage=new Stage();
    @FXML
    void btnAddStudent(ActionEvent event) {
        try{
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/add_student_form.fxml"))));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    void btnBack(ActionEvent event) {
        try{
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login_form.fxml"))));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    void btnDeleteStudent(ActionEvent event) {
        try{
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/delete_student_form.fxml"))));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    void btnUpdateStudent(ActionEvent event) {
        try{
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/update_student_form.fxml"))));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    void btnViewStudent(ActionEvent event) {
        try{
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/view_student_form.fxml"))));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        stage.show();
    }

}
