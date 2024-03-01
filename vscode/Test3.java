class Test3 {
    public static void main(String[] args) {
        System.out.println("welcome to parlour ");
        Beautician beaut = new Beautician();
        Customer cust = new Customer();
        beaut.beauty(Customer);

    }
}

class hairStyleSkills {
    String typeOfProducts;

    void Specailist() {
        System.out.println("nice specaillist");
    }
}

class person {
    char gender;
    int age;
    String name;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Stylish {

}

class Beautician extends person {
    Stylish style = new Stylish();

    Beauty style(Customer C) {
        System.out.println("beauty");
        style.Beauty();
        Beauty beauty = new Beauty();
        return Beauty;
    }

}

class Customer extends person {
    float cost;
    String TypeOfStyle;
}

class Beauty {
    Customer C;

    Beauty(Customer C) {
        this.C = C;
    }
}