
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
            if(Calculadora.status == Calculadora.Estados.NUM2){
                Calculadora.calcularResultado();
            }
            else{
                Calculadora.resultado.setText(Calculadora.vec[0]);
                Calculadora.vec[1] = "";
                Calculadora.vec[2] = "";
                Calculadora.status =  Calculadora.Estados.NUM1;
            }

        }
        
        else if(comando.equals("C")){
            Calculadora.status =  Calculadora.Estados.LIMPAR;
            Calculadora.setVetor("","","",Calculadora.Estados.INICIO);
            Calculadora.total = 0;
            Calculadora.resultado.setText("");
        }
        
        else if((Calculadora.status == Calculadora.Estados.INICIO || Calculadora.status == Calculadora.Estados.IGNORADO)){
            if (comando.equals("+") || comando.equals("-")){
                Calculadora.status = Calculadora.Estados.INICIO;
                Calculadora.resultado.setText(Calculadora.resultado.getText()+comando);
                Calculadora.vec[0] = comando;}
            if((comando.equals("*") || comando.equals("/"))){
                Calculadora.status =  Calculadora.Estados.IGNORADO;
            }
        }
        
        else if( (Calculadora.status ==  Calculadora.Estados.NUM1)) { 
            Calculadora.status =  Calculadora.Estados.OPERADOR; 
            Calculadora.resultado.setText(Calculadora.resultado.getText()+comando);
            Calculadora.vec[2] = comando;
        }
    }
}
