package lecture.reflections;

import lombok.Getter;

@Deprecated(since = "31.01.2023")
@Getter

public class Person {

    public String name;
    public int age;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
