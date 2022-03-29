package Lab9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Animal {
    public static void main(String[] args) {
        List<Animal> listAnimal = new ArrayList<>();
        Animal dog = new Animal.BuilderAnimal().withName("Dog").withFlyAble(false).withSpeed(Dog.getMaxDogSpeed()).build();
        Animal eagle = new Animal.BuilderAnimal().withName("Eagle ").withFlyAble(true).withSpeed(Eagle.getMaxEagleSpeed()).build();
        Animal falcon = new Animal.BuilderAnimal().withName("Falcon").withFlyAble(true).withSpeed(Falcon.getMaxFalconSpeed()).build();
        Animal horse = new Animal.BuilderAnimal().withName("Horse").withFlyAble(false).withSpeed(Horse.getMaxHorseSpeed()).build();
        Animal tiger = new Animal.BuilderAnimal().withName("Tiger").withFlyAble(false).withSpeed(Tiger.getMaxTigerSpeed()).build();
        listAnimal.add(dog);
        listAnimal.add(eagle);
        listAnimal.add(falcon);
        listAnimal.add(horse);
        listAnimal.add(tiger);
        findWinnerAnimal(listAnimal);
    }

    static void findWinnerSpeed(List<Animal> listCanNotFlyAnimal) {
        List<Integer> listSpeed = new ArrayList<>();
        for (Animal animal : listCanNotFlyAnimal) {
            System.out.println("Name: " + animal.getName() + "\t\t\tSpeed: " + animal.getSpeed());
            listSpeed.add(animal.getSpeed());
        }
        int winnerSpeed = Collections.max(listSpeed);
        int indexWinnerAnimal = listSpeed.indexOf(winnerSpeed);
        String nameWinnerAnimal = listCanNotFlyAnimal.get(indexWinnerAnimal).getName();
        System.out.println("---------------------------------------------------");
        System.out.println("Winner is: " + nameWinnerAnimal + "\nWith speed: " + winnerSpeed);
    }

    static void findWinnerAnimal(List<Animal> listAnimal) {
        List<Animal> listCanNotFlyAnimal = new ArrayList<>();
        List<Animal> listCanFlyAnimal = new ArrayList<>();
        for (Animal animal : listAnimal) {
            if (!animal.isFlyAble()) {
                listCanNotFlyAnimal.add(animal);
            } else {
                listCanFlyAnimal.add(animal);
            }
        }
        System.out.println("-------------Can not fly-------------");
        findWinnerSpeed(listCanNotFlyAnimal);
        System.out.println("-------------Can fly-------------");
        findWinnerSpeed(listCanFlyAnimal);
    }
}
