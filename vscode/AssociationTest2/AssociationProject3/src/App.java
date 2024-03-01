public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ClinicalDoctor clinicalDoctorobj1=new ClinicalDoctor();


        Patients patientsrefAry[]={
            new Patients("rrr",30,99),
            new Patients("helo", 40,60),
            new Patients("RUCHITHA",40,90)
        };
        Thermometer thermometerobj=new Thermometer();
        
        

        
        clinicalDoctorobj1.operation(patientsrefAry,thermometerobj);
        
    }
    
    
    // clinicalDoctorobj.operation(patientsAry,stethoscopeobj,thermometerobj);
}
class  Person
{

}

class  ClinicalDoctor  extends Person{
    
    void operation(Patients patientsref[],Thermometer thermometerobjref )
    {
        System.out.println("------------------");
        
        for(int i=0;i<patientsref.length;i++){

            Patients patients=patientsref[i];
            if(patients.getTemperature()>70f ){
                System.out.println(patients.getName()+" the age is   "  +   patients.getTemperature()+"has high fever");

            }else if(patients.getTemperature()<70f){
                System.out.println( patients.getName( )  +" the age is  "+  patients.getTemperature()+"has low fever");
            }

        }
        

    }
}
class Thermometer{
    
}

class Patients
{
    String name;
    int age;
    int temperature;
    
    public Patients(String name, int age, int temperature) {
        this.name=name;
        this.age=age;
        this.temperature=temperature;
        
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}


