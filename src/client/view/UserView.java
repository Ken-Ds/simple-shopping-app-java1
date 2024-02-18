package client.view;
import common.SetJTable;

import javax.swing.*;
import java.awt.*;

public class UserView  extends JFrame {
    private JPanel jPanel2 = new JPanel();
    private JPanel jPanel1 = new JPanel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel1 = new JLabel();
    private JButton btnAddToCart = new JButton();
    private JButton btnViewProduct = new JButton();
    private JButton btnLogOut = new JButton();
    private JLabel labelID = new JLabel();
    private JLabel labelName = new JLabel();


    public UserView() {
        initComponents();
    }
    private void initComponents() {
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(110, 110, 110));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Sitka Display", Font.BOLD, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AND GO UPHILL");

        jLabel3.setFont(new java.awt.Font("Sitka Display", Font.BOLD, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RUN THE MILL ");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(110, Short.MAX_VALUE)
                                .addComponent(jLabel3,GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143))
        );

        jLabel1.setFont(new java.awt.Font("Sitka Display", Font.BOLD, 31)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPHILL");

        btnAddToCart.setText("View Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        btnViewProduct.setText("View Product");
        btnViewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProductActionPerformed(evt);
            }
        });

        btnLogOut.setText("Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        labelName.setFont(new java.awt.Font("Sitka Display", Font.BOLD, 20)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setText("Emman ");

        labelID.setFont(new java.awt.Font("Sitka Display", Font.BOLD, 14)); // NOI18N
        labelID.setForeground(new java.awt.Color(255, 255, 255));
        labelID.setText("00001");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(labelName))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(45, 45, 45)
                                                                .addComponent(labelID, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(40, 40, 40)))
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 195, Short.MAX_VALUE)
                                                .addComponent(btnAddToCart)
                                                .addGap(31, 31, 31)
                                                .addComponent(btnViewProduct)
                                                .addGap(30, 30, 30)
                                                .addComponent(btnLogOut)
                                                .addGap(29, 29, 29))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(btnAddToCart)
                                        .addComponent(btnViewProduct)
                                        .addComponent(btnLogOut))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(labelName)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelID)
                                                .addGap(36, 36, 36))))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void btnViewProductActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new ViewProductList(new SetJTable().setClientTable()).setVisible(true);
    }

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new ViewCart(new SetJTable().setClientTable()).setVisible(true);
    }

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new LogIn().setVisible(true);
    }
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView().setVisible(true);
            }
        });
    }
}


