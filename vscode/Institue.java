public class Institue {
    public static void main(String[] args) {
        System.out.println("welcome to institue");

        Coaching coachobj1 = new Coaching("ruchi", "cse", 9, "female");

        coachobj1.TraningFee();

    }
}

class Lectures {

}

class Coaching extends Institue {
    Lectures Lectobj = new Lectures();

    public String studentName;
    public String Branch;
    public int percentage;
    private String gender;

    public Coaching(String studentName, String Branch, int percentage, String gender) {
        super();
        this.studentName = studentName;
        this.Branch = Branch;
        this.percentage = percentage;
        this.gender = gender;
    }

    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public void setpercentage(int percentage) {
        this.percentage = percentage;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getstudentName() {
        return studentName;
    }

    public String getBranch() {
        return Branch;

    }

    public int percentage() {
        return percentage;
    }

    public String gender()

    {
        return gender;
    }

    void TraningFee() {
        double total = 25000;
        if (percentage >= 9 && percentage <= 10) {
            total = total - 1000;
            System.out.println("dear  " + studentName + "your traning fee is " + total + "and Branch" + Branch);

        } else if (percentage >= 8 && percentage <= 9) {
            total = total - 800;
            System.out.println("your traning fee" + total);
        } else if (percentage >= 7 && percentage <= 8) {
            total = total - 700;
            System.out.println("your traning fee" + total);
        } else if (percentage >= 6 && percentage <= 7) {
            total = total - 500;
            System.out.println("your traning fee" + total);
        } else {
            System.out.println("your not eligible");
        }
    }
}
