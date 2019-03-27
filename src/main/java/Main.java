import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Ninja one = new Ninja("Bruce Lee", 9);
        Ninja two = new Ninja("Jackie Chan", 8);
        Ninja three = new Ninja("Bob", 5);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        System.out.println("Done");

        ArrayList<Ninja> trouble = new ArrayList<>();
        trouble.add(one);
        trouble.add(two);
        trouble.add(three);
        trouble.add(new Ninja("Mary", 9));

        print(trouble);
        Collections.sort(trouble);
        print(trouble);

        //some other types of array list
        ArrayList<String> words = new ArrayList<>();
        words.add("dog");
        words.add("cat");
        words.add("rabbit");
        words.add("aardvark");

        //cannot use int because it is a primitive type.
        //Integer is a wrapper class, so you can call an instance of it.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(3));
        numbers.add(9); //uses boxing to shorten statement.
        numbers.add(-3);
        numbers.add(44);
        numbers.add(8);
        Collections.sort(numbers);
        print(numbers);

        System.out.println("Done");
    }
    public static<E> void print(ArrayList<E> list) {
        System.out.printf("------------ %d objects ------------\n", list.size());
        for(E ninja : list) {
            System.out.println(">>> " + ninja);
        }
    }
}
