import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Novels n1=new Novels("rrrr", 12, "jjjjj");
        Novels n2=new Novels("HHHH", 21, "IIIII");
        Novels n3=new Novels("yyyyy", 51, "oooo");
        Novels n4=new Novels("iiiiii", 45, "hellooo");

        System.out.println("novels are ready");
        HashSet<Novels>  novels=new HashSet<>();

        System.out.println("adding novels");
novels.add(n1);
novels.add(n2);
novels.add(n3);
novels.add(n4);


System.out.println("novles are added -----");
Iterator<Novels>x=novels.iterator();
while (x.hasNext()) {
    Novels thNovels=x.next();
    System.out.println("the novels......"+thNovels);
    
}
    }
}
class Novels{
String name;

int Id;

String  category;

public Novels(int id) {
    super();
    this.Id = id;
}


public Novels(String name, int id, String category) {
    super();
    this.name = name;
   this. Id = id;
    this.category = category;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + Id;
    result = prime * result + ((category == null) ? 0 : category.hashCode());
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
    Novels other = (Novels) obj;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    if (Id != other.Id)
        return false;
    if (category == null) {
        if (other.category != null)
            return false;
    } else if (!category.equals(other.category))
        return false;
    return true;
}


@Override
public String toString() {
    return "Novels [name=" + name + ", Id=" + Id + ", category=" + category + "]";
}

}
