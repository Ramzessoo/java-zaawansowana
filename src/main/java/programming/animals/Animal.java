package programming.animals;

public abstract class Animal {

  public String move() {
    return getName() + "is moving";
  };

  public String sound() {
    return getName() + "makes a noise";
  }
  public abstract String getName();
}
