public class Test {
    public static void main(String[] args) {
        NonVegKitchen NonVegKitchenObj = new NonVegKitchen();
        Chicken chickenObj = new Chicken(60.0f);
        NonVegKitchenObj.cook(chickenObj);

    }
}

class Kitchen {

}

class NonVegKitchen extends Kitchen {
    NonVeg nonVegObj = new NonVeg();

    void cook(Chicken objRef) {
        System.out.println("food is ready");
    }

}

class NonVeg {

}

class Chicken {
    float quantity;

    public Chicken(float quantity) {
        this.quantity = quantity;
    }

    public float getquantity() {
        return quantity;
    }

    public void setquantity(float quantity) {
        this.quantity = quantity;
    }

}
