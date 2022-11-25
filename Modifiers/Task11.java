//Create the following methods for Worker class:
//
//    set salary - to set worker brutto salary
//    get brutto salary - get brutto salary
//    get netto salary - gen netto salary (brutto salary - 20%)
//    increase salary - increase salary with specified sum
//    decrease salary - decrease salary with specified sum
//
//Create a scenario and use all methods.

import java.util.Scanner;

class Worker{
    double salary;
    Worker(double salary){
        this.salary = salary;
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
        Worker first = new Worker(6000);
        System.out.println(first.getBruttoSalary());
        System.out.println(first.getNettoSalary());
        System.out.println(first.increaseSalary(2500));
        System.out.println(first.decreaseSalary(2500));
    }
}
