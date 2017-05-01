package sample;

/**
 * Created by jaradtouchberry on 5/1/17.
 */
public class ToDoItem {
    String text;
    boolean isDone;

    public ToDoItem(String text) {
        this.text = text;
        this.isDone = false;
    }

    @Override
    public String toString() {
        //RETURN TEXT IF TRUE/ RETURN EMPTY STRINGS IF FALSE
        return text + (isDone ? " (done)" : "");
    }
}
