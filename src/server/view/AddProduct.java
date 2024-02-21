package server.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import common.ParseXMLFile;
import common.SetJTable;
import server.model.buttons.addproduct.AddHandler;
import server.model.buttons.addproduct.BackHandler;

public class AddProduct extends JFrame {
   private SetJTable set = new SetJTable();
    private JPanel jPanel2 = new JPanel();
    private JLabel labelName = new JLabel();
    private JLabel titleProduct = new JLabel();
    private JLabel labelID = new JLabel();
    private JLabel labelDescription = new JLabel();
    private JTextField txtDescript = new JTextField();
    private JButton btnBack = new JButton();
    private JLabel priceLabel = new JLabel();
    private JTextField txtQuantity = new JTextField();
    private JTextField txtName = new JTextField();
    public JButton btnAddList = new JButton();
    private JScrollPane jScrollPane2 = new JScrollPane();
    private JTable jTable1 = new JTable();

    public AddProduct() {
        initComponents();
        setBackActionListener(new BackHandler(this));
        setBtnAddList(new AddHandler(this));
    }
    private void initComponents() {

      jTable1.setModel(set.setTable());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(100, 122, 103));

        labelName.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 13)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setText("Name        :");

        titleProduct.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 18)); // NOI18N
        titleProduct.setForeground(new java.awt.Color(255, 255, 255));
        titleProduct.setText("Add Product");

        labelID.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 13)); // NOI18N
        labelID.setForeground(new java.awt.Color(255, 255, 255));

        labelDescription.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        labelDescription.setForeground(new java.awt.Color(255, 255, 255));
        labelDescription.setText("Description:");

        txtDescript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtDescriptActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        btnBack.setText("Back");

        priceLabel.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceLabel.setText("Price           :");

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnAddList.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        btnAddList.setText("Add to List");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        setResizable(false);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(titleProduct, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(99, 99, 99))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelDescription, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(priceLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(labelID, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(labelName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtQuantity, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                                        .addComponent(txtDescript)
                                                        .addComponent(txtName))
                                                .addGap(11, 11, 11))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(btnAddList, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(btnBack)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(titleProduct)
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelName))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(priceLabel)
                                                .addComponent(txtQuantity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(labelID))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtDescript, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelDescription))
                                .addGap(18, 18, 18)
                                .addComponent(btnAddList)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addGap(22, 22, 22))
        );

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
                                .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }

    private void txtNameActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtDescriptActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtQuantityActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }


    public String returnName(){
        return txtName.getText();
    }

    public String returnPrice(){
        return txtQuantity.getText();
    }

    public String returnDescription(){
        return txtDescript.getText();
    }

    public void setBackActionListener(ActionListener listener){
        btnBack.addActionListener(listener);
    }

    public void setBtnAddList(ActionListener listener){
        btnAddList.addActionListener(listener);
    }
}
