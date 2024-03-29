public class CinemaTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Actor actor = new Actor();
        actor.setName("Madhuri Dixit");

        Actor actor2 = new Actor();
        actor2.setName("Aishwarya Rai");

        Photographer photographer = new Photographer();
        photographer.setName("Ritesh Saxena");

        Photo thePhoto = photographer.capture(actor);
        Photo anotherPhoto = photographer.capture(actor2);

        thePhoto.photoDetails();
        anotherPhoto.photoDetails();

        // Photo photo = new Photo();
        // photo.photoDetails();
    }

}

class Lens {

}

class Camera {
    int maximumPhotosToStore = 1000; // hasA
    int currentPhotoCount; // hasA
    Lens lens = new Lens(); // hasA

    void click() {
        System.out.println("Camera being clicked....");

        if (currentPhotoCount < maximumPhotosToStore) {
            currentPhotoCount++;
        } else {
            System.out.println("MEmory is full");
        }
    }

    void deletePic() {
        currentPhotoCount--;
    }

    void zoomIn() {
    }

    void zoomOut() {
    }
}

class Person {
    char gender;
    int age;
    String name;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Photographer extends Person // isA
{
    Camera cam1 = new Camera();// hasA
    Camera cam2 = new Camera();

    // passing object as an argument knowsn as USES
    Photo capture(Actor a) {
        System.out.println(name + " is capturing photo of " + a.name);

        if (a.getName().equals("Aishwarya Rai")) {
            a.smile();
        } else if (a.getName().equals("Madhuri Dixit")) {
            a.dance();
        }

        cam1.click();
        Photo photo = new Photo(a);
        System.out.println("---------------");
        return photo; // PRODUCES-A
    }
}

class Actor extends Person {

    void smile() {
        System.out.println(name + " is smiling...");
    }

    void dance() {
        System.out.println(name + " is dancing...");

    }
}

class Photo {
    Actor a; // null

    Photo(Actor a) {
        this.a = a; // initialized
    }

    void photoDetails() {
        System.out.println("Photo of " + a.name + " is very nice");
    }
}
