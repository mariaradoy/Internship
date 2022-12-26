import java.time.Year;

class Transport{
    protected String model;
    protected double price;
    protected int productionYear;
    public Transport(String model, double price, int productionYear){
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
    }

    public int getAge(){
        int currentYear = Year.now().getValue();
        int age = currentYear - productionYear;
        return age;
    }
    public void move(){
        System.out.println("Transport is moving");
    }
}
class Car extends Transport{
    public Car(String model, double price, int productionYear) {
        super(model, price, productionYear);
    }

    @Override public void move(){
        System.out.println("Car is moving");
    }
}
class Mercedes extends Car{
    public Mercedes(String model, double price, int productionYear) {
        super(model, price, productionYear);
    }

    @Override public void move(){
        System.out.println("Mercedes is moving");
    }
}

class Truck extends Transport{
    public Truck(String model, double price, int productionYear) {
        super(model, price, productionYear);
    }

    @Override public void move(){
        System.out.println("Truck is moving");
    }
}

class MAN extends Truck{
    public MAN(String model, double price, int productionYear) {
        super(model, price, productionYear);
    }

    @Override public void move(){
        System.out.println("MAN is moving");
    }
}

class Airplane extends Transport{
    public Airplane(String model, double price, int productionYear) {
        super(model, price, productionYear);
    }

    @Override public void move(){
        System.out.println("Airplane is flying");
    }
}

class Airbus extends Airplane{
    public Airbus(String model, double price, int productionYear) {
        super(model, price, productionYear);
    }

    @Override public void move(){
        System.out.println("Airbus is flying");
    }
}

class Boeing extends Airplane{
    public Boeing(String model, double price, int productionYear) {
        super(model, price, productionYear);
    }

    @Override public void move(){
        System.out.println("Boeing is flying");
    }
}
public class methods {

    public static void main(String[] args) {
        
    }
}
