// Write a subclass called SubClass that is derived from SuperClass and that adds an integer data field called data2 and a public method called checkCondition() 
// that will check if data1 is equal to 10 and data2 is equal to 15, the checkCondition () method should return “Condition True!”. 
// Also, create methods called setData2() and getData2() for setting and retrieving the value of data1 and data2, as well as a constructor 
// that accepts arguments for the starting values of data1 and data2. data1 is data member of SuperClass.

import java.lang.module.Configuration;

class SuperClass{
    int data1;
    SuperClass() {
    }
    SuperClass(int data1){
        this.data1 = data1;
    }

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }
}

class subClass extends SuperClass{
    int data2;
    subClass(int data2){
        this.data2 = data2;
    }

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    public String checkCondition(int data1, int data2){
        if(data1 == 10 && data2 == 15){
            return "Condition True!";
        }
        else {
            return "Condition False!";
        }
    }
}

public class polymorphism {

    public static void main(String[] args) {
        subClass sub = new subClass(12);
        SuperClass superclass = new SuperClass(31);
        System.out.println(sub.checkCondition(superclass.data1, sub.data2));
        superclass.setData1(10);
        sub.setData2(15);
        System.out.println(sub.checkCondition(superclass.data1, sub.data2));
    }
}
