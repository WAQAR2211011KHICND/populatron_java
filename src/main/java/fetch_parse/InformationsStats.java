package fetch_parse;

import java.util.List;
import java.util.stream.Collectors;

public class InformationsStats {

   private List<WorldCitiesInterface> WorldCitiesData;
   private Long Population;
   
    public  InformationsStats() {    
    }
    
    
    public InformationsStats processPopulation(){

        this.Population = this.WorldCitiesData.stream()
        .collect( Collectors.summarizingLong( w -> w.getPopulation()) )
        .getSum();
        return this;
    }

    public void setWorldCitiesData(List<WorldCitiesInterface> WorldCitiesData) {
        this.WorldCitiesData = WorldCitiesData;
    }
    
    public Long getPopulation(){
        return this.Population;
    }
    
}
