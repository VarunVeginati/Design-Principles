import dialog.Dialog;
import dialog.HtmlDialog;
import dialog.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        dialog = new WindowsDialog();
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}