import javax.swing.*;
import java.awt.*;


public class Main {
    public static JFrame app = new JFrame("Meu app teste");
    public static TextBox1 textb1 = new TextBox1();
    public static TextBox2 textb2 = new TextBox2();

    public static void main(String[] args) {

        Image iconApp = Toolkit.getDefaultToolkit().getImage("./assets/image/icon.png");
        Botao1 b1 = new Botao1();

        b1.addActionListener(e -> {event1();});


        app.add(b1);
        app.add(textb1);
        app.add(textb2);
        app.setSize(500,400);
        app.setLayout(null);
        app.setVisible(true);
        app.setIconImage(iconApp);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void event1(){
        int x = Integer.parseInt(textb1.getText());
        int y = Integer.parseInt(textb2.getText());
        if(Integer.parseInt(textb1.getText()) != 0 || Integer.parseInt(textb1.getText()) != 0){
            int result = x + y;
            JOptionPane.showMessageDialog(null, "Resultado: " + result, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione algo dado a ser somado");
        }
    }
}