package fetch_parse;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Fetch {

    private List<String> lines;
    private String Path;
    

    public Fetch() {

    }

    public List<String> getLines() {
        return this.lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public String getPath() {
        return this.Path;
    }

    public void setPath(String Path) {
        try {
            this.lines = Files.readAllLines(Paths.get(Path), StandardCharsets.ISO_8859_1);   
            this.lines.remove(0);
            this.Path = Path;   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
