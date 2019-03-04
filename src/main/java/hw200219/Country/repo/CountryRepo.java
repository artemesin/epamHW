package hw200219.Country.repo;

import hw200219.Country.domain.Country;
import hw200219.common.business.repo.BaseRepo;

public interface CountryRepo extends BaseRepo {

    void add(Country country);

    Country findById(long id);

    boolean findCountryByName(String country);
}
