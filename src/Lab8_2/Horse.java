package Lab8_2;

public class Horse extends Animal {
    private static int countHorse = 1;
    private static final String NAME_HORSE = "Horse";
    private static final int MAX_HORSE_SPEED = 75;

    public Horse() {
        super(NAME_HORSE + " " + countHorse);
        speedRandom(MAX_HORSE_SPEED);
        countHorse++;
    }
}
