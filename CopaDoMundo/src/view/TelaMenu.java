package view;


import code.Icone;

import view.TelaLogin;

public class TelaMenu extends javax.swing.JFrame {

    public TelaMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        Icone icon = new Icone();
        icon.InserirIcone(this);
        user();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logOff = new code.Botao();
        nomeDoUsuario = new javax.swing.JLabel();
        telaFundo = new javax.swing.JDesktopPane();
        lblFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        times = new javax.swing.JMenu();
        selecoes = new javax.swing.JMenuItem();
        grupos = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        gruposOficiais = new javax.swing.JMenuItem();
        simulacao = new javax.swing.JMenu();
        simulacaoOficial = new javax.swing.JMenuItem();
        configuracao = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 0, 17)); // NOI18N
        jLabel1.setText("Sistema Simulação Copa Do Mundo - Sistema Desenvolvido Por Custom World Cup");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Custom World Cup");

        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuário:");

        jLabel5.setFont(new java.awt.Font("Ubuntu Mono", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Acesso:");

        jLabel6.setFont(new java.awt.Font("Ubuntu Mono", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Admin");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo2D.png"))); // NOI18N

        logOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        logOff.setText("LogOff");
        logOff.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        logOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOffActionPerformed(evt);
            }
        });

        nomeDoUsuario.setFont(new java.awt.Font("Ubuntu Mono", 0, 18)); // NOI18N
        nomeDoUsuario.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 155, Short.MAX_VALUE)
                .addComponent(logOff, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(nomeDoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomeDoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(57, 57, 57)
                .addComponent(logOff, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        telaFundo.setBackground(new java.awt.Color(51, 51, 51));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagensfundo/1.jpg"))); // NOI18N

        telaFundo.setLayer(lblFundo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout telaFundoLayout = new javax.swing.GroupLayout(telaFundo);
        telaFundo.setLayout(telaFundoLayout);
        telaFundoLayout.setHorizontalGroup(
            telaFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        telaFundoLayout.setVerticalGroup(
            telaFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        times.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brasil.png"))); // NOI18N
        times.setText("Times           |");
        times.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N

        selecoes.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        selecoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/gbwlswalesflag_111786.png"))); // NOI18N
        selecoes.setText("Seleções");
        selecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecoesActionPerformed(evt);
            }
        });
        times.add(selecoes);

        jMenuBar1.add(times);

        grupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/qatar.png"))); // NOI18N
        grupos.setText("Grupos           |");
        grupos.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/croatia_icon_127840.png"))); // NOI18N
        jMenu1.setText("Grupos Oficiais");
        jMenu1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N

        gruposOficiais.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        gruposOficiais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/uyuruguayflag_111803.png"))); // NOI18N
        gruposOficiais.setText("Copa Do Mundo 2022");
        gruposOficiais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruposOficiaisActionPerformed(evt);
            }
        });
        jMenu1.add(gruposOficiais);

        grupos.add(jMenu1);

        jMenuBar1.add(grupos);

        simulacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/world-cup.png"))); // NOI18N
        simulacao.setText("Simulação           |");
        simulacao.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N

        simulacaoOficial.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        simulacaoOficial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/cameroon_icon_127792.png"))); // NOI18N
        simulacaoOficial.setText("Simulação");
        simulacaoOficial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulacaoOficialActionPerformed(evt);
            }
        });
        simulacao.add(simulacaoOficial);

        jMenuBar1.add(simulacao);

        configuracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/configuracao-da-roda-dentada.png"))); // NOI18N
        configuracao.setText("Configurações           |");
        configuracao.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ios-8-Help-icon_43821.png"))); // NOI18N
        jMenu4.setText("Sobre");
        jMenu4.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_sistema.png"))); // NOI18N
        jMenuItem1.setText("Como Jogar");
        jMenu4.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_sistema.png"))); // NOI18N
        jMenuItem2.setText("Informações Sobre Projeto");
        jMenu4.add(jMenuItem2);

        configuracao.add(jMenu4);

        jMenuBar1.add(configuracao);

        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        sair.setText("Sair");
        sair.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        jMenuBar1.add(sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telaFundo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecoesActionPerformed
        Selecoes times = new Selecoes();
        telaFundo.add(times);
        times.setVisible(true);
    }//GEN-LAST:event_selecoesActionPerformed

    private void gruposOficiaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruposOficiaisActionPerformed
        GruposOficiais grupo = new GruposOficiais();
        telaFundo.add(grupo);
        grupo.setVisible(true);
    }//GEN-LAST:event_gruposOficiaisActionPerformed

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_sairMouseClicked

    private void simulacaoOficialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulacaoOficialActionPerformed
        SimulacaoOficial simularCopaOficial = new SimulacaoOficial();
        telaFundo.add(simularCopaOficial);
        simularCopaOficial.setVisible(true);
    }//GEN-LAST:event_simulacaoOficialActionPerformed

    private void logOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOffActionPerformed
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOffActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu configuracao;
    private javax.swing.JMenu grupos;
    private javax.swing.JMenuItem gruposOficiais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblFundo;
    private code.Botao logOff;
    private javax.swing.JLabel nomeDoUsuario;
    private javax.swing.JMenu sair;
    private javax.swing.JMenuItem selecoes;
    private javax.swing.JMenu simulacao;
    private javax.swing.JMenuItem simulacaoOficial;
    private javax.swing.JDesktopPane telaFundo;
    private javax.swing.JMenu times;
    // End of variables declaration//GEN-END:variables

   public void user(){
       TelaLogin usuario = new TelaLogin();
       String nome = usuario.pegaNome();
       System.out.println(nome + "menu");
       
       
   }

}
