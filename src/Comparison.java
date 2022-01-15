public class Comparison {

    public void compareAnimals (Animal firstAnimal, Animal secondAnimal){
        System.out.println("We compare " + firstAnimal.toString() + " and " + secondAnimal.toString());
        if (firstAnimal.equals(secondAnimal))
            System.out.println("They are equal");
        else System.out.println("They are not equal");
    }
}
