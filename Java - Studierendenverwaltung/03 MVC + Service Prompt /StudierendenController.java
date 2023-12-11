import java.util.ArrayList;

public class StudierendenController {
    private StudierendenService studierendenService;

    public StudierendenController(StudierendenService studierendenService) {
        this.studierendenService = studierendenService;
    }

    public void addStudierende(String name, String matrikelnummer) {
        studierendenService.addStudierende(name, matrikelnummer);
    }

    public ArrayList<Studierende> getStudierendeList() {
        return studierendenService.getStudierendeList();
    }
}
