//Override toString and hashCode methods as following:

//    toString will print all class properties, each in new line
//    hashCode will print “Class hashcode is: {hashCode}”

//Add comments about why you need to override those methods in the readme.md file located in the task directory.

import java.util.Objects;

class Worker{
    String name;
    double salary;
    static String companyName;

    Worker(String name){
        this.name = name;
    }

    Worker(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    {

    }

    public static void setCompanyName(String companyName){
        Worker.companyName = companyName;
    }

    public static void changeCompanyName(String companyName){
        Worker.companyName = companyName;
    }

    double getBruttoSalary(){
        System.out.print("Brutto Salary: ");
        return salary;
    }

    double getNettoSalary(){
        System.out.print("Netto Salary: ");
        return salary-(salary*0.20);
    }

    double increaseSalary(double sum){
        System.out.print("Increased Salary: ");
        return salary+sum;
    }

    double decreaseSalary(double sum){
        System.out.print("Decreased Salary: ");
        return salary-sum;
    }

    @Override
    public String toString(){
        return this.name + "\n" +  this.salary;
    }

    @Override
    public int hashCode(){
        System.out.print("Class hashcode is: ");
        return Objects.hash(name, salary);
    }
}

public class methods {

    public static void main(String[] args) {
        Worker iva = new Worker("Iva", 5000);
        System.out.print(iva.hashCode());
        System.out.print(iva.toString());
    }
}
