package server.view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class DeleteProduct extends JFrame {


    public DeleteProduct() {
        initComponents();
    }

    private void initComponents() {

        JPanel jPanel2 = new JPanel();
        JLabel titleProduct = new JLabel();
        JButton backButton = new JButton();
        JTextField idTextField = new JTextField();
        JLabel idLabel = new JLabel();
        JButton deleteButton = new JButton();
        JScrollPane jScrollPane2 = new JScrollPane();
        JTable jTable1 = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(100, 122, 103));

        titleProduct.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 18)); // NOI18N
        titleProduct.setForeground(new java.awt.Color(255, 255, 255));
        titleProduct.setText("Delete Product");

        backButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 13)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("ID               :");

        deleteButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        deleteButton.setText("Delete Product");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(idLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(titleProduct, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(99, 99, 99))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                                .addGap(24, 24, 24)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(titleProduct)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idLabel))
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                                .addComponent(backButton)
                                .addGap(39, 39, 39))
        );

        jTable1.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Product ID", "Name", "Price", "Status"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
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
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new AdminView().setVisible(true);
    }

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteProduct().setVisible(true);
            }
        });
    }
}
