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
public class Productinfo_4 extends javax.swing.JFrame {

    private String s1 = null, s2 = null, s3 = null, s4 = null;
    /**
     * Creates new form Productinfo
     */
    private static Productinfo_4 info = null;

    private Productinfo_4() {
        initComponents();
    }

    public synchronized static Productinfo_4 getInfo() {
        if (info == null) {
            info = new Productinfo_4();
            info.setLocationRelativeTo(null);
            info.getContentPane().setBackground(new Color(150, 200, 200));
        }
        return info;
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("产品信息维护");

        jButton1.setText("查询产品");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("添加产品");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("删除产品");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("更新信息");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "产品名称", "售价", "产品特征描述", "所属公司"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("产品名称");

        jLabel3.setText("售价");

        jLabel4.setText("产品特征描述");

        jLabel5.setText("所属公司");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jLabel1))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void query() {
        try {
            // TODO add your handling code here:
            s1 = jTextField1.getText();
            s2 = jTextField2.getText();
            s3 = jTextField3.getText();
            s4 = jTextField4.getText();
            Connect c = new Connect();
            ResultSet rs1 = null;
            if (!s1.equals("")) {
                rs1 = c.connect("select * from product where proname like '%" + s1 + "%'");
            } else if (!s2.equals("")) {
                rs1 = c.connect("select * from product where price like '%" + s2 + "%'");
            } else if (!s3.equals("")) {
                rs1 = c.connect("select * from product where description like '%" + s3 + "%'");
            } else if (!s4.equals("")) {
                rs1 = c.connect("select * from product where company like '%" + s4 + "%'");
            } else {
                rs1 = c.connect("select * from product ");
            }
            int i = 0, j = 0;
            while (rs1.next()) {
                for (int k = 1; k <= 4; k++) {
                    this.jTable1.setValueAt(rs1.getString(k), i, j + k - 1);
                }
                i++;
            }
            while (i < 8) {
                for (int k = 1; k <= 4; k++) {
                    this.jTable1.setValueAt(null, i, j + k - 1);

                }
                i++;
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        info.query();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            s1 = jTextField1.getText();
            s2 = jTextField2.getText();
            s3 = jTextField3.getText();
            s4 = jTextField4.getText();
            // TODO add your handling code here:
            Connect c = new Connect();
            c.sql.execute("INSERT INTO product VALUES ('" + s1 + "'," + s2 + ",'" + s3 + "','" + s4 + "')");
            JOptionPane.showMessageDialog(this, "添加成功!", null, JOptionPane.INFORMATION_MESSAGE);
            info.query();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            s1 = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0).toString();

            // TODO add your handling code here:
            Connect c = new Connect();
            String sa = "select * from product where ";
            String sb = "DELETE FROM `databasework`.`product` WHERE ";
            if (c.connect(sa + " proname ='" + s1 + "'") != null) {
                c.sql.execute(sb + "proname ='" + s1 + "'");

            } else {
                JOptionPane.showMessageDialog(this, "该项数据不存在!", null, JOptionPane.WARNING_MESSAGE);
            }
            JOptionPane.showMessageDialog(this, "删除成功!", null, JOptionPane.INFORMATION_MESSAGE);
            info.query();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            s1 = jTextField1.getText();
            s2 = jTextField2.getText();
            s3 = jTextField3.getText();
            s4 = jTextField4.getText(); System.out.println(s1+s2+s3+s4);
            // TODO add your handling code here:
            Connect c = new Connect();
            String sss;
            int flag = 0;
            ResultSet rs1 = c.connect("SELECT * FROM databasework.product");
            while (rs1.next()) {
                sss = rs1.getString(1);
                if (s1.equals(sss)) {
                    if (!s2.equals("")) {
                        c.sql.execute("UPDATE `databasework`.`product` SET `price`=" + s2 + " WHERE `proname`='" + s1 + "'");
                    }
                    if (!s3.equals("")) {
                        c.sql.execute("UPDATE `databasework`.`product` SET  `description`='" + s3 + "' WHERE `proname`='" + s1 + "'");
                    }
                    if (!s4.equals("")) {
                        c.sql.execute("UPDATE `databasework`.`product` SET  `company`='" + s4 + "' WHERE `proname`='" + s1 + "'");
                    }
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                c.sql.execute("INSERT INTO product VALUES ('" + s1 + "'," + s2 + ",'" + s3 + "','" + s4 + "')");

            }
            JOptionPane.showMessageDialog(this, "更新成功!", null, JOptionPane.INFORMATION_MESSAGE);
            info.query();
        } catch (Exception e) {
            System.out.println(e);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
