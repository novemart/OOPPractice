public class Dog {

    private String name;
    private int height;
    private int weight;
    private int age;
    private boolean isOkay = true;
    String colour = "black";

    private static int counter;

    public Dog(String name, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        counter ++;
    }

    public Dog(String name1) {
        this(name1, 10, 10, 10);
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsOkay(){
        return this.isOkay;
    }

    public static int getCounter(){
        //this.name = "Martina";
        return counter;
    }
}

