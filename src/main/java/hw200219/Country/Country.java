package hw200219.Country;

import hw200219.City.City;

public class Country {
    private final String name;
    private final String language;
    private final City[] cities;

    public Country(String name, String language, City[] cities) {
        this.name = name;
        this.language = language;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public City[] getCities() {
        return cities;
    }
}
