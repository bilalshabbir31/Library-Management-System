/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ubaid ur rehman
 */
public class DeleteRecord extends javax.swing.JFrame {

    /**
     * Creates new form DeleteRecord
     */
    public DeleteRecord() {
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

        jPanel1 = new javax.swing.JPanel();
        studentid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        deletestudentrecord = new javax.swing.JButton();
        backtostudentrecordafterdelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(studentid);
        studentid.setBounds(300, 170, 230, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student id");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 180, 110, 22);

        deletestudentrecord.setBackground(new java.awt.Color(0, 0, 0));
        deletestudentrecord.setForeground(new java.awt.Color(255, 255, 255));
        deletestudentrecord.setText("Delete Record");
        deletestudentrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletestudentrecordActionPerformed(evt);
            }
        });
        jPanel1.add(deletestudentrecord);
        deletestudentrecord.setBounds(340, 240, 140, 23);

        backtostudentrecordafterdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/Icons/Mix Icon/Home.png"))); // NOI18N
        backtostudentrecordafterdelete.setToolTipText("Back to StudentRecord");
        backtostudentrecordafterdelete.setBorderPainted(false);
        backtostudentrecordafterdelete.setContentAreaFilled(false);
        backtostudentrecordafterdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtostudentrecordafterdeleteActionPerformed(evt);
            }
        });
        jPanel1.add(backtostudentrecordafterdelete);
        backtostudentrecordafterdelete.setBounds(10, 20, 40, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Delete Record");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 100, 270, 44);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/Project BackGround/download.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backtostudentrecordafterdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtostudentrecordafterdeleteActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRecord().setVisible(true);
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_backtostudentrecordafterdeleteActionPerformed

    private void deletestudentrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletestudentrecordActionPerformed
        File oldfile=new File("Student.txt");
        File newfile=new File("temp.txt");
        FileWriter fw=null;
        FileReader fr=null;
        BufferedWriter bw=null;
        BufferedReader br=null;
        String id,name,depname,nbb,DOI,TE;
        String idsearch=studentid.getText()+"\n";
        try
        {
            fr=new FileReader(oldfile);
            br=new BufferedReader(fr);
            fw= new FileWriter(newfile,true);
            bw= new BufferedWriter(fw);
            
            while((id=br.readLine())!=null)
            {
                id=id+"\n";
                name=br.readLine()+"\n";
                depname=br.readLine()+"\n";
                nbb=br.readLine()+"\n";
                DOI=br.readLine()+"\n";
                TE=br.readLine()+"\n";
                if(!idsearch.equals(id))
                {
                    bw.write(id);
                  
                    bw.write(name);
                 
                    bw.write(depname);
                 
                    bw.write(nbb);
                   
                    bw.write(DOI);
                  
                    bw.write(TE);
                   
                }
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeleteRecord.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DeleteRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            if(br!=null)
                try {
                    br.close();
            } catch (IOException ex) {
                Logger.getLogger(DeleteRecord.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(bw!=null)
                try {
                    bw.close();
            } catch (IOException ex) {
                Logger.getLogger(DeleteRecord.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(fr!=null)
                try {
                    fr.close();
            } catch (IOException ex) {
                Logger.getLogger(DeleteRecord.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(fw!=null)
                try {
                    fw.close();
            } catch (IOException ex) {
                Logger.getLogger(DeleteRecord.class.getName()).log(Level.SEVERE, null, ex);
            }
            oldfile.delete();
            File file=new File("Student.txt");
            newfile.renameTo(file);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_deletestudentrecordActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backtostudentrecordafterdelete;
    private javax.swing.JButton deletestudentrecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField studentid;
    // End of variables declaration//GEN-END:variables
}