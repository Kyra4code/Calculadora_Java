import javax.swing.*;
import java.awt.*;

public class ComboBox extends JComboBox{
    public ComboBox() {
        addItem("Somar");
        addItem("Subtrair");
        addItem("Multiplicar");
        addItem("Divir");
 //     addItem("Elevar");
 //     addItem("Raiz");
        setSize(new Dimension(20,20));
        setBounds(220, 280, 115, 20);
    }
}
