package GUI.GUIFactory.WindowsGUIFactory;

import GUI.GUIFactory.GUIFactory;
import GUI.Products.Button;
import GUI.Products.Select;
import GUI.Products.TextField;
import GUI.Products.WindowsProducts.WindowsButton;
import GUI.Products.WindowsProducts.WindowsSelect;
import GUI.Products.WindowsProducts.WindowsTextField;

public class WindowsGUIFactory implements GUIFactory {

    public WindowsGUIFactory() {
        System.out.println("WindowsGUIFactory creating");
    }

    @Override
    public Button createButton() {
        System.out.println("WindowsGUIFactory creating Button");
        return new WindowsButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("WindowsGUIFactory creating Select");
        return new WindowsSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("WindowsGUIFactory creating TextField");
        return new WindowsTextField();
    }
}
