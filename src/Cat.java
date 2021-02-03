public class Cat {
    private String name = "Roger";
    private int height = 40;
    private int weight = 3;
    private int age = 5;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != "")
        this.name = name;
    }
}
