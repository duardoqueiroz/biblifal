package resources.shelf;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import core.entities.Book;
import core.entities.Genre;
import core.entities.Section;
import core.entities.Shelf;
import core.entities.ShelfBooks;
import core.entities.User;
import infra.controllers.BooksController;
import infra.controllers.ShelfsController;
import resources.MainMenu;

/**
 *
 * @author Acer
 */
public class ShowBooks extends javax.swing.JFrame {
        private ShelfsController shelfsController = new ShelfsController();
        private Shelf shelf;
        private ArrayList<ShelfBooks> shelfBooks;
        private User user;

        public void setTotalBooks() {
                int totalBooks = 0;
                for (ShelfBooks shelfBook : shelfBooks) {
                        totalBooks = totalBooks + shelfBook.getBooksQuantity();
                }
                jLabel2.setText("Quantidade de livros: " + totalBooks);
        }

        public void updateList() {
                this.shelfBooks = shelfsController.findBooks(this.shelf.getId());
                String[] shelfBooksVector = new String[shelfBooks.size()];

                for (int i = 0; i < shelfBooksVector.length; i++) {
                        int quantityBooks = shelfBooks.get(i).getBooksQuantity();
                        if (quantityBooks > 0) {
                                ArrayList<String> genres = new ArrayList<>();
                                for (Genre genre : shelfBooks.get(i).getBook().getGenres()) {
                                        if (genre != null) {
                                                genres.add(genre.getName());
                                        }
                                }
                                String title = "Título : " + shelfBooks.get(i).getBook().getTitle();
                                String company = "Editora : " + shelfBooks.get(i).getBook().getCompany();
                                String price = "Preço : R$ " + String.valueOf(shelfBooks.get(i).getBook().getPrice());
                                String author = "Autor : " + shelfBooks.get(i).getBook().getAuthor();
                                String genr = "Gêneros : " + genres;
                                String quantity = "Quantidade estocada : "
                                                + String.valueOf(quantityBooks);
                                String id = String.valueOf(shelfBooks.get(i).getBook().getId());
                                shelfBooksVector[i] = id + " - " + title + " | " + company + " | " + price + " | "
                                                + author
                                                + " | "
                                                + genr + " | " + quantity;
                        } else {
                                shelfsController.removeBook(this.shelf.getId(),
                                                this.shelfBooks.get(i).getBook().getId());
                        }

                }
                jList1.setListData(shelfBooksVector);
        }

        public ShowBooks(Shelf shelf, User user) {
                this.shelf = shelf;
                this.user = user;
                initComponents();
                setExtendedState(MAXIMIZED_BOTH);
                updateList();
                setTotalBooks();
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
                buy = new javax.swing.JButton();
                remove = new javax.swing.JButton();
                jButton1 = new javax.swing.JButton();
                jPanel5 = new javax.swing.JPanel();
                jScrollPane5 = new javax.swing.JScrollPane();
                jList1 = new javax.swing.JList<>();
                jPanel8 = new javax.swing.JPanel();
                jPanel9 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(255, 255, 255));

                jScrollPane3.setToolTipText("");

                jPanel2.setBackground(new java.awt.Color(229, 229, 229));

                jPanel1.setBackground(new java.awt.Color(130, 87, 229));

                jPanel4.setLayout(new javax.swing.OverlayLayout(jPanel4));

                jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel11MouseClicked(evt);
                        }
                });

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
                                                                                214, Short.MAX_VALUE)
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33)));

                jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel6.setBackground(new java.awt.Color(130, 87, 229));

                jPanel7.setLayout(new javax.swing.OverlayLayout(jPanel7));

                buy.setBackground(new java.awt.Color(153, 255, 153));
                buy.setText("Comprar");
                buy.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buyActionPerformed(evt);
                        }
                });

                remove.setBackground(new java.awt.Color(255, 51, 51));
                remove.setText("Remover");
                remove.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                removeActionPerformed(evt);
                        }
                });
                remove.setVisible(this.user.getIsManager());

                jButton1.setBackground(new java.awt.Color(0, 102, 255));
                jButton1.setText("Adicionar livro");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });
                jButton1.setVisible(this.user.getIsManager());

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
                                                                .addGap(406, 406, 406))
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(buy,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(remove,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jButton1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel6Layout.setVerticalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(buy)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(remove)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(jPanel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33)));

                jPanel5.setBackground(new java.awt.Color(255, 255, 255));

                jList1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
                jScrollPane5.setViewportView(jList1);

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane5));
                jPanel5Layout.setVerticalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 633,
                                                                Short.MAX_VALUE));

                jPanel8.setBackground(new java.awt.Color(130, 87, 229));
                jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel9.setLayout(new javax.swing.OverlayLayout(jPanel9));
                jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 34, -1, -1));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Estante " + this.shelf.getId());
                jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

                jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(212, 194, 255));
                jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 180, -1));

                jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(212, 194, 255));
                jLabel3.setText("Seção: " + String.valueOf(this.shelf.getSection().getName()));
                jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

                jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(212, 194, 255));
                jLabel4.setText("Capacidade: " + String.valueOf(this.shelf.getCapacity()));
                jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                264, Short.MAX_VALUE)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap(250,
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
                                                                                263, Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
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
                                                                                                .addGap(519, 519, 519)
                                                                                                .addComponent(jPanel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jPanel8,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                174,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 0, 0)
                                                                                                .addComponent(jPanel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(229, Short.MAX_VALUE)));

                jScrollPane3.setViewportView(jPanel2);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane3));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane3,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                1012, Short.MAX_VALUE)
                                                                .addContainerGap()));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                ArrayList<Book> books = new BooksController().findAll();
                for (int i = 0; i < books.size(); i++) {
                        for (int j = 0; j < this.shelfBooks.size(); j++) {
                                if (books.get(i).getId() == this.shelfBooks.get(j).getBook().getId()) {
                                        books.remove(i);
                                }
                        }
                }
                ArrayList<String> options = new ArrayList<>();
                for (Book book : books) {
                        options.add(book.getId() + " - " + book.getTitle());
                }
                Object res = JOptionPane.showInputDialog(null, "Escolha um livro", "Selecao de livros",
                                JOptionPane.PLAIN_MESSAGE, null, options.toArray(), "");
                if (res == null) {
                        JOptionPane.showMessageDialog(null, "É necessário informar o livro!", "Erro",
                                        JOptionPane.ERROR_MESSAGE);
                } else {
                        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de livos"));
                        if (quantity < 1) {
                                JOptionPane.showMessageDialog(null, "É necessário informar a quantidade do livro!",
                                                "Erro", JOptionPane.ERROR_MESSAGE);
                        } else {
                                boolean approved = shelfsController.insertBook(this.shelf.getId(),
                                                Integer.parseInt(res.toString().replaceAll("-[^-]+$", "").trim()),
                                                quantity);
                                if (approved) {
                                        JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!");
                                        updateList();
                                        setTotalBooks();
                                } else {
                                        JOptionPane.showMessageDialog(null, "Erro ao adicionar livro!", "Erro",
                                                        JOptionPane.ERROR_MESSAGE);
                                }
                        }
                }
        }// GEN-LAST:event_jButton1ActionPerformed

        private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel12MouseClicked
                // TODO add your handling code here:
                MainMenu t = new MainMenu(this.user);
                t.setVisible(true);
                this.dispose();
        }// GEN-LAST:event_jLabel12MouseClicked

        private void buyActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateButtonActionPerformed
                if (jList1.getSelectedValue() != null) {
                        int element = Integer.parseInt(jList1.getSelectedValue().replaceAll("-[^-]+$", "").trim());
                        if (element != -1) {
                                int quantity = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                "Informe a quantidade de livros que deseja comprar!"));
                                boolean approved = shelfsController.sellBook(element, this.shelf.getId(), quantity);
                                if (approved) {
                                        JOptionPane.showMessageDialog(null, "Compra aprovada com sucesso!");
                                        updateList();
                                        setTotalBooks();
                                } else {
                                        JOptionPane.showMessageDialog(null, "Houve um erro ao fazer a compra!");
                                }
                        }
                }
        }// GEN-LAST:event_updateButtonActionPerformed

        private void removeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteButtonActionPerformed
                if (jList1.getSelectedValue() != null) {
                        int element = Integer.parseInt(jList1.getSelectedValue().replaceAll("-[^-]+$", "").trim());
                        if (element != -1) {
                                shelfsController.removeBook(this.shelf.getId(), element);
                                updateList();
                                setTotalBooks();
                        }
                }

        }// GEN-LAST:event_deleteButtonActionPerformed

        private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel11MouseClicked
                // TODO add your handling code here:
                // TelaPrincipal t = new TelaPrincipal();
                // this.dispose();
                // t.setVisible(true);
        }// GEN-LAST:event_jLabel11MouseClicked

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
                        java.util.logging.Logger.getLogger(ShowBooks.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(ShowBooks.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(ShowBooks.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(ShowBooks.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new ShowBooks(new Shelf(new Section(1, "name", "description"), 50, 1),
                                                new User(1, "name", "email@gmail.com", "password", true))
                                                .setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton buy;
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JList<String> jList1;
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
        private javax.swing.JScrollPane jScrollPane5;
        private javax.swing.JButton remove;
        // End of variables declaration//GEN-END:variables
}
