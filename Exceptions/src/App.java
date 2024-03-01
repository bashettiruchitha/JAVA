public class App {

    private static double x;

    public static void main(String[] args)  {
        System.out.println("Hello, World!");
        Account account=new Account();
        try {
            account.withdraw(x);
        } catch (InvalidException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InsufficientFundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
}
class Account{

    private double balance;
    
    //public Account(double initialBalance){
       // this.balance=initialBalance;
   // }
    public void withdraw(double x) throws InvalidException,InsufficientFundException{
        if(x<0){
            throw new InvalidException("negative");
        }else {
            System.out.println("positive amount");
        }
        if(x>balance){
            throw new  InsufficientFundException("exceeds");
        }
        
    }
}
class InvalidException extends Exception{
    InvalidException(String str){
        super(str);
    }
}
class InsufficientFundException extends Exception{
    InsufficientFundException(String str){
        super(str);
    }
}