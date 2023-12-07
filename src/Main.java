import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*Calculator calculator = new Calculator();
        MathematicalOperation sum = (a, b) -> a + b;
        MathematicalOperation sub = (a, b) -> a - b;
        MathematicalOperation div = (a, b) -> a / b;
        MathematicalOperation mult = (a, b) -> a * b;

        System.out.println(calculator.executeOperation(2, 4, sum));
        System.out.println(calculator.executeOperation(5, 3, sub));
        System.out.println(calculator.executeOperation(2, 4, div));
        System.out.println(calculator.executeOperation(2, 4, mult));
         */

        LinkedList<String> list = new LinkedList<>();
        list.add("Ola");
        list.add("okokokok");
        list.add("lolololololololol");
        list.add("marc");
        list.add("oooo o o o o o o   aaa");


        /*Filter stringFilterLength = (s) -> s.length() < 5;
        Filter stringFilterHaveA = (s) -> s.contains("a");

        Filterer filterer = new Filterer();
        filterer.filter(list, stringFilterLength);
        filterer.filter(list, stringFilterHaveA);
        */

        /*Transform transform = new Transform();
        Transformation length = (s) -> s.length();

        System.out.println(transform.applyTransformation(list, length));*/

        /*Action action = (s) -> System.out.println(s);
        Executor executor = new Executor();
        executor.executeAction(list, action);*/

        /*Produce<Integer> produce = new Produce<>();
        LinkedList<Integer> prod = produce.produce(10, () -> (int) (Math.random() * 5));

        for (Integer i : prod) {
            System.out.println(i);
        }*/
    }
}