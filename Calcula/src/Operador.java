
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
public class Operador extends JButton {
    String[] op = {"+","-","*","=","C","/"};
    static int index = 0;
    static JTextArea result;
    public Operador() {
         this.setActionCommand(op[index]);
        this.setText(op[index]);
       /* this.addActionListener((ActionEvent e) -> {
            clicaOperador(e);
        }); */
        index++;
    }

   static void clicaOperador(ActionEvent e) {
         String comando = e.getActionCommand();
        if(comando.equals("=")){
            if(Calculadora.status == Calculadora.Estados.NUM2){
            Calculadora.calcularResultado();
            }
            else{
               Operador.result.setText(Calculadora.vec[0]);
                Calculadora.vec[1] = "";
                 Calculadora.vec[2] = "";
                System.out.print(result);
                 Calculadora.status =  Calculadora.Estados.NUM1;
            }

        }
        else if(comando.equals("C")){
             Calculadora.status =  Calculadora.Estados.LIMPAR;
         Calculadora.vec[0]="";
         Calculadora.vec[1]="";
         Calculadora.vec[2]="";
         Calculadora.total = 0;
        Operador.result.setText("");
        System.out.print(result);
           Calculadora.status =  Calculadora.Estados.INICIO;
        }
        else if((Calculadora.status == Calculadora.Estados.INICIO || Calculadora.status == Calculadora.Estados.IGNORADO) && (comando.equals("+") || comando.equals("-")) ){
         Operador.result.setText( Operador.result.getText()+comando);
           Calculadora.vec[0] = comando;
        }
         else if((Calculadora.status == Calculadora.Estados.INICIO || Calculadora.status == Calculadora.Estados.IGNORADO) && (comando.equals("*") || comando.equals("/")) ){
             Calculadora.status =  Calculadora.Estados.IGNORADO;
         }
        else if( (Calculadora.status ==  Calculadora.Estados.NUM1) || Calculadora.status == Calculadora.Estados.IGNORADO) { Calculadora.status =  Calculadora.Estados.OPERADOR; 
        Operador.result.setText( Operador.result.getText()+comando);
         Calculadora.vec[2] = comando;
      System.out.print(Calculadora.vec[2]);
        }
    }
  /*   public void setResult(JTextArea texto){
        Operador.result = texto;
    }
    */
}
