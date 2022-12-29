import java.util.List;
import fetch_parse.*;

public class PopulationCounter {

    public static void main(String[] args) throws Exception {
        Fetching fetchingCsvFile = new Fetching();
        fetchingCsvFile.setPath("./data/worldcitiespop.csv");
        List<String> lines = fetchingCsvFile.getLines();
        ParsingData PD = new ParsingData();
        PD.setWcp(lines);
        List<WorldCitiesInterface> w = PD.getWcp();
        InformationsStats stats = new InformationsStats(w);
        String output = "World population is: " + stats.processPopulation().getPopulation();    
        System.out.print(output);
    }
}
