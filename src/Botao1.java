
import javax.swing.*;
import java.awt.*;

public class Botao1 extends JButton {
    public Botao1(){
        super("Calcular:");
        setLocation(20,20);
        setLayout(new FlowLayout());
        setBounds(200,200,100, 35);
        addActionListener(e->{Clicked();});
    }
    public void Clicked(){
        if(Main.Opcoes.getSelectedItem() != "Raiz"){
            if(Main.textb2.getText().getBytes().length == 0 || Main.textb2.getText().getBytes().length == 0){
                JOptionPane.showMessageDialog(null,"Por favor, preencha os campos");
            }
        }

        /*-----------------------------------------------------------------------------------------------------------------*/
        if(Main.Opcoes.getSelectedItem() == "Somar"){
            int x = Integer.parseInt(Main.textb1.getText());
            int y = Integer.parseInt(Main.textb2.getText());
            int result = x + y;
            JOptionPane.showMessageDialog(null, "Resultado: " + result, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (Main.Opcoes.getSelectedItem() == "Subtrair") {
            int x = Integer.parseInt(Main.textb1.getText());
            int y = Integer.parseInt(Main.textb2.getText());
            int result = x - y;
            JOptionPane.showMessageDialog(null, "Resultado: " + result, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (Main.Opcoes.getSelectedItem() == "Multiplicar") {
            int x = Integer.parseInt(Main.textb1.getText());
            int y = Integer.parseInt(Main.textb2.getText());
            int result = x * y;
            JOptionPane.showMessageDialog(null, "Resultado: " + result, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (Main.Opcoes.getSelectedItem() == "Dividir") {
            float x = Float.parseFloat(Main.textb1.getText());
            float y = Float.parseFloat(Main.textb2.getText());
            float result = x / y;
            JOptionPane.showMessageDialog(null, "Resultado: " + result, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(Main.Opcoes.getSelectedItem() == "Elevar"){
            double x = Double.parseDouble(Main.textb1.getText());
            double y = Double.parseDouble(Main.textb2.getText());
            double result = Math.pow(x, y);;
            JOptionPane.showMessageDialog(null, "Resultado: " + result, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(Main.Opcoes.getSelectedItem() == "Raiz"){
            Main.textb2.setEditable(false);
            Main.textb2.setText("");
            double x = Double.parseDouble(Main.textb1.getText());
            double result = Math.sqrt(x);
        }
    }
}