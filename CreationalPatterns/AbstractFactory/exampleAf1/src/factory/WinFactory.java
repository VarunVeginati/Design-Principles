package factory;

import button.Button;
import button.WinButton;
import checkBox.CheckBox;
import checkBox.WinCheckBox;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
