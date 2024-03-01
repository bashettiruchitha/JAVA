import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
    public static void main(String[] args) {
        try{
         EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();
        Scanner s1= new Scanner(System.in);
        int idsearch=s1.nextInt();
        System.out.println("enter the modify number");
        Student student=em.find(Student.class, idsearch);
        if(student==null){
            StudentNotException n=new StudentNotException("student not found");
            throw n ;

        }

       System.out.println("current student name"+student.getStudentName());
        System.out.println("current age "+student.getStudentage());
        System.out.println("current department"+student.getStudentdept());


        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in);
        Scanner s4=new Scanner(System.in);

        System.out.println("enter the name");
        String newstudentname=s2.nextLine();

        System.out.println("enter the age");
        int  newage=s3.nextInt();

        System.out.println("enter the department");
        String newdepartment =s4.nextLine();

        student.setStudentName(newstudentname);
        student.setStudentage(newage);
        student.setStudentdept(newdepartment);

        em.merge(student);
        trans.commit();
        em.close();

    }catch(StudentNotException e){
        System.out.println("student not found exception"+e);
    }
    }

}
