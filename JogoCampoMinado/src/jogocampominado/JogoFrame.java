/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogocampominado;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author isaon
 */
public class JogoFrame extends javax.swing.JFrame implements ActionListener {
    ajudaDialog ajudaWindow;
    jogoTabuleiro tabuleiro;
    int nivel = 1;

    /**
     * Creates new form JogoFrame
     */
    public JogoFrame() {
        initComponents(); 
        tabuleiro = new jogoTabuleiro(this);
        
        setBandeiras(tabuleiro.getNumBombas());
        this.campo.add(tabuleiro);
        //this.campo.setLayout(new GridLayout(1,1));
        ajudaWindow = new ajudaDialog(this,true);
        facilBtn.addActionListener(this);
        medioBtn.addActionListener(this);
        dificilBtn.addActionListener(this);
        ajudaBtn.addActionListener(this);
        reset.addActionListener(this);
       this.bombas.setText("0");
       
    }

    public void vitoria() {
        winDialog ganhou = new winDialog(this, true);
        ganhou.setVisible(true);
    }
    
    public int getNivel() {
        return nivel;
    }

    
    public void refazTabuleiro(int nivel){
         this.reset.setText(":)");
        this.tabuleiro.removeAll();
        this.campo.remove(this.tabuleiro);
        this.nivel = nivel;
        tabuleiro = new jogoTabuleiro(this,this.nivel);
        setBandeiras(tabuleiro.getNumBombas());
        this.bombas.setText("0");
        this.campo.add(this.tabuleiro);
        revalidate();
        repaint();
        
    }
    
    public void setBandeiras(int valor){
        this.bandeiras.setText(Integer.toString(valor));
        
    }
    
    public void preparaFim(int corretas){
        this.reset.setText(":(");
        this.bombas.setText(Integer.toString(corretas));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campo = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        bandeiras = new javax.swing.JTextField();
        bombas = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        facilBtn = new javax.swing.JMenuItem();
        medioBtn = new javax.swing.JMenuItem();
        dificilBtn = new javax.swing.JMenuItem();
        ajudaBtn = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        campo.setLayout(new javax.swing.BoxLayout(campo, javax.swing.BoxLayout.LINE_AXIS));

        reset.setText(":)");
        reset.setActionCommand("reset");

        bandeiras.setEnabled(false);

        bombas.setEnabled(false);

        jMenu1.setText("Jogo");

        facilBtn.setText("Fácil");
        facilBtn.setActionCommand("facil");
        jMenu1.add(facilBtn);

        medioBtn.setText("Médio");
        medioBtn.setActionCommand("medio");
        jMenu1.add(medioBtn);

        dificilBtn.setText("Difícil");
        dificilBtn.setActionCommand("dificil");
        jMenu1.add(dificilBtn);

        jMenuBar1.add(jMenu1);

        ajudaBtn.setText("Ajuda");
        ajudaBtn.setActionCommand("ajuda");
        jMenuBar1.add(ajudaBtn);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bandeiras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(393, 393, 393)
                        .addComponent(bombas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(campo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(bandeiras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bombas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoFrame().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ajudaBtn;
    private javax.swing.JTextField bandeiras;
    private javax.swing.JTextField bombas;
    private javax.swing.JPanel campo;
    private javax.swing.JMenuItem dificilBtn;
    private javax.swing.JMenuItem facilBtn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem medioBtn;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "facil": refazTabuleiro(1); break; // setGame
            case "medio": refazTabuleiro(2); break;
            case "dificil": refazTabuleiro(3); break; 
            case "reset": refazTabuleiro(nivel);break;
        }
    }
}
