package server.view;
import common.ParseXMLFile;
import org.w3c.dom.NodeList;
import server.model.buttons.adminview.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


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
    private JLabel jLabel1;

    // End of variables declaration

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
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(100, 122, 103));

        exitButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        exitButton.setText("Exit");


        deleteProductButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        deleteProductButton.setText("Delete Product");

        editProductButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        editProductButton.setText("Edit Product");


        labelUphill.setFont(new java.awt.Font("Sitka Display", Font.BOLD, 28)); // NOI18N
        labelUphill.setForeground(new java.awt.Color(255, 255, 255));
        labelUphill.setText("UPHILL");

        addProductButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        addProductButton.setText("Add Product");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(121, Short.MAX_VALUE)
                                .addComponent(labelWelcome)
                                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(labelWelcome)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewProductButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        viewProductButton.setText("View Product");
        viewProductButton.setMaximumSize(new java.awt.Dimension(100, 23));
        viewProductButton.setMinimumSize(new java.awt.Dimension(100, 23));
        viewProductButton.setPreferredSize(new java.awt.Dimension(100, 23));

        viewUserButton.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        viewUserButton.setText("View Users");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelUphill)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(labelSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(labelAdminName))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(viewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(editProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(deleteProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(viewProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(addProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(labelUphill, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSeller)
                                .addGap(64, 64, 64)
                                .addComponent(addProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(135, Short.MAX_VALUE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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




