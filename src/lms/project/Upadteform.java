/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author F2018266227
 */
public class Upadteform extends javax.swing.JFrame {

    /**
     * Creates new form Upadteform
     */
    public Upadteform() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Booknameu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Authornameu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BookEditionu = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update Book Record");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 50, 280, 110);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 190, 180, 40);
        jPanel1.add(Booknameu);
        Booknameu.setBounds(260, 190, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Author Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 260, 180, 29);

        Authornameu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthornameuActionPerformed(evt);
            }
        });
        jPanel1.add(Authornameu);
        Authornameu.setBounds(260, 260, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Book Edition");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 330, 160, 40);
        jPanel1.add(BookEditionu);
        BookEditionu.setBounds(260, 340, 220, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(300, 410, 100, 25);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/Icons/Mix Icon/Home.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 30, 57, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/Project BackGround/book Record.jpg"))); // NOI18N
        jLabel1.setText("Book Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, 0, 750, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AuthornameuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthornameuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthornameuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookRecord().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Tbookname=Booknameu.getText()+"\n";
        String TAName=Authornameu.getText();
             String TBedition=BookEditionu.getText();
             
            
            
            String Bname,Authorname,Bedition;
            
            boolean flag=false;
            FileWriter fw=null;
            BufferedWriter bw=null;
            FileReader fr=null;
            BufferedReader br=null;
            String Orignalfile="Book.txt";
            String Tempfile="Temp.txt";
            File oldfile=new File(Orignalfile);
            File newfile= new File(Tempfile);
            try
            {
                fw=new FileWriter(newfile);
                bw=new BufferedWriter(fw);
                fr=new  FileReader(oldfile);
                br= new BufferedReader(fr);
                while((Bname=br.readLine())!=null)
                {
                    Bname=Bname+"\n";
                    Authorname=br.readLine()+"\n";
                    Bedition=br.readLine()+"\n";
                    
                    if( Bname.equals(Tbookname))
                    {
                        flag=true;
                        bw.write( Tbookname);
                        bw.write(TAName);
                        bw.newLine();
                        bw.write(TBedition);
                        bw.newLine();
                       
                    }
                    else
                    {
                        bw.write(Bname);
                        bw.write(Authorname);
                        
                        bw.write(Bedition);
                        
                      
                       
                    }
                    
                }
                if(flag==false)
                {
                    JOptionPane.showMessageDialog(this,"Sorry This Book isn't Found in Record");
                }
            } catch (java.io.IOException ex) {
            Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally
            {
                if(br!=null)
                    try {
                        br.close();
                } catch (java.io.IOException ex) {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(bw!=null)
                    try {
                        bw.close();
                } catch (java.io.IOException ex) {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(fr!=null)
                    try {
                        fr.close();
                } catch (java.io.IOException ex) {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(fw!=null)
                    try {
                        fw.close();
                } catch (java.io.IOException ex) {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                oldfile.delete();
                File file=new File("Book.txt");
              newfile.renameTo(file);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Upadteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Upadteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Upadteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Upadteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Upadteform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Authornameu;
    private javax.swing.JTextField BookEditionu;
    private javax.swing.JTextField Booknameu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
