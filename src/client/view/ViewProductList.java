package client.view;

import common.Cart;
import common.Product;
import common.SetJTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

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

    ArrayList<Product> productList = new ArrayList<>();

    public ViewProductList(DefaultTableModel dft) {
        initComponents(dft);
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
        btnAddToCart.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                addToCartButton(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1(evt);
            }
        });

        btnSearch1.setText("Search Product");
        btnSearch1.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                searchButton(evt);
            }
        });

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
    private void jButton1(java.awt.event.ActionEvent evt) {
        this.dispose();
        new UserView().setVisible(true);
    }
    private void searchButton(java.awt.event.ActionEvent evt){
        this.dispose();
        new ViewProductList(set.searchByNameProductTable(returnNameSearch())).setVisible(true);
    }
    public String returnNameSearch() {
        return txtName.getText();
    }
    private void addToCartButton(java.awt.event.ActionEvent evt){
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            String name = (String) jTable1.getValueAt(selectedRow, 0);
            String price = (String) jTable1.getValueAt(selectedRow, 1);
            String description = (String) jTable1.getValueAt(selectedRow, 2);

           Product product = new Product(name, price, description);
            productList.add(product);
            Cart cart = new Cart(null, productList);
            System.out.println(cart);
            System.out.println("Selected: " + name + ", " + price + ", " + description);

            JOptionPane.showMessageDialog(this, "Product added to cart: " + name);
        } else {
            // No row selected, display an error message or handle the case appropriately
            JOptionPane.showMessageDialog(this, "Please select a product to add to cart.");
        }
    }
}
