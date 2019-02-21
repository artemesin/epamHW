package hw200219.City.repo;

import hw200219.City.City;

public class CityRepo {
    private static final int CAPACITY = 5;
    private City[] cities = new City[CAPACITY];
    private int lastCityIndex = -1;


    public CityRepo(City[] cities) {
        this.cities = cities;
    }

    public void addCity(City city) {
        if (lastCityIndex == cities.length - 1) {
            City[] newArrCities = new City[this.cities.length * 2];
            System.arraycopy(cities, 0, newArrCities, 0, cities.length);
            this.cities = newArrCities;
        }

        lastCityIndex++;
        cities[lastCityIndex] = city;
    }

    public City findCityByName(String cityName) {
        for (City city : cities) {
            if (city.getNameOfTheCity().equals(cityName)){
                return city;
            }
        }
        return null;
    }

     
}
