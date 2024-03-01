public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("BEGIN THE THREAD");
        Message messageThread1=new Message(" ping");
        messageThread1.start();
        //myThread1.start();
        Message messageThread2=new Message(" Pong");
        messageThread2.start();
        
        Message messageThread3=new Message("   pung");
        messageThread3.start();

        
        System.out.println("ENDTHE THRAED");
    }
}

class Message extends Thread{
    private String  str;
    Message(String x){
        str=x;
    }
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println(str+i);
        }

    }



}
