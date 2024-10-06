package tictactoe;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.GroupLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;

public class GameOver extends JDialog {
   private JLabel gameOver;
   private JPanel jPanel1;
   private JLabel winner;
   private JLabel wins;

   public GameOver(Frame parent, boolean modal) {
      super(parent, modal);
      this.initComponents();
   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.gameOver = new JLabel();
      this.wins = new JLabel();
      this.winner = new JLabel();
      this.setDefaultCloseOperation(2);
      this.setTitle("Game Over");
      this.setAlwaysOnTop(true);
      this.setPreferredSize(new Dimension(300, 200));
      this.jPanel1.setBackground(new Color(153, 255, 153));
      this.jPanel1.setPreferredSize(new Dimension(300, 200));
      this.gameOver.setFont(new Font("Magneto", 0, 36));
      this.gameOver.setForeground(new Color(51, 51, 51));
      this.gameOver.setText("Game Over");
      this.wins.setFont(new Font("Harlow Solid Italic", 0, 36));
      this.wins.setForeground(new Color(0, 0, 0));
      this.wins.setText("Wins!!!!!");
      this.winner.setFont(new Font("Lucida Calligraphy", 0, 36));
      this.winner.setForeground(new Color(0, 0, 0));
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(37, 37, 37).addComponent(this.gameOver).addContainerGap(46, 32767)).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.winner, -2, 37, -2).addGap(18, 18, 18).addComponent(this.wins, -2, 161, -2).addGap(18, 18, 18)));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(24, 24, 24).addComponent(this.gameOver).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.wins, -2, 43, -2).addComponent(this.winner, -2, 43, -2)).addContainerGap(71, 32767)));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767)));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767)));
      this.setSize(new Dimension(316, 208));
      this.setLocationRelativeTo((Component)null);
   }

   public void setWinner(String s) {
      this.winner.setText(s);
   }
}
