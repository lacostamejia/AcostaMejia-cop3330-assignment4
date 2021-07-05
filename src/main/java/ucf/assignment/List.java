package ucf.assignment;

import java.util.ArrayList;

public class List {

    private String List_Name;
    //Here we are going to create an array list to store the items inside this list
    private ArrayList<String> List_Items; //Here we are going to store the items in this list


    //Constructor for the name Initialization
    public List(String List_Name) {
        this.List_Name = List_Name;
        List_Items = new ArrayList<String>();
    }

    public String getList_Name() {

        return List_Name;
    }

    public void setList_Name(String list_Name) {

        List_Name = list_Name;
    }

    public ArrayList<String> getList_Items() {
        return List_Items;
    }

    public void setList_Items(ArrayList<String> list_Items) {
        List_Items = list_Items;
    }

    public void Modify_List_Name(String Modified_List_Name){
        //Here we are going to modify the name of the list
        List_Name = Modified_List_Name;
    }

    public void Search(){
        //Here we are going to be using this method to search for a particular
        //item on a list.
    }


    public void DeleteList(){
        //We have to delete all the information of the list with this code
    }

    public void SaveList(){

        //Here we are planning to save the list

    }
    public void LoadList(){

        //Here we are going to be using it as a setter since we are going to load a list to operate with

    }
    public void Save_All_Lists(){
        //Here we are going to save multiple lists that we are operating with

    }
    public void Load_Multiple_Lists(){

        //Here we are going to load multiple lists that we are going to operate with them

    }

}
