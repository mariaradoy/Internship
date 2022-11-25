//Create a new method on class Person that prints in console name, age and gender. Come up with an intuitive name for this method.

class Person{
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    void printPersonInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

public class methods {

    public static void main(String[] args) {
        Person iva = new Person("Iva", 26, "female");
        iva.printPersonInfo();
    }
}
