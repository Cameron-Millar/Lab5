package com.example.lab05;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class TableApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(TableApplication.class.getResource("hello-view.fxml"));

        stage.setTitle("Student Grades");
        TableView<StudentRecord> MarkTable = new TableView<>();
        ObservableList<StudentRecord> students = DataSource.getAllMarks();
        TableColumn IDCol = new TableColumn("ID");
        IDCol.setCellValueFactory(new PropertyValueFactory<StudentRecord,String>("StudentID"));

        TableColumn AssignCol = new TableColumn("Assignments");
        AssignCol.setCellValueFactory(new PropertyValueFactory<StudentRecord,Double>("Assignments"));

        TableColumn MidCol = new TableColumn("Midterm");
        MidCol.setCellValueFactory(new PropertyValueFactory<StudentRecord,Double>("Midterm"));

        TableColumn FinalCol = new TableColumn("Final Exam");
        FinalCol.setCellValueFactory(new PropertyValueFactory<StudentRecord,Double>("FinalExam"));

        TableColumn TotalCol = new TableColumn("Final Grade");
        TotalCol.setCellValueFactory(new PropertyValueFactory<StudentRecord,Double>("FinalMark"));

        TableColumn LetterCol = new TableColumn("Letter Grade");
        LetterCol.setCellValueFactory(new PropertyValueFactory<StudentRecord,String>("LetterGrade"));

        MarkTable.getColumns().addAll(IDCol, AssignCol, MidCol, FinalCol, TotalCol, LetterCol);
        MarkTable.setItems(students);
        Scene scene = new Scene(MarkTable, 800, 450);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}