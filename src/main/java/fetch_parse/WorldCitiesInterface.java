package fetch_parse;

public class WorldCitiesInterface {
   
   private String Country;
   private String City;
   private String AccentCity;
   private String Region;
   private long Population;
   private String Latitude;
   private String Longitude;

    public WorldCitiesInterface() {
    }

    public String getCountry() {
        return this.Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCity() {
        return this.City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getAccentCity() {
        return this.AccentCity;
    }

    public void setAccentCity(String AccentCity) {
        this.AccentCity = AccentCity;
    }

    public String getRegion() {
        return this.Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public long getPopulation() {
        return this.Population;
    }

    public void setPopulation(long Population) {
        this.Population = Population;
    }

    public String getLatitude() {
        return this.Latitude;
    }

    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    public String getLongitude() {
        return this.Longitude;
    }

    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }
   

}
