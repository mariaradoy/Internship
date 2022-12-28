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
