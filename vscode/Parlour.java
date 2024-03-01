public class Parlour {
    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.setName("Elizabeth");

        Actor actor2 = new Actor();
        actor2.setName("Mia");

        Beautian beautian1 = new Beautian();
        beautian1.setName("BOBBI");

        Customer cust1 = beautian1.beautify(actor);

        Customer cust2 = beautian1.beautify(actor2);

    }
}

class Person {
    String name;
    char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}

class Products {
    String productsNames;

    void makeup() {
        System.out.println("Iam Professional");
    }

}

class Beautian extends Person {
    Products pro1 = new Products();
    Products pro2 = new Products();

    Customer beautify(Actor a) {
        System.out.println(name + " is doing makeup for " + a.name);

        if (a.getName().equals("Mia")) {
            a.style();
        } else if (a.getName().equals("Elizabeth")) {
            a.looks();
        }
        pro1.makeup();
        Customer customer = new Customer(a);
        System.out.println(".........");
        return customer;
    }
}

// class Equipments{
// void hairCut()
// {
// System.out.println("--------")
// }
// }
// class HairStylist extends Person{
// Equipments eq1=new Equipments();
// Equipments eq2=new Equipments(;)

// }

class Actor extends Person {
    void style() {
        System.out.println(name + " ,I am dancer");
    }

    void looks() {
        System.out.println(name + " ,I am actor");
    }
}

class Customer {
    Actor a;

    Customer(Actor a) {
        this.a = a;
    }

}