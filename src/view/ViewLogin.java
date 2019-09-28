/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.Color;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;
import view.ViewConta;
import view.viewRecuperarSenha;

/**
 *
 * @author brasileiro
 */
public class ViewLogin extends javax.swing.JFrame{
    
    /**
     * Creates new form ViewLogin
     */
    private int xMouse;
    private int yMouse;
    
    public ViewLogin() {
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

        jComboBox1 = new javax.swing.JComboBox();
        txtCpf = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            txtCpf = new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
        }
        txtSenha = new javax.swing.JPasswordField();
        jLabelRecuperarSenha = new javax.swing.JLabel();
        jButtonAcessarContar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoCriarConta = new javax.swing.JButton();
        frameDrag = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setName("Login"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Funcionário", "Condômino", "Inquilino" }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 290, 30));

        txtCpf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCpf.setText("CPF");
        txtCpf.setBorder(null);
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 290, 30));

        txtSenha.setText("jPasswordField1");
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 290, 30));

        jLabelRecuperarSenha.setForeground(java.awt.Color.white);
        jLabelRecuperarSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRecuperarSenha.setText("Deseja recuperar a senha?");
        jLabelRecuperarSenha.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelRecuperarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRecuperarSenhaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelRecuperarSenhaMouseEntered(evt);
            }
        });
        getContentPane().add(jLabelRecuperarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 150, 20));

        jButtonAcessarContar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAcessarContar.setText("Acessar");
        jButtonAcessarContar.setBorder(null);
        jButtonAcessarContar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAcessarContar.setPreferredSize(new java.awt.Dimension(90, 40));
        jButtonAcessarContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarContarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarContar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        botaoCancelar.setBackground(new java.awt.Color(255, 255, 255));
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setBorder(null);
        botaoCancelar.setPreferredSize(new java.awt.Dimension(90, 40));
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        botaoCriarConta.setBackground(new java.awt.Color(255, 255, 255));
        botaoCriarConta.setText("Criar Conta");
        botaoCriarConta.setBorder(null);
        botaoCriarConta.setPreferredSize(new java.awt.Dimension(90, 40));
        botaoCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarContaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));

        frameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameDragMouseDragged(evt);
            }
        });
        frameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameDragMousePressed(evt);
            }
        });
        getContentPane().add(frameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 10));

        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 10, 20));

        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 20, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/logo-400.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 12, 376, 376));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/background-medium.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarContaActionPerformed
        // Botao Criar Conta
        ViewConta cadastrarConta = new ViewConta();
        cadastrarConta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCriarContaActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        // Botao Cancelar da tela Incial
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void jButtonAcessarContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarContarActionPerformed
        // Botao acessar

        ViewPainelCentral painel = new ViewPainelCentral();
        painel.setLocationRelativeTo(null);
        painel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAcessarContarActionPerformed

    private void jLabelRecuperarSenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRecuperarSenhaMouseEntered
        // TODO add your handling code here:
        jLabelRecuperarSenha.setToolTipText("Caso esteja cadastro e esqueceu a senha, então clique para recupera-la!");
    }//GEN-LAST:event_jLabelRecuperarSenhaMouseEntered

    private void jLabelRecuperarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRecuperarSenhaMouseClicked
        // link recuperar senha

        viewRecuperarSenha recuperarSenha = new viewRecuperarSenha();
        recuperarSenha.setLocationRelativeTo(null);
        recuperarSenha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelRecuperarSenhaMouseClicked

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed

        txtCpf.setText(null);
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        // TODO add your handling code here:
        if  (txtCpf.getText().equals("")) {
            txtCpf.setText("CPF");
        }
    }//GEN-LAST:event_txtCpfFocusLost

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        // evento focusGained para colocar vazio o conteudo do jtextfieldCpf ao clicar ou estar em foco

        if (txtCpf.getText().
            equals("CPF")) {
            txtCpf.setText("");
        }
    }//GEN-LAST:event_txtCpfFocusGained

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setState(ViewLogin.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void frameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_frameDragMouseDragged

    private void frameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY(); 
    }//GEN-LAST:event_frameDragMousePressed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
            //public void run() {
                //new ViewLogin().setVisible(true);
            //}
        //});
   // }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoCriarConta;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JButton jButtonAcessarContar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelRecuperarSenha;
    public javax.swing.JTextField txtCpf;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
