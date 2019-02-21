package hw200219;

import hw200219.City.City;
import hw200219.City.repo.CityRepo;
import hw200219.Country.Country;
import hw200219.Country.repo.CountryRepo;
import hw200219.Order.Order;
import hw200219.Order.repo.OrderRepo;
import hw200219.Person.Person;
import hw200219.service.Operator;
import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void test() {
        Person person = new Person("Ivan", "Demkin", "0000_12321231");
        City madrid = new City("Madrid", 1000000, true);
        Country spain = new Country("Spain", "spanish", new City[]{madrid});
        CountryRepo countryRepo = new CountryRepo();
        countryRepo.addCountry(spain);
        CityRepo cityRepo = new CityRepo();
        cityRepo.addCity(madrid);
        OrderRepo orderRepo = new OrderRepo();
        Order order = new Order(person, "Madrid", "Spain");
        Operator operator = new Operator(countryRepo, cityRepo, orderRepo);
        Assert.assertEquals("All is OK", operator.checkOrder(order));
    }
}
