package Interface_AbstracClass;

import java.util.Date;
import java.util.zip.DataFormatException;

public abstract class Person implements IUseLibrary {
    private int id;
    String name;
    Date birthDay = new Date();

    public Person(int id, String name, Date birthDay) {
        validate(id);
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
    }

    private void validate(int id){
        if (id < 0)
            throw new IllegalArgumentException("Person ID must not be negative!");
    }

    protected abstract void thinking() throws DataFormatException;

    public void sleeping(){
        System.out.println("Close eyes ... zzz zzzz");
    }

    public int getId() {
        return id;
    }

    public static int getZero() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
