/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JButton;

/**
 *
 * @author rebel
 */
public class cargando extends javax.swing.JInternalFrame {
    
    public JDesktopPane principal;
    public Imagenes VentanaImagenes;
    public Image abrirImagenes;
    public Seguridad VentanaSeguridad;
    
    /**
     * Creates new form cargando
     */
    public cargando() {
        initComponents();
//        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
//        muestra();
    }

    cargando(JDesktopPane principal) {
        initComponents();
//        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        this.principal = principal;
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(cargando.class.getName()).log(Level.SEVERE, null, ex);
//        }
        muestra();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Cargando...");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(334, 334, 334))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        muestra();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void muestra(){
////        VentanaImagenes = new Imagenes();
////        this.principal.add(VentanaImagenes);
////        VentanaImagenes.setVisible(true);
//        //Se muestran las imágenes seleccionadas en la Ventana de Imagenes
//        try {
//            VentanaImagenes = new Imagenes();
//            this.principal.add(VentanaImagenes);
//            VentanaImagenes.setVisible(true);
//            VentanaImagenes.panel.setLayout(new GridLayout(listaImagenes.length,0));
//            for(int i=0;i<listaImagenes.length;i++){
//                BufferedImage bi =  ImageIO.read(listaImagenes[i]);
//                JButton b = new JButton();
//                VentanaImagenes.panel.add(b);
//                b.setIcon(new ImageIcon(bi.getScaledInstance(VentanaImagenes.panel.getWidth(),
//                        VentanaImagenes.panel.getWidth(),Image.SCALE_DEFAULT)));
//                VentanaImagenes.panel.updateUI();
//                System.out.println(i+"\n");
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}