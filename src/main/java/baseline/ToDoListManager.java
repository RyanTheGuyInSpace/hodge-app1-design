package baseline;

public class ToDoListManager {


    /**
     * Creates a new ToDoList.
     * @param title The title to give to the ToDoList.
     * @return To newly created ToDoList.
     */
    public static ToDoList createList(String title) {

        return new ToDoList();
    }
}
