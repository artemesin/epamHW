package hw200219.order;

import hw200219.person.Person;

public class Order {
    private final Person person;
    private final String city;
    private final String country;

    public Order(Person person, String city, String country) {
        this.person = person;
        this.city = city;
        this.country = country;
    }

    public Person getPerson() {
        return person;
    }

    public String getCountry() {
        return country;
    }
    public String getCity() {
        return city;
    }
}
