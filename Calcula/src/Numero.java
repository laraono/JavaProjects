
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextArea;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isaon
 */
public class Numero extends JButton {
    Integer[] alg = {1,2,3,4,5,6,7,8,9,0};
    static int index = 0;
    static JTextArea result;
    public Numero() {
        this.setActionCommand(alg[index].toString());
        this.setText(alg[index].toString());
       /* this.addActionListener((ActionEvent e) -> {
            clicaNumero(e);
        }); */
        index++;
    }
     static void clicaNumero(ActionEvent e){
          String valor = e.getActionCommand();
        if(Calculadora.status == Calculadora.Estados.NUM1 || Calculadora.status == Calculadora.Estados.INICIO || Calculadora.status == Calculadora.Estados.IGNORADO){
            Calculadora.status = Calculadora.Estados.NUM1;
             if(Calculadora.vec[0] == null) {
             Calculadora.vec[0] = (valor);
            } else {
                Calculadora.vec[0] = Calculadora.vec[0].concat(valor);
            }
           
        }
        else {
            Calculadora.status = Calculadora.Estados.NUM2;
                if(Calculadora.vec[1] == null) {
             Calculadora.vec[1] = (valor);
            } else {
                Calculadora.vec[1] = Calculadora.vec[1].concat(valor);
            }
                }
         Numero.result.setText(Numero.result.getText()+valor);
    }
  /*  public void setResult(JTextArea texto){
        Numero.result = texto;
    }
    */
}
