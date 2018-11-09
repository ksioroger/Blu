package interfaces;

import entidade.Usuário;
import controle.ControleTamanhoTexto;
import static entidade.Usuário.buscar_Usuário_e_PK;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import java.net.URL;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.InputMap;
import javax.swing.JComponent;

import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

/**
 *
 * @author Cassiano Rogério
 */
public class Login extends javax.swing.JFrame {
    /**
     * Creates new form Login
     */
    //public Login(java.awt.Frame parent, boolean modal) {
    public Login() {
        URL url = this.getClass().getResource("/images/key 20x20.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
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

        jPanelEtiquetaseCampos = new javax.swing.JPanel();
        jPanelLabels = new javax.swing.JPanel();
        jLabelKey = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jPanelCamposdeDados = new javax.swing.JPanel();
        jPasswordFieldKey = new javax.swing.JPasswordField();
        jFormattedTextFieldUser = new javax.swing.JFormattedTextField();
        jPanelBotões = new javax.swing.JPanel();
        jButtonNovoUser = new javax.swing.JButton();
        jButtonEntrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Note");
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanelEtiquetaseCampos.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabelKey.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelKey.setText("Senha");

        jLabelUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelUser.setText("Usuário");

        javax.swing.GroupLayout jPanelLabelsLayout = new javax.swing.GroupLayout(jPanelLabels);
        jPanelLabels.setLayout(jPanelLabelsLayout);
        jPanelLabelsLayout.setHorizontalGroup(
            jPanelLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelLabelsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelUser)
                    .addComponent(jLabelKey)))
        );
        jPanelLabelsLayout.setVerticalGroup(
            jPanelLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLabelsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelKey)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPasswordFieldKey.setDocument( new ControleTamanhoTexto(30) );
        jPasswordFieldKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldKeyActionPerformed(evt);
            }
        });

        jFormattedTextFieldUser.setDocument( new ControleTamanhoTexto(30) );
        jFormattedTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCamposdeDadosLayout = new javax.swing.GroupLayout(jPanelCamposdeDados);
        jPanelCamposdeDados.setLayout(jPanelCamposdeDadosLayout);
        jPanelCamposdeDadosLayout.setHorizontalGroup(
            jPanelCamposdeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposdeDadosLayout.createSequentialGroup()
                .addGroup(jPanelCamposdeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldKey, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCamposdeDadosLayout.setVerticalGroup(
            jPanelCamposdeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposdeDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFormattedTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordFieldKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonNovoUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNovoUser.setMnemonic('N');
        jButtonNovoUser.setText("Novo Usúario");
        jButtonNovoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoUserActionPerformed(evt);
            }
        });

        jButtonEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEntrar.setMnemonic('e');
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancelar.setMnemonic('c');
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotõesLayout = new javax.swing.GroupLayout(jPanelBotões);
        jPanelBotões.setLayout(jPanelBotõesLayout);
        jPanelBotõesLayout.setHorizontalGroup(
            jPanelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotõesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNovoUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanelBotõesLayout.setVerticalGroup(
            jPanelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotõesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoUser)
                    .addComponent(jButtonEntrar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelEtiquetaseCamposLayout = new javax.swing.GroupLayout(jPanelEtiquetaseCampos);
        jPanelEtiquetaseCampos.setLayout(jPanelEtiquetaseCamposLayout);
        jPanelEtiquetaseCamposLayout.setHorizontalGroup(
            jPanelEtiquetaseCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEtiquetaseCamposLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelLabels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCamposdeDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelEtiquetaseCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBotões, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEtiquetaseCamposLayout.setVerticalGroup(
            jPanelEtiquetaseCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEtiquetaseCamposLayout.createSequentialGroup()
                .addGroup(jPanelEtiquetaseCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCamposdeDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelLabels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelBotões, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelEtiquetaseCampos);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        //Encerra o programa
        System.exit(0);  
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    //Cria a janela de novo cadastro de senha
    private void Cadastrar(){
        //Criar uma nova janela, para adicionar dados
        Cadastrar cadastrardialogo = new Cadastrar(this,true);
        cadastrardialogo.setLocationRelativeTo(null);
        cadastrardialogo.setResizable(false);
        cadastrardialogo.setVisible(true);
    }
    
    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        //Captura os dados informados pelo usuário
        Usuário dados = capturaNomeSenha();
        if (dados==null) {
            JOptionPane.showMessageDialog(this, "Informe o nome de Usuário e Senha.", "Atenção",
                    JOptionPane.ERROR_MESSAGE);
        }
        //Caso o usuário e senha tenham sido informados na tela de login, irá buscar se o usuário existe no banco
        else if(dados!=null){
            Usuário dadosBuscaBD;
            String userInformado, userBanco;
            String keyInformada, keyBanco;
            //Busca se o usuário existe, caso não exista terá null como retorno
            if ((dadosBuscaBD = buscar_Usuário_e_PK(dados.getusuário()))==null) {
                JOptionPane.showMessageDialog(this, "User não cadastrado.", "Atenção",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            //Caso o usuário exista no banco, irá testar a senha
            else{
                //Dados informados pelo usuário solicitando o login
                userInformado = dados.getusuário();
                //Senha é encrtiptada para testar a compatil]bilidade com a armazenada no banco
                keyInformada = entidade.EncriptaSenha_SHA256.encripta(dados.getsenha());

                //Dados armazenados no banco
                userBanco = dadosBuscaBD.getusuário();
                keyBanco = dadosBuscaBD.getsenha();

                //Testa se a senha informada é a mesma armazenada no banco, se sim executa o F5enha
                if (keyInformada.equals(keyBanco)==true){
                    //Descarta a tela de login e executa o F5enha
                    this.dispose();
                    F5enha(userInformado);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Senha incorreta.", "Atenção",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonNovoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoUserActionPerformed
        // TODO add your handling code here:
        Cadastrar();
    }//GEN-LAST:event_jButtonNovoUserActionPerformed

    private void jPasswordFieldKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyActionPerformed
        // TODO add your handling code here:
        //Quando estiver no campo de texto da senha permite confirmar usando a tecla enter
        jButtonEntrar.doClick();
    }//GEN-LAST:event_jPasswordFieldKeyActionPerformed

    private void jFormattedTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldUserActionPerformed
        // TODO add your handling code here:
        //Pula para o campo de senha
        jPasswordFieldKey.requestFocus();
    }//GEN-LAST:event_jFormattedTextFieldUserActionPerformed

    //Permitir fechar a Janela com a tecla Esc
    @Override
    protected JRootPane createRootPane() {
        JRootPane rootPane = new JRootPane();
        KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
        Action actionListener;
        actionListener = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) { 
                //setVisible(false);
                //Encerra o programa
                System.exit(0);  
            } 
        };
        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(stroke, "ESCAPE");
        rootPane.getActionMap().put("ESCAPE", actionListener);
        return rootPane;
    }
    
    public Usuário capturaNomeSenha(){
        //Usuário dados = null;
        Usuário dados = new Usuário(null,null,null);
        
        //Captura o nome de usuário digitado
        dados.setusuário(jFormattedTextFieldUser.getText());
        //Converte os dados de usuário para caixa baixa(minusculo)
        dados.setusuário(dados.getusuário().toLowerCase());
        
        //Captura a senha digitada
        char[] PassWord =  jPasswordFieldKey.getPassword();
        //Converte a senha em String
        dados.setsenha(String.valueOf(PassWord));
        
        if ((dados.getusuário().isEmpty()==true) && (dados.getsenha().isEmpty()==true)) {
            System.out.println("user e senha vazios");
            return null;
        }
        if (dados.getusuário().isEmpty()==true) {
            System.out.println("user vazio");
            return null;
        }
        if (dados.getsenha().isEmpty()==true) {
            System.out.println("senha vazia");
            return null;
        }
        return dados;
    }
    
    //Cria a tela de login
    private void F5enha(String nomeUser){
        Blu1 JanelaNote =  new Blu1(nomeUser);
        //JanelaNote.setLayout(new BorderLayout());
        //JanelaNote.setLocationRelativeTo(null);
        //JanelaNote.setResizable(false);
        JanelaNote.setExtendedState(MAXIMIZED_BOTH);
        JanelaNote.setVisible(true);
    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login TelaLogin = new Login();
                TelaLogin.setLayout(new BorderLayout());
                TelaLogin.setLocationRelativeTo(null);
                TelaLogin.setResizable(false);
                TelaLogin.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonNovoUser;
    private javax.swing.JFormattedTextField jFormattedTextFieldUser;
    private javax.swing.JLabel jLabelKey;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanelBotões;
    private javax.swing.JPanel jPanelCamposdeDados;
    private javax.swing.JPanel jPanelEtiquetaseCampos;
    private javax.swing.JPanel jPanelLabels;
    private javax.swing.JPasswordField jPasswordFieldKey;
    // End of variables declaration//GEN-END:variables
}
