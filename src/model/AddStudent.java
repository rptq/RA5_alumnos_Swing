/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package model;

import java.awt.Component;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import static model.FileManager.registerFile;

/**
 *
 * @author RobertTerolLacasta
 */
public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form addStudent
     */
    public AddStudent() {
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

        jBttnOK = new javax.swing.JButton();
        jBttnCancel = new javax.swing.JButton();
        jTxtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtSurname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtCourse = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtDNI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBttnOK.setText("OK");
        jBttnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnOKActionPerformed(evt);
            }
        });

        jBttnCancel.setText("Cancel");
        jBttnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnCancelActionPerformed(evt);
            }
        });

        jTxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        jTxtSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSurnameActionPerformed(evt);
            }
        });

        jLabel2.setText("Surname:");

        jTxtAge.setActionCommand("<Not Set>");
        jTxtAge.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTxtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAgeActionPerformed(evt);
            }
        });

        jLabel3.setText("Age:");

        jTxtCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCourseActionPerformed(evt);
            }
        });

        jLabel4.setText("Course:");

        jTxtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDNIActionPerformed(evt);
            }
        });

        jLabel5.setText("DNI:");

        jLblError.setForeground(new java.awt.Color(255, 0, 0));
        jLblError.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTxtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTxtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblError)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBttnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBttnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLblError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBttnOK)
                    .addComponent(jBttnCancel))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNameActionPerformed

    private void jTxtSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSurnameActionPerformed

    private void jTxtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAgeActionPerformed

    private void jTxtCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCourseActionPerformed

    private void jTxtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDNIActionPerformed

    private void jBttnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnCancelActionPerformed
        this.setVisible(false);
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBttnCancelActionPerformed

    private void jBttnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnOKActionPerformed
        
        int ageint = 0;
        
        if (jTxtName.getText().equals("") || jTxtSurname.getText().equals("") || jTxtAge.getText().equals("") || jTxtCourse.getText().equals("") || jTxtDNI.getText().equals("")) {
            jLblError.setText("Completa todos los campos.");
            
            
        } 
        
        else {
            boolean studentexists = false;
            ageint = Integer.parseInt(jTxtAge.getText());
            Student stdnt = new Student(jTxtName.getText(), jTxtSurname.getText(), ageint, jTxtCourse.getText(), jTxtDNI.getText());

            for (Student existingstudent : StudentRegister.StudentRegister.students) {
                if (stdnt.getDni().equalsIgnoreCase(existingstudent.getDni())) {
                    studentexists = true;
                }
            }
            
            if (!studentexists) {

                StudentRegister.StudentRegister.students.add(stdnt);

                try {
                    FileWriter fw = new FileWriter(registerFile);

                    BufferedWriter bw = new BufferedWriter(fw);

                    for (var student : StudentRegister.StudentRegister.students) {
                        bw.write(student.tostringFormat());
                    }

                    bw.flush();
                    bw.close();
                    this.setVisible(false);
                    new Menu().setVisible(true);
                    dispose();
                } catch (IOException e) {
                    System.err.println("No se ha podido crear el archivo.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ya hay un alumno registrado con el mismo dni.", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_jBttnOKActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttnCancel;
    private javax.swing.JButton jBttnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLblError;
    private javax.swing.JTextField jTxtAge;
    private javax.swing.JTextField jTxtCourse;
    private javax.swing.JTextField jTxtDNI;
    private javax.swing.JTextField jTxtName;
    private javax.swing.JTextField jTxtSurname;
    // End of variables declaration//GEN-END:variables
}
