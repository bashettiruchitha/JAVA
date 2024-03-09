import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        MagazineShelf magazineShelf=new MagazineShelf(1, "magics", "xyz",450, 800);
        MagazineShelf magazineShelf2=new MagazineShelf(2, "happy", "ster", 300, 700);
        MagazineShelf magazineShelf3=new MagazineShelf(3, "sad", "stein", 500, 200);
        MagazineShelf magazineShelf4= new MagazineShelf(4, "sad", "stein", 500, 1000);
        MagazineShelf magazineShelf5=magazineShelf2;
        HashSet<MagazineShelf> magazineShelfs=new HashSet<MagazineShelf>();
        magazineShelfs.add(magazineShelf);
        magazineShelfs.add(magazineShelf2);
        magazineShelfs.add(magazineShelf3);
        magazineShelfs.add(magazineShelf4);
        magazineShelfs.add(magazineShelf5);

        Iterator<MagazineShelf>x=magazineShelfs.iterator();
        while(x.hasNext()){
            System.out.println("magazines are added"+x.next());
        }
    }
}
