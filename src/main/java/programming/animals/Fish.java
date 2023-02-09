package programming.animals;

public abstract class Fish extends Animal {

    @Override
    public String sound() {
        return "Fish " + getName() + " does not make a sound";
    }

    @Override
    public String move() {
        return "Fish " + getName() + " is swimming";
    }
}

