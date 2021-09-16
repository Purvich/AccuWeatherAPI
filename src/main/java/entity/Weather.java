package entity;

import java.util.Objects;

public class Weather {
    private String city;
    private String localDate;
    private double temperature;

    public Weather(String city, String beatifyDateForOneDay, int temperature, int fromFahrenheitToCelsius) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return Double.compare(weather.temperature, temperature) == 0 && Objects.equals(city, weather.city)
                && Objects.equals(localDate, weather.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, localDate, temperature);
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", localDate='" + localDate + '\'' +
                ", temperature=" + temperature +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Weather(String city, String localDate, double temperature) {
        this.city = city;
        this.localDate = localDate;
        this.temperature = temperature;
    }
}
