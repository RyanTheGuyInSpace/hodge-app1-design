/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import javafx.beans.property.BooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.security.auth.callback.Callback;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class MainController implements Initializable {

    ObservableList<ToDoList> toDoLists = FXCollections.observableArrayList();

    ObservableList<Task> tasks = FXCollections.observableArrayList();

    @FXML
    public ListView<ToDoList> toDoListingBox;

    @FXML
    public ListView<Task> toDoListItemsBox;

    @FXML
    public Scene scene;

    @FXML
    public Scene editTaskScene;

    @FXML
    public TextField editTaskField;

    @FXML
    public Button editTaskSet;

    @FXML
    public TextField newListInputField;

    @FXML
    public Button newListButton;

    @FXML
    public TextField addTaskField;

    @FXML
    private Button addTaskButton;

    @FXML
    private MenuItem toggleTaskCompleteButton;

    @FXML
    private MenuItem editTaskButton;

    @FXML
    private MenuItem deleteTaskButton;

    @FXML
    private MenuItem setTaskDueDateButton;

    @FXML
    private MenuItem deleteAllTasksButton;

    @FXML
    private MenuItem showCompleteButton;

    @FXML
    private MenuItem showIncompleteButton;

    @FXML
    private MenuItem showAllButton;

    @FXML
    private Button editTaskSaveButton;

    public long selectedItemIndex = -1;

    /**
     * Creates a list using the text inside the adjacent text field.
     *
     * ---
     * Create a new ToDoList and name it whatever is inside newListInputField
     * If newListInputField is blank, do nothing
     * Clear the text inside newListInputField
     * Open up FileChooser so the user can choose where to store their ToDoList
     * When they select the desired location, Add the list as an element to the left pane and load it
     * Save the ToDoList to write it to file
     * ---
     */
    @FXML
    public void createList() {

    }

    /**
     * Loads the ToDoList that was just clicked and
     * focuses the field to add a task and clears the editTaskField
     *
     * ---
     * Get the currently selected ToDoList
     * Set the list of Tasks in this controller to the
     * ---
     */
    public void loadList() {
        
    }

    /**
     * Loads only the completed Tasks from the currently selected ToDoList
     *
     * ---
     * Set the currently listed tasks to ONLY the tasks that are completed by filtering for a true return
     * of the isComplete method
     * ---
     */
    public void loadComplete() {

    }

    /**
     * Loads only the uncompleted Tasks from the currently selected ToDoList
     *
     * ---
     * Set the currently listed tasks to ONLY the tasks that are incomplete by filtering for a false return
     * on the isComplete method
     * ---
     */
    public void loadIncomplete() {

    }

    /**
     * Loads the last clicked Task into the editTaskField to allow it to be edited
     *
     * ---
     * Get the currently selected Task
     * Set the editTaskField to the selected Task's description
     * Focus the editTaskField for quick access to editing
     * ---
     */
    public void loadTask() {

    }

    /**
     * Adds a new Task to the currently selected ToDoList.
     *
     * ---
     * Get the currently selected ToDoList
     * If it's null, return and do nothing
     * Otherwise, call addTask on the currently selected ToDoList and set the description of the Task to
     *  the contents of addTaskField
     * ---
     */
    public void addTask() {

    }

    /**
     * Toggles the currently selected Task to be complete or incomplete
     * based on the current state of its isComplete field
     *
     * ---
     * Get the currently selected Task
     * If the task is complete, set it to be incomplete
     * If the task is incomplete, set it to be complete
     * Reload the list
     * ---
     */
    public void toggleTaskComplete() {

    }

    /**
     * Edits currently selected Task
     *
     * ---
     * Get the currently selected ToDoList
     * Get the currently selected Task from that ToDoList
     * Get the text from the editTaskField
     * Set the description of the Task to the text that was inside the editTaskField
     * Save the ToDoList
     * Reload the ToDoList
     * Clear the editTaskField
     * ---
     */
    public void editTask() {

    }

    /**
     * Deletes the currently selected Task.
     *
     * ---
     * Get the currently selected ToDoList
     * Get the currently selected Task
     * Remove the currently selected Task from the currently selected ToDoList
     * Reload the ToDoList
     * ---
     */
    public void deleteTask() {

    }

    /**
     * Deletes all Tasks from the currently selected ToDoList.
     *
     * ---
     * Get the currently selected ToDoList
     * If the Tasks list isn't empty, clear it
     * Reload the ToDoList
     * ---
     */
    public void deleteAllTasks() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
