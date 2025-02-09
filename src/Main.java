import javax.swing.*;
import java.awt.*;


public class Main {
    public static JFrame app = new JFrame("Meu app teste");
    public static TextBox1 textb1 = new TextBox1();
    public static TextBox2 textb2 = new TextBox2();
    public static ComboBox Opcoes = new ComboBox();

    public static void main(String[] args) {

        Image iconApp = new ImageIcon(("./assets/image/icon.png")).getImage();
        Botao1 b1 = new Botao1();
        Titulo titulo = new Titulo();

        app.add(titulo);
        app.add(Opcoes);
        app.add(b1);
        app.add(textb1);
        app.add(textb2);
        app.setSize(550,400);
        app.setLayout(null);
        app.setVisible(true);
        app.setIconImage(iconApp);
        app.setResizable(false);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}