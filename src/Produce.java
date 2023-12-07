import java.util.LinkedList;

public class Produce<T> {
    LinkedList<T> produce(int number, Generator<T> generator) {
        LinkedList<T> linkedList = new LinkedList<>();
        for (int i = 0; i < number; i++) {
            linkedList.add(generator.generate());
        }
        return linkedList;
    }
}
