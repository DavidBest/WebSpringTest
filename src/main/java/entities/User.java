package entities;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by David on 30.06.2017.
 */
public class User {

    @NotNull
    @Size(min = 5)
    private String name;

    @NotNull
    @Size(min = 5)
    private String secondName;

    private int age;

    public User() {
    }

    public User(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
