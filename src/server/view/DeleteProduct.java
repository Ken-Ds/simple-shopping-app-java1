package server.view;
import common.ParseXMLFile;
import common.SetJTable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class DeleteProduct extends JFrame {
    private SetJTable set = new SetJTable();
    private JPanel jPanel2 = new JPanel();
    private JLabel titleProduct = new JLabel();
    private JButton backButton = new JButton();
    private JTextField idTextField = new JTextField();
    private JLabel idLabel = new JLabel();
    private JButton deleteButton = new JButton();
    private JScrollPane jScrollPane2 = new JScrollPane();
    private JTable jTable1 = new JTable();

    public DeleteProduct() {
        initComponents();
    }

    private void initComponents() {

        jTable1.setModel(set.setTable());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(100, 122, 103));

        titleProduct.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 18));
        titleProduct.setForeground(new java.awt.Color(255, 255, 255));
        titleProduct.setText("Delete Product");

        backButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 13));
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("ID               :");

        deleteButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        deleteButton.setText("Delete Product");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        setResizable(false);
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

        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        setResizable(false);
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

    private void backButtonActionPerformed(ActionEvent evt) {
        this.dispose();
        new AdminView().setVisible(true);
    }

    public void idTextFieldActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }


    private void deleteButtonActionPerformed(ActionEvent evt) {
        new ParseXMLFile().deleteXMLProduct(returnId());
        this.dispose();
        new DeleteProduct().setVisible(true);
    }

    public String returnId(){
        return idTextField.getText();
    }
}
