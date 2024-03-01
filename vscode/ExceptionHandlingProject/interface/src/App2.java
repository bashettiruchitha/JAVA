public class App2 {
    public static void main(String[] args) {
        System.out.println("wlecome to market");
        Market market = new Market();
        market.Sells();
        System.out.println("----------");
        Vegetables vegetables = new Vegetables();
        vegetables.Buy();
        System.out.println("----------");
        NonVegetables nonVegetables = new NonVegetables();
        nonVegetables.Buy();
    }
}

class Market {
    void Sells() {
        System.out.println("selling vegetables");
    }
}

interface Purchase {
    void Buy();
}

class Vegetables extends Market implements Purchase {
    public void Buy() {
        System.out.println("only vegetables are avaialble");
    }
}

class NonVegetables extends Market implements Purchase {
    public void Buy() {
        System.out.println("only non veg avaialble");
    }
}