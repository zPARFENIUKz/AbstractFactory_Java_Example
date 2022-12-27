package GUI.GUIFactory;

import GUI.Products.Button;
import GUI.Products.Select;
import GUI.Products.TextField;

public interface GUIFactory {
    Button createButton();
    Select createSelect();
    TextField createTextField();
}
