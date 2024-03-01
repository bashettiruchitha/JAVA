public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        BluePen bluePen=new BluePen();
        bluePen.write("ballpen");
        bluePen.check("Red");
        
    }
}
class Pen{
    
}
class BluePen extends Pen{


    String LinkType;
    String PenType;
   /*  public BluePen(String linkType, String penType) {
        LinkType = linkType;
       PenType = penType;
    }*/
    void write(String PenType){
        
        System.out.println(PenType+"is working ");
    }
    void check(String linkType){
        this.LinkType=linkType;
        if(LinkType.equals("Red")){
            System.out.println("its is a red link");
        }else{
            System.out.println("the pen is not red pen");
        }
    }

}
