package hw200219.Country.repo;

import hw200219.Country.Country;

public class CountryRepo {
    private static final int CAPACITY = 5;
    private Country[] countries = new Country[CAPACITY];
    private int lastCountryIndex = -1;


    public CountryRepo(Country[] countries) {
        this.countries = countries;
    }

    public void addCountry(Country country) {
        if (lastCountryIndex == countries.length - 1) {
            Country[] newArrCountries = new Country[this.countries.length * 2];
            System.arraycopy(countries, 0, newArrCountries, 0, countries.length);
            this.countries = newArrCountries;
        }

        lastCountryIndex++;
        countries[lastCountryIndex] = country;
    }

    public Country findCountryByName(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)){
                return country;
            }
        }
        return null;
    }

     
}
