//John Doe, a cat breeder, believes that it is vitally important to know how to distinguish different types of animals. 
//Let's help John Doe out. We'll write a method that determines the class of the object passed to it, 
//and returns one of the following results: "Cow", "Whale", "Dog", or "Unknown Animal".
 
class Cow{

}
class Whale{

}
class Dog{

}

public class polymorphism {

    static void defineAnimal(Object obj){
        if(obj instanceof Cow){
            System.out.println("Cow");
        }
        else if(obj instanceof Whale){
            System.out.println("Whale");
        }
        else if(obj instanceof Dog){
            System.out.println("Dog");
        }
        else{
            System.out.println("Unknown animal");
        }
    }
    public static void main(String[] args) {
        Cow cow = new Cow();
        Whale whale = new Whale();
        Dog dog = new Dog();

        defineAnimal(whale);
    }
}
