public class App3 {
    public static void main(String[] args) {
        Table table=new Table();
        Thread1 t=new Thread1(table);
        t.start();
        
    }
    
}
class Table
{
    void printTable(int n){
        for(int i=1;i<10;i++){
            System.out.println(i*n+"");
        }

    }
}
class Thread1 extends Thread{
    Table t;
    Thread1( Table t){
this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
