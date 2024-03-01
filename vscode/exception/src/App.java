public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try{
            Person p1=new Person();
      p1.journey();
        }catch(DiselNotFoundException e){
            System.out.println("disel not found exception"+e);
        }catch(EngineFailException e2){
            System.out.println(e2);
        }
      
}
}
class Person
{
    void journey() throws EngineFailException
    {
        
            double val=Math.random()%10;
            if(val>0.99)
            {
                throw new DiselNotFoundException("ohh! disel not there ");
            }
        else if(val<0.89 && val>0.90)
        {
           
                throw new EngineFailException("ohh! engine fail ");
                
            }
            System.out.println("exception caught"); 
        }
        
    }  

     class EngineFailException extends Exception
    {
    EngineFailException(String msg){
        super(msg);
    }
}

 class DiselNotFoundException extends RuntimeException {
    DiselNotFoundException(String msg){
        super(msg);
    }
    
}
    



