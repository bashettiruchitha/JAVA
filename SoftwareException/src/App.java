import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Labtop labtop=new Labtop();
        
        System.out.println("enter the x value ");
        Scanner scanner =new Scanner(System.in);
        int x=scanner.nextInt();
        System.out.println("enter y value ");
        Scanner scanner2=new Scanner(System.in);
        int y=scanner2.nextInt();
        labtop.check();
       
    }
}
class Labtop{
  Labtop(){
        //double val=Math.random()%10;
        
        if(x>y){
            throw new SoftwareException("software problem");
        }

    }
    void check() throws HardwareException{
       // double val=Math.random()%10;
    
        if(x<y){
            throw new HardwareException("hardware issue");
        }
    }

}
class  SoftwareException extends RuntimeException{
    SoftwareException(String msg){
        super(msg);
    }
}
class HardwareException extends Exception{
    HardwareException(String msg){
        super(msg);
    }
}