import java.util.LinkedList;

public class Transform {
    public LinkedList<Integer> applyTransformation(LinkedList<String> linkedList, Transformation transformation) {
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        linkedList.forEach((s) -> {
             newLinkedList.add(transformation.transform(s));
        });
        return newLinkedList;
    }
}
