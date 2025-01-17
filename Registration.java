
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.*;
import javax.swing.JOptionPane;

public class Registeration extends javax.swing.JFrame {

   
    public Registeration() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lRegisterNow = new javax.swing.JLabel();
        tName = new javax.swing.JLabel();
        fName_reg = new javax.swing.JTextField();
        tPhoneNumber = new javax.swing.JLabel();
        fEmail_reg = new javax.swing.JTextField();
        tGender = new javax.swing.JLabel();
        tPassword = new javax.swing.JLabel();
        pPassword_reg1 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        fPhoneNumber_reg = new javax.swing.JTextField();
        tEmail = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        bSubmit_reg = new java.awt.Button();
        rmale = new javax.swing.JRadioButton();
        rfemale = new javax.swing.JRadioButton();
        rothers = new javax.swing.JRadioButton();
        pPassword_reg = new javax.swing.JPasswordField();
        tPassword1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        errorl = new javax.swing.JLabel();
        perror = new javax.swing.JLabel();
        tGender1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        address = new javax.swing.JTextField();
        fname_fail = new javax.swing.JLabel();
        fail = new javax.swing.JLabel();
        fail1 = new javax.swing.JLabel();
        fail2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(750, 1100));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        lRegisterNow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/final reg image.png"))); 

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lRegisterNow, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lRegisterNow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tName.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        tName.setText("Name");
        tName.setToolTipText("Enter your name");

        fName_reg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); 
        fName_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fName_regActionPerformed(evt);
            }
        });
        fName_reg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fName_regKeyReleased(evt);
            }
        });

        tPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        tPhoneNumber.setText("Phone Number");
        tPhoneNumber.setToolTipText("Enter your Phone Number");

        fEmail_reg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); 
        fEmail_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fEmail_regActionPerformed(evt);
            }
        });
        fEmail_reg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fEmail_regKeyReleased(evt);
            }
        });

        tGender.setFont(new java.awt.Font("Times New Roman", 1, 24));
        tGender.setText("Address ");

        tPassword.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        tPassword.setText("Password");
        tPassword.setToolTipText("Enter your Password");

        pPassword_reg1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); 
        pPassword_reg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPassword_reg1ActionPerformed(evt);
            }
        });
        pPassword_reg1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pPassword_reg1KeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        fPhoneNumber_reg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); 
        fPhoneNumber_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fPhoneNumber_regActionPerformed(evt);
            }
        });
        fPhoneNumber_reg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fPhoneNumber_regKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fPhoneNumber_regKeyReleased(evt);
            }
        });

        tEmail.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tEmail.setText("Email");
        tEmail.setToolTipText("Enter your email");

        jPanel7.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        bSubmit_reg.setActionCommand("Sumbit");
        bSubmit_reg.setBackground(new java.awt.Color(51, 102, 255));
        bSubmit_reg.setFont(new java.awt.Font("Times New Roman", 1, 30)); 
        bSubmit_reg.setForeground(new java.awt.Color(255, 255, 255));
        bSubmit_reg.setLabel("Submit");
        bSubmit_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmit_regActionPerformed(evt);
            }
        });

        buttonGroup2.add(rmale);
        rmale.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); 
        rmale.setText("Male");

        buttonGroup2.add(rfemale);
        rfemale.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18));
        rfemale.setText("Female");

        buttonGroup2.add(rothers);
        rothers.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); 
        rothers.setText("Others");

        pPassword_reg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); 
        pPassword_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPassword_regActionPerformed(evt);
            }
        });
        pPassword_reg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pPassword_regKeyReleased(evt);
            }
        });

        tPassword1.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        tPassword1.setText("Confirm Password");
        tPassword1.setToolTipText("Enter your Password");

        jPanel8.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        errorl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); 
        errorl.setForeground(new java.awt.Color(255, 0, 0));

        perror.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); 
        perror.setForeground(new java.awt.Color(255, 0, 51));

        tGender1.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        tGender1.setText("Gender");

        jPanel10.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        fname_fail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); 
        fname_fail.setForeground(new java.awt.Color(255, 0, 0));

        fail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        fail.setForeground(new java.awt.Color(255, 0, 51));

        fail1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        fail1.setForeground(new java.awt.Color(255, 0, 51));

        fail2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        fail2.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tGender, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(189, 189, 189)
                                        .addComponent(perror, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(rmale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rothers, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(fEmail_reg, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fName_reg, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pPassword_reg1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                            .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(33, 33, 33)
                                            .addComponent(fail, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(197, 197, 197)))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(pPassword_reg)
                                            .addComponent(fPhoneNumber_reg, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fail1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(230, 230, 230))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(errorl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fname_fail, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(tPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fail2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(435, 435, 435))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(bSubmit_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(tName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fname_fail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(fName_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(fEmail_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(perror, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(tPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(fPhoneNumber_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(fail1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fail, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pPassword_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tPassword1))
                    .addComponent(fail2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(pPassword_reg1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rmale)
                    .addComponent(rfemale)
                    .addComponent(rothers))
                .addGap(18, 18, 18)
                .addComponent(tGender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bSubmit_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        jScrollPane1.setViewportView(jPanel9);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1287, Short.MAX_VALUE)
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    
    private void pPassword_reg1ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }//GEN-LAST:event_pPassword_reg1ActionPerformed

    private void pPassword_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pPassword_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pPassword_regActionPerformed

    private void bSubmit_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmit_regActionPerformed
        // TODO add your handling code here:
        try{
            int i=1;
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trial","root","W7301@jqir#");
            String q = "INSERT INTO register (name, email, number, password, confirmpassword, gender, address) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pt=con.prepareStatement(q);
           pt.setString(1,fName_reg.getText());
           pt.setString(2,fEmail_reg.getText());
           pt.setString(3,fPhoneNumber_reg.getText());
           pt.setString(4,new String(pPassword_reg.getPassword()));
           pt.setString(5,new String(pPassword_reg1.getPassword()));
           String d="";
           if(rmale.isSelected())
                   {
            d=rmale.getText();
                   }
            if(rfemale.isSelected())
            {
            d=rfemale.getText();
            }
            if(rothers.isSelected())
            {
            d=rothers.getText();
            }
            pt.setString(6,d);
            pt.setString(7,address.getText());
            pt.executeUpdate(); // Execute registration query
            JOptionPane.showMessageDialog(null, "Registration Successful");
             ++i;
            String query = "INSERT INTO login (id,username, password) SELECT id,name, password FROM register";
            PreparedStatement pt2 = con.prepareStatement(query);
            pt2.executeUpdate(); // Execute login data transfer query

            con.close();
            Welcome w = new Welcome();
            w.setVisible(true);
            dispose();


        }
         catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
    }//GEN-LAST:event_bSubmit_regActionPerformed
    }
    private void fName_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fName_regActionPerformed
       
    }//GEN-LAST:event_fName_regActionPerformed

    private void fEmail_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fEmail_regActionPerformed
       
    }//GEN-LAST:event_fEmail_regActionPerformed

    private void fEmail_regKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fEmail_regKeyReleased
        
                                                      
      String PATTERN="^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
      Pattern patt=Pattern.compile(PATTERN);
      Matcher match =patt.matcher(fEmail_reg.getText());
      if(!match.matches()){
          errorl.setText("Email is incorrect");
      }
      else{
          errorl.setText(null);
      }
    
    }//GEN-LAST:event_fEmail_regKeyReleased

    private void fPhoneNumber_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fPhoneNumber_regActionPerformed
     
    }//GEN-LAST:event_fPhoneNumber_regActionPerformed

    private void fPhoneNumber_regKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fPhoneNumber_regKeyReleased
       
         String PATTERN="^[0-9]{0,12}$";
      Pattern patt=Pattern.compile(PATTERN);
      Matcher match =patt.matcher(fPhoneNumber_reg.getText());
      if(!match.matches()){
          perror.setText("Phone Number is incorrect");
      }
      else{
          perror.setText(null);
      }
    }//GEN-LAST:event_fPhoneNumber_regKeyReleased

    private void fPhoneNumber_regKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fPhoneNumber_regKeyPressed
       
         String phoneNumber=fPhoneNumber_reg.getText();
        int lenght= phoneNumber.length();
        char c=evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
        if(lenght<10){
        fPhoneNumber_reg.setEditable(true);
        }else{
        fPhoneNumber_reg.setEditable(false);
        }
        }else
        {
        if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE){
        fPhoneNumber_reg.setEditable(true);
        }else{
        fPhoneNumber_reg.setEditable(false);
}
    }  
    }//GEN-LAST:event_fPhoneNumber_regKeyPressed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
     
    }//GEN-LAST:event_addressActionPerformed

    private void fName_regKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fName_regKeyReleased
      String PATTERN="^[a-z A-Z]{0,20}" + " " + "[a-z A-Z]{0,20}$";
      Pattern patt=Pattern.compile(PATTERN);
      Matcher match =patt.matcher(fName_reg.getText());
      if(!match.matches()){
          fname_fail.setText("First name invalid.");
      }
      else{
          fname_fail.setText(null);
      }



    }//GEN-LAST:event_fName_regKeyReleased

    private void pPassword_regKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pPassword_regKeyReleased
String PATTERN="^[a-z A-Z 0-9 !@#$%^&*>?]{6,20}$";
      Pattern patt=Pattern.compile(PATTERN);
      Matcher match =patt.matcher(pPassword_reg.getText());
      if(!match.matches() || evt.getKeyChar()==' '){
          fail.setText("Password invalid.");
      }
      else{
          fail.setText(null);
      }     
    }//GEN-LAST:event_pPassword_regKeyReleased

    private void pPassword_reg1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pPassword_reg1KeyReleased

    }//GEN-LAST:event_pPassword_reg1KeyReleased
   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registeration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registeration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registeration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registeration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registeration().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private java.awt.Button bSubmit_reg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel errorl;
    private javax.swing.JTextField fEmail_reg;
    private javax.swing.JTextField fName_reg;
    private javax.swing.JTextField fPhoneNumber_reg;
    private javax.swing.JLabel fail;
    private javax.swing.JLabel fail1;
    private javax.swing.JLabel fail2;
    private javax.swing.JLabel fname_fail;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lRegisterNow;
    private javax.swing.JPasswordField pPassword_reg;
    private javax.swing.JPasswordField pPassword_reg1;
    private javax.swing.JLabel perror;
    private javax.swing.JRadioButton rfemale;
    private javax.swing.JRadioButton rmale;
    private javax.swing.JRadioButton rothers;
    private javax.swing.JLabel tEmail;
    private javax.swing.JLabel tGender;
    private javax.swing.JLabel tGender1;
    private javax.swing.JLabel tName;
    private javax.swing.JLabel tPassword;
    private javax.swing.JLabel tPassword1;
    private javax.swing.JLabel tPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
