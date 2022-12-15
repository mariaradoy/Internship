import java.time.Year;
import java.util.Date;

class User{
    public String name;
    public String surname;

    public void setUser(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getFullName(){
        return name+surname;
    }
}

class Student extends User{
    public int year;
    public Student(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public int getCourse(){
        int thisYear = Year.now().getValue();
        int course = thisYear - year;
        if(course >=1 || course <= 5){
            return course;
        }
        else {
            System.out.println("Student is graduated");
            return 0;
        }
    }
}

public class methods {

    public static void main(String[] args) {
        var student = new Student("John", "Doe", 2018);
        System.out.println(student.name);
        System.out.println(student.surname);
        System.out.println(student.getFullName());
        System.out.println(student.year);
        System.out.println(student.getCourse());

    }
}
