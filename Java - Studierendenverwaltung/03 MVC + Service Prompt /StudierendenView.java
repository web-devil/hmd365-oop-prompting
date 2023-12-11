import java.util.ArrayList;

public class StudierendenView {
    public void printStudierendeDetails(ArrayList<Studierende> studierendeList) {
        for(Studierende s : studierendeList) {
            System.out.println(s);
        }
    }
}
