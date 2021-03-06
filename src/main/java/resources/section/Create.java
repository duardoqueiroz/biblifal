package resources.section;

import core.entities.Section;
import core.entities.User;
import infra.controllers.SectionsController;
import resources.MainMenu;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Create extends javax.swing.JFrame {

        private User user;

        public Create(User user) {
                this.user = user;
                initComponents();
                setExtendedState(MAXIMIZED_BOTH);
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                jScrollPane2 = new javax.swing.JScrollPane();
                jScrollPane3 = new javax.swing.JScrollPane();
                jPanel2 = new javax.swing.JPanel();
                jPanel1 = new javax.swing.JPanel();
                jPanel4 = new javax.swing.JPanel();
                jLabel11 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jPanel6 = new javax.swing.JPanel();
                jPanel7 = new javax.swing.JPanel();
                jPanel5 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                name = new javax.swing.JTextField();
                jScrollPane4 = new javax.swing.JScrollPane();
                description = new javax.swing.JTextArea();
                jPanel8 = new javax.swing.JPanel();
                jPanel9 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(255, 255, 255));

                jScrollPane3.setToolTipText("");

                jPanel2.setBackground(new java.awt.Color(229, 229, 229));

                jPanel1.setBackground(new java.awt.Color(0, 153, 204));

                jPanel4.setLayout(new javax.swing.OverlayLayout(jPanel4));

                jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

                jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Voltar.png"))); // NOI18N
                jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel13MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(406, 406, 406))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(66, 66, 66)
                                                                                                .addComponent(jLabel11))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(jLabel13,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                79,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel13,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                36,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(9, 9, 9)
                                                                .addComponent(jLabel11)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                214,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33)));

                jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel6.setBackground(new java.awt.Color(0, 153, 204));

                jPanel7.setLayout(new javax.swing.OverlayLayout(jPanel7));

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jPanel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(406, 406, 406)));
                jPanel6Layout.setVerticalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jPanel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33)));

                jPanel5.setBackground(new java.awt.Color(255, 255, 255));

                jLabel4.setBackground(new java.awt.Color(50, 38, 77));
                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(50, 38, 77));
                jLabel4.setText("Dados");

                jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(156, 152, 166));
                jLabel7.setText("Nome");

                jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(156, 152, 166));
                jLabel8.setText("Descri????o");

                jButton1.setBackground(new java.awt.Color(4, 211, 97));
                jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
                jButton1.setForeground(new java.awt.Color(255, 255, 255));
                jButton1.setText("Salvar cadastro");
                jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jButton1MouseClicked(evt);
                        }
                });
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                name.setForeground(new java.awt.Color(156, 152, 166));
                name.setCaretColor(new java.awt.Color(230, 230, 240));
                name.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                nameActionPerformed(evt);
                        }
                });

                description.setColumns(20);
                description.setRows(5);
                jScrollPane4.setViewportView(description);

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGap(85, 85, 85)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                214, Short.MAX_VALUE)
                                                                .addGap(77, 77, 77))
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGap(46, 46, 46)
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel5Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel7)
                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel5Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(jPanel5Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addComponent(jScrollPane4,
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(name,
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                jPanel5Layout.createSequentialGroup()
                                                                                                                                                                .addGroup(jPanel5Layout
                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                .addComponent(jLabel8,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                134,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addComponent(jLabel4))
                                                                                                                                                                .addGap(0, 190, Short.MAX_VALUE)))
                                                                                                                .addContainerGap()))));
                jPanel5Layout.setVerticalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jLabel4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel7)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(name,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(23, 23, 23)
                                                                .addComponent(jLabel8)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                25,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                55,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(69, 69, 69)));

                jPanel8.setBackground(new java.awt.Color(0, 153, 204));
                jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel9.setLayout(new javax.swing.OverlayLayout(jPanel9));
                jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 34, -1, -1));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Cadastrar Se????o");
                jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 340, -1));

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                267,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap(253,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jPanel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(14, 14, 14)))
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel8,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel5,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addComponent(jPanel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                262, Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jPanel1,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jPanel6,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addGap(516, 516, 516)
                                                                                                .addComponent(jPanel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jPanel8,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                174,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jPanel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(217, 217, 217)))
                                                                .addContainerGap(229, Short.MAX_VALUE)));

                jScrollPane3.setViewportView(jPanel2);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane3));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane3));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel13MouseClicked
                MainMenu t = new MainMenu(this.user);
                t.setVisible(true);
                this.dispose();
        }// GEN-LAST:event_jLabel13MouseClicked

        private void nameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_nameActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jButton1ActionPerformed

        private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseClicked

                if ("".equalsIgnoreCase(description.getText()) || "".equalsIgnoreCase(name.getText())) {
                        JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
                } else {
                        SectionsController sectionsController = new SectionsController();
                        Section section = new Section(1, name.getText(), description.getText());
                        sectionsController.save(section);
                        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
                }
        }// GEN-LAST:event_jButton1MouseClicked

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Create(new User(1, "name", "email@gmail.com", "password", true)).setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextArea description;
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JTextField name;
        // End of variables declaration//GEN-END:variables
}
