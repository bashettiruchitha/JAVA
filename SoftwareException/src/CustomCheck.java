public class CustomCheck {
    public static void main(String[] args) {
        try{
            Labtop labtop=new Labtop();
            labtop.check();
            
        }catch(SoftwareException e1){
            System.out.println("software problemmm");
        }
        catch(HardwareException e2){
            System.out.println("hardware issue");
        }
    }
    
}
