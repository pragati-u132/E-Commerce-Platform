
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Cart extends javax.swing.JFrame {
int price1,price2;
    
    public Cart() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bcheckout = new java.awt.Button();
        jproductselect = new javax.swing.JComboBox<>();
        bvieworder = new java.awt.Button();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jquantity = new javax.swing.JComboBox<>();
        jpayment = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Screenshot_2021-10-15_231629-removebg-preview.png"))); 

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 48)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("My Cart");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 22)); 
        jLabel4.setText("Select the Product :");

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 22)); 
        jLabel5.setText("Select the Quantity:");

        bcheckout.setBackground(new java.awt.Color(0, 102, 255));
        bcheckout.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); 
        bcheckout.setForeground(new java.awt.Color(255, 255, 255));
        bcheckout.setLabel("Checkout");
        bcheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcheckoutActionPerformed(evt);
            }
        });

        jproductselect.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jproductselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Iphone", "OnePlus9", "Realme", "Lgtv", "Washing Machine", "Ac" }));
        jproductselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jproductselectActionPerformed(evt);
            }
        });

        bvieworder.setBackground(new java.awt.Color(0, 102, 255));
        bvieworder.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); 
        bvieworder.setForeground(new java.awt.Color(255, 255, 255));
        bvieworder.setLabel("View My Orders");
        bvieworder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvieworderActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 22)); 
        jLabel6.setText("Select Payment Options :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); 

        jquantity.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jquantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jquantityActionPerformed(evt);
            }
        });

        jpayment.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jpayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cart Wallet", "Cash On Delivery" }));
        jpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jproductselect, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bcheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(bvieworder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jproductselect, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bcheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bvieworder, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bvieworderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvieworderActionPerformed
       
    }//GEN-LAST:event_bvieworderActionPerformed

    private void bcheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcheckoutActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trial", "root", "W7301@jqir#");

            // Retrieve the user's ID from the database based on their username
            String username = "username"; // Replace "username" with the actual username
            String getUserIdQuery = "SELECT id FROM register WHERE name = ?";
            PreparedStatement getUserIdStatement = con.prepareStatement(getUserIdQuery);
            getUserIdStatement.setString(1, username);
            ResultSet userIdResult = getUserIdStatement.executeQuery();
            int userId = -1;
            if (userIdResult.next()) {
                userId = userIdResult.getInt("id");
            }

            // Calculate the price of the item based on the selected product
            int price = 0;
            String selectedProduct = jproductselect.getSelectedItem().toString();
            if (selectedProduct.equals("Iphone")) {
                price = 129999;
            } else if (selectedProduct.equals("OnePlus9")) {
                price = 64999;
            } else if (selectedProduct.equals("Realme")) {
                price = 10999;
            } else if (selectedProduct.equals("Lgtv")) {
                price = 19999;
            } else if (selectedProduct.equals("Washing Machine")) {
                price = 19999;
            } else if (selectedProduct.equals("Ac")) {
                price = 30999;
            }

            // Insert data into the cart table
            String q = "INSERT INTO cart (product_name, quantity, price, payment_option) VALUES (?, ?, ?, ?)";
            PreparedStatement pt = con.prepareStatement(q);
            pt.setString(1, selectedProduct); // Product name
            pt.setString(2, jquantity.getSelectedItem().toString()); // Quantity
            pt.setInt(3, price); // Price of the item
            pt.setString(4, jpayment.getSelectedItem().toString()); // Payment option
            pt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Added Successfully to Cart");
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        String selectedValue =jproductselect.getSelectedItem().toString();
        Confirm c =new Confirm();
        c.jLabel3.setText(selectedValue);
        String selectedValue1 =jquantity.getSelectedItem().toString();
        c.quant.setText(selectedValue1);
        String selectedValue2 =jpayment.getSelectedItem().toString();
        c.jLabel9.setText(selectedValue2);
        
        
        
       
        
        
      
        if(selectedValue=="Iphone"){
          price1=129999;
        }
        else if(selectedValue=="OnePlus9") {
          price1=64999;
        }
        else if(selectedValue=="Realme") {
          price1=10999;
        }
        else if(selectedValue=="Lgtv") {
          price1=19999;
        }
        else if(selectedValue=="Washing Machine") {
          price1=19999;
        }
        else if(selectedValue=="Ac") {
          price1=30999;
        }
        else{
         price1=0;
        }
       String amt=c.quant.getText().toString();
       int number = Integer.parseInt(amt);
       int num1=number*price1;
       String num2=Integer.toString(num1);
       c.dynaval.setText(num2);
       c.setVisible(true);
       dispose();
       
       
       if(selectedValue2=="Cash On Delivery"){
        c.proceed.setVisible(false);
       
       }
       if(selectedValue2=="Cart Wallet"){
        c.deli.setVisible(false);
       
       }
       
      
       
           
      
    
    }//GEN-LAST:event_bcheckoutActionPerformed

    private void jproductselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jproductselectActionPerformed
       
    }//GEN-LAST:event_jproductselectActionPerformed

    private void jquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jquantityActionPerformed
       
    }//GEN-LAST:event_jquantityActionPerformed

    private void jpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpaymentActionPerformed
       
    }//GEN-LAST:event_jpaymentActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static java.awt.Button bcheckout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private java.awt.Button bvieworder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> jpayment;
    private javax.swing.JComboBox<String> jproductselect;
    private javax.swing.JComboBox<String> jquantity;
    // End of variables declaration//GEN-END:variables
}
