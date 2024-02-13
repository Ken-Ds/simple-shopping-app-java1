package server.view;
import javax.swing.*;
import java.awt.*;

public class AdminView extends JFrame {


    public AdminView() {
        initComponents();
        setTitle("UPHILL App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void initComponents() {

        JPanel jPanel2 = new JPanel();
        JButton exitButton = new JButton();
        JButton deleteProductButton = new JButton();
        JButton editProductButton = new JButton();
        JLabel labelUphill = new JLabel();
        JButton addProductButton = new JButton();
        JLabel labelAdminName = new JLabel();
        JLabel labelSeller = new JLabel();
        JPanel jPanel1 = new JPanel();
        JLabel labelWelcome = new JLabel();
        JButton viewProductButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(100, 122, 103));

        exitButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        deleteProductButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        deleteProductButton.setText("Delete Product");
        deleteProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductButtonActionPerformed(evt);
            }
        });

        editProductButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        editProductButton.setText("Edit Product");
        editProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProductButtonActionPerformed(evt);
            }
        });

        labelUphill.setFont(new java.awt.Font("Sitka Display", Font.BOLD, 28)); // NOI18N
        labelUphill.setForeground(new java.awt.Color(255, 255, 255));
        labelUphill.setText("UPHILL");

        addProductButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        addProductButton.setText("Add Product");
        addProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductButtonActionPerformed(evt);
            }
        });

        labelAdminName.setFont(new java.awt.Font("Sitka Display", Font.BOLD, 18)); // NOI18N
        labelAdminName.setForeground(new java.awt.Color(255, 255, 255));
        labelAdminName.setText("ADMIN");

        labelSeller.setBackground(new java.awt.Color(255, 255, 255));
        labelSeller.setFont(new java.awt.Font("Sitka Display", Font.PLAIN, 14)); // NOI18N
        labelSeller.setForeground(new java.awt.Color(255, 255, 255));
        labelSeller.setText("Seller");

        jPanel1.setBackground(new java.awt.Color(198, 222, 198));
        jPanel1.setForeground(new java.awt.Color(198, 222, 198));

        labelWelcome.setFont(new java.awt.Font("Segoe UI Semibold", Font.BOLD, 36)); // NOI18N
        labelWelcome.setText("WELCOME TO DASHBOARD");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(73, Short.MAX_VALUE)
                                .addComponent(labelWelcome)
                                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(labelWelcome)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        viewProductButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        viewProductButton.setText("View Product");
        viewProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductButtonActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelUphill)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(labelSeller, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(labelAdminName))))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 14, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(addProductButton, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(deleteProductButton, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(editProductButton, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(viewProductButton, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelUphill, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelAdminName, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSeller)
                                .addGap(30, 30, 30)
                                .addComponent(addProductButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(viewProductButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteProductButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editProductButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(82, Short.MAX_VALUE))
                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void deleteProductButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new DeleteProduct().setVisible(true);
    }

    private void addProductButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new AddProduct().setVisible(true);
    }

    private void viewProductButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new ViewProduct().setVisible(true);
    }

    private void editProductButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new EditProduct().setVisible(true);
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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

}
