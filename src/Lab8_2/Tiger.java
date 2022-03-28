package Lab8_2;

public class Tiger extends Animal {
    private static int countTiger = 1;
    private static final String NAME_TIGER = "Tiger";
    private static final int MAX_TIGER_SPEED = 100;

    public Tiger() {
        super(NAME_TIGER + " " + countTiger);
        speedRandom(MAX_TIGER_SPEED);
        countTiger++;
    }
}
