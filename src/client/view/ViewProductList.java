package client.view;

import client.controller.buttons.viewproductlist.VPLAddProduct;
import client.controller.buttons.viewproductlist.VPLBack;
import client.controller.buttons.viewproductlist.VPLSearchProduct;
import common.SetJTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class ViewProductList extends JFrame {
    private JButton backButton = new JButton();
    private JPanel jPanel1 = new JPanel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTable jTable1 = new JTable();
    private JLabel jLabel1 = new JLabel();
    private JTextField txtName = new JTextField();
    private JButton btnAddToCart = new JButton();
    private JButton btnSearch1 = new JButton();
    private SetJTable set = new SetJTable();


    public ViewProductList(DefaultTableModel dft) {
        initComponents(dft);
        setBackButtonActionListener(new VPLBack(this));
        setBtnAddToCartActionListener(new VPLAddProduct(this));
        setBtnSearch1ActionListener(new VPLSearchProduct(this));
    }

    private void initComponents(DefaultTableModel defaultTableModel) {
        jTable1.setModel(defaultTableModel);
        setResizable(false);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(110, 110, 110));

        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Sitka Display", Font.BOLD, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product Name  :");

        btnAddToCart.setText("Add to Cart");

        backButton.setText("Back");


        btnSearch1.setText("Search Product");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch1)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddToCart)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backButton)
                                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAddToCart)
                                        .addComponent(backButton)
                                        .addComponent(btnSearch1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    public String returnNameSearch() {
        return txtName.getText();
    }

    public void setBtnSearch1ActionListener(ActionListener listener){
        btnSearch1.addActionListener(listener);
    }

    public void setBackButtonActionListener(ActionListener listener){
        backButton.addActionListener(listener);
    }

    public void setBtnAddToCartActionListener(ActionListener listener){
        btnAddToCart.addActionListener(listener);
    }

    public int returnId(){
        return UserView.userID;
    }

    public String returnName(){
        return UserView.userName;
    }

    public JTable returnJTable1(){
        return jTable1;
    }
}
