// Write the codes for all the classes shown in the class diagram. 
// Mark all the overridden methods with annotation @Override.

// https://poweritsrl-my.sharepoint.com/personal/adela_gorea_powerit_dev/_layouts/15/onedrive.aspx?ga=1&id=%2Fpersonal%2Fadela%5Fgorea%5Fpowerit%5Fdev%2FDocuments%2FUML%5FDiagrams%2FEx%5F12%5FJava%5FPolimorfism%2Epng&parent=%2Fpersonal%2Fadela%5Fgorea%5Fpowerit%5Fdev%2FDocuments%2FUML%5FDiagrams
abstract class Animal{
    String name;
    Animal(){}
    Animal(String name){
        this.name = name;
    }
    abstract void greets();
}

class Cat extends Animal{
    Cat(String name){
        this.name = name;
    }

    @Override
    void greets(){
        System.out.println("Meow");
    }
}



class Dog extends Animal{
    Dog(){}
    Dog(String name){
        this.name = name;
    }

    @Override
    void greets(){
        System.out.println("Woof");
    }

    void greets(Dog another){
        System.out.println("Woooof");
    }
}

class BigDog extends Dog{
    BigDog(String name){
        this.name = name;
    }

    @Override
    void greets(){
        System.out.println("Woow");
    }

    void greets(Dog another){
        System.out.println("Woooow");
    }

    void greets(BigDog another){
        System.out.println("Woooooooow");
    }

}

public class polymorphism {

    public static void main(String[] args) {
        Cat cat = new Cat("Sunny");
        Dog dog = new Dog("Bunny");
        Dog another = new Dog("Rory");
        BigDog bigDog = new BigDog("Holly");
        BigDog anotherBig = new BigDog("Elly");

        cat.greets();
        dog.greets();
        dog.greets(another);
        bigDog.greets();
        bigDog.greets(dog);
        bigDog.greets(anotherBig);
    }
}
