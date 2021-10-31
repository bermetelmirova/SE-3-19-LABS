/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    private String startGame = "x";
    private int xCount = 0;
    private int oCount = 0;
    
    public Game() {
        initComponents();
    }
    
    private void gameScore ()
    {
        playerxxx.setText(String.valueOf(xCount));
        playerooo.setText(String.valueOf(oCount));
    }
    
    private void choosePlayer() 
    {
        if(startGame.equalsIgnoreCase("x"))
        {
            startGame = "O";
        }
        else 
        {
            startGame = "X";
        }
        
    }
    private void winningGame()
    {
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
        
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
        if (b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
            
        } else if (b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            
        }
        else if (b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            
        }
         else if (b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
            
        }
         else if (b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            
        }
         else if (b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            
        }
         else if (b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            
        }
        else if (b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
            
        }
        
        
        if (b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
            
        } else if (b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            
        }
        else if (b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            
        }
         else if (b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
            
        }
         else if (b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            
        }
         else if (b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            
        }
         else if (b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            
        }
        else if (b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", 
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playerxxx = new javax.swing.JLabel();
        playerooo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe Game");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tic Tac Toe Game");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(327, 327, 327))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtbtn1.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtexit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtexit.setText("Exit");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(102, 153, 255));
        txtreset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtreset.setText("Reset");
        txtreset.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));

        playero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        playero.setText("Player O :");

        playerx.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        playerx.setText("Player X :");

        playerxxx.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playerxxx.setForeground(new java.awt.Color(0, 102, 255));
        playerxxx.setText("xxxxxxxxxxxx");

        playerooo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playerooo.setForeground(new java.awt.Color(0, 102, 255));
        playerooo.setText("xxxxxxxxxxxx");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(263, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(playerx, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addGap(158, 158, 158)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
         txtbtn1.setText(startGame);
        
         if(startGame.equalsIgnoreCase("x"))
         {
            txtbtn1.setForeground(Color.RED);
         }
         else 
         {
           txtbtn1.setForeground(Color.MAGENTA);
         }
         choosePlayer();
         winningGame();
    }                                       

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:
        txtreset.setBackground(new Color(102, 155, 255));
        txtreset.setOpaque(false);
        txtreset.setBorderPainted(true);
        txtexit.setBackground(new Color(255, 102, 102));
        txtexit.setOpaque(false);
        txtexit.setBorderPainted(false);
    }                                 

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit",
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        
    }                                       

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
          txtbtn2.setText(startGame);
        
         if(startGame.equalsIgnoreCase("x"))
         {
            txtbtn2.setForeground(Color.RED);
         }
         else 
         {
           txtbtn2.setForeground(Color.MAGENTA);
         }
         choosePlayer();
         winningGame();
    }                                       

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
         txtbtn3.setText(startGame);
        
         if(startGame.equalsIgnoreCase("x"))
         {
            txtbtn3.setForeground(Color.RED);
         }
         else 
         {
           txtbtn3.setForeground(Color.MAGENTA);
         }
         choosePlayer();
         winningGame();
    }                                       

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
         txtbtn4.setText(startGame);
        
         if(startGame.equalsIgnoreCase("x"))
         {
            txtbtn4.setForeground(Color.RED);
         }
         else 
         {
           txtbtn4.setForeground(Color.MAGENTA);
         }
         choosePlayer();
         winningGame();
    }                                       

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
         txtbtn5.setText(startGame);
        
         if(startGame.equalsIgnoreCase("x"))
         {
            txtbtn5.setForeground(Color.RED);
         }
         else 
         {
           txtbtn5.setForeground(Color.MAGENTA);
         }
         choosePlayer();
         winningGame();
    }                                       

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
         txtbtn6.setText(startGame);
        
         if(startGame.equalsIgnoreCase("x"))
         {
            txtbtn6.setForeground(Color.RED);
         }
         else 
         {
           txtbtn6.setForeground(Color.MAGENTA);
         }
         choosePlayer();
         winningGame();
    }                                       

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
         txtbtn7.setText(startGame);
        
         if(startGame.equalsIgnoreCase("x"))
         {
            txtbtn7.setForeground(Color.RED);
         }
         else 
         {
           txtbtn7.setForeground(Color.MAGENTA);
         }
         choosePlayer();
         winningGame();
    }                                       

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
         txtbtn8.setText(startGame);
        
         if(startGame.equalsIgnoreCase("x"))
         {
            txtbtn8.setForeground(Color.RED);
         }
         else 
         {
           txtbtn8.setForeground(Color.MAGENTA);
         }
         choosePlayer();
         winningGame();
    }                                       

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
         txtbtn9.setText(startGame);
        
         if(startGame.equalsIgnoreCase("x"))
         {
            txtbtn9.setForeground(Color.RED);
         }
         else 
         {
           txtbtn9.setForeground(Color.MAGENTA);
         }
         choosePlayer();
         winningGame();
    }                                       

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
        
    }                                        

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxxx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration                   
}
