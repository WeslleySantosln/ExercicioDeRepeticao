package Classes;

import javax.swing.DefaultListModel;

public class NewJFrame extends javax.swing.JFrame {

    int sli1;
    int sli2;
    int sli3;

    public NewJFrame() {
        initComponents();

    }

    private void pegarinfor() {

        sli1 = sliI.getValue();
        sli2 = sliF.getValue();
        sli3 = sliP.getValue();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sliI = new javax.swing.JSlider();
        sliF = new javax.swing.JSlider();
        sliP = new javax.swing.JSlider();
        lblI = new javax.swing.JLabel();
        lblF = new javax.swing.JLabel();
        lblP = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        list3 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("inico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 69, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("fim");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 138, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("passo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 210, -1, -1));

        sliI.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sliI.setMaximum(5);
        sliI.setValue(0);
        sliI.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliIStateChanged(evt);
            }
        });
        getContentPane().add(sliI, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 69, -1, -1));

        sliF.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sliF.setMaximum(20);
        sliF.setMinimum(6);
        sliF.setValue(6);
        sliF.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliFStateChanged(evt);
            }
        });
        getContentPane().add(sliF, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 138, -1, -1));

        sliP.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sliP.setMaximum(4);
        sliP.setMinimum(1);
        sliP.setValue(1);
        sliP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliPStateChanged(evt);
            }
        });
        getContentPane().add(sliP, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 210, -1, -1));

        lblI.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getContentPane().add(lblI, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 58, 67, 43));

        lblF.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getContentPane().add(lblF, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 127, 67, 43));

        lblP.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getContentPane().add(lblP, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 197, 67, 45));

        jButton1.setFont(new java.awt.Font("Agency FB", 3, 24)); // NOI18N
        jButton1.setText("Repita");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 270, 60));

        list1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jScrollPane1.setViewportView(list1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 190, 490));

        list3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jScrollPane2.setViewportView(list3);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 190, 490));

        list2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jScrollPane3.setViewportView(list2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 190, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliIStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliIStateChanged

        pegarinfor();
        lblI.setText(Integer.toString(sli1));

    }//GEN-LAST:event_sliIStateChanged

    private void sliFStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliFStateChanged
        pegarinfor();
        lblF.setText(Integer.toString(sli2));
    }//GEN-LAST:event_sliFStateChanged

    private void sliPStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliPStateChanged
        pegarinfor();
        lblP.setText(Integer.toString(sli3));
    }//GEN-LAST:event_sliPStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        pegarinfor();
        DefaultListModel lista = new DefaultListModel();
        DefaultListModel lista2 = new DefaultListModel();
        DefaultListModel lista3 = new DefaultListModel();

        int m2 = sli1;
        int m3 = sli1;

        while (sli1 <= sli2) {

            lista.addElement(sli1);
            sli1 += sli3;
        }

        list1.setModel(lista);

        do {

            lista2.addElement(m2);
            m2+=sli3;
            
        } while (m2 <= sli2);

        list2.setModel(lista2);

        for (int i = m3; i <= sli2; i += sli3) {
            lista3.addElement(i);

        }

        list3.setModel(lista3);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblF;
    private javax.swing.JLabel lblI;
    private javax.swing.JLabel lblP;
    private javax.swing.JList<String> list1;
    private javax.swing.JList<String> list2;
    private javax.swing.JList<String> list3;
    private javax.swing.JSlider sliF;
    private javax.swing.JSlider sliI;
    private javax.swing.JSlider sliP;
    // End of variables declaration//GEN-END:variables
}
