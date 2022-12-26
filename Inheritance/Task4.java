//Create class Animal and extension classes Dog, Cat, Horse. The class Animal will contain the following properties: food, breed and methods: makeNoise, eat, sleep. 
//The method makeNoise() can output "Dog barks", “Cat meows”, “Horse neighs”. 
//Dog, Cat, Horse must override methods makeNoise() and eat(). Add new properties to classes Dog, Cat, Horse, which are private for specific types of animal.

class Animal{
    protected String nickname;
    protected String food;
    protected String breed;

    public void sleep(){
        System.out.println("Animal" + nickname + "sleeps");
    }
    public void eat(){
        System.out.println("Animal" + nickname + "eats");
    }
    public void makeNoise(){
        System.out.println("Animal" + nickname + "makes noise");
    }
}

class Dog extends Animal{
    private String group;
    @Override public void makeNoise(){
        System.out.println("Dog " + nickname + " barks");
    }

    @Override public void eat(){
        System.out.println("Dag " + nickname + " eats");
    }
}

class Cat extends Animal{
    private  int huntingHours;

    @Override public void makeNoise(){
        System.out.println("Cat " + nickname + " meows");
    }

    @Override public void eat(){
        System.out.println("Cat " + nickname + " eats");
    }
}

class Horse extends Animal{
    private int races;
    @Override public void makeNoise(){
        System.out.println("Horse " + nickname + " neighs");
    }

    @Override public void eat(){
        System.out.println("Horse " + nickname + " eats");
    }
}

