import java.util.ArrayList;
import java.util.Scanner;

public class Studentenverwaltung {
    private ArrayList<Student> studentList = new ArrayList<>();

    private class Student {
        String name;
        String matrikelnummer;

        public Student(String name, String matrikelnummer) {
            this.name = name;
            this.matrikelnummer = matrikelnummer;
        }

        @Override
        public String toString() {
            return "Name: " + this.name + ", Matrikelnummer: " + 
this.matrikelnummer;
        }
    }

    public void addStudent(String name, String matrikelnummer) {
        Student s = new Student(name, matrikelnummer);
        studentList.add(s);
    }

    public void showStudents() {
        for(Student s : studentList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Studentenverwaltung sv = new Studentenverwaltung();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1. Student hinzufügen");
            System.out.println("2. Alle Studenten anzeigen");
            System.out.println("3. Beenden");
            System.out.println("Bitte Option auswählen:");

            int option = scanner.nextInt();
            scanner.nextLine(); // clear the buffer

            switch(option) {
                case 1:
                    System.out.println("Geben Sie den Namen des Studenten ein:");
                    String name = scanner.nextLine();
                    System.out.println("Geben Sie die Matrikelnummer des Studenten ein:");
                    String matrikelnummer = scanner.nextLine();
                    sv.addStudent(name, matrikelnummer);
                    break;
                case 2:
                    sv.showStudents();
                    break;
                case 3:
                    System.out.println("Beenden...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Ungültige Option, bitte versuchen Sie es erneut.");
            }
        }
    }
}

