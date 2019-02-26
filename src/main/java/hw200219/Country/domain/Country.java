package hw200219.Country.domain;

import hw200219.City.domain.City;
import hw200219.common.business.domain.BaseDomain;

import java.util.ArrayList;

public class Country extends BaseDomain {
    private final String name;
    private final String language;
    private final ArrayList<City> citiesList;

    public Country(Long id, String name, String language, ArrayList<City> citiesList) {
        super(id);
        this.name = name;
        this.language = language;
        this.citiesList = citiesList;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public ArrayList<City> getCities() {
        return citiesList;
    }
}
