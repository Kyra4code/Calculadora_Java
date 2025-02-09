import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Titulo extends JLabel{
    public Titulo() {
        super("Calculadora");
        Font font = new Font("Arial", Font.PLAIN, 40);
        setFont(font);
        setBackground(Main.app.getBackground());
        setBounds(155, 10, 220, 40);
    }
}
