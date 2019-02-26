package hw200219.City.service;

import hw200219.City.domain.City;
import hw200219.City.search.CitySearchCondition;
import hw200219.common.business.service.BaseService;

public interface CityService extends BaseService {

    void add(City city);
    City findById(Long id);
    void delete(City city);
    City[] search(CitySearchCondition searchCondition);
}
