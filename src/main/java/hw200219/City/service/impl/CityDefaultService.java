package hw200219.City.service.impl;

import hw200219.City.domain.City;
import hw200219.City.repo.CityRepo;
import hw200219.City.search.CitySearchCondition;
import hw200219.City.service.CityService;

public class CityDefaultService implements CityService {

    private final CityRepo cityRepo;

    public CityDefaultService(CityRepo cityRepo) {
        this.cityRepo = cityRepo;
    }

    @Override
    public void add(City city) {

    }

    @Override
    public City findById(Long id) {
        return null;
    }

    @Override
    public void delete(City city) {

    }

    @Override
    public City[] search(CitySearchCondition searchCondition) {
        return new City[0];
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void printAll() {

    }
}
