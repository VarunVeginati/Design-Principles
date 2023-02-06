package button;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Windows Button rendered");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Clicked Windows Button");
    }
}
