public class Parlour {
    public static void main(String[] args) {

    }
}

class person {
    int empId;
    String Name;
    String gender;
    boolean Specailist;

    public int getempId() {
        return empId;
    }

    public void setempId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean getSpecailist() {
        return Specailist;
    }

    public void setSpecailist(boolean Specailist) {
        return Specailist;
    }

}

class beautyParlour extends Parlour// isA
{

}

class Beautician extends person {
    void hairstyle() {

    }
}