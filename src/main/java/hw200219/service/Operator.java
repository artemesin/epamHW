package hw200219.service;

import hw200219.City.repo.CityRepo;
import hw200219.Country.repo.CountryRepo;
import hw200219.Order.Order;

public class Operator {
    private final CountryRepo countryRepo;
    private final CityRepo cityRepo;

    public Operator(CountryRepo countryRepo, CityRepo cityRepo) {
        this.countryRepo = countryRepo;
        this.cityRepo = cityRepo;
    }

    public String checkOrder(Order order){
        if(countryRepo.findCountryByName(order.getCountry()) == null){
            return "Country is not available for our agency";
        }
        if (cityRepo.findCityByName(order.getCity()) == null){
            return "City is not available for our agency";
        }
        return "All is OK";
    }

    public Integer getPrice(Order order){
        String s = "All is OK";
        if (checkOrder(order).equals(s)){
            return 100500;
        }
        return null;
    }

    public void confirm(Order order){

    }
}
