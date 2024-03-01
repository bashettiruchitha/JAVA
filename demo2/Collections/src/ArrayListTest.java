import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");

        ArrayList x=new ArrayList();
        x.add(40);
        x.add(60);
        x.add(78);
        x.add(54);
        for(int i=0;i<=4;i++){
           System.out.println("values"+x.get(i));
        }
        Iterator y=x.iterator();
        while(y.hasNext()){
            Integer intvalue=(Integer)y.next();
        }
    }
}
