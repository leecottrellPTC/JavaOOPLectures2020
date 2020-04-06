/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qrlecture2;

import com.google.zxing.common.BitMatrix;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;

public class QRCodeGUI extends javax.swing.JFrame {

    String QRString;        //contents of QR COde
    int height = 200;
    int width = 200;
    Toolkit tools = Toolkit.getDefaultToolkit();
    Graphics draw;      //draw onto the panel

    Image QRimage;      //image drawn on the screen
    BufferedImage QRBuffered;       //image in memory
    BitMatrix QRmatrix;     //QR date for the code

    public QRCodeGUI() {
        initComponents();
        //link to the panel
        draw = this.qrPanel.getGraphics();
        //hide the button
        this.saveButton.setVisible(false);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
//        draw.setColor(Color.pink);
//        draw.fillRect(5, 5, width, height);
        draw.drawImage(QRimage, 5, 5, this);//end of paint
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        noteField = new javax.swing.JTextField();
        drawButton = new javax.swing.JButton();
        qrPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Phone");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Note");

        nameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameFieldKeyTyped(evt);
            }
        });

        phoneField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        emailField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        noteField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        drawButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        drawButton.setText("Generate QR Code");
        drawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtonActionPerformed(evt);
            }
        });

        qrPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        qrPanel.setMinimumSize(new java.awt.Dimension(210, 210));
        qrPanel.setPreferredSize(new java.awt.Dimension(210, 210));

        javax.swing.GroupLayout qrPanelLayout = new javax.swing.GroupLayout(qrPanel);
        qrPanel.setLayout(qrPanelLayout);
        qrPanelLayout.setHorizontalGroup(
            qrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        qrPanelLayout.setVerticalGroup(
            qrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );

        saveButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        saveButton.setText("Save QR Code");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField)
                            .addComponent(phoneField)
                            .addComponent(emailField)
                            .addComponent(noteField)))
                    .addComponent(drawButton, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(qrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(qrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drawButton)
                            .addComponent(saveButton))
                        .addGap(8, 8, 8))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtonActionPerformed
        // TODO add your handling code here:
        
        if(this.nameField.getText().trim().isEmpty()){
            return;
            //stop the method
        }
        //replace any : or ; or \ in the names .replace("\\", "").replace(":", "")
        QRString = "MECARD:N:" + nameField.getText().trim();
        QRString += ";EMAIL:" + emailField.getText();
        QRString += ";TEL:" + phoneField.getText();
        QRString += ";NOTE:" + noteField.getText() + ";;";
        //  JOptionPane.showMessageDialog(this, QRString);
        try {
            QRmatrix = new QRCodeWriter().encode(QRString, BarcodeFormat.QR_CODE, width, height);
            //QR is built in memory
            QRBuffered = MatrixToImageWriter.toBufferedImage(QRmatrix);
            //convert QR to a buffered image
            QRimage = tools.createImage(QRBuffered.getSource());
            //Java can use this image
            draw.drawImage(QRimage, 5, 5, this);
            this.saveButton.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "QR Image failed " + ex.toString());
        }
    }//GEN-LAST:event_drawButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        try{
            String fileName = nameField.getText() + ".gif";
            File saveFile = new File(fileName);
            
            JFileChooser save = new JFileChooser();
            save.setSelectedFile(saveFile);
            int button = save.showSaveDialog(this);//holds onto the chosen button
            if(button == JFileChooser.APPROVE_OPTION){
                //clicked save
                fileName = save.getSelectedFile().toString();
                //full path
                FileOutputStream qrSave = new FileOutputStream(fileName);
                MatrixToImageWriter.writeToStream(QRmatrix, "gif", qrSave);//write to disk       
                qrSave.close();
            }
            else{
                //clicked cancel
            }      
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "QR Save failed " + ex.toString());
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyTyped
        // TODO add your handling code here:
        this.saveButton.setVisible(false);
    }//GEN-LAST:event_nameFieldKeyTyped

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
            java.util.logging.Logger.getLogger(QRCodeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QRCodeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QRCodeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QRCodeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QRCodeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton drawButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField noteField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JPanel qrPanel;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
