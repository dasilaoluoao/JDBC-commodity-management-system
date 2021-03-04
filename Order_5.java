/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlwork;

import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Order_5 extends javax.swing.JFrame {

    private String s[][], ss1 = null;

    public String getSs1() {
        return ss1;
    }

    /**
     * Creates new form Order
     */
    private static Order_5 o = null;

    private Order_5() {
        initComponents();
    }

    public synchronized static Order_5 getO() {
        if (o == null) {
            o = new Order_5();
            o.setLocationRelativeTo(null);
            o.getContentPane().setBackground(new Color(150, 200, 200));
        }
        return o;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("订单");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "订购日期", "要求到货日期", "送货地址", "特殊说明", "下订单人", "产品名称", "订购数量"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("生成订单");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("删除订单");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("修改订单");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("排产计划");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(94, 94, 94)
                        .addComponent(jButton3)
                        .addGap(98, 98, 98)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int i = 0;
        try {
            // TODO add your handling code here:

            Connect c = new Connect();
            ResultSet rs1 = c.connect("SELECT * FROM databasework.`order`");

            while (rs1.next()) {
                for (int k = 1; k <= 7; k++) {
                    this.jTable1.setValueAt(rs1.getString(k), i, k - 1);
                }
                i++;
            }
            while (i < 8) {
                for (int k = 1; k <= 7; k++) {
                    this.jTable1.setValueAt(null, i, k - 1);
                }
                i++;
            }
            c.con.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (p1.getPp().isB2()) {
            JOptionPane.showMessageDialog(this, "没有操作权限！", null, JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                // TODO add your handling code here:
                String s1 = null, s2 = null;
                Connect c = new Connect();
                s1 = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 4).toString();
                s2 = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 5).toString();
                c.sql.execute("delete from databasework.`order` where person='" + s1 + "'and proname='" + s2 + "'");

                ResultSet rs1 = c.connect("SELECT * FROM databasework.`order`");
                int i = 0;
                while (rs1.next()) {
                    for (int k = 1; k <= 7; k++) {
                        this.jTable1.setValueAt(rs1.getString(k), i, k - 1);
                    }
                    i++;
                }
                while (i < 8) {
                    for (int k = 1; k <= 7; k++) {
                        this.jTable1.setValueAt(null, i, k - 1);
                    }
                    i++;
                }
                c.con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (p1.getPp().isB2()) {
            JOptionPane.showMessageDialog(this, "没有操作权限！", null, JOptionPane.WARNING_MESSAGE);
        } else {
            ss1 = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 4).toString();

            if (ss1 != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        Updateorder_10.getO().setVisible(true);
                    }
                });
            } else {
                JOptionPane.showMessageDialog(this, "当前无订单！", null, JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (p1.getPp().isB3()) {
            JOptionPane.showMessageDialog(this, "没有操作权限！", null, JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                // TODO add your handling code here:
                s = new String[10][4];
                int j = 0;
                String sa = "";
                Connect c1 = new Connect();
                ResultSet rs1 = c1.connect("SELECT * FROM databasework.`order`");
                ResultSet rs2 = null;
                Connect c2 = new Connect();
                while (rs1.next()) {

                    s[j][1] = rs1.getString(2);
                    s[j][2] = rs1.getString(7);
                    s[j][3] = rs1.getString(6);
                    rs2 = c2.connect("select company from databasework.`product` where proname='" + s[j][3] + "'");
                    if (rs2.next()) {
                        s[j][0] = rs2.getString(1);
                    }
                    j++;
                }

                c2.con.close();
                for (int k = 0; k < j; k++) {
                    sa = sa + s[k][0] + "需要在" + s[k][1] + "前完成生产" + s[k][2] + "瓶" + s[k][3] + "\n";
                }

                jTextArea1.setText(sa);
                if (j == 0) {
                    JOptionPane.showMessageDialog(this, "无排产计划", null, JOptionPane.INFORMATION_MESSAGE);
                }
                c1.con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
