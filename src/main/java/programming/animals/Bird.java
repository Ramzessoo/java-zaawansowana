package programming.animals;

public abstract class Bird extends Animal{


    @Override
    public String move() {
        return "Bird is flying";
    }

    @Override
    public String sound() {
        return "Bird is singing";
    }
}
