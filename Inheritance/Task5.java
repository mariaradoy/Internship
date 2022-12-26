//Suppose that we have a set of objects with some common behaviors: they could move up, down, left or right. 
//The exact behaviors (such as how to move and how far to move) depend on the objects themselves. 
//One common way to model these common behaviors is to define an interface called Movable, with abstract methods moveUp(), moveDown(), moveLeft() and moveRight(). 
//The classes that implement the Movable interface will provide actual implementation to these abstract methods.
Write two concrete classes - MovablePoint and MovableCircle - that implement the Movable interface.

interface Movable{
    abstract public void moveUp();
    abstract public void moveDown();
    abstract public void moveLeft();
    abstract public void moveRight();
}
class MovablePoint implements Movable {

    @Override
    public void moveUp() {
        System.out.println("Point moves up");
    }

    @Override
    public void moveDown() {
        System.out.println("Point moves down");
    }

    @Override
    public void moveLeft() {
        System.out.println("Point moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("Point moves right");
    }
}

class MovableCircle implements Movable{

    @Override
    public void moveUp() {
        System.out.println("Circle moves up");
    }

    @Override
    public void moveDown() {
        System.out.println("Circle moves down");
    }

    @Override
    public void moveLeft() {
        System.out.println("Circle moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("Circle moves right");
    }
}
public class methods {

    public static void main(String[] args) {

    }
}
