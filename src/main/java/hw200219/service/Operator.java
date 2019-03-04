package hw200219.service;

import hw200219.City.repo.CityRepo;
import hw200219.Country.repo.impl.CountryMemoryRepo;
import hw200219.order.Order;
import hw200219.order.repo.OrderRepo;

public class Operator {
    private final CountryMemoryRepo countryMemoryRepo;
    private final CityRepo cityRepo;
    private final OrderRepo orderRepo;

    public Operator(CountryMemoryRepo countryMemoryRepo, CityRepo cityRepo, OrderRepo orderRepo) {
        this.countryMemoryRepo = countryMemoryRepo;
        this.cityRepo = cityRepo;
        this.orderRepo = orderRepo;
    }

    public String checkOrder(Order order){
       /* if(countryMemoryRepo.findCountryByName(order.getCountry()) == null){
            return "Country is not available for our agency";
        }
        if (cityRepo.findCityByName(order.getCity()) == null){
            return "City is not available for our agency";
        }*/
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
        orderRepo.addOrder(order);
    }


}
