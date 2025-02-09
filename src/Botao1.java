
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
        String text = Main.Opcoes.getSelectedItem().toString();
        switch (text){
            case "Somar":
                int x = Integer.parseInt(Main.textb1.getText());
                int y = Integer.parseInt(Main.textb2.getText());
                int result = x + y;
                JOptionPane.showMessageDialog(null, "Resultado: " + result, "Resultado", JOptionPane.INFORMATION_MESSAGE);x = y = result = 0;
                break;
            case "Subtrair":
                x = Integer.parseInt(Main.textb1.getText());
                y = Integer.parseInt(Main.textb2.getText());
                result = x - y;
                JOptionPane.showMessageDialog(null, "Resultado: " + result, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Multiplicar":
                x = Integer.parseInt(Main.textb1.getText());
                y = Integer.parseInt(Main.textb2.getText());
                result = x * y;
                JOptionPane.showMessageDialog(null, "Resultado: " + result, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Dividir":
                double x2 = Double.parseDouble(Main.textb1.getText());
                double y2 = Double.parseDouble(Main.textb2.getText());
                double result2 = x2 / y2;
                JOptionPane.showMessageDialog(null, "Resultado: " + result2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Elevar":
                x2 = Double.parseDouble(Main.textb1.getText());
                y2 = Double.parseDouble(Main.textb2.getText());
                result2 = Math.pow(x2, y2);
                JOptionPane.showMessageDialog(null, "Resultado: " + result2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Raiz":
                x2 = Double.parseDouble(Main.textb1.getText());
                result2 = Math.sqrt(x2);
                JOptionPane.showMessageDialog(null, "Resultado: " + result2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Não foi possível compreender");
                break;

        }
    }
}