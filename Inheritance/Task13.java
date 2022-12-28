// Create a class 'Student' with three data members which are name, age and address. 
// The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available". 
// It has two members with the same name 'setInfo'. First method has two parameters for name and age and assigns the same whereas the second method has 
// three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.
// Hint - Use array of objects

import java.util.Scanner;

class Student{
    String name;
    int age;
    String address;

    Student(){
        name = "Unknown";
        age = 0;
        address = "not available";
    }

    public void setInfo(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Student setInfo(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
        return null;
    }
    public void getInfo(){
        System.out.println(this.name + " " + this.age + " " +this.address);
    }
}

public class polymorphism {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();
        students[3] = new Student();
        students[4] = new Student();
        students[5] = new Student();
        students[6] = new Student();
        students[7] = new Student();
        students[8] = new Student();
        students[9] = new Student();

        for(int i = 0; i < students.length; i++){
            String name;
            int age;
            String address;
            System.out.print(i+1 + ". Name: ");
            name = scanner.nextLine();
            System.out.print("Age: ");
            age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Address: ");
            address = scanner.nextLine();
            students[i].setInfo(name, age, address);
            System.out.println();
        }

        for(int i = 0; i < students.length; i++){
            students[i].getInfo();
        }

    }
}
