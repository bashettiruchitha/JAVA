public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Boxer boxer=new Boxer();
        boxer.Boxing();
}
}
class Boxer{
    Boxer() throws LoosetheGameException{
        double x=Math.random()%10;
        if(x>0.5 && x<0.99){
            throw new LoosetheGameException("ohh!! loose the game");
        }
    
    
    }
    void  Boxing(){
        double y=Math.random()%10;
        if(y>0.1 &&  y<0.99){
            throw new  BleedingException("oh!! it is bleeding ");
        }
    }

}
class LoosetheGameException extends Exception{//checked
    LoosetheGameException(String msg){
        super(msg);
    }
}
class BleedingException extends RuntimeException{//unchecked
    BleedingException(String msg){
        super(msg);
    }
}

