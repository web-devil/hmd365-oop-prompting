import java.util.Scanner;

public class UserInputHandler {
    private StudierendenController controller;
    private StudierendenView view;
    private Scanner scanner;

    public UserInputHandler(StudierendenController controller, StudierendenView view) {
        this.controller = controller;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void handleUserInput() {
        while(true) {
            System.out.println("1. Studierende hinzufügen");
            System.out.println("2. Alle Studierenden anzeigen");
            System.out.println("3. Beenden");
            System.out.println("Bitte Option auswählen:");

            int option = scanner.nextInt();
            scanner.nextLine(); // clear the buffer

            switch(option) {
                case 1:
                    System.out.println("Geben Sie den Namen der Studierenden ein:");
                    String name = scanner.nextLine();
                    System.out.println("Geben Sie die Matrikelnummer der Studierenden ein:");
                    String matrikelnummer = scanner.nextLine();
                    controller.addStudierende(name, matrikelnummer);
                    break;
                case 2:
                    view.printStudierendeDetails(controller.getStudierendeList());
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
