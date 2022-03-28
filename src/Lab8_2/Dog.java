package Lab8_2;

public class Dog extends Animal {
    private static int countDog = 1;
    private static final String NAME_DOG = "Dog";
    private static final int MAX_DOG_SPEED = 60;

    public Dog() {
        super(NAME_DOG + " " + countDog + "  ");
        speedRandom(MAX_DOG_SPEED);
        countDog++;
    }

}
