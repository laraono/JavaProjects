/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package jogocampominado;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.SwingUtilities;

/**
 *
 * @author isaon
 */
public class jogoTabuleiro extends javax.swing.JPanel implements MouseListener{
    int numBombas;
    int altura;
    int flags;
    int largura;
    Boolean fim = false, inicio = true;
    Casas[][] casa;
    JogoFrame frame;
    /**
     * Creates new form jogoTabuleiro
     * @param quadro
     */
    public jogoTabuleiro(JogoFrame quadro) {
        initComponents();
        setNivel(1);
        setCasas();
        setBombas();
        this.setLayout(new GridLayout(altura,largura));
        frame = quadro;
    }
     public jogoTabuleiro(JogoFrame quadro, int nivel) {
        if(nivel >= 1 && nivel <=3 ){
        initComponents(); 
        setNivel(nivel);
        setCasas();
        setBombas();
        this.setLayout(new GridLayout(altura,largura));
        frame = quadro;
        }
    }

    private void setNivel(int nivel){
        switch(nivel){
            case 1 -> {
                numBombas = 10; altura = 9; largura = 9;
            }
            case 2 -> {
                numBombas = 40; altura = 16; largura = 16;
            }
            case 3 -> {
                numBombas = 99; altura = 16; largura = 30;
            }
        }
        casa = new Casas[altura][largura];
    }
    
    private void setCasas(){
        for(int i = 0; i< altura; i++){
            for(int j = 0; j< largura; j++){
            Casas nova = new Casas(i,j,false);
            nova.setText("");
            nova.addMouseListener(this);
            casa[i][j] = nova;
            
            this.add(casa[i][j]);
            }
        }
        
    }
    
    private void setBombas(){
        Random gera = new Random();
        for(int i = 0; i < numBombas; i++){
            int x = gera.nextInt(altura);
            int y = gera.nextInt(largura);
            while(casa[x][y].bombas){
            x = gera.nextInt(altura);
            y = gera.nextInt(largura);
            }
            casa[x][y].bombas = true;
           
            setVizinhos(x,y);
        }
    }
    
    private void setVizinhos(int x, int y){
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                if(x+i >= 0 && y+j >= 0 && x+i < altura && y+j < largura && !casa[x+i][y+j].bombas){
                    casa[x+i][y+j].vizinhos++;
                }
                
            }

        }
    
    }
    
    private void revelarBombas(){
        int corretas = 0;
        for(int i = 0; i< altura; i++){
            for(int j = 0; j< largura; j++){
                if(casa[i][j].bombas){
                    casa[i][j].setText("*");
                    casa[i][j].setBackground(Color.red);
                    if(casa[i][j].flag.equals("+")){
                        corretas++;
                    }
                }

            }
        }
                     frame.preparaFim(corretas);
    }

    public int getNumBombas() {
        return numBombas;
    }
    
  private void recursaoVizinhos(int x, int y){
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                if(x+i >= 0 && y+j >= 0 && x+i < altura && y+j < largura && !casa[x+i][y+j].bombas){
                    casa[x+i][y+j].revelaCasa();
                    if(casa[x+i][y+j].vizinhos == 0 && !casa[x+i][y+j].revelado && !casa[x+i][y+j].getText().equals("+")){
                        recursaoVizinhos(x+i,y+j);
                        break;
                    }
                }
                
            }

        }
    
    }
    
  private void clicaFlag(Casas btn){
      if (this.flags <= this.numBombas && btn.getText().equals("")) {
                        this.flags++;
                        btn.flag = "+";
            }
            else if (this.flags > 0 && btn.getText().equals("+")){
                this.flags--;
                btn.flag = "";
            }
            frame.setBandeiras(this.numBombas - this.flags);
            btn.setText(btn.flag);
            if (this.flags == this.numBombas) {
                verificaVencer();
            }
  }
    
  private void clicaCasa(Casas btn){
      if(!btn.revelado){
            btn.revelaCasa();
            if(btn.bombas){
             if(!this.inicio){
             fim = true;
             revelarBombas();

             } else {
             frame.refazTabuleiro(frame.getNivel());
             }
            } 
            else {
              recursaoVizinhos(btn.posX,btn.posY);
            }
            if(this.inicio){
                this.inicio = false;
            }
            }
            
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void mouseClicked(MouseEvent e) {
        if(fim == false){
        if(e.getComponent() instanceof Casas){
            Casas btn = (Casas) e.getComponent();
        if (SwingUtilities.isRightMouseButton(e)) {
            this.clicaFlag(btn);
        }
        else if(SwingUtilities.isLeftMouseButton(e)){
            this.clicaCasa(btn);
        }
        }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    
    }

    @Override
    public void mouseEntered(MouseEvent e) {
   
    }

    @Override
    public void mouseExited(MouseEvent e) {
    
    }

    private void verificaVencer() {
        Boolean win = true;
        for(int i = 0; i< altura; i++){
            for(int j = 0; j< largura; j++){
                if(casa[i][j].bombas){
                    if(!casa[i][j].getText().equals("+")){
                        win = false;
                        break;
                    }
                }
            }
        }
        if(win == true){
            frame.vitoria();
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
