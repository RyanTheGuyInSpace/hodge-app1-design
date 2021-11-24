package baseline;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    /**
     * Declare a new ToDoList object
     * Give the ToDoList a title and valid path
     * Save the ToDoList when it has no Tasks in it
     * Store the size of the ToDoList's Task list in an int
     * Add a Task to the ToDoList
     * Store the new size of the ToDoList's Task list in another int
     * Assert that the two ints are not equal, meaning the addition of the task was successful
     */
    @Test
    void addTask() {

    }

    /**
     * Declare a new ToDoList object
     * Give the ToDoList a title and valid path
     * Save the ToDoList when it has no Tasks in it
     * Add a Task to the ToDoList
     * Save the ToDoList when it has a single Task in it
     * Store the size of the ToDoList's Task list in an int
     * Remove the first Task from the ToDoList
     * Store the new size of the ToDoList's Task list
     * Assert that the two ints are not equal, meaning the removal of the task was successful
     */
    @Test
    void removeTask() {

    }

    /**
     * Declare a new ToDoList object
     * Give the ToDoList a title and valid path
     * Save the ToDoList when it has no Tasks in it
     * Add a Task to the ToDoList
     * Save the ToDoList when it has a single Task in it
     * Store the size of the ToDoList's Task list in an int
     * Clear the ToDoList's Task list
     * Store the new size of the ToDoList's Task list
     * Assert that the two ints are not equal, meaning the clearing of all Tasks was successful
     */
    @Test
    void clearAllTasks() {

    }

    /**
     * Declare a new ToDoList object
     * Give the ToDoList a title and valid path
     * Add a Task to the ToDoList
     * Save the ToDoList to file
     * Read the destination file of the ToDoList
     * Assert that the file is not empty, meaning the save was successful and the ToDoList was written to disk
     */
    @Test
    void save() {

    }

    /**
     * Declare a new ToDoList object
     * Give the ToDoList a title and valid path
     * Add a Task to the ToDOList
     * Save the ToDoList
     * Assert that the ToString method and the title of the ToDoList give the same value
     */
    @Test
    void ToString() {

    }
}