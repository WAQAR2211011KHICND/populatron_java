import fetch_parse.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new PopulationCounter(new Fetch(), new ParsingData(), new InformationsStats());
    }


    
}

