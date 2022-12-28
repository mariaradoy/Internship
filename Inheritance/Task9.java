// Write a program to implement polymorphism using inheritance. 
// Consider the example of Shape as base class with method show(). 
// And then a child class Circle and Rectangle which inherit the base class Shape and override its method show(). 
// Add one more Method with the name of getInfo(). This method would display the class name in which it is implemented. 
// Do not override this method. When you will call the method getInfo() with child object it would still show the  name of the base class, 
// which implies that method has been directly inherited and was not overridden.

class Shape{
    public void show(){
        System.out.println("Show shape");
    }
    protected void getInfo(){
        System.out.println("Shape");
    }
}

class Circle extends Shape{
    @Override
    public void show(){
        System.out.println("Show circle");
    }
}

class Rectangle extends Shape{
    @Override
    public void show(){
        System.out.println("Show rectangle");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getInfo();
        circle.show();
    }
}
