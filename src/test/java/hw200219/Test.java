package hw200219;

import hw200219.City.domain.City;
import hw200219.City.repo.CityRepo;
import hw200219.Country.domain.Country;
import hw200219.Country.repo.impl.CountryMemoryRepo;
import hw200219.order.Order;
import hw200219.order.repo.OrderRepo;
import hw200219.person.Person;
import hw200219.service.Operator;
import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void test() {
        Person person = new Person("Ivan", "Demkin", "0000_12321231");
        City madrid = new City("Madrid", 1000000, true);
        //Country spain = new Country("Spain", "spanish", new City[]{madrid});
        CountryMemoryRepo countryMemoryRepo = new CountryMemoryRepo();
        //countryMemoryRepo.addCountry(spain);
        CityRepo cityRepo = new CityRepo();
        cityRepo.addCity(madrid);
        OrderRepo orderRepo = new OrderRepo();
        Order order = new Order(person, "Madrid", "Spain");
        Operator operator = new Operator(countryMemoryRepo, cityRepo, orderRepo);
        Assert.assertEquals("All is OK", operator.checkOrder(order));
    }
}
