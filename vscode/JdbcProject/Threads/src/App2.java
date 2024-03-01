public class App2 {
    public static void main(String[] args)throws Exception {
        Alaram alaram1=new Alaram("ting");
        alaram1.start();
        Alaram alaram2=new Alaram("tik");
        alaram2.start();
        Alaram alaram3=new Alaram("tik tik");
        alaram3.start();

        
    }
    
}
class Alaram extends Thread{
    private String  str;
    Alaram (String x){
        str=x;
    }
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println(str+i);
        }

    }



}
