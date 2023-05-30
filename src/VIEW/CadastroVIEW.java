/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.UsuarioDAO;
import DTO.usuariosDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author 1-2021221386
 */
public class CadastroVIEW extends javax.swing.JFrame {

    /**
     * Creates new form CadastroVIEW
     */
    public CadastroVIEW() {
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
        NOME = new javax.swing.JTextField();
        EMAIL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SENHA = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cadastro = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(601, 420));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        NOME.setBackground(new java.awt.Color(0, 0, 0));
        NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMEActionPerformed(evt);
            }
        });
        jPanel1.add(NOME);
        NOME.setBounds(360, 130, 180, 30);

        EMAIL.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(EMAIL);
        EMAIL.setBounds(360, 190, 180, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SENHA");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(430, 230, 40, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOME");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 100, 40, 16);

        SENHA.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SENHA);
        SENHA.setBounds(360, 250, 180, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EMAIL");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(430, 170, 40, 16);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        cadastro.setText("CADASTRAR");
        cadastro.setBorder(null);
        cadastro.setContentAreaFilled(false);
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });
        jPanel2.add(cadastro);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(390, 310, 110, 30);

        voltar.setBackground(new java.awt.Color(0, 0, 0));
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/certo_1.png"))); // NOI18N
        voltar.setBorder(null);
        voltar.setBorderPainted(false);
        voltar.setContentAreaFilled(false);
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel1.add(voltar);
        voltar.setBounds(0, 10, 75, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CADASTRO");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(380, 50, 150, 29);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 390);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        PrincipalVIEW tela = new PrincipalVIEW();//criando um objeto
        tela.setVisible(true);//tornando o objeto tela visÃ­vel(true)
        dispose();//Fechando a tela login

    }//GEN-LAST:event_voltarActionPerformed

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed
        
        usuariosDTO user = new usuariosDTO();
        
        user.setNome(NOME.getText());
        user.setSenha(SENHA.getText());
        user.setEmail(EMAIL.getText());
        
        UsuarioDAO userdao = new UsuarioDAO();
        
        userdao.inserir(user);
        
        JOptionPane.showMessageDialog(null, user.salvar()); //salvar as informaÃ§Ãµes
        
        NOME.setText("");
        SENHA.setText("");
        EMAIL.setText("");
        
    }//GEN-LAST:event_cadastroActionPerformed

    private void NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMEActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EMAIL;
    private javax.swing.JTextField NOME;
    private javax.swing.JPasswordField SENHA;
    private javax.swing.JButton cadastro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

}