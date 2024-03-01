public class Institue {
    public static void main(String[] args){
        System.out.println("welcome to institue")

        Coaching[] students=new Coaching[4];

        students[0]=new Coaching("ruchitha","cse","female",80);

        for(Coaching students : students)
        {
            student.traningFee();
        }
    }
}

class Lectures {

}

class Coaching extends Institue {
    Lectures Lectobj =new Lectures;

    public String studentName;
    public String Branch;
    public float percentage;
    private String gender;

    public Coaching(String studentName, String Branch, String percentage, float gender) {
        this.studentName = studentName;
        this.Branch = Branch;
        this.percentage = percentage;
        this.gender = gender;
    }

    void TraningFee()
    {
        double total=25000;
        if(percentage>=9 && percentage<=10){
            total=total-1000;
            
        }
        else if(percentage>=8 && percentage<=9){
            total=total-800;
        }
        else if(percentage>=7 && percentage<=8){
            total=total-700;
        }
        elseif(percentage>=6 && percentage<=7)
        {
            total=total-500;
        }
        else{
            System.out.println("thank you for joining")
        }
    }System.out.println("your name is "studentName+Branch+" "+gender+"total traning fee"+total);
}