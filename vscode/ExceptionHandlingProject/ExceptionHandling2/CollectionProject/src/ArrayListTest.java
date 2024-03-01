import java.util.HashSet;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        // ArrayList numberList = new ArrayList();
        // LinkedList numberList = new LinkedList<>();
        // TreeSet numberList = new TreeSet<>();
        HashSet numberList = new HashSet();
        System.out.println("conatiner created");

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);
        System.out.println("content is added");

        System.out.println("Accessing the iteration");
        // straw givemethestraw = starw.startthestrawtodrink
        Iterator numberIterator = numberList.iterator();// it is a conatiner
        System.out.println("got the iterator");

        System.out.println("Itearting through the collection");
        // hasnext()itschecks
        while (numberIterator.hasNext()) {
            Integer intValue = (Integer) numberIterator.next();
            System.out.println("value: " + intValue);
        }
        System.out.println("Done");
    }
}
