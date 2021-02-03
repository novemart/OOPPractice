public class Practice {

    public static void main(String[] args) {
        Dog doggie1 = new Dog("Buddy");
        Dog doggie2 = new Dog("Ruby", 13, 10, 5);

        System.out.println("Doggie one is called " + doggie1.getName());
        System.out.println("Doggie two is called " + doggie2.getName());
        System.out.println("Is doggie one okay? " + doggie1.getIsOkay() );
        System.out.println("Doggie's one colour is " + doggie1.colour);

        System.out.println("We have " + doggie2.getCounter() + " dogs");
        System.out.println("We have " + Dog.getCounter() + " dogs");

        sayHello();

        Cat kitty1 = new Cat();
        System.out.println("Cat one is called "+ kitty1.getName());
        kitty1.setName( "");
        System.out.println("Cat one is now called "+ kitty1.getName());
    }

    public static void sayHello(){
        System.out.println("Hello");
    }
}
