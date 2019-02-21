package hw200219.Person;

public class Person {
    private final String name;
    private final String lastName;
    private final String serialAndNumberOfPassport;

    public Person(String name, String lastName, String serialAndNumberOfPassport) {
        this.name = name;
        this.lastName = lastName;
        this.serialAndNumberOfPassport = serialAndNumberOfPassport;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSerialAndNumberOfPassport() {
        return serialAndNumberOfPassport;
    }
}
