
package tictactoe;

import java.awt.Component;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.SoftBevelBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar.Separator;
import javax.swing.KeyStroke;

public class GameField extends JFrame {
   boolean x = false;
   boolean o = false;
   private JButton Button1;
   private JButton Button2;
   private JButton Button3;
   private JButton Button4;
   private JButton Button5;
   private JButton Button6;
   private JButton Button7;
   private JButton Button8;
   private JButton Button9;
   private JMenu jMenu1;
   private JMenuBar jMenuBar1;
   private JMenuItem jMenuItem2;
   private JMenuItem jMenuItem3;
   private JPanel jPanel1;
   private Separator jSeparator1;
   private JMenuItem restartButton;
   private JButton[] buttons = {Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9};

   public GameField() {
      this.initComponents();
   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.Button1 = new JButton();
      this.Button2 = new JButton();
      this.Button3 = new JButton();
      this.Button4 = new JButton();
      this.Button5 = new JButton();
      this.Button6 = new JButton();
      this.Button7 = new JButton();
      this.Button8 = new JButton();
      this.Button9 = new JButton();
      this.jMenuBar1 = new JMenuBar();
      this.jMenu1 = new JMenu();
      this.restartButton = new JMenuItem();
      this.jMenuItem2 = new JMenuItem();
      this.jSeparator1 = new Separator();
      this.jMenuItem3 = new JMenuItem();
      this.setDefaultCloseOperation(3);
      this.setTitle("Tic Tac Toe");
      this.setPreferredSize(new Dimension(346, 360));
      this.getContentPane().setLayout(new GridLayout(1, 0));
      this.jPanel1.setPreferredSize(new Dimension(330, 330));
      this.jPanel1.setLayout(new GridLayout(3, 3));
      this.Button1.setBackground(new Color(255, 255, 255));
      this.Button1.setFont(new Font("Transformers Movie", 0, 48));
      this.Button1.setPreferredSize(new Dimension(100, 100));
      this.Button1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            GameField.this.Button1ActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.Button1);
      this.Button2.setBackground(new Color(255, 255, 255));
      this.Button2.setFont(new Font("Transformers Movie", 0, 48));
      this.Button2.setPreferredSize(new Dimension(100, 100));
      this.Button2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            GameField.this.Button2ActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.Button2);
      this.Button3.setBackground(new Color(255, 255, 255));
      this.Button3.setFont(new Font("Transformers Movie", 0, 48));
      this.Button3.setPreferredSize(new Dimension(100, 100));
      this.Button3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            GameField.this.Button3ActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.Button3);
      this.Button4.setBackground(new Color(255, 255, 255));
      this.Button4.setFont(new Font("Transformers Movie", 0, 48));
      this.Button4.setPreferredSize(new Dimension(100, 100));
      this.Button4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            GameField.this.Button4ActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.Button4);
      this.Button5.setBackground(new Color(255, 255, 255));
      this.Button5.setFont(new Font("Transformers Movie", 0, 48));
      this.Button5.setPreferredSize(new Dimension(100, 100));
      this.Button5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            GameField.this.Button5ActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.Button5);
      this.Button6.setBackground(new Color(255, 255, 255));
      this.Button6.setFont(new Font("Transformers Movie", 0, 48));
      this.Button6.setPreferredSize(new Dimension(100, 100));
      this.Button6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            GameField.this.Button6ActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.Button6);
      this.Button7.setBackground(new Color(255, 255, 255));
      this.Button7.setFont(new Font("Transformers Movie", 0, 48));
      this.Button7.setPreferredSize(new Dimension(100, 100));
      this.Button7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            GameField.this.Button7ActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.Button7);
      this.Button8.setBackground(new Color(255, 255, 255));
      this.Button8.setFont(new Font("Transformers Movie", 0, 48));
      this.Button8.setPreferredSize(new Dimension(100, 100));
      this.Button8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            GameField.this.Button8ActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.Button8);
      this.Button9.setBackground(new Color(255, 255, 255));
      this.Button9.setFont(new Font("Transformers Movie", 0, 48));
      this.Button9.setPreferredSize(new Dimension(100, 100));
      this.Button9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            GameField.this.Button9ActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.Button9);
      this.getContentPane().add(this.jPanel1);
      this.jMenuBar1.setBackground(new Color(51, 51, 51));
      this.jMenuBar1.setBorder(new SoftBevelBorder(0));
      this.jMenuBar1.setForeground(new Color(255, 255, 255));
      this.jMenu1.setForeground(new Color(255, 255, 255));
      this.jMenu1.setText("File");
      this.restartButton.setAccelerator(KeyStroke.getKeyStroke(82, 128));
      this.restartButton.setBackground(new Color(255, 255, 255));
      this.restartButton.setForeground(new Color(0, 0, 0));
      this.restartButton.setText("Restart");
      this.restartButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            GameField.this.restartButtonActionPerformed(evt);
         }
      });
      this.jMenu1.add(this.restartButton);
      this.jMenuItem2.setBackground(new Color(255, 255, 255));
      this.jMenuItem2.setForeground(new Color(0, 0, 0));
      this.jMenuItem2.setText("Info");
      this.jMenuItem2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            GameField.this.jMenuItem2ActionPerformed(evt);
         }
      });
      this.jMenu1.add(this.jMenuItem2);
      this.jMenu1.add(this.jSeparator1);
      this.jMenuItem3.setBackground(new Color(255, 255, 255));
      this.jMenuItem3.setForeground(new Color(0, 0, 0));
      this.jMenuItem3.setText("Exit");
      this.jMenuItem3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            GameField.this.jMenuItem3ActionPerformed(evt);
         }
      });
      this.jMenu1.add(this.jMenuItem3);
      this.jMenuBar1.add(this.jMenu1);
      this.setJMenuBar(this.jMenuBar1);
      this.pack();
   }

   private void gameOver() {
      this.Button1.setEnabled(false);
      this.Button1.setBackground(Color.decode("#C5C6C7"));
      this.Button1.setForeground(Color.BLACK);
      this.Button2.setEnabled(false);
      this.Button2.setBackground(Color.decode("#C5C6C7"));
      this.Button2.setForeground(Color.BLACK);
      this.Button3.setEnabled(false);
      this.Button3.setBackground(Color.decode("#C5C6C7"));
      this.Button3.setForeground(Color.BLACK);
      this.Button4.setEnabled(false);
      this.Button4.setBackground(Color.decode("#C5C6C7"));
      this.Button4.setForeground(Color.BLACK);
      this.Button5.setEnabled(false);
      this.Button5.setBackground(Color.decode("#C5C6C7"));
      this.Button5.setForeground(Color.BLACK);
      this.Button6.setEnabled(false);
      this.Button6.setBackground(Color.decode("#C5C6C7"));
      this.Button6.setForeground(Color.BLACK);
      this.Button7.setEnabled(false);
      this.Button7.setBackground(Color.decode("#C5C6C7"));
      this.Button7.setForeground(Color.BLACK);
      this.Button8.setEnabled(false);
      this.Button8.setBackground(Color.decode("#C5C6C7"));
      this.Button8.setForeground(Color.BLACK);
      this.Button9.setEnabled(false);
      this.Button9.setBackground(Color.decode("#C5C6C7"));
      this.Button9.setForeground(Color.BLACK);
   }

   private void XWins() {
      GameOver game = new GameOver(this, true);
      game.setWinner("X");
      game.setVisible(true);
      this.gameOver();
   }

   private void OWins() {
      GameOver game = new GameOver(this, true);
      game.setWinner("O");
      game.setVisible(true);
      this.gameOver();
   }

   private void setWinColor(JButton b1, JButton b2, JButton b3) {
      b1.setBackground(Color.decode("#D1FFBD"));
      b2.setBackground(Color.decode("#D1FFBD"));
      b3.setBackground(Color.decode("#D1FFBD"));
   }

   private void checkWinner() {
      if (this.Button1.getText().equals("X") && this.Button2.getText().equals("X") && this.Button3.getText().equals("X")) {
         this.setWinColor(this.Button1, this.Button2, this.Button3);
         this.XWins();
      } else if (this.Button4.getText().equals("X") && this.Button5.getText().equals("X") && this.Button6.getText().equals("X")) {
         this.setWinColor(this.Button4, this.Button5, this.Button6);
         this.XWins();
      } else if (this.Button7.getText().equals("X") && this.Button8.getText().equals("X") && this.Button9.getText().equals("X")) {
         this.setWinColor(this.Button7, this.Button8, this.Button9);
         this.XWins();
      } else if (this.Button1.getText().equals("X") && this.Button4.getText().equals("X") && this.Button7.getText().equals("X")) {
         this.setWinColor(this.Button1, this.Button4, this.Button7);
         this.XWins();
      } else if (this.Button2.getText().equals("X") && this.Button5.getText().equals("X") && this.Button8.getText().equals("X")) {
         this.setWinColor(this.Button2, this.Button5, this.Button8);
         this.XWins();
      } else if (this.Button3.getText().equals("X") && this.Button6.getText().equals("X") && this.Button9.getText().equals("X")) {
         this.setWinColor(this.Button3, this.Button6, this.Button9);
         this.XWins();
      } else if (this.Button1.getText().equals("X") && this.Button5.getText().equals("X") && this.Button9.getText().equals("X")) {
         this.setWinColor(this.Button1, this.Button5, this.Button9);
         this.XWins();
      } else if (this.Button3.getText().equals("X") && this.Button5.getText().equals("X") && this.Button7.getText().equals("X")) {
         this.setWinColor(this.Button3, this.Button5, this.Button7);
         this.XWins();
      }

      if (this.Button1.getText().equals("O") && this.Button2.getText().equals("O") && this.Button3.getText().equals("O")) {
         this.setWinColor(this.Button1, this.Button2, this.Button3);
         this.OWins();
      } else if (this.Button4.getText().equals("O") && this.Button5.getText().equals("O") && this.Button6.getText().equals("O")) {
         this.setWinColor(this.Button4, this.Button5, this.Button6);
         this.OWins();
      } else if (this.Button7.getText().equals("O") && this.Button8.getText().equals("O") && this.Button9.getText().equals("O")) {
         this.setWinColor(this.Button7, this.Button8, this.Button9);
         this.OWins();
      } else if (this.Button1.getText().equals("O") && this.Button4.getText().equals("O") && this.Button7.getText().equals("O")) {
         this.setWinColor(this.Button1, this.Button4, this.Button7);
         this.OWins();
      } else if (this.Button2.getText().equals("O") && this.Button5.getText().equals("O") && this.Button8.getText().equals("O")) {
         this.setWinColor(this.Button2, this.Button5, this.Button8);
         this.OWins();
      } else if (this.Button3.getText().equals("O") && this.Button6.getText().equals("O") && this.Button9.getText().equals("O")) {
         this.setWinColor(this.Button3, this.Button6, this.Button9);
         this.OWins();
      } else if (this.Button1.getText().equals("O") && this.Button5.getText().equals("O") && this.Button9.getText().equals("O")) {
         this.setWinColor(this.Button1, this.Button5, this.Button9);
         this.OWins();
      } else if (this.Button3.getText().equals("O") && this.Button5.getText().equals("O") && this.Button7.getText().equals("O")) {
         this.setWinColor(this.Button3, this.Button5, this.Button7);
         this.OWins();
      } else {
         boolean draw = !this.Button1.getText().trim().isEmpty() && !this.Button2.getText().trim().isEmpty() && !this.Button2.getText().trim().isEmpty() && !this.Button4.getText().trim().isEmpty() && !this.Button3.getText().trim().isEmpty() && !this.Button6.getText().trim().isEmpty() && !this.Button4.getText().trim().isEmpty() && !this.Button8.getText().trim().isEmpty() && !this.Button5.getText().trim().isEmpty();
         if (draw) {
            JOptionPane.showMessageDialog((Component)null, "Draw Match!!");
            this.restartButtonActionPerformed((ActionEvent)null);
         }
      }

   }

   private void Button2ActionPerformed(ActionEvent evt) {
      if (!this.Button2.getText().equals("X") && !this.Button2.getText().equals("O")) {
         if (!this.x) {
            this.x = true;
            this.o = false;
            this.Button2.setText("X");
            this.checkWinner();
         } else {
            this.o = true;
            this.x = false;
            this.Button2.setText("O");
            this.checkWinner();
         }
      }

   }

   private void Button1ActionPerformed(ActionEvent evt) {
      if (!this.Button1.getText().equals("X") && !this.Button1.getText().equals("O")) {
         if (!this.x) {
            this.x = true;
            this.o = false;
            this.Button1.setText("X");
            this.checkWinner();
         } else {
            this.o = true;
            this.x = false;
            this.Button1.setText("O");
            this.checkWinner();
         }
      }

   }

   private void Button3ActionPerformed(ActionEvent evt) {
      if (!this.Button3.getText().equals("X") && !this.Button3.getText().equals("O")) {
         if (!this.x) {
            this.x = true;
            this.o = false;
            this.Button3.setText("X");
            this.checkWinner();
         } else {
            this.o = true;
            this.x = false;
            this.Button3.setText("O");
            this.checkWinner();
         }
      }

   }

   private void Button4ActionPerformed(ActionEvent evt) {
      if (!this.Button4.getText().equals("X") && !this.Button4.getText().equals("O")) {
         if (!this.x) {
            this.x = true;
            this.o = false;
            this.Button4.setText("X");
            this.checkWinner();
         } else {
            this.o = true;
            this.x = false;
            this.Button4.setText("O");
            this.checkWinner();
         }
      }

   }

   private void Button5ActionPerformed(ActionEvent evt) {
      if (!this.Button5.getText().equals("X") && !this.Button5.getText().equals("O")) {
         if (!this.x) {
            this.x = true;
            this.o = false;
            this.Button5.setText("X");
            this.checkWinner();
         } else {
            this.o = true;
            this.x = false;
            this.Button5.setText("O");
            this.checkWinner();
         }
      }

   }

   private void Button6ActionPerformed(ActionEvent evt) {
      if (!this.Button6.getText().equals("X") && !this.Button6.getText().equals("O")) {
         if (!this.x) {
            this.x = true;
            this.o = false;
            this.Button6.setText("X");
            this.checkWinner();
         } else {
            this.o = true;
            this.x = false;
            this.Button6.setText("O");
            this.checkWinner();
         }
      }

   }

   private void Button7ActionPerformed(ActionEvent evt) {
      if (!this.Button7.getText().equals("X") && !this.Button7.getText().equals("O")) {
         if (!this.x) {
            this.x = true;
            this.o = false;
            this.Button7.setText("X");
            this.checkWinner();
         } else {
            this.o = true;
            this.x = false;
            this.Button7.setText("O");
            this.checkWinner();
         }
      }

   }

   private void Button8ActionPerformed(ActionEvent evt) {
      if (!this.Button8.getText().equals("X") && !this.Button8.getText().equals("O")) {
         if (!this.x) {
            this.x = true;
            this.o = false;
            this.Button8.setText("X");
            this.checkWinner();
         } else {
            this.o = true;
            this.x = false;
            this.Button8.setText("O");
            this.checkWinner();
         }
      }

   }

   private void Button9ActionPerformed(ActionEvent evt) {
      if (!this.Button9.getText().equals("X") && !this.Button9.getText().equals("O")) {
         if (!this.x) {
            this.x = true;
            this.o = false;
            this.Button9.setText("X");
            this.checkWinner();
         } else {
            this.o = true;
            this.x = false;
            this.Button9.setText("O");
            this.checkWinner();
         }
      }

   }

   private void jMenuItem3ActionPerformed(ActionEvent evt) {
      System.exit(0);
   }

   private void restartButtonActionPerformed(ActionEvent evt) {
      this.Button1.setText("");
      this.Button1.setEnabled(true);
      this.Button1.setBackground(Color.WHITE);
      this.Button1.setForeground(Color.BLACK);
      this.Button2.setText("");
      this.Button2.setEnabled(true);
      this.Button2.setBackground(Color.WHITE);
      this.Button2.setForeground(Color.BLACK);
      this.Button3.setText("");
      this.Button3.setEnabled(true);
      this.Button3.setBackground(Color.WHITE);
      this.Button3.setForeground(Color.BLACK);
      this.Button4.setText("");
      this.Button4.setEnabled(true);
      this.Button4.setBackground(Color.WHITE);
      this.Button4.setForeground(Color.BLACK);
      this.Button5.setText("");
      this.Button5.setEnabled(true);
      this.Button5.setBackground(Color.WHITE);
      this.Button5.setForeground(Color.BLACK);
      this.Button6.setText("");
      this.Button6.setEnabled(true);
      this.Button6.setBackground(Color.WHITE);
      this.Button6.setForeground(Color.BLACK);
      this.Button7.setText("");
      this.Button7.setEnabled(true);
      this.Button7.setBackground(Color.WHITE);
      this.Button7.setForeground(Color.BLACK);
      this.Button8.setText("");
      this.Button8.setEnabled(true);
      this.Button8.setBackground(Color.WHITE);
      this.Button8.setForeground(Color.BLACK);
      this.Button9.setText("");
      this.Button9.setEnabled(true);
      this.Button9.setBackground(Color.WHITE);
      this.Button9.setForeground(Color.BLACK);
   }

   private void jMenuItem2ActionPerformed(ActionEvent evt) {
      Info info = new Info(this,true);
      info.setVisible(true);
      info.pack();
      info.setLocationRelativeTo((Component)null);
   }
}

