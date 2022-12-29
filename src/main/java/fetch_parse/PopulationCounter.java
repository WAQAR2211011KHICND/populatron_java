
package fetch_parse;
import java.util.List;

public class PopulationCounter {

    public PopulationCounter(Fetch fetchingCsvFile, ParsingData PD,  InformationsStats stats  ) {

        fetchingCsvFile.setPath("./data/worldcitiespop.csv");
        List<String> lines = fetchingCsvFile.getLines();
        PD.setWcp(lines);
        List<WorldCitiesInterface> w = PD.getWcp();
        stats.setWorldCitiesData(w);
        String output = "World population is: " + stats.processPopulation().getPopulation();    
        System.out.print(output);

    }

}
