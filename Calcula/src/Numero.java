
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Numero extends JButton {
    Integer[] alg = {1,2,3,4,5,6,7,8,9,0};
    static int index = 0;
    public Numero() {
        this.setActionCommand(alg[index].toString());
        this.setText(alg[index].toString());
        index++;
    }
     static void clicaNumero(ActionEvent e){
         String valor = e.getActionCommand();
         if(Calculadora.resultado.getText().equals("ERROR!")){
            Calculadora.resultado.setText("");
        }
         switch(Calculadora.getStatus()){
            case Calculadora.Estados.IGNORADO:
                Calculadora.setStatus(Calculadora.Estados.INICIO);
            case Calculadora.Estados.INICIO:
                 Calculadora.setStatus(Calculadora.Estados.NUM1);
                if(Calculadora.vec[0] == null) {Calculadora.vec[0] = (valor); break;}
            case Calculadora.Estados.NUM1:
                Calculadora.vec[0] = Calculadora.vec[0].concat(valor);
                break;
            case Calculadora.Estados.OPERADOR:
                Calculadora.setStatus(Calculadora.Estados.NUM2);
                Calculadora.vec[1] = (valor);
                break;
            case Calculadora.Estados.NUM2:
                Calculadora.vec[1] = Calculadora.vec[1].concat(valor);
         }
           Calculadora.resultado.setText(Calculadora.resultado.getText()+valor);
     }
     }

