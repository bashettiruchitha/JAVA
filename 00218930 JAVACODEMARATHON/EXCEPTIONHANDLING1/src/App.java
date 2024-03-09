public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        KaraTest karaTest=new KaraTest();
        karaTest.KungFuMaster();
    }
}
class KaratMaster{
  public  void  knockDown(){

    }

}
class KaraTest{
     void KungFuMaster() throws KnockDownException{
        for(int i=0;i<20;i++){
            double val=Math.random()%10;
            if(val>0.90){
                throw new  KnockDownException("ohh! he fallen");
            }
            else{
                if(val<0.30){
                    throw new FallenException("ohh sh/he fallen");
                }
            }
        }
     }
}
