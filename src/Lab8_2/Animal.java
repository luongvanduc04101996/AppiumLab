package Lab8_2;

import java.security.SecureRandom;

public class Animal {
    private int speed;
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void speedRandom(int maxSpeed) {
        setSpeed(new SecureRandom().nextInt(maxSpeed));
    }
}
