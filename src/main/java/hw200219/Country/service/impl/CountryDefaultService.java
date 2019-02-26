package hw200219.Country.service.impl;

import hw200219.Country.domain.Country;
import hw200219.Country.repo.CountryRepo;
import hw200219.Country.repo.impl.CountryMemoryRepo;
import hw200219.Country.search.CountrySearchCondition;
import hw200219.Country.service.CountryService;

public class CountryDefaultService implements CountryService {

    private final CountryRepo countryRepo;

    public CountryDefaultService(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }

    @Override
    public void add(Country country) {
        countryRepo.add(country);
    }

    @Override
    public Country findById(Long id) {
        if (id != null){
            return countryRepo.findById(id);
        }
        return null;
    }

    @Override
    public void delete(Country country) {
        if (country.getId() != null){
            this.deleteById(country.getId());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (id != null){
            countryRepo.deleteById(id);
        }

    }

    @Override
    public void printAll() {
        countryRepo.printAll();
    }
}
