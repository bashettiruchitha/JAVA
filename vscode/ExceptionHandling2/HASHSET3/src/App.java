import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Laptab l1=new Laptab(1, "hp", 70000);
        Laptab l2=new Laptab(2, "dell", 80000);
        Laptab l3=new Laptab(3, "lenovo", 50000);
        Laptab l4=new Laptab(4, "dell", 60000);
        HashSet<Laptab>theLaptabs=new HashSet<Laptab>();

        theLaptabs.add(l1);
        theLaptabs.add(l2);
        theLaptabs.add(l3);
        theLaptabs.add(l4);
        Iterator<Laptab> x=theLaptabs.iterator();
        while (x.hasNext()) {
            System.out.println("the laptab"+x.next());
            
        }


    
        
    }
}
class Laptab{
    int lapid;
    String lapname;
double  lapPrice;
public Laptab(int lapid, String lapname, double lapPrice) {
    this.lapid = lapid;
    this.lapname = lapname;
    this.lapPrice = lapPrice;
}
public int getLapid() {
    return lapid;
}
public void setLapid(int lapid) {
    this.lapid = lapid;
}
public String getLapname() {
    return lapname;
}
public void setLapname(String lapname) {
    this.lapname = lapname;
}
public double getLapPrice() {
    return lapPrice;
}
public void setLapPrice(double lapPrice) {
    this.lapPrice = lapPrice;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + lapid;
    result = prime * result + ((lapname == null) ? 0 : lapname.hashCode());
    long temp;
    temp = Double.doubleToLongBits(lapPrice);
    result = prime * result + (int) (temp ^ (temp >>> 32));
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
    Laptab other = (Laptab) obj;
    if (lapid != other.lapid)
        return false;
    if (lapname == null) {
        if (other.lapname != null)
            return false;
    } else if (!lapname.equals(other.lapname))
        return false;
    if (Double.doubleToLongBits(lapPrice) != Double.doubleToLongBits(other.lapPrice))
        return false;
    return true;
}
@Override
public String toString() {
    return "Laptab [lapid=" + lapid + ", lapname=" + lapname + ", lapPrice=" + lapPrice + "]";
}
}   