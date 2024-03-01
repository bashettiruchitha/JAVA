public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

Student student=new Student();
student.StartTheExam();
student.enterInExamHall();
student.exitFromExamHall();


    }
}
class Student{
    void enterInExamHall(){
        System.out.println("entering into the exam hall");
    }
    void exitFromExamHall(){
        System.out.println("exiting from exam hall");
    }
    void StartTheExam(){
        ExamHall examHall;
        try{
            examHall=new ExamHall();
            examHall.writing();
        }catch(LinkNotFoundException e){
            e.printStackTrace();
        }
        FinishTheExam();

    
        System.out.println("starting the exam");
    }
    void FinishTheExam(){
        System.out.println("finishing the exam");   
}
}
class ExamHall{


    ExamHall() throws LinkNotFoundException{
        double val=Math.random()%10;
        if(val>0.80){
            throw new LinkNotFoundException("oh link not there");
        }
    }
    void  writing(){
    for(int i=1;i<=50;i++){
            double val=Math.random()%10;

            if(val>0.90){
                throw new HallTicketException("Omg i have forget the hall ticket in my home ");
                }
                }
        
    }
}

class HallTicketException extends RuntimeException{//checked
    HallTicketException(String msg){
        super(msg);
    }
}
class LinkNotFoundException extends Exception{//unchecked
    LinkNotFoundException(String msg){
        super(msg);
    }
}
