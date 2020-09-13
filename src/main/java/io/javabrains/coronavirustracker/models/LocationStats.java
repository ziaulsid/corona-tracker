package io.javabrains.coronavirustracker.models;

public class LocationStats {


    private String country;
    private int cases;
    private int todayCases;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public int getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(int todayCases) {
        this.todayCases = todayCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "country='" + country + '\'' +
                ", cases=" + cases +
                ", todayCases=" + todayCases +
                '}';
    }
}
