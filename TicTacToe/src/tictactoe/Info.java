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
import javax.swing.LayoutStyle.ComponentPlacement;

public class Info extends JDialog {
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JLabel jLabel5;
   private JPanel jPanel1;
   private JPanel jPanel2;

   public Info(Frame parent, boolean modal) {
      super(parent, modal);
      this.initComponents();
   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.jPanel2 = new JPanel();
      this.jLabel1 = new JLabel();
      this.jLabel2 = new JLabel();
      this.jLabel3 = new JLabel();
      this.jLabel4 = new JLabel();
      this.jLabel5 = new JLabel();
      this.setDefaultCloseOperation(2);
      this.setTitle("Information");
      this.setAlwaysOnTop(true);
      this.setPreferredSize(new Dimension(300, 225));
      this.setResizable(false);
      this.jPanel1.setBackground(new Color(243, 237, 237));
      this.jPanel1.setPreferredSize(new Dimension(300, 225));
      this.jPanel2.setBackground(new Color(0, 204, 255));
      this.jPanel2.setPreferredSize(new Dimension(300, 100));
      this.jLabel1.setFont(new Font("Maiandra GD", 0, 48));
      this.jLabel1.setForeground(new Color(0, 0, 0));
      this.jLabel1.setText("Tic Tac Toe");
      this.jLabel1.setAlignmentY(0.0F);
      GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
      this.jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(29, 32767).addComponent(this.jLabel1).addGap(27, 27, 27)));
      jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addContainerGap(21, 32767)));
      this.jLabel2.setFont(new Font("Sitka Text", 0, 18));
      this.jLabel2.setForeground(new Color(0, 0, 0));
      this.jLabel2.setText("Written By:");
      this.jLabel3.setFont(new Font("Sitka Text", 0, 18));
      this.jLabel3.setForeground(new Color(0, 0, 0));
      this.jLabel3.setText("Creation Date:");
      this.jLabel4.setFont(new Font("Segoe UI Variable", 1, 18));
      this.jLabel4.setForeground(new Color(0, 0, 0));
      this.jLabel4.setText("Manohar Samvel T");
      this.jLabel5.setFont(new Font("Segoe UI Variable", 1, 18));
      this.jLabel5.setForeground(new Color(0, 0, 0));
      this.jLabel5.setText("20.06.2024");
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(0, 0, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel3).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel5)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel4))).addContainerGap(-1, 32767)));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, 86, -2).addGap(24, 24, 24).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jLabel4)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.jLabel5)).addGap(0, 32, 32767)));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767)));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 212, -2).addGap(0, 13, 32767)));
      this.setSize(new Dimension(306, 233));
      this.setLocationRelativeTo((Component)null);
   }
}
