import java.util.Iterator;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
           TreeSet mycats=new  TreeSet();
        Cats cats=new Cats(1, "jinny", "happy");
        Cats cats1=new Cats(2, "jacky", "sad");
        Cats cats2=new Cats(3, "jinny", "sad");
        Cats cats3=new Cats(4 ,"jinny", "sad");

        //ArrayList<Cats> mycats=new ArrayList<Cats>();
       // HashSet<Cats> mycats=new HashSet<Cats>();
    
        mycats.add(cats);
        mycats.add(cats1);
        mycats.add(cats2);
        mycats.add(cats3);

        Iterator<Cats> cat=mycats.iterator();
        while (cat.hasNext()) {
            Cats thecat=cat.next();
            System.out.println("cats are added"+thecat);
            
        }

    }
}
class Cats implements Comparable<Cats>{// to string should be added 
    int catid;
    String catname;
    String cutiee;


    public int compareTo(Cats x) {
		System.out.println("comparing...."+catname+ " with "+x.catname );
	return x.catname.compareTo(catname);
	}

    
    public Cats(int catid, String catname, String cutiee) {
        this.catid = catid;
        this.catname = catname;
        this.cutiee = cutiee;
    }


    /*public Cats(int catid, String catname, String cutiee) {
        this.catid = catid;
        this.catname = catname;
        this.cutiee = cutiee;
    }
    public Cats(int catid) {
        this.catid = catid;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + catid;
        result = prime * result + ((catname == null) ? 0 : catname.hashCode());
        result = prime * result + ((cutiee == null) ? 0 : cutiee.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cats other = (Cats) obj;
        if (catid != other.catid)
            return false;
        if (catname == null) {
            if (other.catname != null)
                return false;
        } else if (!catname.equals(other.catname))
            return false;
        if (cutiee == null) {
            if (other.cutiee != null)
                return false;
        } else if (!cutiee.equals(other.cutiee))
            return false;
        return true;
    }*/
    @Override
    public String toString() {
        return "Cats [catid=" + catid + ", catname=" + catname + ", cutiee=" + cutiee + "]";
    };
}
