package ucf.assignment;

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
    }
}
