
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MainFrame extends javax.swing.JFrame {

    private String turn;
    private int xCount;
    private int oCount;
    private int drawVar;

    public MainFrame() {
        initComponents();
        turn = "O";
        xCount = 0;
        oCount = 0;
        drawVar = 0;
    }

    private void choosePlayer(){      //initially player is "O"(because turn is instantiated by "O") and after first move, we have to change the sign. 
        if(turn.equals("O")){
            turn = "X";
        }else{
            turn = "O";
        }
    }
    
    public void win(){
        String b1 = button1.getText();
        String b2 = button2.getText();
        String b3 = button3.getText();
        String b4 = button4.getText();
        String b5 = button5.getText();
        String b6 = button6.getText();
        String b7 = button7.getText();
        String b8 = button8.getText();
        String b9 = button9.getText();
        
        if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){ 
            if(turn.equals("X")){
                xCount++;
                xpoint.setText(xCount + "");
            }else{
                oCount++;
                opoint.setText(oCount + "");
            }
            JOptionPane.showMessageDialog(this, "Player "+ turn + " Won. Congrats" ,"TicTacToe",JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }else if(b4.equals(b5) && b5.equals(b6) && !b4.equals("")){
            if(turn.equals("X")){
                xCount++;
                xpoint.setText(xCount + "");
            }else{
                oCount++;
                opoint.setText(oCount + "");
            }
            JOptionPane.showMessageDialog(this, "Player "+ turn + " Won. Congrats" ,"TicTacToe",JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }else if(b7.equals(b8) && b8.equals(b9) && !b7.equals("")){
            if(turn.equals("X")){
                xCount++;
                xpoint.setText(xCount + "");
            }else{
                oCount++;
                opoint.setText(oCount + "");
            }
            JOptionPane.showMessageDialog(this, "Player "+ turn + " Won. Congrats" ,"TicTacToe",JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }else if(b1.equals(b4) && b4.equals(b7) && !b1.equals("")){
            if(turn.equals("X")){
                xCount++;
                xpoint.setText(xCount + "");
            }else{
                oCount++;
                opoint.setText(oCount + "");
            }
            JOptionPane.showMessageDialog(this, "Player "+ turn + " Won. Congrats" ,"TicTacToe",JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }else if(b2.equals(b5) && b5.equals(b8) && !b2.equals("")){
            if(turn.equals("X")){
                xCount++;
                xpoint.setText(xCount + "");
            }else{
                oCount++;
                opoint.setText(oCount + "");
            }
            JOptionPane.showMessageDialog(this, "Player "+ turn + " Won. Congrats" ,"TicTacToe",JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }else if(b3.equals(b6) && b6.equals(b9) && !b3.equals("")){
            if(turn.equals("X")){
                xCount++;
                xpoint.setText(xCount + "");
            }else{
                oCount++;
                opoint.setText(oCount + "");
            }
            JOptionPane.showMessageDialog(this, "Player "+ turn + " Won. Congrats" ,"TicTacToe",JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }else if(b1.equals(b5) && b5.equals(b9) && !b1.equals("")){
            if(turn.equals("X")){
                xCount++;
                xpoint.setText(xCount + "");
            }else{
                oCount++;
                opoint.setText(oCount + "");
            }
            JOptionPane.showMessageDialog(this, "Player "+ turn + " Won. Congrats" ,"TicTacToe",JOptionPane.INFORMATION_MESSAGE);
        }else if(b3.equals(b5) && b5.equals(b7) && !b3.equals("")){
            if(turn.equals("X")){
                xCount++;
                xpoint.setText(xCount + "");
            }else{
                oCount++;
                opoint.setText(oCount + "");
            }
            JOptionPane.showMessageDialog(this, "Player "+ turn + " Won. Congrats" ,"TicTacToe",JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }else if(drawVar == 9){
            JOptionPane.showMessageDialog(this, "Draw!!!" , "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        button3 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        xpoint = new javax.swing.JLabel();
        opoint = new javax.swing.JLabel();
        button9 = new javax.swing.JButton();
        button11 = new javax.swing.JButton();
        newgame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));

        jLabel1.setBackground(new java.awt.Color(51, 0, 102));
        jLabel1.setFont(new java.awt.Font("Magnolia Alt", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        button3.setFont(new java.awt.Font("Chalkboard", 1, 36)); // NOI18N
        button3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        button3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button1.setFont(new java.awt.Font("Chalkboard", 1, 36)); // NOI18N
        button1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Chalkboard", 1, 36)); // NOI18N
        button2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        button2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button4.setFont(new java.awt.Font("Chalkboard", 1, 36)); // NOI18N
        button4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        button4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setFont(new java.awt.Font("Chalkboard", 1, 36)); // NOI18N
        button5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        button5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setFont(new java.awt.Font("Chalkboard", 1, 36)); // NOI18N
        button6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        button6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setFont(new java.awt.Font("Chalkboard", 1, 36)); // NOI18N
        button7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        button7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setFont(new java.awt.Font("Chalkboard", 1, 36)); // NOI18N
        button8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        button8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        button10.setForeground(new java.awt.Color(0, 153, 51));
        button10.setText("RESET");
        button10.setBorder(null);
        button10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SCORE CARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setText("PLAYER O");

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setText("PLAYER X");

        xpoint.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        xpoint.setText("0");

        opoint.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        opoint.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(opoint))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(xpoint)))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xpoint))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opoint))
                .addGap(47, 47, 47))
        );

        button9.setFont(new java.awt.Font("Chalkboard", 1, 36)); // NOI18N
        button9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        button9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button11.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        button11.setForeground(new java.awt.Color(255, 0, 0));
        button11.setText("EXIT");
        button11.setBorder(null);
        button11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button11.setPreferredSize(new java.awt.Dimension(59, 26));
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        newgame.setBackground(new java.awt.Color(204, 255, 204));
        newgame.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        newgame.setText("NEW GAME");
        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newgame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(newgame, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        
        if(!button1.getText().equals("")){
            return; 
        }
        
        button1.setText(turn);
        
        if(turn.equals("O")){
            button1.setForeground(Color.red);
        }else{
            button1.setForeground(Color.black);
        }
        drawVar++;
        win();
        
        choosePlayer();
    }//GEN-LAST:event_button1ActionPerformed

    
    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(this, "Confirm if you want to exit", "TicTacToe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
            
    }//GEN-LAST:event_button11ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        
        if(!button2.getText().equals("")){
            return;
        }
        
        button2.setText(turn);
        
        if(turn.equals("O")){
            button2.setForeground(Color.red);
        }else{
            button2.setForeground(Color.black);
        }
        drawVar++;
        win();
        
        choosePlayer();
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        
        if(!button3.getText().equals("")){
            return;
        }
        
        button3.setText(turn);
        
        if(turn.equals("O")){
            button3.setForeground(Color.red);
        }else{
            button3.setForeground(Color.black);
        }
        drawVar++;
        win();
        
        choosePlayer();
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        
        if(!button4.getText().equals("")){
            return;
        }
        
        button4.setText(turn);
        
        if(turn.equals("O")){
            button4.setForeground(Color.red);
        }else{
            button4.setForeground(Color.black);
        }
        drawVar++;
        win();
        choosePlayer();
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        
        if(!button5.getText().equals("")){
            return;
        }
        
        button5.setText(turn);
        
        if(turn.equals("O")){
            button5.setForeground(Color.red);
        }else{
            button5.setForeground(Color.black);
        }
        drawVar++;
        win();
        
        choosePlayer();
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        
        if(!button6.getText().equals("")){
            return;
        }
        
        button6.setText(turn);
        
        if(turn.equals("O")){
            button6.setForeground(Color.red);
        }else{
            button6.setForeground(Color.black);
        }
        drawVar++;
        win();
        
        choosePlayer();
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
       
        if(!button7.getText().equals("")){
            return;
        }
        
        button7.setText(turn);
        
        if(turn.equals("O")){
            button7.setForeground(Color.red);
        }else{
            button7.setForeground(Color.black);
        }
        drawVar++;
        win();
        
        choosePlayer();
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
       
        if(!button8.getText().equals("")){
            return;
        }
        
        button8.setText(turn);
        
        if(turn.equals("O")){
            button8.setForeground(Color.red);
        }else{
            button8.setForeground(Color.black);
        }
        drawVar++;
        win();
        
        choosePlayer();
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        
        if(!button9.getText().equals("")){
            return;
        }
        
        button9.setText(turn);
        
        if(turn.equals("O")){
            button9.setForeground(Color.red);
        }else{
            button9.setForeground(Color.black);
        }
        drawVar++;
        win();
        
        choosePlayer();
    }//GEN-LAST:event_button9ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        resetGame();
    }//GEN-LAST:event_button10ActionPerformed

    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed
        
        opoint.setText("0");
        xpoint.setText("0");
        xCount = 0;
        oCount = 0;
        drawVar = 0;
        resetGame();
    }//GEN-LAST:event_newgameActionPerformed

    public void resetGame(){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        
        drawVar = 0;
        
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button10;
    private javax.swing.JButton button11;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton newgame;
    private javax.swing.JLabel opoint;
    private javax.swing.JLabel xpoint;
    // End of variables declaration//GEN-END:variables
}
