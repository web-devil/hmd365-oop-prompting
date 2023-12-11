import java.util.ArrayList;

public class StudierendenService {
    private ArrayList<Studierende> studierendeList;

    public StudierendenService() {
        studierendeList = new ArrayList<>();
    }

    public void addStudierende(String name, String matrikelnummer) {
        Studierende s = new Studierende(name, matrikelnummer);
        studierendeList.add(s);
    }

    public ArrayList<Studierende> getStudierendeList() {
        return studierendeList;
    }
}
