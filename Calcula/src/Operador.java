
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Operador extends JButton {
    String[] op = {"+","-","*","=","C","/"};
    static int index = 0;
    
    public Operador() {
        this.setActionCommand(op[index]);
        this.setText(op[index]);
        index++;
    }

   static void clicaOperador(ActionEvent e) {
        String comando = e.getActionCommand();
        
        if(comando.equals("=")){
            if(Calculadora.getStatus().equals(Calculadora.Estados.NUM2)){
                Calculadora.calcularResultado();
                 Calculadora.setStatus(Calculadora.Estados.RESULTADO);
            }
            else{
                Calculadora.resultado.setText(Calculadora.vec[0]);
                Calculadora.vec[1] = "";
                Calculadora.vec[2] = "";
                 Calculadora.setStatus(Calculadora.Estados.NUM1);
            }

        }
        
        else if(comando.equals("C")){
             Calculadora.setStatus(Calculadora.Estados.LIMPAR);
            Calculadora.setVetor("","","",Calculadora.Estados.INICIO);
            Calculadora.total = 0;
            Calculadora.resultado.setText("");
        }
        
        else if((Calculadora.getStatus().equals(Calculadora.Estados.INICIO) || Calculadora.getStatus().equals(Calculadora.Estados.IGNORADO))){
            if (comando.equals("-")){
                Calculadora.setStatus(Calculadora.Estados.NUM1);
                Calculadora.resultado.setText(Calculadora.resultado.getText()+comando);
                Calculadora.vec[0] = comando;}
            if((comando.equals("*") || comando.equals("/"))){
               Calculadora.setStatus(Calculadora.Estados.IGNORADO);
            }
        }
        
        else if((Calculadora.getStatus().equals(Calculadora.Estados.NUM1))) { 
            if(!Calculadora.vec[0].isEmpty()){
             Calculadora.setStatus(Calculadora.Estados.OPERADOR);
            Calculadora.resultado.setText(Calculadora.resultado.getText()+comando);
            Calculadora.vec[2] = comando;
            }
        }
        else if(Calculadora.getStatus().equals(Calculadora.Estados.OPERADOR)){
            if(comando.equals("-")){
                Calculadora.setStatus(Calculadora.Estados.NUM2);
                Calculadora.vec[1] = comando;
                Calculadora.resultado.setText(Calculadora.resultado.getText()+comando);
            }
        }
    }
}
