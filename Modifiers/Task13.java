//Create a method to change companyName of all created Worker instances 
//in the previous task. Print the company name of both instances and see the result  
//(add comments about how the static method works in the readme.md file located in the task 
//directory).


import java.util.Scanner;

class Worker{
    double salary;
    static String companyName;
    Worker(double salary){
        this.salary = salary;
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
}

public class methods {

    public static void main(String[] args) {
        Worker.setCompanyName("Company 1");
        Worker first = new Worker(6000);
        Worker second = new Worker(5000);
        System.out.println(first.companyName);
        System.out.println(second.companyName);
        Worker.changeCompanyName("Company 2");
        System.out.println(first.companyName);
        System.out.println(second.companyName);
    }
}
