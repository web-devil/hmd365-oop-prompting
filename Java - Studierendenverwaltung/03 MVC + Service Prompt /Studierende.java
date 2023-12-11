public class Studierende {
    private String name;
    private String matrikelnummer;

    public Studierende(String name, String matrikelnummer) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Matrikelnummer: " + matrikelnummer;
    }
}
