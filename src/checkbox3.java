import javax.swing.*;
import java.awt.*;

public class checkbox3 extends JCheckBox {
    public checkbox3(String text) {
        super(text);
        setLayout(new FlowLayout());
        setSize(new Dimension(20,20));
        setBounds(110, 280, 35, 50);
        addActionListener(e->{action();});
    }
    public void action(){
        if(isSelected()){
            Main.Sub.setSelected(false);
            Main.Soma.setSelected(false);
            Main.Divi.setSelected(false);
        }
    }
}
