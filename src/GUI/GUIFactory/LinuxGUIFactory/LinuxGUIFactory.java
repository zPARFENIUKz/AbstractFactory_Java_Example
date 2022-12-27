package GUI.GUIFactory.MacGUIFactory;

import GUI.GUIFactory.GUIFactory;
import GUI.Products.Button;
import GUI.Products.MacProducts.MacButton;
import GUI.Products.MacProducts.MacSelect;
import GUI.Products.MacProducts.MacTextField;
import GUI.Products.Select;
import GUI.Products.TextField;

public class MacGUIFactory implements GUIFactory {

    public MacGUIFactory() {
        System.out.println("MacGUIFactory creating");
    }

    @Override
    public Button createButton() {
        System.out.println("MacGUIFactory creating Button");
        return new MacButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("MacGUIFactory creating Select");
        return new MacSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("MacGUIFactory creating TextField");
        return new MacTextField();
    }
}
