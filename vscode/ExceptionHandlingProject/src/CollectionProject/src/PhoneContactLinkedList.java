public class PhoneContactLinkedList {
    public static void main(String[] args) {
        PhoneContact contact1 = new PhoneContact("ruchitha", 123455, "ruchi@gmail.com");
        PhoneContact contact2 = new PhoneContact("ruchitha", 123455, "ruchi@gmail.com");
        PhoneContact contact3 = new PhoneContact("ruchitha", 123455, "ruchi@gmail.com");
        PhoneContact contact4 = new PhoneContact("ruchitha", 123455, "ruchi@gmail.com");

    }
}

class PhoneContact {
    String name;
    String PhoneNumber;
    String email;

    public PhoneContact(String name, int i, String email) {
        this.name = name;
        PhoneNumber = i;
        this.email = email;
    }
}
