package hw200219.Country.repo.impl;

import hw200219.Country.domain.Country;
import hw200219.Country.repo.CountryRepo;

import java.util.ArrayList;

public class CountryMemoryRepo implements CountryRepo {
    ArrayList<Country> countryList = new ArrayList<Country>();


    @Override
    public void add(Country country) {
        countryList.add(country);
    }

    @Override
    public Country findById(long id) {
        Integer countryIndex = findCountryByIndex(id);
        if (countryIndex != null){
            countryList.get((int) id);
        }
        return null;
    }

    @Override
    public boolean findCountryByName(String country) {
        return false;
    }

    @Override
    public void deleteById(long id) {
        Integer countryIndex = findCountryByIndex(id);
        if (countryIndex != null){
            deleteCountryByIndex(countryIndex);
        }
    }

    private void deleteCountryByIndex(Integer countryIndex) {
        countryList.remove(countryIndex);
    }

    private Integer findCountryByIndex(Long countryId) {
        for (int i = 0; i < countryList.size(); i++) {
            if(countryList.get(i).getId().equals(countryId)){
                return i;
            }
        }
        return null;
    }

    @Override
    public void printAll() {

    }
}
