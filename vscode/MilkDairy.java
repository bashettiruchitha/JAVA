class MilkDairy {
    ClarifiedButter purchase() {
        Cow cow = new Cow();

        Milk milk = cow.milkACow();
        Curd curd = milk.coagulate();
        Butter butter = curd.churn();

        ClarifiedButter clarifiedButter = butter.boil();
        return clarifiedButter;
    }
}

public class ProducesTest {
    public static void main(String[] args) {

        MilkDairy theDairy = new MilkDairy();

        ClarifiedButter clarifiedButter = theDairy.purchase();

        System.out.println("Ghee   : " + clarifiedButter);

    }
}

class Cow {
    Milk milkACow() {
        Milk milk = new Milk("GirCow", "White", 60);
        return milk;
    }
}

class ClarifiedButter {
    private String type;
    private String color;
    private String density;
    private double quantity;

    public ClarifiedButter(String type, String color, String density, double quantity) {
        super();
        this.type = type;
        this.color = color;
        this.density = density;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDensity() {
        return density;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ClarifiedButter [type=" + type + ", color=" + color + ", density=" + density + ", quantity=" + quantity
                + "]";
    }

}

class Butter {
    private String type;
    private String color;
    private String density;
    private double quantity;

    public Butter(String type, String color, String density, double quantity) {
        super();
        this.type = type;
        this.color = color;
        this.density = density;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Butter [type=" + type + ", color=" + color + ", density=" + density + ", quantity=" + quantity + "]";
    }

    ClarifiedButter boil() {
        System.out.println("Boiling " + quantity + " kg butter...");
        ClarifiedButter clarifiedButter = new ClarifiedButter(type, color, density, this.quantity * 0.75f);
        return clarifiedButter;
    }

}

class Curd {
    private String type;
    private String color;
    private String density;
    private int quantity;

    public Curd(String type, String color, String density, int quantity) {
        super();
        this.type = type;
        this.color = color;
        this.density = density;
        this.quantity = quantity;
    }

    Butter churn() {
        System.out.println("Churning the " + this.quantity + "kg Curd");
        Butter butter = new Butter(type, color, density, this.quantity * (0.5f * 0.100));
        return butter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDensity() {
        return density;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Curd [type=" + type + ", color=" + color + ", density=" + density + ", quantity=" + quantity + "]";
    }

}

class Milk // extends Object = super class in java
{
    private String type;
    private String color;
    private int quantity;

    public Milk(String type, String color, int quantity) {
        super();
        this.type = type;
        this.color = color;
        this.quantity = quantity;
    }

    Curd coagulate() {
        System.out.println(quantity + " ltr Milk is being coagulated....");
        Curd curd = new Curd(type, "white", "thick", quantity / 3);
        return curd;

    }

    Milk curdling() {
        System.out.println(quantity + " litre milk being curdling");
        Milk milk = new Milk(type, "white", quantity / 0.75);
    }

    void printMilk() {
        System.out.println("Type     : " + type);
        System.out.println("Color    : " + color);
        System.out.println("Quantity : " + quantity);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Milk [type=" + type + ", color=" + color + ", quantity=" + quantity + "]";
    }

}