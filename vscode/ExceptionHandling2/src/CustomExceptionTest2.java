public class CustomExceptionTest2 {
    public static void main(String[] args) throws LinkNotFoundException {
        System.out.println("begin main");
        try {
          ExamHall examHall=new ExamHall();
          examHall.writing();
            
        } catch (HallTicketException e1) {
            // TODO: handle exception
            System.out.println("hall ticket not there"+e1);
        }
        catch(LinkNotFoundException e2){
            System.out.println("link is not there");
        }
        

    }
    
}
