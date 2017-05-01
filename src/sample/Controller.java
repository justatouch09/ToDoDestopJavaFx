package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    //ITEMS STORED ON LIST
    ObservableList<ToDoItem> items = FXCollections.observableArrayList();

    //FIELD XML MAPPINGS
    @FXML
    ListView list;

    @FXML
    TextField text;

    //EVENT HANDLERS
    public void addItem() {
        items.add(new ToDoItem(text.getText()));
        text.setText("");
    }

    public void removeItem() {
        ToDoItem item = (ToDoItem) list.getSelectionModel().getSelectedItem();
        items.remove(item);
    }

    public void toggleItem() {
        //GET CURRENTLY SELECTED ITEM
        ToDoItem item = (ToDoItem) list.getSelectionModel().getSelectedItem();
        //TOGGLE THE "IS DONE" FIELD
        if (item != null) {
            //! FLIP BOOLEAN
            item.isDone = !item.isDone;
            //CHANGE CONTENT INSIDE OF LIST AND REFRESH CONTENT
            list.refresh();
        }
    }
    //METHOD TO RUN ON APP START
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(items);
    }
}
