package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListManagerTest {

    /**
     * Declare a new ToDoList object and give it a name that is a valid string
     * Assert that the ToDoList exists by comparing its title to the title given in the createList method
     */
    @Test
    void createList() {
        ToDoList list = ToDoListManager.createList("New List");

        assertEquals("New List", list.title);
    }
}