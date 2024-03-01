import java.lang.reflect.Method;

public class AnnotationReflectionTest {
    public static void main(String[] args) {
        GrandFather gf=new GrandFather();
        Class theMirror =gf.getClass();
        Method methods[]= theMirror.getMethods();
        for(Method thMethod:methods){
            System.out.println("method name is"+getName());
        }
        //reflections
        
    }
    
}//annnotation
class  GrandFather{
    void farming()
    {
        System.out.println("grandfather is farming");

    }
}
