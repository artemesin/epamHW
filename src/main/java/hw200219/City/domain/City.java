package hw200219.City.domain;

public class City {

    private final String nameOfTheCity;
    private final int population;
    private final boolean isCapital;

    public City(String nameOfTheCity, int population, boolean isCapital) {
        this.nameOfTheCity = nameOfTheCity;
        this.population = population;
        this.isCapital = isCapital;
    }

    public String getNameOfTheCity() {
        return nameOfTheCity;
    }

    public int getPopulation() {
        return population;
    }

    public boolean isCapital() {
        return isCapital;
    }
}
