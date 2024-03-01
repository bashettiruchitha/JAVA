import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {

        Student s1=new Student("ruchi", "cse", 20);
        Student s2=new Student("deepika", "eee", 21);
        Student s3=new Student("chandhu", "arch", 21);
        Student s4=new Student("meghu", "ece", 19);
    

        

        LinkedList<Student>set1=new LinkedList<Student>();
        set1.add(s1);
        set1.add(s2);
        set1.add(s3);
        set1.add(s4);
        Iterator<Student>x=set1.iterator();
        while(x.hasNext()){
            Student theStudent=x.next();
        }
        
        
    }
    
}
class Student{

    String name;
    String Branch;
    int age;
    
    public Student(String name, String branch, int age) {
        this.name = name;
        this.Branch = branch;
        this.age = age;
    }
    
}
