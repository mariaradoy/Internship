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
