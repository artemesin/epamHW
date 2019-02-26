package hw200219.City.search;

import hw200219.common.business.search.BaseSearchCondition;

public class CitySearchCondition extends BaseSearchCondition {
    private String city;

    public String getCountry() {
        return city;
    }

    public void setCountry(String city) {
        this.city = city;
    }

    public boolean needSearchByCity(){
        return true;
    }


}
