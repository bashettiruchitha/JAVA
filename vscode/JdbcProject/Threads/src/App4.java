public class App4 {
    public static void main(String[] args) {

        SedanCar sedanCar1 = new SedanCar("BMW"); //Chalk chalk = new Chalk();
        SedanCar sedanCar2 = new SedanCar("MERC"); //Chalk chalk = new Chalk();
        SedanCar sedanCar3 = new SedanCar("SKODA"); //Chalk chalk = new Chalk();

        HorseCart horseCart = new HorseCart();
        Cycle cycle=new Cycle();
        Bike bike=new Bike();

        Thread thread1 = new Thread(sedanCar1); //Pen pen = new Pen(chalk);
        Thread thread2 = new Thread(sedanCar2); //Pen pen = new Pen(chalk);
        Thread thread3 = new Thread(horseCart); //Pen pen = new Pen(chalk);
        Thread thread4 = new Thread(sedanCar3); //Pen pen = new Pen(chalk);
        Thread thread5=new Thread(cycle);
        Thread thread6=new Thread(bike);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        
        
        
    }
}

class Car {
    void drive() {
        System.out.println("driving....a car");
    }
}
class SedanCar extends Car implements Runnable
{
    String modelName;
    SedanCar(String model) {
        modelName = model;
    }
    public void run() {
        System.out.println(modelName+" Car is running....");
    }
} 

class HorseCart implements Runnable {
    public void run() {
       // System.out.println("put the horses infront of the cart, and not behind the cart.. dear mind of the human...");
        System.out.println("Horse cart is running...");
    }
}
class Cycle implements Runnable{
    public void  run(){
        System.out.println("cycle is running");
    }
}
class Bike implements Runnable{
    public void run()
    {
        System.out.println("bike is running");
    }
}