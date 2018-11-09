package interfaces;

import controle.controladorSobre;
import controle.controladorAtalhos;

import entidade.Senha;
import entidade.Visão;
import entidade.Usuário;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.net.URL;

import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Cassiano Rogério
 */

//Janela principal do programa de gestão de senhas
public class Blu1 extends javax.swing.JFrame {

    /**
    * Gestor de senhas desenvolvido por Cassiano Rogério.
    */
    public Vector<Visão<String>> senhas_cadastradas;
    String userLogado = null;
    
    public Blu1(String nomeUser) {
        userLogado = nomeUser;
        senhas_cadastradas = Senha.getVisões(Usuário.buscar_Usuário_Todos_os_dados(userLogado).getID());
        URL url = this.getClass().getResource("/images/key 20x20.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
        initComponents();
        //Quando for dado um clique duplo na lista de cadastros abre a janela de visualização do cadastro clicado duplamente
        cliqueDuplo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelListagem = new javax.swing.JPanel();
        jScrollPaneListadeSenhas = new javax.swing.JScrollPane();
        jListSenhasCadastradas = new javax.swing.JList();
        jLabelFundoListagem = new javax.swing.JLabel();
        jPanelBotões = new javax.swing.JPanel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonVisualizar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBarMenus = new javax.swing.JMenuBar();
        jMenuMenuUsuário = new javax.swing.JMenu();
        jMenuItemGerenciar = new javax.swing.JMenuItem();
        jMenuItemTrocar_Usuário = new javax.swing.JMenuItem();
        jMenuItemBotão_Sair = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuItemNovo = new javax.swing.JMenuItem();
        jMenuItemVisualizar = new javax.swing.JMenuItem();
        jMenuItemAtualizar = new javax.swing.JMenuItem();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItemAtalhos = new javax.swing.JMenuItem();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blu1");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(getExtendedState());
        setLocation(new java.awt.Point(0, 0));
        setMaximizedBounds(getMaximizedBounds());
        setMinimumSize(getMinimumSize());
        setName("Blu1"); // NOI18N
        setShape(getShape());
        setSize(getMaximumSize());

        jPanelListagem.setBackground(new java.awt.Color(204, 204, 204));
        jPanelListagem.setMaximumSize(getMaximumSize());
        jPanelListagem.setLayout(new javax.swing.OverlayLayout(jPanelListagem));

        jScrollPaneListadeSenhas.setOpaque(false);
        jScrollPaneListadeSenhas.getViewport().setOpaque(false);
        jScrollPaneListadeSenhas.setMaximumSize(getMaximumSize());

        jListSenhasCadastradas.setOpaque(false);
        jListSenhasCadastradas.setBackground(new Color(0, 0, 0, 0));
        jListSenhasCadastradas.setForeground(Color.WHITE);
        jListSenhasCadastradas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jListSenhasCadastradas.setForeground(new java.awt.Color(51, 51, 51));
        jListSenhasCadastradas.setModel(new DefaultComboBoxModel(senhas_cadastradas));
        jListSenhasCadastradas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListSenhasCadastradas.setToolTipText("");
        jListSenhasCadastradas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPaneListadeSenhas.setViewportView(jListSenhasCadastradas);

        jPanelListagem.add(jScrollPaneListadeSenhas);

        jLabelFundoListagem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFundoListagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Key backgroung 250x250.png"))); // NOI18N
        jLabelFundoListagem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelFundoListagem.setFocusable(false);
        jLabelFundoListagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelFundoListagem.setInheritsPopupMenu(false);
        jLabelFundoListagem.setMaximumSize(getMaximumSize());
        jLabelFundoListagem.setMinimumSize(getMinimumSize());
        jLabelFundoListagem.setPreferredSize(getPreferredSize());
        jLabelFundoListagem.setRequestFocusEnabled(false);
        jLabelFundoListagem.setVerifyInputWhenFocusTarget(false);
        jPanelListagem.add(jLabelFundoListagem);

        getContentPane().add(jPanelListagem, java.awt.BorderLayout.CENTER);

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find 40x40.png"))); // NOI18N
        jButtonBuscar.setMnemonic('b');
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new 40x40.png"))); // NOI18N
        jButtonNovo.setMnemonic('n');
        jButtonNovo.setText("Novo");
        jButtonNovo.setToolTipText("");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonVisualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view 40x40.png"))); // NOI18N
        jButtonVisualizar.setMnemonic('v');
        jButtonVisualizar.setText("Visualizar");
        jButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update 40x40.png"))); // NOI18N
        jButtonAtualizar.setMnemonic('a');
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove 40x40.png"))); // NOI18N
        jButtonExcluir.setMnemonic('e');
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit 40x40.png"))); // NOI18N
        jButtonSair.setMnemonic('s');
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabel1.setText("Blu - Sistema de gerenciamento de estoque e vendas");

        javax.swing.GroupLayout jPanelBotõesLayout = new javax.swing.GroupLayout(jPanelBotões);
        jPanelBotões.setLayout(jPanelBotõesLayout);
        jPanelBotõesLayout.setHorizontalGroup(
            jPanelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotõesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVisualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addContainerGap())
        );
        jPanelBotõesLayout.setVerticalGroup(
            jPanelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotõesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotõesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBotõesLayout.createSequentialGroup()
                        .addGroup(jPanelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBuscar)
                            .addComponent(jButtonNovo)
                            .addComponent(jButtonVisualizar)
                            .addComponent(jButtonAtualizar)
                            .addComponent(jButtonExcluir)
                            .addComponent(jButtonSair))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanelBotões, java.awt.BorderLayout.SOUTH);

        jMenuBarMenus.setBorder(null);
        jMenuBarMenus.setFocusCycleRoot(true);
        jMenuBarMenus.setName(""); // NOI18N
        jMenuBarMenus.setPreferredSize(new java.awt.Dimension(50, 22));

        jMenuMenuUsuário.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuMenuUsuário.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user 20x20.png"))); // NOI18N
        jMenuMenuUsuário.setMnemonic('u');
        jMenuMenuUsuário.setText(userLogado);
        jMenuMenuUsuário.setFocusable(false);
        jMenuMenuUsuário.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        jMenuItemGerenciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user 20x20.png"))); // NOI18N
        jMenuItemGerenciar.setText("Gerenciar");
        jMenuItemGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerenciarActionPerformed(evt);
            }
        });
        jMenuMenuUsuário.add(jMenuItemGerenciar);

        jMenuItemTrocar_Usuário.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users 20x20.png"))); // NOI18N
        jMenuItemTrocar_Usuário.setText("Trocar Usuário");
        jMenuItemTrocar_Usuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTrocar_UsuárioActionPerformed(evt);
            }
        });
        jMenuMenuUsuário.add(jMenuItemTrocar_Usuário);

        jMenuItemBotão_Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit 20x20.png"))); // NOI18N
        jMenuItemBotão_Sair.setText("Sair");
        jMenuItemBotão_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBotão_SairActionPerformed(evt);
            }
        });
        jMenuMenuUsuário.add(jMenuItemBotão_Sair);

        jMenuBarMenus.add(jMenuMenuUsuário);

        jMenuEditar.setBorder(null);
        jMenuEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit 20x20.png"))); // NOI18N
        jMenuEditar.setMnemonic('d');
        jMenuEditar.setText("Editar");
        jMenuEditar.setToolTipText("");
        jMenuEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItemNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, 0));
        jMenuItemNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new 20x20.png"))); // NOI18N
        jMenuItemNovo.setText("Novo");
        jMenuItemNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemNovo);

        jMenuItemVisualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, 0));
        jMenuItemVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view 20x20.png"))); // NOI18N
        jMenuItemVisualizar.setText("Visualizar");
        jMenuItemVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemVisualizar);

        jMenuItemAtualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        jMenuItemAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update 20x20.png"))); // NOI18N
        jMenuItemAtualizar.setText("Atualizar");
        jMenuItemAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtualizarActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemAtualizar);

        jMenuItemExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        jMenuItemExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove 20x20.png"))); // NOI18N
        jMenuItemExcluir.setText("Excluir");
        jMenuItemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemExcluir);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit 20x20.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemSair);

        jMenuBarMenus.add(jMenuEditar);

        jMenuSobre.setBorder(null);
        jMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about 20x20.png"))); // NOI18N
        jMenuSobre.setMnemonic('o');
        jMenuSobre.setText("Sobre");
        jMenuSobre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItemAtalhos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemAtalhos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/link 20x20.png"))); // NOI18N
        jMenuItemAtalhos.setText("Atalhos");
        jMenuItemAtalhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtalhosActionPerformed(evt);
            }
        });
        jMenuItemAtalhos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemAtalhosKeyPressed(evt);
            }
        });
        jMenuSobre.add(jMenuItemAtalhos);

        jMenuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0));
        jMenuItemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about 20x20.png"))); // NOI18N
        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItemSobre);

        jMenuBarMenus.add(jMenuSobre);

        setJMenuBar(jMenuBarMenus);

        getAccessibleContext().setAccessibleDescription("Gerenciador");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Permite abrir a tela de visualização com click duplo no item
    private void cliqueDuplo(){
        jListSenhasCadastradas.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2){
                    visualizar();
                }
            }          
        });
    }
    
    //Atualiza a interface com a lista de cadastros
    public void RefazerJList(){
        //Limpa o Jlist que lista os cadastro
        jListSenhasCadastradas.clearSelection();
        //Atualiza o vector com as lista de cadastros
        senhas_cadastradas = Senha.getVisões(Usuário.buscar_Usuário_Todos_os_dados(userLogado).getID());
        //Recria o Jlist que lista os cadastros de senhas com o vector atualizado
        jListSenhasCadastradas.setModel(new DefaultComboBoxModel(senhas_cadastradas));
    }
    
    //Cria a tela de gerenciamento de usuário
    private void gestão_de_Usuário(){
        Gerenciar_User gerenciar_User_Frame = new Gerenciar_User(userLogado);
        gerenciar_User_Frame.setLayout(new BorderLayout());
        gerenciar_User_Frame.setLocationRelativeTo(null);
        gerenciar_User_Frame.setResizable(false);
        gerenciar_User_Frame.setVisible(true);
        gerenciar_User_Frame.setAlwaysOnTop(true);   
    }
    
    //Cria a tela de login
    private void login(){
        //Loginfra logindialogo = new Login(this,true);
        Login logindialogo = new Login();
        logindialogo.setLocationRelativeTo(null);
        logindialogo.setResizable(false);
        logindialogo.setVisible(true);
        //Recria a Lista de senhas cadastradas na tela
        RefazerJList();
    }
    
    //Cria a janela de novo cadastro de senha
    private void buscar(){
        //Criar uma nova janela, para buscar dados
        Buscar novaJanelaBuscar = new Buscar(this,true, Usuário.buscar_Usuário_Todos_os_dados(userLogado));
        novaJanelaBuscar.setLocationRelativeTo(null);
        novaJanelaBuscar.setResizable(false);
        novaJanelaBuscar.setVisible(true);
        //Recria a Lista de senhas cadastradas na tela
        RefazerJList();
    }
    
    //Cria a janela de novo cadastro de senha
    private void novo(){
        //Criar uma nova janela, para adicionar dados
        Novo novodialogo = new Novo(this,true, Usuário.buscar_Usuário_Todos_os_dados(userLogado));
        novodialogo.setLocationRelativeTo(null);
        novodialogo.setResizable(false);
        novodialogo.setVisible(true);
        //Recria a Lista de senhas cadastradas na tela
        RefazerJList();
    }
    
    //Cria a janela de visualização de cadastro
    private void visualizar(){
        //Capturar o item selecionado
        int item = jListSenhasCadastradas.getSelectedIndex();
        //checar se algum item foi selecionado
        if(jListSenhasCadastradas.getSelectedIndex()<0){
            JOptionPane.showMessageDialog(this, "Por gentileza selecione uma senha para visualizar", "ERRO",
            JOptionPane.ERROR_MESSAGE);
        } else {
            //Criar uma nova janela, para visualizar a senha que foi selecionada
            Visualizar visualizardialogo = new Visualizar(this,true,item, Usuário.buscar_Usuário_Todos_os_dados(userLogado), senhas_cadastradas);
            visualizardialogo.setLocationRelativeTo(null);
            visualizardialogo.setResizable(false);
            visualizardialogo.setVisible(true);
        }
    }
    
    //Cria a janela de atualização de cadastro
    private void atualizar(){
        //Capturar o item selecionado
        int item = jListSenhasCadastradas.getSelectedIndex();
        //checar se algum item foi selecionado
        if(jListSenhasCadastradas.getSelectedIndex()<0){
            JOptionPane.showMessageDialog(this, "Por gentileza selecione uma senha para atualizar", "ERRO",
            JOptionPane.ERROR_MESSAGE);
        } else {
            //Criar uma nova janela, para visualizar a senha que foi selecionada
            Atualizar atualizardialogo = new Atualizar(this,true,item, Usuário.buscar_Usuário_Todos_os_dados(userLogado), senhas_cadastradas);
            atualizardialogo.setLocationRelativeTo(null);
            atualizardialogo.setResizable(false);
            atualizardialogo.setVisible(true);
            //Recria a Lista de senhas cadastradas na tela
            RefazerJList();
        }
    }
    
    //Cria a janela de exclusão do cadastro selecionado
    private void excluir(){
        //Capta qual foi o intem selecionado 
        int item = jListSenhasCadastradas.getSelectedIndex();
        if(jListSenhasCadastradas.getSelectedIndex()<0){
            JOptionPane.showMessageDialog(this, "Por gentileza selecione uma senha para excluir", "ERRO",
            JOptionPane.ERROR_MESSAGE);
        } else {
            //Criar uma nova janela, para visualizar dados
            Excluir excluirdialogo = new Excluir(this,true,item, Usuário.buscar_Usuário_Todos_os_dados(userLogado), senhas_cadastradas);
            excluirdialogo.setLocationRelativeTo(null);
            excluirdialogo.setResizable(false);
            excluirdialogo.setVisible(true);
            //Recria a Lista de senhas cadastradas na tela
            RefazerJList();
        }
    }
    
    private void jMenuItemAtalhosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemAtalhosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemAtalhosKeyPressed
    
    private void jMenuItemAtalhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtalhosActionPerformed
        // TODO add your handling code here:
        //Chama a janela que lista os atalhos do programa
        new controladorAtalhos ();
    }//GEN-LAST:event_jMenuItemAtalhosActionPerformed
    
    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        // TODO add your handling code here:
        //Cria a janela sobre do programa
        new controladorSobre ();
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        //Encerra o programa
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirActionPerformed
        // TODO add your handling code here:
        //Solicita a criação da janela de exclusão do cadastro selecionado
        excluir();
    }//GEN-LAST:event_jMenuItemExcluirActionPerformed

    private void jMenuItemAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtualizarActionPerformed
        // TODO add your handling code here:
        //Solicita a criação da janela de atualização do cadastro selecionado
        atualizar();
    }//GEN-LAST:event_jMenuItemAtualizarActionPerformed

    private void jMenuItemVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarActionPerformed
        // TODO add your handling code here:
        //Solicita a criação da janela de visualização do cadastro selecionado
        visualizar();
    }//GEN-LAST:event_jMenuItemVisualizarActionPerformed

    private void jMenuItemNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoActionPerformed
        // TODO add your handling code here:
        //Solicita a criação da janela de criação de novo cadastro de senha
        novo();
    }//GEN-LAST:event_jMenuItemNovoActionPerformed

    private void jMenuItemBotão_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBotão_SairActionPerformed
        // TODO add your handling code here:
        //Encerra o programa
        System.exit(0);
    }//GEN-LAST:event_jMenuItemBotão_SairActionPerformed

    private void jMenuItemTrocar_UsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTrocar_UsuárioActionPerformed
        // TODO add your handling code here:
        //Descarta a tela atual
        this.dispose();
        //Invoca a tela de login
        login();
    }//GEN-LAST:event_jMenuItemTrocar_UsuárioActionPerformed

    private void jMenuItemGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerenciarActionPerformed
        // TODO add your handling code here:
        gestão_de_Usuário();
        
    }//GEN-LAST:event_jMenuItemGerenciarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        //Refaz a lista de cadastro na tela principal
        RefazerJList();
        buscar();
        RefazerJList();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        //Solicita a criação da janela de criação de novo cadastro de senha
        novo();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed
        // TODO add your handling code here:
        //Solicita a criação da janela de visualização do cadastro selecionado
        visualizar();
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
        //Solicita a criação da janela de atualização do cadastro selecionado
        atualizar();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        //Solicita a criação da janela de exclusão do cadastro selecionado
        excluir();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        //Encerra o programa
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(Blu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Blu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Blu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Blu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                String nomeUser = null;
                Blu1 JanelaNote =  new Blu1(nomeUser);
                //JanelaNote.setLayout(new BorderLayout());
                //JanelaNote.setLocationRelativeTo(null);
                //JanelaNote.setResizable(false);
                //JanelaNote.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButtonAtualizar;
    javax.swing.JButton jButtonBuscar;
    javax.swing.JButton jButtonExcluir;
    javax.swing.JButton jButtonNovo;
    javax.swing.JButton jButtonSair;
    javax.swing.JButton jButtonVisualizar;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabelFundoListagem;
    public javax.swing.JList jListSenhasCadastradas;
    javax.swing.JMenuBar jMenuBarMenus;
    javax.swing.JMenu jMenuEditar;
    javax.swing.JMenuItem jMenuItemAtalhos;
    javax.swing.JMenuItem jMenuItemAtualizar;
    javax.swing.JMenuItem jMenuItemBotão_Sair;
    javax.swing.JMenuItem jMenuItemExcluir;
    javax.swing.JMenuItem jMenuItemGerenciar;
    javax.swing.JMenuItem jMenuItemNovo;
    javax.swing.JMenuItem jMenuItemSair;
    javax.swing.JMenuItem jMenuItemSobre;
    javax.swing.JMenuItem jMenuItemTrocar_Usuário;
    javax.swing.JMenuItem jMenuItemVisualizar;
    javax.swing.JMenu jMenuMenuUsuário;
    javax.swing.JMenu jMenuSobre;
    javax.swing.JPanel jPanelBotões;
    javax.swing.JPanel jPanelListagem;
    javax.swing.JScrollPane jScrollPaneListadeSenhas;
    // End of variables declaration//GEN-END:variables
}
