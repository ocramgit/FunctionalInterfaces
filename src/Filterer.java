import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Filterer {

    public void filter(LinkedList<String> linkedList, Filter filter) {
        List<String> filtered = new ArrayList<>();
        linkedList.stream().filter(string -> string.length()>5).toList();
        linkedList.forEach((s) -> {
            if(filter.accept(s)) {
                filtered.add(s);
                System.out.println(s);
            }
        });
    }
}
