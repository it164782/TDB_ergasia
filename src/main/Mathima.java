/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author proxc
 */
public class Mathima extends javax.swing.JFrame {

    /**
     * Creates new form Home_Data
     */
    public Mathima() {
        initComponents();
        viewPanel.setBackground(new java.awt.Color(35,90,190));
        showAllInTable();
        setIcon();
    }
    
    public void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().createImage(getClass().getResource("binder_30px.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        viewPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        editPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        botPanel = new javax.swing.JPanel();
        viewMathimata = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        editMathimata = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        onomaEditLabel = new javax.swing.JLabel();
        amKathigitiMathimatosTF = new javax.swing.JTextField();
        onomaMathimatosEditTF = new javax.swing.JTextField();
        epeksergasiaEditBtn = new javax.swing.JButton();
        eponimoEditLabel = new javax.swing.JLabel();
        eidikotitaEditLabel = new javax.swing.JLabel();
        amEditLabel = new javax.swing.JLabel();
        amKathigitisEditTF = new javax.swing.JTextField();
        onomaLabel3 = new javax.swing.JLabel();
        emfanisiStoixeiaKathigitiLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/w_school_50px.png"))); // NOI18N
        jLabel15.setText(" Μαθήματα");

        viewPanel.setBackground(new java.awt.Color(45, 118, 232));
        viewPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPanelMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Προβολή");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        editPanel.setBackground(new java.awt.Color(45, 118, 232));
        editPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editPanelMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Επεξεργασία");

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        botPanel.setLayout(new java.awt.CardLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Κωδικός Μαθηματος", "Όνομα Μαθήματος", "Ονομα Διδάσκοντος Καθηγητής", "Επίθετο Διδάσκοντος Καθηγητής"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout viewMathimataLayout = new javax.swing.GroupLayout(viewMathimata);
        viewMathimata.setLayout(viewMathimataLayout);
        viewMathimataLayout.setHorizontalGroup(
            viewMathimataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        viewMathimataLayout.setVerticalGroup(
            viewMathimataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        botPanel.add(viewMathimata, "card2");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Φόρμα επεξεργασίας καθηγητών"));
        jPanel6.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(new java.awt.GridBagLayout());

        onomaEditLabel.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        onomaEditLabel.setText("Όνομα Μαθήματος :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel6.add(onomaEditLabel, gridBagConstraints);

        amKathigitiMathimatosTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                amKathigitiMathimatosTFFocusLost(evt);
            }
        });
        amKathigitiMathimatosTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amKathigitiMathimatosTFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 149;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 40, 9, 0);
        jPanel6.add(amKathigitiMathimatosTF, gridBagConstraints);

        onomaMathimatosEditTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onomaMathimatosEditTFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 149;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 40, 9, 0);
        jPanel6.add(onomaMathimatosEditTF, gridBagConstraints);

        epeksergasiaEditBtn.setText("Επεξεργασία");
        epeksergasiaEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epeksergasiaEditBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(17, 39, 20, 0);
        jPanel6.add(epeksergasiaEditBtn, gridBagConstraints);

        eponimoEditLabel.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        eponimoEditLabel.setText("ΑΜ Σχετιζόμενου Καθηγητή :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel6.add(eponimoEditLabel, gridBagConstraints);

        eidikotitaEditLabel.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        eidikotitaEditLabel.setText("Στοιχεία Καθηγητη :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel6.add(eidikotitaEditLabel, gridBagConstraints);

        amEditLabel.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        amEditLabel.setText("ΑΜ Μαθήματος :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel6.add(amEditLabel, gridBagConstraints);

        amKathigitisEditTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                amKathigitisEditTFFocusLost(evt);
            }
        });
        amKathigitisEditTF.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                amKathigitisEditTFPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 153;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 40, 9, 0);
        jPanel6.add(amKathigitisEditTF, gridBagConstraints);

        onomaLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        onomaLabel3.setText("Εισαγετε το ΑΜ του καθηγητη που θελετε να επεξεργαστειτε:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 14, 14, 14);
        jPanel6.add(onomaLabel3, gridBagConstraints);

        emfanisiStoixeiaKathigitiLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(9, 40, 9, 0);
        jPanel6.add(emfanisiStoixeiaKathigitiLabel, gridBagConstraints);

        javax.swing.GroupLayout editMathimataLayout = new javax.swing.GroupLayout(editMathimata);
        editMathimata.setLayout(editMathimataLayout);
        editMathimataLayout.setHorizontalGroup(
            editMathimataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editMathimataLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        editMathimataLayout.setVerticalGroup(
            editMathimataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editMathimataLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        botPanel.add(editMathimata, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:

        viewMathimata.setVisible(true);
        editMathimata.setVisible(false);
        viewPanel.setBackground(new java.awt.Color(35,90,190));
        editPanel.setBackground(new java.awt.Color(45,118,232));
        showAllInTable();

    }//GEN-LAST:event_jLabel7MouseClicked

    private void viewPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPanelMouseClicked
        // TODO add your handling code here:
        viewMathimata.setVisible(true);
        editMathimata.setVisible(false);
        viewPanel.setBackground(new java.awt.Color(35,90,190));
        editPanel.setBackground(new java.awt.Color(45,118,232));
        showAllInTable();

    }//GEN-LAST:event_viewPanelMouseClicked

    private void editPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseClicked
        // TODO add your handling code here:
        viewMathimata.setVisible(false);
        editMathimata.setVisible(true);
        viewPanel.setBackground(new java.awt.Color(45,118,232));
        editPanel.setBackground(new java.awt.Color(35,90,190));
    }//GEN-LAST:event_editPanelMouseClicked

    private void amKathigitiMathimatosTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amKathigitiMathimatosTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amKathigitiMathimatosTFActionPerformed

    private void onomaMathimatosEditTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onomaMathimatosEditTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onomaMathimatosEditTFActionPerformed

    private void epeksergasiaEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epeksergasiaEditBtnActionPerformed
        editMathima(Integer.valueOf(amKathigitisEditTF.getText()),
                    onomaMathimatosEditTF.getText(),
                    Integer.valueOf(amKathigitiMathimatosTF.getText()));
    }//GEN-LAST:event_epeksergasiaEditBtnActionPerformed

    private void amKathigitisEditTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amKathigitisEditTFFocusLost
        // TODO add your handling code here:
        showDetailsEdit(amKathigitisEditTF.getText());
    }//GEN-LAST:event_amKathigitisEditTFFocusLost

    private void amKathigitisEditTFPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_amKathigitisEditTFPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_amKathigitisEditTFPropertyChange

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        // TODO add your handling code here:
        jPanel6.requestFocus();
    }//GEN-LAST:event_jPanel6MousePressed

    private void amKathigitiMathimatosTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amKathigitiMathimatosTFFocusLost
        // TODO add your handling code here:
        showKathigitis(Integer.valueOf(amKathigitiMathimatosTF.getText()));
    }//GEN-LAST:event_amKathigitiMathimatosTFFocusLost

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
            java.util.logging.Logger.getLogger(Mathima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mathima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mathima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mathima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mathima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amEditLabel;
    private javax.swing.JTextField amKathigitiMathimatosTF;
    private javax.swing.JTextField amKathigitisEditTF;
    private javax.swing.JPanel botPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel editMathimata;
    private javax.swing.JPanel editPanel;
    private javax.swing.JLabel eidikotitaEditLabel;
    private javax.swing.JLabel emfanisiStoixeiaKathigitiLabel;
    private javax.swing.JButton epeksergasiaEditBtn;
    private javax.swing.JLabel eponimoEditLabel;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel onomaEditLabel;
    private javax.swing.JLabel onomaLabel3;
    private javax.swing.JTextField onomaMathimatosEditTF;
    private javax.swing.JPanel viewMathimata;
    private javax.swing.JPanel viewPanel;
    // End of variables declaration//GEN-END:variables

    private void showAllInTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String selectString = "SELECT showtablemathima()";
        Statement aStatePG = DBPostresqlAdmin.getStatement();
        model.setRowCount(0);
        ResultSet rs = DBPostresqlAdmin.getResultset();
        try {
            rs = aStatePG.executeQuery(selectString);
            Object[] row = new Object[8];
            String columnvalue;
            
            while (rs.next()) {
                columnvalue = rs.getString(1);
                String[] a = columnvalue.substring(1, columnvalue.length()-1).split(",");
                for (int i = 0; i < a.length; i++) {
                    row[i] =a[i];
                }
                model.addRow(row);
            }
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
		System.out.println("Message: " + ex.getMessage());
		ex = ex.getNextException();
            }
        } 
    }

    private void showDetailsEdit(String ext){
        try {
            int num  = Integer.valueOf(ext);
            if((num< MathitisAdmin.getSid()) && (num >0)){
                String selectString = "SELECT selMathimaViaID(?);";
                PreparedStatement aStatePG = DBPostresqlAdmin.getPrepareStatement(selectString);
                ResultSet rs = DBPostresqlAdmin.getResultset();
                try {
                    aStatePG.setInt(1, num);
                    rs = aStatePG.executeQuery();        
                    String columnvalue;
                    rs.next();
                    columnvalue = rs.getString(1);   
                    String[] a = columnvalue.substring(1, columnvalue.length()-1).split(",");
                    onomaMathimatosEditTF.setText(a[0]);
                    amKathigitiMathimatosTF.setText(a[1]);
                    emfanisiStoixeiaKathigitiLabel.setText(a[2] + " " + a[3] + " " + a[4]);
                    
                    
                                   
                } catch(SQLException ex) {
                    System.out.println("\n -- SQL Exception --- \n");
                    while(ex != null) {
                        System.out.println("Message: " + ex.getMessage());
                        ex = ex.getNextException();
                    }
                } 
            }else{
                onomaMathimatosEditTF.setText("");
                amKathigitiMathimatosTF.setText("");
                emfanisiStoixeiaKathigitiLabel.setText("");
                String temp = "<html>To AM που δωσατε ειναι δεν υπαρχει <br>Παρακαλω δωστε αριθμους απο το 1 εως "+ String.valueOf(MathitisAdmin.getSid()-1);
                JOptionPane.showMessageDialog(null, temp, "Προσοχή!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
                onomaMathimatosEditTF.setText("");
                amKathigitiMathimatosTF.setText("");
                emfanisiStoixeiaKathigitiLabel.setText("");
            String temp = "<html>To AM που δωσατε ειναι δεν υπαρχει <br>Παρακαλω δωστε αριθμους απο το 1 εως "+ String.valueOf(MathitisAdmin.getSid()-1);
            JOptionPane.showMessageDialog(null, temp, "Προσοχή!", JOptionPane.WARNING_MESSAGE);
            System.out.println("ti pige strava: " + e.getMessage());
        }
        
    }


    private void showKathigitis(int ext){
                try {
            int num  = Integer.valueOf(ext);
            if((num< MathitisAdmin.getSid()) && (num >0)){
                String selectString = "SELECT selKathigitisViaID(?);";
                PreparedStatement aStatePG = DBPostresqlAdmin.getPrepareStatement(selectString);
                ResultSet rs = DBPostresqlAdmin.getResultset();
                try {
                    aStatePG.setInt(1, num);
                    rs = aStatePG.executeQuery();        
                    String columnvalue;
                    rs.next();
                    columnvalue = rs.getString(1);   
                    String[] a = columnvalue.substring(1, columnvalue.length()-1).split(",");
                    emfanisiStoixeiaKathigitiLabel.setText(a[0] + " " + a[1] + " " + a[2]);
                    
                    
                                   
                                  
                } catch(SQLException ex) {
                    System.out.println("\n -- SQL Exception --- \n");
                    while(ex != null) {
                        System.out.println("Message: " + ex.getMessage());
                        ex = ex.getNextException();
                    }
                } 
            }else{
                emfanisiStoixeiaKathigitiLabel.setText("");
                String temp = "<html>To AM που δωσατε ειναι δεν υπαρχει <br>Παρακαλω δωστε αριθμους απο το 1 εως "+ String.valueOf(MathitisAdmin.getSid()-1);
                JOptionPane.showMessageDialog(null, temp, "Προσοχή!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
                emfanisiStoixeiaKathigitiLabel.setText("");
            String temp = "<html>To AM που δωσατε ειναι δεν υπαρχει <br>Παρακαλω δωστε αριθμους απο το 1 εως "+ String.valueOf(MathitisAdmin.getSid()-1);
            JOptionPane.showMessageDialog(null, temp, "Προσοχή!", JOptionPane.WARNING_MESSAGE);
            System.out.println("ti pige strava: " + e.getMessage());
        }
    }
private void editMathima(int ext1, String ext2, int ext3){
        String selectString = "SELECT updatemathima(?, ?, ?);";
        PreparedStatement aStatePG = DBPostresqlAdmin.getPrepareStatement(selectString);
        
        try {
            aStatePG.setInt(1, ext1);
            aStatePG.setString(2, ext2);
            aStatePG.setInt(3, ext3);
            aStatePG.executeQuery();
            
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
		System.out.println("Message: " + ex.getMessage());
		ex = ex.getNextException();
            }
        }
    }






















}
