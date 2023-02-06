package factory;

import button.Button;
import button.MacButton;
import checkBox.CheckBox;
import checkBox.MacCheckBox;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
