import javax.swing.*;
import java.awt.*;

public class checkbox1 extends JCheckBox {
    public checkbox1(String text) {
        super(text);
        setSelected(true);
        setLayout(new FlowLayout());
        setSize(new Dimension(20,20));
        setBounds(10, 280, 40, 50);
        addActionListener(e->{action();});
    }
    public void action(){
        if(isSelected()){
            Main.Sub.setSelected(false);
            Main.Multi.setSelected(false);
            Main.Divi.setSelected(false);
        }
    }
}
