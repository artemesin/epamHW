package hw200219.Country.service;

import hw200219.Country.domain.Country;
import hw200219.Country.search.CountrySearchCondition;
import hw200219.common.business.service.BaseService;

public interface CountryService extends BaseService {

    void add(Country city);
    Country findById(Long id);
    void delete(Country city);
}
