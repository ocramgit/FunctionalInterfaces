import java.util.LinkedList;

public class Executor {
    void executeAction(LinkedList<String> linkedList, Action action) {
        for (String s : linkedList) {
            action.execute(s);
        }
    }
}
