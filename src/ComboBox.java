import javax.swing.*;
import java.awt.*;

public class ComboBox extends JComboBox{
    public ComboBox() {
        addItem("Somar");
        addItem("Subtrair");
        addItem("Multiplicar");
        addItem("Dividir");
        addItem("Elevar");
        addItem("Raiz");
        setSize(new Dimension(20,20));
        setBounds(220, 280, 115, 20);

        addActionListener(e->{
            if(getSelectedItem() == "Raiz"){
                Main.textb2.setEnabled(false);
                Main.textb2.setEditable(false);
            }else{
                Main.textb2.setEditable(true);
                Main.textb2.setEnabled(true);
            }
        });

        
    }
}
