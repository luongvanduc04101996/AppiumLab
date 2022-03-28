package Lab8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Animal {
    public static void main(String[] args) {
        List<Animal> listAnimal = new ArrayList<>();
        Animal animal1 = new Dog();
        Animal animal2 = new Tiger();
        Animal animal3 = new Horse();
        Animal animal4 = new Tiger();
        Animal animal5 = new Dog();
        Animal animal6 = new Horse();
        listAnimal.add(animal1);
        listAnimal.add(animal2);
        listAnimal.add(animal3);
        listAnimal.add(animal4);
        listAnimal.add(animal5);
        listAnimal.add(animal6);
        findWinnerSpeed(listAnimal);
    }

    static void findWinnerSpeed(List<Animal> listAnimal) {
        List<Integer> listSpeed = new ArrayList<>();
        for (Animal animal : listAnimal) {
            System.out.println("Name: " + animal.getName() + "\t\t\tSpeed: " + animal.getSpeed());
            listSpeed.add(animal.getSpeed());
        }
        int winnerSpeed = Collections.max(listSpeed);
        int indexWinnerAnimal = listSpeed.indexOf(winnerSpeed);
        String nameWinnerAnimal = listAnimal.get(indexWinnerAnimal).getName();
        System.out.println("---------------------------------------------------");
        System.out.println("Winner is: " + nameWinnerAnimal + "\nWith speed: " + winnerSpeed);
    }
}
