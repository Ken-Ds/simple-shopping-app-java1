package server.view;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import server.model.SetJTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ViewProduct extends JFrame {

    private DefaultTableModel model;
    public ViewProduct(){
        initComponents();
    }
    private void initComponents() {
        SetJTable set = new SetJTable();
        JPanel jPanel1 = new JPanel();
        JLabel idLabel = new JLabel();
        JLabel titleProduct = new JLabel();
        JTextField idTextField = new JTextField();
        JButton searchProductButton = new JButton();
        JButton backButton = new JButton();
        JButton editButton = new JButton();
        JPanel jPanel2 = new JPanel();
        JScrollPane jScrollPane1 = new JScrollPane();
        JTable jTable1 = new JTable();
        jTable1.setModel(set.setTable());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(100, 122, 103));

        idLabel.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 13)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("ID               :");

        titleProduct.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 18)); // NOI18N
        titleProduct.setForeground(new java.awt.Color(255, 255, 255));
        titleProduct.setText("View Product");

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        searchProductButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        searchProductButton.setText("Search Product");
        searchProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchProductButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        setResizable(false);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(titleProduct)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(idLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(searchProductButton, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(editButton, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(titleProduct)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(idLabel)
                                        .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(searchProductButton)
                                .addGap(18, 18, 18)
                                .addComponent(editButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(backButton)
                                .addGap(51, 51, 51))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void idTextFieldActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchProductButtonActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void backButtonActionPerformed(ActionEvent evt) {
        this.dispose();
        new AdminView().setVisible(true);
    }

    private void editButtonActionPerformed(ActionEvent evt) {
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
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | InstantiationException |
                 IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new ViewProduct().setVisible(true));
    }
}

