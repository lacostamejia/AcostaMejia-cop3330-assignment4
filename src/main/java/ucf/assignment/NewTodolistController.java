package ucf.assignment;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class NewTodolistController {
    //Here we are going to have variables created for the name of the list, the new list, the information
    //We are going to pass as parameters. //The status of the item  is incomplete at first, we have to save this.

    @FXML
    public void Create_List(ActionEvent actionEvent) {
        //Here we are going to be creating a new list with the name inputted.
        //We have to check if the name is empty or NULL
        //We have to use the class List and call it as a blue print, in order to access to the information of this class
    }
    @FXML
    public void Close_New_todo_list(ActionEvent actionEvent) {
        //Here we are going to close this window.
        ((Stage)(((Button)actionEvent.getSource()).getScene().getWindow())).close();
    }
    @FXML
    public void Add_item_new_todo_list(ActionEvent actionEvent) {
        //Here we are going to be adding items to the new list created.
        //We have to check if there is an item with the same name imputed.
        //If the name, due date or description is empty or NULL.
        //We are going to set the status of the item at first as incomplete.
        //We have to access to the ListItems class
    }
}
