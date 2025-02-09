
import javax.swing.*;
import java.awt.*;

public class checkbox2 extends JCheckBox{
    public checkbox2(String text) {
        super(text);
        setLayout(new FlowLayout());
        setSize(new Dimension(20,20));
        setBounds(60, 280, 35, 50);
        addActionListener(e->{action();});
    }
    public void action(){
        if(isSelected()){
            Main.Soma.setSelected(false);
            Main.Multi.setSelected(false);
            Main.Divi.setSelected(false);
        }
    }
}
