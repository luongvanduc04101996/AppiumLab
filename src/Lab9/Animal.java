package Lab9;

import java.security.SecureRandom;

public class Animal {
    private int speed;
    private String name;
    private boolean flyAble;

    protected Animal() {
    }

    protected Animal(BuilderAnimal builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyAble = builder.flyAble;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public boolean isFlyAble() {
        return flyAble;
    }

    public static class BuilderAnimal {
        private int speed;
        private String name;
        private boolean flyAble;

        public BuilderAnimal withSpeed(int speed) {
            this.speed = new SecureRandom().nextInt(speed);
            return this;
        }

        public BuilderAnimal withName(String name) {
            this.name = name;
            return this;
        }

        public BuilderAnimal withFlyAble(boolean flyAble) {
            this.flyAble = flyAble;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
