package fetch_parse;

import java.util.List;


public class ParsingData {

    private List<WorldCitiesInterface> wcp;

    public ParsingData() {
    }

    public List<WorldCitiesInterface> getWcp() {
        return this.wcp;
    }

    public void setWcp(List<String> lines) {
        this.wcp = lines.stream().map(li ->{
            String[] CityArray= li.split(",");
            WorldCitiesInterface w = new WorldCitiesInterface();
            w.setCountry(CityArray[0]);
            w.setCity(CityArray[1]);
            w.setAccentCity(CityArray[2]);
            w.setRegion(CityArray[3]);
            w.setPopulation(CityArray[4].length()==0 ? 0 : Long.parseLong(CityArray[4]));
            w.setLatitude(CityArray[5]);
            w.setLongitude(CityArray[6]);
            return w;
        }).toList();

    }

}
