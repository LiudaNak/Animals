import java.util.StringJoiner;

public class Horse extends Animal{
    int horsepower;

    //Constructor
    public Horse(String name, int weight, int horsepower) {
        super(name, weight);
        this.horsepower = horsepower;
        System.out.println("Horse is created");
    }

    @Override
    public void makeSound() {
        System.out.println("Horse says \"Igogo\"");
    }

    @Override
    public void eat() {
        System.out.println("Horse eats oat");
    }

    @Override
    public void sleep() {
        System.out.println("Horse sleeps about 4 hours");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Horse horse = (Horse) o;

        return horsepower == horse.horsepower;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + horsepower;
        return result;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Horse.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("weight=" + weight)
                .add("animal='" + animal + "'")
                .add("horsepower=" + horsepower)
                .toString();
    }
}
