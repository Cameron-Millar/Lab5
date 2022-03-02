package com.example.lab05;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableController {

/*
    public TableController(){
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

    }
*/
}