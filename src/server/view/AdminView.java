package server.view;
import common.ParseXMLFile;
import common.SetJTable;
import org.w3c.dom.NodeList;
import server.model.buttons.adminview.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Set;

public class AdminView extends JFrame {
    private ParseXMLFile parseXMLFile = new ParseXMLFile();
    private NodeList list = parseXMLFile.readXMLProduct();
    private JPanel jPanel2 = new JPanel();
    private JButton exitButton = new JButton();
    private JButton deleteProductButton = new JButton();
    private JButton editProductButton = new JButton();
    private JLabel labelUphill = new JLabel();
    private JButton addProductButton = new JButton();
    private JLabel labelAdminName = new JLabel();
    private JLabel labelSeller = new JLabel();
    private JPanel jPanel1 = new JPanel();
    private JLabel labelWelcome = new JLabel();
    private JButton viewProductButton = new JButton();
    private JButton viewUserButton = new JButton();


    public AdminView() {
        initComponents();
        setTitle("UPHILL App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setExitButton(new ExitButtonHandler(this));
        setViewProductButton(new ViewProductHandler(this));
        setViewUserButton(new ViewUsersHandler(this));
        setAddProductButton(new AddProductHandler(this));
        setEditProductButton(new EditProductHandler(this));
        setDeleteProductButton(new DeleteProductHandler(this));
    }

    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(100, 122, 103));

        exitButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        exitButton.setText("Exit");

        deleteProductButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        deleteProductButton.setText("Delete Product");


        editProductButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        editProductButton.setText("Edit Product");

        labelUphill.setFont(new java.awt.Font("Sitka Display", Font.BOLD, 28));
        labelUphill.setForeground(new java.awt.Color(255, 255, 255));
        labelUphill.setText("UPHILL");

        addProductButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        addProductButton.setText("Add Product");

        labelAdminName.setFont(new java.awt.Font("Sitka Display", Font.BOLD, 18));
        labelAdminName.setForeground(new java.awt.Color(255, 255, 255));
        labelAdminName.setText("ADMIN");

        labelSeller.setBackground(new java.awt.Color(255, 255, 255));
        labelSeller.setFont(new java.awt.Font("Sitka Display", Font.PLAIN, 14));
        labelSeller.setForeground(new java.awt.Color(255, 255, 255));
        labelSeller.setText("Seller");

        jPanel1.setBackground(new java.awt.Color(198, 222, 198));
        jPanel1.setForeground(new java.awt.Color(198, 222, 198));

        labelWelcome.setFont(new java.awt.Font("Segoe UI Semibold", Font.BOLD, 36));
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

        viewUserButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        viewUserButton.setText("View Users");


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
                                                        .addComponent(viewProductButton, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(viewUserButton, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(viewUserButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(47, Short.MAX_VALUE))
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
    public void setExitButton(ActionListener exit){
        exitButton.addActionListener(exit);
    }

    public void setDeleteProductButton(ActionListener delete){
        deleteProductButton.addActionListener(delete);
    }

    public void setAddProductButton(ActionListener add){
        addProductButton.addActionListener(add);
    }

    public void setViewProductButton(ActionListener viewProduct){
        viewProductButton.addActionListener(viewProduct);
    }

    public void setEditProductButton(ActionListener edit){
        editProductButton.addActionListener(edit);
    }

    public void setViewUserButton(ActionListener viewUser){
        viewUserButton.addActionListener(viewUser);
    }
}




