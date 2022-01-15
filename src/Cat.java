import java.util.StringJoiner;

public class Cat extends Animal{
    String color;

    //Constructoor
    public Cat(String name, int weight, String color) {
        super(name, weight);
        this.color = color;
        System.out.println("Cat is created");
    }

    //new method
    public void makeVibration(){
        System.out.println("Murrrrr-muuuuur-muuuuur");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat saying \"Myauuuu\"");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats meat");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps about 16 hours a day");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cat.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("weight=" + weight)
                .add("animal='" + animal + "'")
                .add("color='" + color + "'")
                .toString();
    }
}
