public class Shop {
    public static void main(String[] args) {
        System.out.println("hello");
        MedicalShop obj = new MedicalShop();
        obj.charges("Dolo", 9);
    }
}

class MedicalShop extends Shop {
    String[] medicineName = { "Dolo", "Citrizen", "Ativan" };
    int noOfCap;
    double costOfTablet;

    void charges(String medName, int noOfCap) {
        int totalCharges = 0;

        if (medName == "Dolo") {
            totalCharges = totalCharges + 6 * noOfCap;
        } else if (medName == "Citrizen") {
            totalCharges = totalCharges + 5 * noOfCap;
        } else if (medName == "Ativan") {
            totalCharges = totalCharges + 7 * noOfCap;
        } else {
            System.out.println("not available");
        }

        System.out.println("the total cost of your bill is " + totalCharges);
    }
}