public abstract class Animal {
    public String name;
    public int weight;
    //initialized variable
    public String animal = "Yes";

    //Constructor
    public Animal(String name, int weight) {
    }

    public void makeSound(){
        System.out.println("Different animals makes different sounds");
    }
public abstract void eat();
public abstract void sleep();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal1 = (Animal) o;
        if (weight != animal1.weight) return false;
        if (name != null ? !name.equals(animal1.name) : animal1.name != null) return false;
        return animal != null ? animal.equals(animal1.animal) : animal1.animal == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + weight;
        result = 31 * result + (animal != null ? animal.hashCode() : 0);
        return result;
    }
}
