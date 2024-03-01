public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Person person=new Person();
        person.Journey();
        person.Learning();
    }
}
class Person{
    void Journey()
    {
        for(int i=0;i<=10;i++){
        double val=Math.random()%10;
        if(val>0.90){
            throw new AutoNotFoundException("no auto there");
        }
        System.out.println("jouney done"+i);
    }
}
void Learning(){
    double val=Math.random()%10;
    if(val>0.99){
        try
        {
            throw new PSDNotFoundExcpetion("psd not found");
        } catch (PSDNotFoundExcpetion e) {
            e.printStackTrace();
        }
    }
}

}

class AutoNotFoundException extends RuntimeException
{
    AutoNotFoundException(String string)
    {
        super(string);
    }
}
class PSDNotFoundExcpetion extends Exception
{
    PSDNotFoundExcpetion(String string)
    {
        super(string);
    }
}