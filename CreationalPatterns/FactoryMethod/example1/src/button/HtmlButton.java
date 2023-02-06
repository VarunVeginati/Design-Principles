package button;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("HTML Button rendered");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Clicked HTML Button");
    }
}
