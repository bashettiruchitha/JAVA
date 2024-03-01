public class Vechile {
    public static void main(String[] args) {
        System.out.println("helooo passengers");

        Bus busobj1 = new Bus();
        busobj1.setPassengerName("ruchitha");
        busobj1.setpassType("");
        busobj1.setPassengerType("child");

        busobj1.Billing();
        // busobj1.PassengerType();

    }
}

class Conductor {

}

class Bus extends Vechile {
    Conductor Condobj = new Conductor();

    String PassengerName;
    String passType;
    String PassengerType;

    void setPassengerName(String PassengerName) {
        this.PassengerName = PassengerName;
    }

    void setpassType(String passType) {
        this.passType = passType;
    }

    void setPassengerType(String PassengerType) {
        this.PassengerType = PassengerType;
    }

    void Billing() {
        if (passType.equals("dailypass")) {
            System.out.println(PassengerName + "your pass fee = 100");
        } else if (passType.equals("monthlypass")) {
            System.out.println(PassengerName + "your pass fee = 450");
        } else if (passType.equals("yearlypass")) {
            System.out.println(PassengerName + "your pass fee=1000");
        } else {
            System.out.println("No pass");
            if (PassengerType.equals("child")) {
                System.out.println(PassengerName + "your charge is = 30");
            }
            if (PassengerType.equals("adult")) {
                System.out.println(PassengerName + "your charges is = 60");
            }
            if (PassengerType.equals("oldage")) {
                System.out.print(PassengerName + "your charges is = 80");
            }
        }
    }

    // void PassengerType() {
    // if (passType != null) {

    // }
    // }

}