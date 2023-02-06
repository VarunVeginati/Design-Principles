package factory;

import button.Button;
import checkBox.CheckBox;

public interface GUIFactory {
    public Button createButton();

    public CheckBox createCheckBox();
}
