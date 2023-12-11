public class Main {
    public static void main(String[] args) {
        StudierendenService service = new StudierendenService();
        StudierendenController controller = new StudierendenController(service);
        StudierendenView view = new StudierendenView();
        UserInputHandler userInputHandler = new UserInputHandler(controller, view);
        userInputHandler.handleUserInput();
    }
}
