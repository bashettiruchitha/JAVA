public class CustomeTest{
    public static void main(String[] args) {
        try{
            Boxer boxer=new Boxer();
            boxer.Boxing();
        }catch(LoosetheGameException e1){
            System.out.println("lossing the game"+e1);
        }catch(BleedingException e2){
            System.out.println("bleeding exception"+e2);
        }
    }
}