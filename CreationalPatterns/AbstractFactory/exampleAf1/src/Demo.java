import factory.GUIFactory;
import factory.MacFactory;
import factory.WinFactory;

public class Demo {

    public static void main(String[] args) {
        GUIFactory factory = new MacFactory();
        Application app = new Application(factory);
        app.paint();
    }
}
