import javax.swing.*;
import java.awt.*;

public class Botao1 extends JButton {
    public Botao1(){
        super("Calcular:");
        setLocation(20,20);
        setLayout(new FlowLayout());
        setBounds(200,200,100, 35);
    }
}