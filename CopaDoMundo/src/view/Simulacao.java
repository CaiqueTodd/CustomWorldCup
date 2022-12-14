package view;

import java.util.ArrayList;
import code.SimulacaoCode;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Simulacao extends javax.swing.JFrame {

    public Simulacao() {
        initComponents();
        GrupoOficial();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fundoTela = new javax.swing.JLabel();
        grupoG = new javax.swing.JPanel();
        G = new javax.swing.JLabel();
        brasil = new javax.swing.JLabel();
        servia = new javax.swing.JLabel();
        suica = new javax.swing.JLabel();
        camaroes = new javax.swing.JLabel();
        semifinal2 = new javax.swing.JPanel();
        semifinalBUm = new javax.swing.JLabel();
        semifinalBDois = new javax.swing.JLabel();
        resultadoSemifinalQuatro = new javax.swing.JLabel();
        resultadoSemifinalTres = new javax.swing.JLabel();
        grupoD = new javax.swing.JPanel();
        D = new javax.swing.JLabel();
        franca = new javax.swing.JLabel();
        australia = new javax.swing.JLabel();
        dinamarca = new javax.swing.JLabel();
        tunisia = new javax.swing.JLabel();
        grupoH = new javax.swing.JPanel();
        H = new javax.swing.JLabel();
        portugual = new javax.swing.JLabel();
        gana = new javax.swing.JLabel();
        uruguai = new javax.swing.JLabel();
        coreiaDoSul = new javax.swing.JLabel();
        quartas3 = new javax.swing.JPanel();
        quartasCUm = new javax.swing.JLabel();
        quartasCDois = new javax.swing.JLabel();
        resultadoQuartasCinco = new javax.swing.JLabel();
        resultadoQuartasSeis = new javax.swing.JLabel();
        final1 = new javax.swing.JPanel();
        finalTimeUm = new javax.swing.JLabel();
        finalTimeDois = new javax.swing.JLabel();
        resultadoFinalDois = new javax.swing.JLabel();
        resultadoFinalUm = new javax.swing.JLabel();
        grupoA = new javax.swing.JPanel();
        A = new javax.swing.JLabel();
        qatar = new javax.swing.JLabel();
        equador = new javax.swing.JLabel();
        senegal = new javax.swing.JLabel();
        holanda = new javax.swing.JLabel();
        oitavas7 = new javax.swing.JPanel();
        oitavasGrupoG1 = new javax.swing.JLabel();
        oitavasGrupoG2 = new javax.swing.JLabel();
        resultadoOitavasTreze = new javax.swing.JLabel();
        resultadoOitavasQuartoze = new javax.swing.JLabel();
        grupoE = new javax.swing.JPanel();
        E = new javax.swing.JLabel();
        espanha = new javax.swing.JLabel();
        costaRica = new javax.swing.JLabel();
        alemanha = new javax.swing.JLabel();
        japao = new javax.swing.JLabel();
        oitavas3 = new javax.swing.JPanel();
        oitavasGrupoC1 = new javax.swing.JLabel();
        oitavasGrupoC2 = new javax.swing.JLabel();
        resultadoOitavasCinco = new javax.swing.JLabel();
        resultadoOitavasSeis = new javax.swing.JLabel();
        quartas4 = new javax.swing.JPanel();
        quartasDUm = new javax.swing.JLabel();
        quartasDDois = new javax.swing.JLabel();
        resultadoQuartasOito = new javax.swing.JLabel();
        resultadoQuartasSete = new javax.swing.JLabel();
        oitavas8 = new javax.swing.JPanel();
        oitavasGrupoH1 = new javax.swing.JLabel();
        oitavasGrupoH2 = new javax.swing.JLabel();
        resultadoOitavasQuinze = new javax.swing.JLabel();
        resultadoOitavasDezesseis = new javax.swing.JLabel();
        oitavas4 = new javax.swing.JPanel();
        oitavasGrupoD1 = new javax.swing.JLabel();
        oitavasGrupoD2 = new javax.swing.JLabel();
        resultadoOitavasSete = new javax.swing.JLabel();
        resultadoOitavasOito = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        grupoB = new javax.swing.JPanel();
        B = new javax.swing.JLabel();
        inglaterra = new javax.swing.JLabel();
        ira = new javax.swing.JLabel();
        usa = new javax.swing.JLabel();
        gales = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        grupoF = new javax.swing.JPanel();
        F = new javax.swing.JLabel();
        belgica = new javax.swing.JLabel();
        canada = new javax.swing.JLabel();
        marracos = new javax.swing.JLabel();
        croacia = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        sair = new code.Botao();
        simular = new javax.swing.JButton();
        quartas1 = new javax.swing.JPanel();
        quartasAUm = new javax.swing.JLabel();
        quartasADois = new javax.swing.JLabel();
        resultadoQuartasUm = new javax.swing.JLabel();
        resultadoQuartasDois = new javax.swing.JLabel();
        semifinal1 = new javax.swing.JPanel();
        semifinalAUm = new javax.swing.JLabel();
        semifinalADois = new javax.swing.JLabel();
        resultadoSemifinalDois = new javax.swing.JLabel();
        resultadoSemifinalUm = new javax.swing.JLabel();
        grupoC = new javax.swing.JPanel();
        C = new javax.swing.JLabel();
        argentina = new javax.swing.JLabel();
        arabiaSaudita = new javax.swing.JLabel();
        mexico = new javax.swing.JLabel();
        polonia = new javax.swing.JLabel();
        oitavas5 = new javax.swing.JPanel();
        oitavasGrupoE1 = new javax.swing.JLabel();
        oitavasGrupoE2 = new javax.swing.JLabel();
        resultadoOitavasNove = new javax.swing.JLabel();
        resultadoOitavasDez = new javax.swing.JLabel();
        oitavas1 = new javax.swing.JPanel();
        oitavasGrupoA1 = new javax.swing.JLabel();
        oitavasGrupoA2 = new javax.swing.JLabel();
        resultadoOitavasUm = new javax.swing.JLabel();
        resultadoOitavasDois = new javax.swing.JLabel();
        quartas2 = new javax.swing.JPanel();
        quartasBUm = new javax.swing.JLabel();
        quartasBDois = new javax.swing.JLabel();
        resultadoQuartasQuatro = new javax.swing.JLabel();
        resultadoQuartasTres = new javax.swing.JLabel();
        oitavas6 = new javax.swing.JPanel();
        oitavasGrupoF1 = new javax.swing.JLabel();
        oitavasGrupoF2 = new javax.swing.JLabel();
        resultadoOitavasOnze = new javax.swing.JLabel();
        resultadoOitavasDoze = new javax.swing.JLabel();
        oitavas2 = new javax.swing.JPanel();
        oitavasGrupoB1 = new javax.swing.JLabel();
        oitavasGrupoB2 = new javax.swing.JLabel();
        resultadoOitavasTres = new javax.swing.JLabel();
        resultadoOitavasQuatro = new javax.swing.JLabel();
        campeao = new javax.swing.JPanel();
        timeCampeao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1630, 750));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1630, 750));

        fundoTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagensfundo/simublackwhite.jpg"))); // NOI18N

        grupoG.setBackground(new java.awt.Color(51, 51, 51));
        grupoG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        grupoG.setPreferredSize(new java.awt.Dimension(170, 216));

        G.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        G.setForeground(new java.awt.Color(255, 255, 255));
        G.setText("G");

        brasil.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        brasil.setForeground(new java.awt.Color(255, 255, 255));
        brasil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/brazil_icon_127818.png"))); // NOI18N

        servia.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        servia.setForeground(new java.awt.Color(255, 255, 255));
        servia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/serbia_icon_127829.png"))); // NOI18N

        suica.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        suica.setForeground(new java.awt.Color(255, 255, 255));
        suica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/switzerland_icon_127871.png"))); // NOI18N

        camaroes.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        camaroes.setForeground(new java.awt.Color(255, 255, 255));
        camaroes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/cameroon_icon_127792.png"))); // NOI18N

        javax.swing.GroupLayout grupoGLayout = new javax.swing.GroupLayout(grupoG);
        grupoG.setLayout(grupoGLayout);
        grupoGLayout.setHorizontalGroup(
            grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoGLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brasil)
                    .addComponent(camaroes)
                    .addComponent(servia)
                    .addComponent(suica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(G)
                .addGap(17, 17, 17))
        );
        grupoGLayout.setVerticalGroup(
            grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoGLayout.createSequentialGroup()
                .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoGLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(G))
                    .addGroup(grupoGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(brasil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(servia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(suica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(camaroes)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        semifinal2.setBackground(new java.awt.Color(51, 51, 51));
        semifinal2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        semifinal2.setPreferredSize(new java.awt.Dimension(170, 216));

        semifinalBUm.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        semifinalBUm.setForeground(new java.awt.Color(255, 255, 255));

        semifinalBDois.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        semifinalBDois.setForeground(new java.awt.Color(255, 255, 255));

        resultadoSemifinalQuatro.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoSemifinalQuatro.setForeground(new java.awt.Color(255, 255, 255));

        resultadoSemifinalTres.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoSemifinalTres.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout semifinal2Layout = new javax.swing.GroupLayout(semifinal2);
        semifinal2.setLayout(semifinal2Layout);
        semifinal2Layout.setHorizontalGroup(
            semifinal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(semifinal2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(semifinal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semifinalBDois, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(semifinalBUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(semifinal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoSemifinalTres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoSemifinalQuatro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        semifinal2Layout.setVerticalGroup(
            semifinal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, semifinal2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(semifinal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(semifinal2Layout.createSequentialGroup()
                        .addComponent(resultadoSemifinalTres, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultadoSemifinalQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(semifinal2Layout.createSequentialGroup()
                        .addComponent(semifinalBUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(semifinalBDois, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        grupoD.setBackground(new java.awt.Color(51, 51, 51));
        grupoD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        grupoD.setPreferredSize(new java.awt.Dimension(170, 216));

        D.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        D.setForeground(new java.awt.Color(255, 255, 255));
        D.setText("D");

        franca.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        franca.setForeground(new java.awt.Color(255, 255, 255));
        franca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/france_icon_127830.png"))); // NOI18N

        australia.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        australia.setForeground(new java.awt.Color(255, 255, 255));
        australia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/australia_icon_127744.png"))); // NOI18N

        dinamarca.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        dinamarca.setForeground(new java.awt.Color(255, 255, 255));
        dinamarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/denmark_icon_127836.png"))); // NOI18N

        tunisia.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        tunisia.setForeground(new java.awt.Color(255, 255, 255));
        tunisia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/tunisia_icon_127788.png"))); // NOI18N

        javax.swing.GroupLayout grupoDLayout = new javax.swing.GroupLayout(grupoD);
        grupoD.setLayout(grupoDLayout);
        grupoDLayout.setHorizontalGroup(
            grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoDLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(D)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(australia)
                    .addComponent(franca)
                    .addComponent(dinamarca)
                    .addComponent(tunisia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        grupoDLayout.setVerticalGroup(
            grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(franca)
                .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoDLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(australia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dinamarca))
                    .addGroup(grupoDLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(D)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tunisia)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        grupoH.setBackground(new java.awt.Color(51, 51, 51));
        grupoH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        grupoH.setPreferredSize(new java.awt.Dimension(170, 216));

        H.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        H.setForeground(new java.awt.Color(255, 255, 255));
        H.setText("H");

        portugual.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        portugual.setForeground(new java.awt.Color(255, 255, 255));
        portugual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/portugal_icon_127827.png"))); // NOI18N

        gana.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        gana.setForeground(new java.awt.Color(255, 255, 255));
        gana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/ghana_icon_127776.png"))); // NOI18N

        uruguai.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        uruguai.setForeground(new java.awt.Color(255, 255, 255));
        uruguai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/uyuruguayflag_111803.png"))); // NOI18N

        coreiaDoSul.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        coreiaDoSul.setForeground(new java.awt.Color(255, 255, 255));
        coreiaDoSul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/south_korea_icon_127918.png"))); // NOI18N

        javax.swing.GroupLayout grupoHLayout = new javax.swing.GroupLayout(grupoH);
        grupoH.setLayout(grupoHLayout);
        grupoHLayout.setHorizontalGroup(
            grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoHLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoHLayout.createSequentialGroup()
                        .addComponent(portugual)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(grupoHLayout.createSequentialGroup()
                        .addComponent(coreiaDoSul)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(grupoHLayout.createSequentialGroup()
                        .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uruguai)
                            .addComponent(gana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(H)
                        .addGap(15, 15, 15))))
        );
        grupoHLayout.setVerticalGroup(
            grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoHLayout.createSequentialGroup()
                .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoHLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(portugual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uruguai))
                    .addGroup(grupoHLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(H)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coreiaDoSul)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        quartas3.setBackground(new java.awt.Color(51, 51, 51));
        quartas3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quartas3.setPreferredSize(new java.awt.Dimension(170, 216));

        quartasCUm.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        quartasCUm.setForeground(new java.awt.Color(255, 255, 255));

        quartasCDois.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        quartasCDois.setForeground(new java.awt.Color(255, 255, 255));

        resultadoQuartasCinco.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoQuartasCinco.setForeground(new java.awt.Color(255, 255, 255));

        resultadoQuartasSeis.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoQuartasSeis.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout quartas3Layout = new javax.swing.GroupLayout(quartas3);
        quartas3.setLayout(quartas3Layout);
        quartas3Layout.setHorizontalGroup(
            quartas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quartas3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quartas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quartasCDois, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(quartasCUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quartas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoQuartasCinco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoQuartasSeis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        quartas3Layout.setVerticalGroup(
            quartas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quartas3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quartas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quartasCUm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoQuartasCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(quartas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quartasCDois, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoQuartasSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        final1.setBackground(new java.awt.Color(51, 51, 51));
        final1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        final1.setPreferredSize(new java.awt.Dimension(170, 216));

        finalTimeUm.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        finalTimeUm.setForeground(new java.awt.Color(255, 255, 255));

        finalTimeDois.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        finalTimeDois.setForeground(new java.awt.Color(255, 255, 255));

        resultadoFinalDois.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoFinalDois.setForeground(new java.awt.Color(255, 255, 255));

        resultadoFinalUm.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoFinalUm.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout final1Layout = new javax.swing.GroupLayout(final1);
        final1.setLayout(final1Layout);
        final1Layout.setHorizontalGroup(
            final1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(final1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(final1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalTimeDois, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(finalTimeUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(final1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoFinalUm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoFinalDois, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        final1Layout.setVerticalGroup(
            final1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, final1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(final1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultadoFinalUm, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(finalTimeUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(final1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultadoFinalDois, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(finalTimeDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        grupoA.setBackground(new java.awt.Color(51, 51, 51));
        grupoA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        grupoA.setPreferredSize(new java.awt.Dimension(170, 216));

        A.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        A.setForeground(new java.awt.Color(255, 255, 255));
        A.setText("A");

        qatar.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        qatar.setForeground(new java.awt.Color(255, 255, 255));
        qatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/qatar_icon_127877.png"))); // NOI18N

        equador.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        equador.setForeground(new java.awt.Color(255, 255, 255));
        equador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/ecuador_icon_127819.png"))); // NOI18N

        senegal.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        senegal.setForeground(new java.awt.Color(255, 255, 255));
        senegal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/senegal_icon_127802.png"))); // NOI18N

        holanda.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        holanda.setForeground(new java.awt.Color(255, 255, 255));
        holanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/netherlands_icon_127838.png"))); // NOI18N

        javax.swing.GroupLayout grupoALayout = new javax.swing.GroupLayout(grupoA);
        grupoA.setLayout(grupoALayout);
        grupoALayout.setHorizontalGroup(
            grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grupoALayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(A)
                .addGap(18, 18, 18)
                .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(holanda)
                    .addComponent(senegal)
                    .addComponent(equador)
                    .addComponent(qatar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        grupoALayout.setVerticalGroup(
            grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grupoALayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(qatar)
                .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoALayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(equador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(senegal))
                    .addGroup(grupoALayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(A)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(holanda)
                .addContainerGap())
        );

        oitavas7.setBackground(new java.awt.Color(51, 51, 51));
        oitavas7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        oitavas7.setPreferredSize(new java.awt.Dimension(170, 216));

        oitavasGrupoG1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoG1.setForeground(new java.awt.Color(255, 255, 255));

        oitavasGrupoG2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoG2.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasTreze.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasTreze.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasQuartoze.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasQuartoze.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout oitavas7Layout = new javax.swing.GroupLayout(oitavas7);
        oitavas7.setLayout(oitavas7Layout);
        oitavas7Layout.setHorizontalGroup(
            oitavas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oitavas7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oitavas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoG2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(oitavasGrupoG1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(oitavas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoOitavasTreze, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoOitavasQuartoze, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        oitavas7Layout.setVerticalGroup(
            oitavas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oitavas7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oitavas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoG1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoOitavasTreze, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(oitavas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoG2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(oitavas7Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(resultadoOitavasQuartoze, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        grupoE.setBackground(new java.awt.Color(51, 51, 51));
        grupoE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        grupoE.setPreferredSize(new java.awt.Dimension(170, 216));

        E.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        E.setForeground(new java.awt.Color(255, 255, 255));
        E.setText("E");

        espanha.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        espanha.setForeground(new java.awt.Color(255, 255, 255));
        espanha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/spain_icon_127825.png"))); // NOI18N

        costaRica.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        costaRica.setForeground(new java.awt.Color(255, 255, 255));
        costaRica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/costa_rica_icon_127928.png"))); // NOI18N

        alemanha.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        alemanha.setForeground(new java.awt.Color(255, 255, 255));
        alemanha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/Germany_29761.png"))); // NOI18N

        japao.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        japao.setForeground(new java.awt.Color(255, 255, 255));
        japao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/jpjapanflag_111832.png"))); // NOI18N

        javax.swing.GroupLayout grupoELayout = new javax.swing.GroupLayout(grupoE);
        grupoE.setLayout(grupoELayout);
        grupoELayout.setHorizontalGroup(
            grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoELayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoELayout.createSequentialGroup()
                        .addComponent(japao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(grupoELayout.createSequentialGroup()
                        .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(espanha)
                            .addGroup(grupoELayout.createSequentialGroup()
                                .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(costaRica)
                                    .addComponent(alemanha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                                .addComponent(E)))
                        .addContainerGap())))
        );
        grupoELayout.setVerticalGroup(
            grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(espanha)
                .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoELayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(costaRica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alemanha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(grupoELayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(E)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(japao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        oitavas3.setBackground(new java.awt.Color(51, 51, 51));
        oitavas3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        oitavas3.setPreferredSize(new java.awt.Dimension(170, 216));

        oitavasGrupoC1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoC1.setForeground(new java.awt.Color(255, 255, 255));

        oitavasGrupoC2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoC2.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasCinco.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasCinco.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasSeis.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasSeis.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout oitavas3Layout = new javax.swing.GroupLayout(oitavas3);
        oitavas3.setLayout(oitavas3Layout);
        oitavas3Layout.setHorizontalGroup(
            oitavas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oitavas3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oitavas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oitavasGrupoC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(oitavas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoOitavasSeis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoOitavasCinco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        oitavas3Layout.setVerticalGroup(
            oitavas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oitavas3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oitavas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultadoOitavasCinco, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(oitavasGrupoC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(oitavas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oitavasGrupoC2, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(resultadoOitavasSeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        quartas4.setBackground(new java.awt.Color(51, 51, 51));
        quartas4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quartas4.setPreferredSize(new java.awt.Dimension(170, 216));

        quartasDUm.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        quartasDUm.setForeground(new java.awt.Color(255, 255, 255));

        quartasDDois.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        quartasDDois.setForeground(new java.awt.Color(255, 255, 255));

        resultadoQuartasOito.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoQuartasOito.setForeground(new java.awt.Color(255, 255, 255));

        resultadoQuartasSete.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoQuartasSete.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout quartas4Layout = new javax.swing.GroupLayout(quartas4);
        quartas4.setLayout(quartas4Layout);
        quartas4Layout.setHorizontalGroup(
            quartas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quartas4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quartas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quartasDUm, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(quartasDDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quartas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoQuartasOito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoQuartasSete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        quartas4Layout.setVerticalGroup(
            quartas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quartas4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quartas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(quartas4Layout.createSequentialGroup()
                        .addComponent(resultadoQuartasSete, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultadoQuartasOito, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(quartas4Layout.createSequentialGroup()
                        .addComponent(quartasDUm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quartasDDois, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        oitavas8.setBackground(new java.awt.Color(51, 51, 51));
        oitavas8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        oitavas8.setPreferredSize(new java.awt.Dimension(170, 216));

        oitavasGrupoH1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoH1.setForeground(new java.awt.Color(255, 255, 255));

        oitavasGrupoH2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoH2.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasQuinze.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasQuinze.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasDezesseis.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasDezesseis.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout oitavas8Layout = new javax.swing.GroupLayout(oitavas8);
        oitavas8.setLayout(oitavas8Layout);
        oitavas8Layout.setHorizontalGroup(
            oitavas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oitavas8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oitavas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoH2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(oitavasGrupoH1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(oitavas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoOitavasQuinze, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoOitavasDezesseis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        oitavas8Layout.setVerticalGroup(
            oitavas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oitavas8Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(oitavas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoH1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoOitavasQuinze, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(oitavas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oitavasGrupoH2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoOitavasDezesseis, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        oitavas4.setBackground(new java.awt.Color(51, 51, 51));
        oitavas4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        oitavas4.setPreferredSize(new java.awt.Dimension(170, 216));

        oitavasGrupoD1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoD1.setForeground(new java.awt.Color(255, 255, 255));

        oitavasGrupoD2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoD2.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasSete.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasSete.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasOito.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasOito.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout oitavas4Layout = new javax.swing.GroupLayout(oitavas4);
        oitavas4.setLayout(oitavas4Layout);
        oitavas4Layout.setHorizontalGroup(
            oitavas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oitavas4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oitavas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoD2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(oitavasGrupoD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(oitavas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoOitavasSete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoOitavasOito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        oitavas4Layout.setVerticalGroup(
            oitavas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oitavas4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oitavas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultadoOitavasSete, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(oitavasGrupoD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addGroup(oitavas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoD2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoOitavasOito, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel83.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("OITAVAS");

        jLabel104.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("SEMIFINAL");

        grupoB.setBackground(new java.awt.Color(51, 51, 51));
        grupoB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        grupoB.setPreferredSize(new java.awt.Dimension(170, 216));

        B.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        B.setForeground(new java.awt.Color(255, 255, 255));
        B.setText("B");

        inglaterra.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        inglaterra.setForeground(new java.awt.Color(255, 255, 255));
        inglaterra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/gbengenglandflag_111695.png"))); // NOI18N

        ira.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        ira.setForeground(new java.awt.Color(255, 255, 255));
        ira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/iran_icon_127909.png"))); // NOI18N

        usa.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        usa.setForeground(new java.awt.Color(255, 255, 255));
        usa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/united_states_icon_127943.png"))); // NOI18N

        gales.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        gales.setForeground(new java.awt.Color(255, 255, 255));
        gales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/gbwlswalesflag_111786.png"))); // NOI18N

        javax.swing.GroupLayout grupoBLayout = new javax.swing.GroupLayout(grupoB);
        grupoB.setLayout(grupoBLayout);
        grupoBLayout.setHorizontalGroup(
            grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B)
                .addGap(15, 15, 15)
                .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gales)
                    .addComponent(ira)
                    .addComponent(inglaterra)
                    .addComponent(usa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        grupoBLayout.setVerticalGroup(
            grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoBLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(inglaterra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoBLayout.createSequentialGroup()
                        .addComponent(ira)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grupoBLayout.createSequentialGroup()
                        .addComponent(B)
                        .addGap(20, 20, 20)))
                .addComponent(gales)
                .addContainerGap())
        );

        jLabel105.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("QUARTAS");

        jLabel116.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("QUARTAS");

        grupoF.setBackground(new java.awt.Color(51, 51, 51));
        grupoF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        grupoF.setPreferredSize(new java.awt.Dimension(170, 216));

        F.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        F.setForeground(new java.awt.Color(255, 255, 255));
        F.setText("F");

        belgica.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        belgica.setForeground(new java.awt.Color(255, 255, 255));
        belgica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/belgium_icon_127865.png"))); // NOI18N

        canada.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        canada.setForeground(new java.awt.Color(255, 255, 255));
        canada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/canada_icon_127925.png"))); // NOI18N

        marracos.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        marracos.setForeground(new java.awt.Color(255, 255, 255));
        marracos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/morocco_icon_127773.png"))); // NOI18N

        croacia.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        croacia.setForeground(new java.awt.Color(255, 255, 255));
        croacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/croatia_icon_127840.png"))); // NOI18N

        javax.swing.GroupLayout grupoFLayout = new javax.swing.GroupLayout(grupoF);
        grupoF.setLayout(grupoFLayout);
        grupoFLayout.setHorizontalGroup(
            grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoFLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoFLayout.createSequentialGroup()
                        .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(belgica)
                            .addComponent(croacia))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(grupoFLayout.createSequentialGroup()
                        .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(canada)
                            .addComponent(marracos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(F)
                        .addGap(17, 17, 17))))
        );
        grupoFLayout.setVerticalGroup(
            grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(belgica)
                .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoFLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marracos))
                    .addGroup(grupoFLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(F)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(croacia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel117.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("FINAL");

        jLabel25.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("OITAVAS");

        jLabel118.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setText("SEMIFINAL");

        sair.setForeground(new java.awt.Color(255, 0, 0));
        sair.setText("SAIR");
        sair.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        simular.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        simular.setText("SIMULAR JOGOS");
        simular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        simular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simularActionPerformed(evt);
            }
        });

        quartas1.setBackground(new java.awt.Color(51, 51, 51));
        quartas1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quartas1.setPreferredSize(new java.awt.Dimension(170, 216));

        quartasAUm.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        quartasAUm.setForeground(new java.awt.Color(255, 255, 255));

        quartasADois.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        quartasADois.setForeground(new java.awt.Color(255, 255, 255));

        resultadoQuartasUm.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoQuartasUm.setForeground(new java.awt.Color(255, 255, 255));

        resultadoQuartasDois.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoQuartasDois.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout quartas1Layout = new javax.swing.GroupLayout(quartas1);
        quartas1.setLayout(quartas1Layout);
        quartas1Layout.setHorizontalGroup(
            quartas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quartas1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quartas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quartasAUm, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(quartasADois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quartas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoQuartasUm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoQuartasDois, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        quartas1Layout.setVerticalGroup(
            quartas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quartas1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quartas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quartasAUm, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(resultadoQuartasUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(quartas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quartasADois, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoQuartasDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        semifinal1.setBackground(new java.awt.Color(51, 51, 51));
        semifinal1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        semifinal1.setPreferredSize(new java.awt.Dimension(170, 216));

        semifinalAUm.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        semifinalAUm.setForeground(new java.awt.Color(255, 255, 255));

        semifinalADois.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        semifinalADois.setForeground(new java.awt.Color(255, 255, 255));

        resultadoSemifinalDois.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoSemifinalDois.setForeground(new java.awt.Color(255, 255, 255));

        resultadoSemifinalUm.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoSemifinalUm.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout semifinal1Layout = new javax.swing.GroupLayout(semifinal1);
        semifinal1.setLayout(semifinal1Layout);
        semifinal1Layout.setHorizontalGroup(
            semifinal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(semifinal1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(semifinal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semifinalADois, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(semifinalAUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(semifinal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoSemifinalUm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoSemifinalDois, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        semifinal1Layout.setVerticalGroup(
            semifinal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(semifinal1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(semifinal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultadoSemifinalUm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semifinalAUm, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(semifinal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semifinalADois, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoSemifinalDois, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        grupoC.setBackground(new java.awt.Color(51, 51, 51));
        grupoC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        grupoC.setPreferredSize(new java.awt.Dimension(170, 216));

        C.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setText("C");

        argentina.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        argentina.setForeground(new java.awt.Color(255, 255, 255));
        argentina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/argentina_icon_127814.png"))); // NOI18N

        arabiaSaudita.setBackground(new java.awt.Color(255, 255, 255));
        arabiaSaudita.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        arabiaSaudita.setForeground(new java.awt.Color(255, 255, 255));
        arabiaSaudita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/saudi_arabia_icon_127908.png"))); // NOI18N

        mexico.setBackground(new java.awt.Color(255, 255, 255));
        mexico.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        mexico.setForeground(new java.awt.Color(255, 255, 255));
        mexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/mexico_icon_127947.png"))); // NOI18N

        polonia.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        polonia.setForeground(new java.awt.Color(255, 255, 255));
        polonia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seleções/poland_icon_127852.png"))); // NOI18N

        javax.swing.GroupLayout grupoCLayout = new javax.swing.GroupLayout(grupoC);
        grupoC.setLayout(grupoCLayout);
        grupoCLayout.setHorizontalGroup(
            grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grupoCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(C)
                .addGap(13, 13, 13)
                .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(arabiaSaudita)
                    .addComponent(mexico, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(polonia, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(argentina, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        grupoCLayout.setVerticalGroup(
            grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(argentina)
                .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoCLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arabiaSaudita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mexico))
                    .addGroup(grupoCLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(C)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(polonia)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        oitavas5.setBackground(new java.awt.Color(51, 51, 51));
        oitavas5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        oitavas5.setPreferredSize(new java.awt.Dimension(170, 216));

        oitavasGrupoE1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoE1.setForeground(new java.awt.Color(255, 255, 255));

        oitavasGrupoE2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoE2.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasNove.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasNove.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasDez.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasDez.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout oitavas5Layout = new javax.swing.GroupLayout(oitavas5);
        oitavas5.setLayout(oitavas5Layout);
        oitavas5Layout.setHorizontalGroup(
            oitavas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oitavas5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oitavas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoE1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(oitavasGrupoE2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(oitavas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoOitavasDez, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoOitavasNove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        oitavas5Layout.setVerticalGroup(
            oitavas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oitavas5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oitavas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoE1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoOitavasNove, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(oitavas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoE2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(oitavas5Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(resultadoOitavasDez, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        oitavas1.setBackground(new java.awt.Color(51, 51, 51));
        oitavas1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        oitavas1.setPreferredSize(new java.awt.Dimension(170, 216));

        oitavasGrupoA1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoA1.setForeground(new java.awt.Color(255, 255, 255));

        oitavasGrupoA2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoA2.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasUm.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasUm.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasDois.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasDois.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout oitavas1Layout = new javax.swing.GroupLayout(oitavas1);
        oitavas1.setLayout(oitavas1Layout);
        oitavas1Layout.setHorizontalGroup(
            oitavas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oitavas1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oitavas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoA2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(oitavasGrupoA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(oitavas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoOitavasDois, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oitavas1Layout.createSequentialGroup()
                        .addComponent(resultadoOitavasUm, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        oitavas1Layout.setVerticalGroup(
            oitavas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oitavas1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oitavas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oitavasGrupoA1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(resultadoOitavasUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addGroup(oitavas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oitavasGrupoA2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(resultadoOitavasDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        quartas2.setBackground(new java.awt.Color(51, 51, 51));
        quartas2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quartas2.setPreferredSize(new java.awt.Dimension(170, 216));

        quartasBUm.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        quartasBUm.setForeground(new java.awt.Color(255, 255, 255));

        quartasBDois.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        quartasBDois.setForeground(new java.awt.Color(255, 255, 255));

        resultadoQuartasQuatro.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoQuartasQuatro.setForeground(new java.awt.Color(255, 255, 255));

        resultadoQuartasTres.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoQuartasTres.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout quartas2Layout = new javax.swing.GroupLayout(quartas2);
        quartas2.setLayout(quartas2Layout);
        quartas2Layout.setHorizontalGroup(
            quartas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quartas2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quartas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quartasBDois, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(quartasBUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quartas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoQuartasTres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoQuartasQuatro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        quartas2Layout.setVerticalGroup(
            quartas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quartas2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quartas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quartasBUm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoQuartasTres, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(quartas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quartasBDois, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoQuartasQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        oitavas6.setBackground(new java.awt.Color(51, 51, 51));
        oitavas6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        oitavas6.setPreferredSize(new java.awt.Dimension(170, 216));

        oitavasGrupoF1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoF1.setForeground(new java.awt.Color(255, 255, 255));

        oitavasGrupoF2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoF2.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasOnze.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasOnze.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasDoze.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasDoze.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout oitavas6Layout = new javax.swing.GroupLayout(oitavas6);
        oitavas6.setLayout(oitavas6Layout);
        oitavas6Layout.setHorizontalGroup(
            oitavas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oitavas6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oitavas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoF1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(oitavasGrupoF2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(oitavas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoOitavasDoze, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoOitavasOnze, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        oitavas6Layout.setVerticalGroup(
            oitavas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oitavas6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oitavas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(oitavas6Layout.createSequentialGroup()
                        .addComponent(resultadoOitavasOnze, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(oitavas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoF2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoOitavasDoze, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        oitavas2.setBackground(new java.awt.Color(51, 51, 51));
        oitavas2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        oitavas2.setPreferredSize(new java.awt.Dimension(170, 216));

        oitavasGrupoB1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoB1.setForeground(new java.awt.Color(255, 255, 255));

        oitavasGrupoB2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        oitavasGrupoB2.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasTres.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasTres.setForeground(new java.awt.Color(255, 255, 255));

        resultadoOitavasQuatro.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        resultadoOitavasQuatro.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout oitavas2Layout = new javax.swing.GroupLayout(oitavas2);
        oitavas2.setLayout(oitavas2Layout);
        oitavas2Layout.setHorizontalGroup(
            oitavas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oitavas2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oitavas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oitavasGrupoB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(oitavas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoOitavasTres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoOitavasQuatro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        oitavas2Layout.setVerticalGroup(
            oitavas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oitavas2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(oitavas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultadoOitavasTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oitavasGrupoB1, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(oitavas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oitavasGrupoB2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoOitavasQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        campeao.setBackground(new java.awt.Color(51, 51, 51));
        campeao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        campeao.setPreferredSize(new java.awt.Dimension(170, 216));

        timeCampeao.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        timeCampeao.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/world-cup.png"))); // NOI18N
        jLabel1.setText("Campeão");

        javax.swing.GroupLayout campeaoLayout = new javax.swing.GroupLayout(campeao);
        campeao.setLayout(campeaoLayout);
        campeaoLayout.setHorizontalGroup(
            campeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, campeaoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timeCampeao, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );
        campeaoLayout.setVerticalGroup(
            campeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campeaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(campeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeCampeao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campeao, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(504, 504, 504)
                                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(grupoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(grupoC, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(grupoD, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(grupoA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(oitavas2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                                .addComponent(oitavas3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                                .addComponent(oitavas4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(oitavas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(jLabel25)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel118)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(quartas1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(quartas2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(174, 174, 174)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel104)
                                                .addGap(154, 154, 154))
                                            .addComponent(quartas3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(quartas4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(semifinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(semifinal2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(157, 157, 157)
                                        .addComponent(simular, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel116)
                                        .addGap(56, 56, 56)
                                        .addComponent(final1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel105)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(oitavas7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(oitavas6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(oitavas8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(oitavas5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel83)
                                        .addGap(97, 97, 97)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(grupoF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(grupoG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grupoH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grupoE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel117)
                        .addGap(774, 774, 774)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(fundoTela, javax.swing.GroupLayout.PREFERRED_SIZE, 1636, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(campeao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel116)
                            .addComponent(jLabel105))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quartas1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quartas3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel118)
                            .addComponent(jLabel104))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(semifinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(quartas2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quartas4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(semifinal2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(simular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel117)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(oitavas1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(final1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel83)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(oitavas5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(grupoE, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(oitavas2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(oitavas6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(oitavas3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(oitavas4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(oitavas7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(oitavas8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(grupoA, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grupoB, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(grupoC, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(grupoD, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(grupoF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grupoG, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grupoH, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(fundoTela, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_sairActionPerformed

    private void simularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simularActionPerformed
        SimulacaoCode simularFase = new SimulacaoCode();

        ArrayList<String> grupoA = simularFase.faseDeGrupos(simularFase.grupoA);
        ArrayList<String> grupoB = simularFase.faseDeGrupos(simularFase.grupoB);
        ArrayList<String> grupoC = simularFase.faseDeGrupos(simularFase.grupoC);
        ArrayList<String> grupoD = simularFase.faseDeGrupos(simularFase.grupoD);
        ArrayList<String> grupoE = simularFase.faseDeGrupos(simularFase.grupoE);
        ArrayList<String> grupoF = simularFase.faseDeGrupos(simularFase.grupoF);
        ArrayList<String> grupoG = simularFase.faseDeGrupos(simularFase.grupoG);
        ArrayList<String> grupoH = simularFase.faseDeGrupos(simularFase.grupoH);

        ArrayList<String> oitavasPartidaUm = simularFase.partidas(grupoA.get(0), grupoB.get(1));
        ArrayList<String> oitavasPartidaDois = simularFase.partidas(grupoC.get(0), grupoD.get(1));
        ArrayList<String> oitavasPartidaTres = simularFase.partidas(grupoE.get(0), grupoF.get(1));
        ArrayList<String> oitavasPartidaQuatro = simularFase.partidas(grupoG.get(0), grupoH.get(1));
        ArrayList<String> oitavasPartidaCinco = simularFase.partidas(grupoB.get(0), grupoA.get(1));
        ArrayList<String> oitavasPartidaSeis = simularFase.partidas(grupoD.get(0), grupoC.get(1));
        ArrayList<String> oitavasPartidaSete = simularFase.partidas(grupoF.get(0), grupoE.get(1));
        ArrayList<String> oitavasPartidaOito = simularFase.partidas(grupoH.get(0), grupoG.get(1));

        ArrayList<String> quartasPartidaUm = simularFase.partidas(oitavasPartidaUm.get(0), oitavasPartidaDois.get(0));
        ArrayList<String> quartasPartidaDois = simularFase.partidas(oitavasPartidaTres.get(0), oitavasPartidaQuatro.get(0));
        ArrayList<String> quartasPartidaTres = simularFase.partidas(oitavasPartidaCinco.get(0), oitavasPartidaSeis.get(0));
        ArrayList<String> quartasPartidaQuatro = simularFase.partidas(oitavasPartidaSete.get(0), oitavasPartidaOito.get(0));

        ArrayList<String> semifinalUm = simularFase.partidas(quartasPartidaUm.get(0), quartasPartidaDois.get(0));
        ArrayList<String> semifinalDois = simularFase.partidas(quartasPartidaTres.get(0), quartasPartidaQuatro.get(0));

        ArrayList<String> finals = simularFase.partidas(semifinalUm.get(0), semifinalDois.get(0));

        oitavasGrupoA1.setText(grupoA.get(0));
        resultadoOitavasUm.setText(oitavasPartidaUm.get(1));
        oitavasGrupoA2.setText(grupoB.get(1));
        resultadoOitavasDois.setText(oitavasPartidaUm.get(2));
        

        oitavasGrupoB1.setText(grupoC.get(0));
        resultadoOitavasTres.setText(oitavasPartidaDois.get(1));
        oitavasGrupoB2.setText(grupoD.get(1));
        resultadoOitavasQuatro.setText(oitavasPartidaDois.get(2));
        
        
        oitavasGrupoC1.setText(grupoE.get(0));
        resultadoOitavasCinco.setText(oitavasPartidaTres.get(1));
        oitavasGrupoC2.setText(grupoF.get(1));
        resultadoOitavasSeis.setText(oitavasPartidaTres.get(2));
        
        
        oitavasGrupoD1.setText(grupoG.get(0));
        resultadoOitavasSete.setText(oitavasPartidaQuatro.get(1));
        oitavasGrupoD2.setText(grupoH.get(1));
        resultadoOitavasOito.setText(oitavasPartidaQuatro.get(2));

        oitavasGrupoE1.setText(grupoB.get(0));
        resultadoOitavasNove.setText(oitavasPartidaCinco.get(1));
        oitavasGrupoE2.setText(grupoA.get(1));
        resultadoOitavasDez.setText(oitavasPartidaCinco.get(2));
        
        
        oitavasGrupoF1.setText(grupoD.get(0));
        resultadoOitavasOnze.setText(oitavasPartidaSeis.get(1));
        oitavasGrupoF2.setText(grupoC.get(1));
        resultadoOitavasDoze.setText(oitavasPartidaSeis.get(2));
        
        
        
        oitavasGrupoG1.setText(grupoF.get(0));
        resultadoOitavasTreze.setText(oitavasPartidaSete.get(1));
        oitavasGrupoG2.setText(grupoE.get(1));
        resultadoOitavasQuartoze.setText(oitavasPartidaSete.get(2));
        
        
        oitavasGrupoH1.setText(grupoH.get(0));
        resultadoOitavasQuinze.setText(oitavasPartidaOito.get(1));
        oitavasGrupoH2.setText(grupoG.get(1));
        resultadoOitavasDezesseis.setText(oitavasPartidaOito.get(2));
        
        
        
        
        quartasAUm.setText(oitavasPartidaUm.get(0));
        resultadoQuartasUm.setText(quartasPartidaUm.get(1));
        quartasADois.setText(oitavasPartidaDois.get(0));
        resultadoQuartasDois.setText(quartasPartidaUm.get(2));

        
        quartasBUm.setText(oitavasPartidaTres.get(0));
        resultadoQuartasTres.setText(quartasPartidaDois.get(1));
        quartasBDois.setText(oitavasPartidaQuatro.get(0));
        resultadoQuartasQuatro.setText(quartasPartidaDois.get(2));

        
        quartasCUm.setText(oitavasPartidaCinco.get(0));
        resultadoQuartasCinco.setText(quartasPartidaTres.get(1));
        quartasCDois.setText(oitavasPartidaSeis.get(0));
        resultadoQuartasSeis.setText(quartasPartidaTres.get(2));

        
        quartasDUm.setText(oitavasPartidaSete.get(0));
        resultadoQuartasSete.setText(quartasPartidaQuatro.get(1));
        quartasDDois.setText(oitavasPartidaOito.get(0));
        resultadoQuartasOito.setText(quartasPartidaQuatro.get(2));

        
        semifinalAUm.setText(quartasPartidaUm.get(0));
        resultadoSemifinalUm.setText(semifinalUm.get(1));
        semifinalADois.setText(quartasPartidaDois.get(0));
        resultadoSemifinalDois.setText(semifinalUm.get(2));

        semifinalBUm.setText(quartasPartidaTres.get(0));
        resultadoSemifinalTres.setText(semifinalDois.get(1));
        semifinalBDois.setText(quartasPartidaQuatro.get(0));
        resultadoSemifinalQuatro.setText(semifinalDois.get(2));
        

        finalTimeUm.setText(semifinalUm.get(0));
        resultadoFinalUm.setText(finals.get(1));
        finalTimeDois.setText(semifinalDois.get(0));
        resultadoFinalDois.setText(finals.get(2));
        
        timeCampeao.setText(finals.get(0));

        icones();
    }//GEN-LAST:event_simularActionPerformed

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
            java.util.logging.Logger.getLogger(Simulacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JLabel C;
    private javax.swing.JLabel D;
    private javax.swing.JLabel E;
    private javax.swing.JLabel F;
    private javax.swing.JLabel G;
    private javax.swing.JLabel H;
    private javax.swing.JLabel alemanha;
    private javax.swing.JLabel arabiaSaudita;
    private javax.swing.JLabel argentina;
    private javax.swing.JLabel australia;
    private javax.swing.JLabel belgica;
    private javax.swing.JLabel brasil;
    private javax.swing.JLabel camaroes;
    private javax.swing.JPanel campeao;
    private javax.swing.JLabel canada;
    private javax.swing.JLabel coreiaDoSul;
    private javax.swing.JLabel costaRica;
    private javax.swing.JLabel croacia;
    private javax.swing.JLabel dinamarca;
    private javax.swing.JLabel equador;
    private javax.swing.JLabel espanha;
    private javax.swing.JPanel final1;
    private javax.swing.JLabel finalTimeDois;
    private javax.swing.JLabel finalTimeUm;
    private javax.swing.JLabel franca;
    private javax.swing.JLabel fundoTela;
    private javax.swing.JLabel gales;
    private javax.swing.JLabel gana;
    private javax.swing.JPanel grupoA;
    private javax.swing.JPanel grupoB;
    private javax.swing.JPanel grupoC;
    private javax.swing.JPanel grupoD;
    private javax.swing.JPanel grupoE;
    private javax.swing.JPanel grupoF;
    private javax.swing.JPanel grupoG;
    private javax.swing.JPanel grupoH;
    private javax.swing.JLabel holanda;
    private javax.swing.JLabel inglaterra;
    private javax.swing.JLabel ira;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel japao;
    private javax.swing.JLabel marracos;
    private javax.swing.JLabel mexico;
    private javax.swing.JPanel oitavas1;
    private javax.swing.JPanel oitavas2;
    private javax.swing.JPanel oitavas3;
    private javax.swing.JPanel oitavas4;
    private javax.swing.JPanel oitavas5;
    private javax.swing.JPanel oitavas6;
    private javax.swing.JPanel oitavas7;
    private javax.swing.JPanel oitavas8;
    private javax.swing.JLabel oitavasGrupoA1;
    private javax.swing.JLabel oitavasGrupoA2;
    private javax.swing.JLabel oitavasGrupoB1;
    private javax.swing.JLabel oitavasGrupoB2;
    private javax.swing.JLabel oitavasGrupoC1;
    private javax.swing.JLabel oitavasGrupoC2;
    private javax.swing.JLabel oitavasGrupoD1;
    private javax.swing.JLabel oitavasGrupoD2;
    private javax.swing.JLabel oitavasGrupoE1;
    private javax.swing.JLabel oitavasGrupoE2;
    private javax.swing.JLabel oitavasGrupoF1;
    private javax.swing.JLabel oitavasGrupoF2;
    private javax.swing.JLabel oitavasGrupoG1;
    private javax.swing.JLabel oitavasGrupoG2;
    private javax.swing.JLabel oitavasGrupoH1;
    private javax.swing.JLabel oitavasGrupoH2;
    private javax.swing.JLabel polonia;
    private javax.swing.JLabel portugual;
    private javax.swing.JLabel qatar;
    private javax.swing.JPanel quartas1;
    private javax.swing.JPanel quartas2;
    private javax.swing.JPanel quartas3;
    private javax.swing.JPanel quartas4;
    private javax.swing.JLabel quartasADois;
    private javax.swing.JLabel quartasAUm;
    private javax.swing.JLabel quartasBDois;
    private javax.swing.JLabel quartasBUm;
    private javax.swing.JLabel quartasCDois;
    private javax.swing.JLabel quartasCUm;
    private javax.swing.JLabel quartasDDois;
    private javax.swing.JLabel quartasDUm;
    private javax.swing.JLabel resultadoFinalDois;
    private javax.swing.JLabel resultadoFinalUm;
    private javax.swing.JLabel resultadoOitavasCinco;
    private javax.swing.JLabel resultadoOitavasDez;
    private javax.swing.JLabel resultadoOitavasDezesseis;
    private javax.swing.JLabel resultadoOitavasDois;
    private javax.swing.JLabel resultadoOitavasDoze;
    private javax.swing.JLabel resultadoOitavasNove;
    private javax.swing.JLabel resultadoOitavasOito;
    private javax.swing.JLabel resultadoOitavasOnze;
    private javax.swing.JLabel resultadoOitavasQuartoze;
    private javax.swing.JLabel resultadoOitavasQuatro;
    private javax.swing.JLabel resultadoOitavasQuinze;
    private javax.swing.JLabel resultadoOitavasSeis;
    private javax.swing.JLabel resultadoOitavasSete;
    private javax.swing.JLabel resultadoOitavasTres;
    private javax.swing.JLabel resultadoOitavasTreze;
    private javax.swing.JLabel resultadoOitavasUm;
    private javax.swing.JLabel resultadoQuartasCinco;
    private javax.swing.JLabel resultadoQuartasDois;
    private javax.swing.JLabel resultadoQuartasOito;
    private javax.swing.JLabel resultadoQuartasQuatro;
    private javax.swing.JLabel resultadoQuartasSeis;
    private javax.swing.JLabel resultadoQuartasSete;
    private javax.swing.JLabel resultadoQuartasTres;
    private javax.swing.JLabel resultadoQuartasUm;
    private javax.swing.JLabel resultadoSemifinalDois;
    private javax.swing.JLabel resultadoSemifinalQuatro;
    private javax.swing.JLabel resultadoSemifinalTres;
    private javax.swing.JLabel resultadoSemifinalUm;
    private code.Botao sair;
    private javax.swing.JPanel semifinal1;
    private javax.swing.JPanel semifinal2;
    private javax.swing.JLabel semifinalADois;
    private javax.swing.JLabel semifinalAUm;
    private javax.swing.JLabel semifinalBDois;
    private javax.swing.JLabel semifinalBUm;
    private javax.swing.JLabel senegal;
    private javax.swing.JLabel servia;
    private javax.swing.JButton simular;
    private javax.swing.JLabel suica;
    private javax.swing.JLabel timeCampeao;
    private javax.swing.JLabel tunisia;
    private javax.swing.JLabel uruguai;
    private javax.swing.JLabel usa;
    // End of variables declaration//GEN-END:variables

    public void GrupoOficial() {
        code.GruposOficiais simulacao = new code.GruposOficiais();
        qatar.setText(simulacao.grupoA[0]);
        equador.setText(simulacao.grupoA[1]);
        senegal.setText(simulacao.grupoA[2]);
        holanda.setText(simulacao.grupoA[3]);

        inglaterra.setText(simulacao.grupoB[0]);
        ira.setText(simulacao.grupoB[1]);
        usa.setText(simulacao.grupoB[2]);
        gales.setText(simulacao.grupoB[3]);

        argentina.setText(simulacao.grupoC[0]);
        arabiaSaudita.setText(simulacao.grupoC[1]);
        mexico.setText(simulacao.grupoC[2]);
        polonia.setText(simulacao.grupoC[3]);

        franca.setText(simulacao.grupoD[0]);
        australia.setText(simulacao.grupoD[1]);
        dinamarca.setText(simulacao.grupoD[2]);
        tunisia.setText(simulacao.grupoD[3]);

        espanha.setText(simulacao.grupoE[0]);
        costaRica.setText(simulacao.grupoE[1]);
        alemanha.setText(simulacao.grupoE[2]);
        japao.setText(simulacao.grupoE[3]);

        belgica.setText(simulacao.grupoF[0]);
        canada.setText(simulacao.grupoF[1]);
        marracos.setText(simulacao.grupoF[2]);
        croacia.setText(simulacao.grupoF[3]);

        brasil.setText(simulacao.grupoG[0]);
        servia.setText(simulacao.grupoG[1]);
        suica.setText(simulacao.grupoG[2]);
        camaroes.setText(simulacao.grupoG[3]);

        portugual.setText(simulacao.grupoH[0]);
        gana.setText(simulacao.grupoH[1]);
        uruguai.setText(simulacao.grupoH[2]);
        coreiaDoSul.setText(simulacao.grupoH[3]);
    }

    
    
    public void icones(){
        iconeOitavasTimeUm();
        iconeOitavasTimeDois();
        iconeOitavasTimeTres();
        iconeOitavasTimeQuatro();
        iconeOitavasTimeCinco();
        iconeOitavasTimeSeis();
        iconeOitavasTimeSete();
        iconeOitavasTimeOito();
        iconeOitavasTimeNove();
        iconeOitavasTimeDez();
        iconeOitavasTimeOnze();
        iconeOitavasTimeDoze();
        iconeOitavasTimeTreze();
        iconeOitavasTimeQuatorze();
        iconeOitavasTimeQuinze();
        iconeOitavasTimeDezesseis();
        
        iconeQuartasTimeUm();
        iconeQuartasTimeDois();
        iconeQuartasTimeTres();
        iconeQuartasTimeQuatro();
        iconeQuartasTimeCinco();
        iconeQuartasTimeSeis();
        iconeQuartasTimeSete();
        iconeQuartasTimeOito();
        
        iconeSemifinalTimeUm();
        iconeSemifinalTimeDois();
        iconeSemifinalTimeTres();
        iconeSemifinalTimeQuatro();

        iconeFinalTimeUm();
        iconeFinalTimeDois();
        
        iconeVencedor();
    }
    
    
    private void iconeOitavasTimeUm() {

        String oitavas;
        oitavas = oitavasGrupoA1.getText();

        if (oitavas.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            oitavasGrupoA1.setIcon(produto_imagem);

        } else if (oitavas.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            oitavasGrupoA1.setIcon(produto_imagem);
        } else if (oitavas.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            oitavasGrupoA1.setIcon(produto_imagem);
        } else if (oitavas.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            oitavasGrupoA1.setIcon(produto_imagem);
        }

    }

    private void iconeOitavasTimeDois() {
        String oitavas;
        oitavas = oitavasGrupoA2.getText();

        if (oitavas.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            oitavasGrupoA2.setIcon(iconeTime);
        } else if (oitavas.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            oitavasGrupoA2.setIcon(iconeTime);
        } else if (oitavas.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            oitavasGrupoA2.setIcon(iconeTime);
        } else if (oitavas.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            oitavasGrupoA2.setIcon(iconeTime);
        }
    }

    private void iconeOitavasTimeTres(){
        String oitavas;
        oitavas = oitavasGrupoB1.getText();

        if (oitavas.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            oitavasGrupoB1.setIcon(iconeTime);
        } else if (oitavas.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            oitavasGrupoB1.setIcon(iconeTime);
        } else if (oitavas.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            oitavasGrupoB1.setIcon(iconeTime);
        } else if (oitavas.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            oitavasGrupoB1.setIcon(iconeTime);
        }
    }

    private void iconeOitavasTimeQuatro(){
        String oitavas;
        oitavas = oitavasGrupoB2.getText();

        if (oitavas.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            oitavasGrupoB2.setIcon(iconeTime);
        } else if (oitavas.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            oitavasGrupoB2.setIcon(iconeTime);
        } else if (oitavas.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            oitavasGrupoB2.setIcon(iconeTime);
        } else if (oitavas.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            oitavasGrupoB2.setIcon(iconeTime);
        }
    }

    
    private void iconeOitavasTimeCinco(){
        String oitavas;
        oitavas = oitavasGrupoC1.getText();

        if (oitavas.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            oitavasGrupoC1.setIcon(iconeTime);
        } else if (oitavas.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            oitavasGrupoC1.setIcon(iconeTime);
        } else if (oitavas.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            oitavasGrupoC1.setIcon(iconeTime);
        } else if (oitavas.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            oitavasGrupoC1.setIcon(iconeTime);
        }
    }

    private void iconeOitavasTimeSeis(){
        String oitavas;
        oitavas = oitavasGrupoC2.getText();

        if (oitavas.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            oitavasGrupoC2.setIcon(iconeTime);
        } else if (oitavas.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            oitavasGrupoC2.setIcon(iconeTime);
        } else if (oitavas.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            oitavasGrupoC2.setIcon(iconeTime);
        } else if (oitavas.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            oitavasGrupoC2.setIcon(iconeTime);
        }
    }

    private void iconeOitavasTimeSete(){
        String oitavas;
        oitavas = oitavasGrupoD1.getText();

        if (oitavas.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            oitavasGrupoD1.setIcon(iconeTime);
        } else if (oitavas.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            oitavasGrupoD1.setIcon(iconeTime);
        } else if (oitavas.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            oitavasGrupoD1.setIcon(iconeTime);
        } else if (oitavas.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            oitavasGrupoD1.setIcon(iconeTime);
        }
    }

    private void iconeOitavasTimeOito(){
        String oitavas;
        oitavas = oitavasGrupoD2.getText();

        if (oitavas.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            oitavasGrupoD2.setIcon(iconeTime);
        } else if (oitavas.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            oitavasGrupoD2.setIcon(iconeTime);
        } else if (oitavas.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            oitavasGrupoD2.setIcon(iconeTime);
        } else if (oitavas.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            oitavasGrupoD2.setIcon(iconeTime);
        }
    }

    private void iconeOitavasTimeNove(){
        String oitavas;
        oitavas = oitavasGrupoE1.getText();

        if (oitavas.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            oitavasGrupoE1.setIcon(iconeTime);
        } else if (oitavas.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            oitavasGrupoE1.setIcon(iconeTime);
        } else if (oitavas.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            oitavasGrupoE1.setIcon(iconeTime);
        } else if (oitavas.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            oitavasGrupoE1.setIcon(iconeTime);
        }
    }

    private void iconeOitavasTimeDez(){
        String oitavas;
        oitavas = oitavasGrupoE2.getText();

       if (oitavas.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            oitavasGrupoE2.setIcon(produto_imagem);

        } else if (oitavas.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            oitavasGrupoE2.setIcon(produto_imagem);
        } else if (oitavas.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            oitavasGrupoE2.setIcon(produto_imagem);
        } else if (oitavas.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            oitavasGrupoE2.setIcon(produto_imagem);
        }
    }

    private void iconeOitavasTimeOnze(){
        String oitavas;
        oitavas = oitavasGrupoF1.getText();


        if (oitavas.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            oitavasGrupoF1.setIcon(iconeTime);
        } else if (oitavas.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            oitavasGrupoF1.setIcon(iconeTime);
        } else if (oitavas.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            oitavasGrupoF1.setIcon(iconeTime);
        } else if (oitavas.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            oitavasGrupoF1.setIcon(iconeTime);
        }
    }

    private void iconeOitavasTimeDoze(){
        String oitavas;
        oitavas = oitavasGrupoF2.getText();

         if (oitavas.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            oitavasGrupoF2.setIcon(iconeTime);
        } else if (oitavas.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            oitavasGrupoF2.setIcon(iconeTime);
        } else if (oitavas.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            oitavasGrupoF2.setIcon(iconeTime);
        } else if (oitavas.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            oitavasGrupoF2.setIcon(iconeTime);
        }
    }

    private void iconeOitavasTimeTreze(){
        String oitavas;
        oitavas = oitavasGrupoG1.getText();

        if (oitavas.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            oitavasGrupoG1.setIcon(iconeTime);
        } else if (oitavas.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            oitavasGrupoG1.setIcon(iconeTime);
        } else if (oitavas.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            oitavasGrupoG1.setIcon(iconeTime);
        } else if (oitavas.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            oitavasGrupoG1.setIcon(iconeTime);
        }
    }

    private void iconeOitavasTimeQuatorze(){
        String oitavas;
        oitavas = oitavasGrupoG2.getText();

        if (oitavas.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            oitavasGrupoG2.setIcon(iconeTime);
        } else if (oitavas.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            oitavasGrupoG2.setIcon(iconeTime);
        } else if (oitavas.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            oitavasGrupoG2.setIcon(iconeTime);
        } else if (oitavas.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            oitavasGrupoG2.setIcon(iconeTime);
        }
    }

    private void iconeOitavasTimeQuinze(){
        String oitavas;
        oitavas = oitavasGrupoH1.getText();

        if (oitavas.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            oitavasGrupoH1.setIcon(iconeTime);
        } else if (oitavas.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            oitavasGrupoH1.setIcon(iconeTime);
        } else if (oitavas.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            oitavasGrupoH1.setIcon(iconeTime);
        } else if (oitavas.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            oitavasGrupoH1.setIcon(iconeTime);
        }
    }

    private void iconeOitavasTimeDezesseis(){
        String oitavas;
        oitavas = oitavasGrupoH2.getText();

        if (oitavas.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            oitavasGrupoH2.setIcon(iconeTime);
        } else if (oitavas.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            oitavasGrupoH2.setIcon(iconeTime);
        } else if (oitavas.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            oitavasGrupoH2.setIcon(iconeTime);
        } else if (oitavas.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            oitavasGrupoH2.setIcon(iconeTime);
        }
    }
    
    
    private void iconeQuartasTimeUm(){
        String quartas;
        quartas = quartasAUm.getText();

        if (quartas.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            quartasAUm.setIcon(produto_imagem);

        } else if (quartas.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            quartasAUm.setIcon(produto_imagem);
        } else if (quartas.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            quartasAUm.setIcon(produto_imagem);
        } else if (quartas.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            quartasAUm.setIcon(produto_imagem);}
       
        else if (quartas.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            quartasAUm.setIcon(iconeTime);
        }
       
        else if (quartas.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            quartasAUm.setIcon(iconeTime);
            
        }
       
        else if (quartas.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            quartasAUm.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            quartasAUm.setIcon(iconeTime);
        }
        else if (quartas.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            quartasAUm.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            quartasAUm.setIcon(iconeTime);
        }
        else if (quartas.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            quartasAUm.setIcon(iconeTime);
        } else if (quartas.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            quartasAUm.setIcon(iconeTime);
        }
        
    }
    
    
    
    
    
    private void iconeQuartasTimeDois(){
        String quartas;
        quartas = quartasADois.getText();

        if (quartas.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            quartasADois.setIcon(produto_imagem);

        } else if (quartas.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            quartasADois.setIcon(produto_imagem);
        } else if (quartas.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            quartasADois.setIcon(produto_imagem);
        } else if (quartas.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            quartasADois.setIcon(produto_imagem);}
       
        else if (quartas.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            quartasADois.setIcon(iconeTime);
        }
       
        else if (quartas.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            quartasADois.setIcon(iconeTime);
            
        }
       
        else if (quartas.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            quartasADois.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            quartasADois.setIcon(iconeTime);
        }
        else if (quartas.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            quartasADois.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            quartasADois.setIcon(iconeTime);
        }
        else if (quartas.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            quartasADois.setIcon(iconeTime);
        } else if (quartas.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            quartasADois.setIcon(iconeTime);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    private void iconeQuartasTimeTres(){
        String quartas;
        quartas = quartasBUm.getText();

        if (quartas.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            quartasBUm.setIcon(produto_imagem);

        } else if (quartas.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            quartasBUm.setIcon(produto_imagem);
        } else if (quartas.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            quartasBUm.setIcon(produto_imagem);
        } else if (quartas.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            quartasBUm.setIcon(produto_imagem);}
       
        else if (quartas.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            quartasBUm.setIcon(iconeTime);
        }
       
        else if (quartas.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            quartasBUm.setIcon(iconeTime);
            
        }
       
        else if (quartas.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            quartasBUm.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            quartasBUm.setIcon(iconeTime);
        }
        else if (quartas.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            quartasBUm.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            quartasBUm.setIcon(iconeTime);
        }
        else if (quartas.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            quartasBUm.setIcon(iconeTime);
        } else if (quartas.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            quartasBUm.setIcon(iconeTime);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    private void iconeQuartasTimeQuatro(){
        String quartas;
        quartas = quartasBDois.getText();

        if (quartas.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            quartasBDois.setIcon(produto_imagem);

        } else if (quartas.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            quartasBDois.setIcon(produto_imagem);
        } else if (quartas.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            quartasBDois.setIcon(produto_imagem);
        } else if (quartas.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            quartasBDois.setIcon(produto_imagem);}
       
        else if (quartas.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            quartasBDois.setIcon(iconeTime);
        }
       
        else if (quartas.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            quartasBDois.setIcon(iconeTime);
            
        }
       
        else if (quartas.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            quartasBDois.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            quartasBDois.setIcon(iconeTime);
        }
        else if (quartas.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            quartasBDois.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            quartasBDois.setIcon(iconeTime);
        }
        else if (quartas.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            quartasBDois.setIcon(iconeTime);
        } else if (quartas.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            quartasBDois.setIcon(iconeTime);
        }
    }
    
    
    
    
    private void iconeQuartasTimeCinco(){
        String quartas;
        quartas = quartasCUm.getText();

        if (quartas.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            quartasCUm.setIcon(produto_imagem);

        } else if (quartas.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            quartasCUm.setIcon(produto_imagem);
        } else if (quartas.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            quartasCUm.setIcon(produto_imagem);
        } else if (quartas.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            quartasCUm.setIcon(produto_imagem);}
       
        else if (quartas.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            quartasCUm.setIcon(iconeTime);
        }
       
        else if (quartas.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            quartasCUm.setIcon(iconeTime);
            
        }
       
        else if (quartas.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            quartasCUm.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            quartasCUm.setIcon(iconeTime);
        }
        else if (quartas.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            quartasCUm.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            quartasCUm.setIcon(iconeTime);
        }
        else if (quartas.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            quartasCUm.setIcon(iconeTime);
        } else if (quartas.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            quartasCUm.setIcon(iconeTime);
        }
    }
    
    
    private void iconeQuartasTimeSeis(){
        String quartas;
        quartas = quartasCDois.getText();

        if (quartas.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            quartasCDois.setIcon(produto_imagem);

        } else if (quartas.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            quartasCDois.setIcon(produto_imagem);
        } else if (quartas.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            quartasCDois.setIcon(produto_imagem);
        } else if (quartas.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            quartasCDois.setIcon(produto_imagem);}
       
        else if (quartas.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            quartasCDois.setIcon(iconeTime);
        }
       
        else if (quartas.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            quartasCDois.setIcon(iconeTime);
            
        }
       
        else if (quartas.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            quartasCDois.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            quartasCDois.setIcon(iconeTime);
        }
        else if (quartas.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            quartasCDois.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            quartasCDois.setIcon(iconeTime);
        }
        else if (quartas.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            quartasCDois.setIcon(iconeTime);
        } else if (quartas.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            quartasCDois.setIcon(iconeTime);
        }
    }
    private void iconeQuartasTimeSete(){
        String quartas;
        quartas = quartasDUm.getText();

        if (quartas.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            quartasDUm.setIcon(produto_imagem);

        } else if (quartas.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            quartasDUm.setIcon(produto_imagem);
        } else if (quartas.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            quartasDUm.setIcon(produto_imagem);
        } else if (quartas.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            quartasDUm.setIcon(produto_imagem);}
       
        else if (quartas.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            quartasDUm.setIcon(iconeTime);
        }
       
        else if (quartas.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            quartasDUm.setIcon(iconeTime);
            
        }
       
        else if (quartas.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            quartasDUm.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            quartasDUm.setIcon(iconeTime);
        }
        else if (quartas.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            quartasDUm.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            quartasDUm.setIcon(iconeTime);
        }
        else if (quartas.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            quartasDUm.setIcon(iconeTime);
        } else if (quartas.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            quartasDUm.setIcon(iconeTime);
        }
    }
    
    
    private void iconeQuartasTimeOito(){
        String quartas;
        quartas = quartasDDois.getText();

        if (quartas.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            quartasDDois.setIcon(produto_imagem);

        } else if (quartas.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            quartasDDois.setIcon(produto_imagem);
        } else if (quartas.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            quartasDDois.setIcon(produto_imagem);
        } else if (quartas.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            quartasDDois.setIcon(produto_imagem);}
       
        else if (quartas.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            quartasDDois.setIcon(iconeTime);
        }
       
        else if (quartas.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            quartasDDois.setIcon(iconeTime);
            
        }
       
        else if (quartas.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            quartasDDois.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            quartasDDois.setIcon(iconeTime);
        }
        else if (quartas.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            quartasDDois.setIcon(iconeTime);
        }
        
        else if (quartas.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            quartasDDois.setIcon(iconeTime);
        }
        else if (quartas.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            quartasDDois.setIcon(iconeTime);
        } else if (quartas.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            quartasDDois.setIcon(iconeTime);
        }
    }
    
    
    
    
    
    private void iconeSemifinalTimeUm(){
        String semiFinal;
        semiFinal = semifinalAUm.getText();
        
        
        if (semiFinal.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            semifinalAUm.setIcon(produto_imagem);

        } else if (semiFinal.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            semifinalAUm.setIcon(produto_imagem);
        } else if (semiFinal.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            semifinalAUm.setIcon(produto_imagem);
        } else if (semiFinal.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            semifinalAUm.setIcon(produto_imagem);}
       
        else if (semiFinal.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            semifinalAUm.setIcon(iconeTime);
        }
       
        else if (semiFinal.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            semifinalAUm.setIcon(iconeTime);
            
        }
       
        else if (semiFinal.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            semifinalAUm.setIcon(iconeTime);
        }
        
        else if (semiFinal.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            semifinalAUm.setIcon(iconeTime);
        }
        else if (semiFinal.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            semifinalAUm.setIcon(iconeTime);
        }
        
        else if (semiFinal.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            semifinalAUm.setIcon(iconeTime);
        }
        else if (semiFinal.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            semifinalAUm.setIcon(iconeTime);
        } else if (semiFinal.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            semifinalAUm.setIcon(iconeTime);
        }
    }
    
    
    
    
    private void iconeSemifinalTimeDois(){
        String semiFinal;
        semiFinal = semifinalADois.getText();

        if (semiFinal.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            semifinalADois.setIcon(produto_imagem);

        } else if (semiFinal.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            semifinalADois.setIcon(produto_imagem);
        } else if (semiFinal.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            semifinalADois.setIcon(produto_imagem);
        } else if (semiFinal.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            semifinalADois.setIcon(produto_imagem);}
       
        else if (semiFinal.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            semifinalADois.setIcon(iconeTime);
        }
       
        else if (semiFinal.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            semifinalADois.setIcon(iconeTime);
            
        }
       
        else if (semiFinal.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            semifinalADois.setIcon(iconeTime);
        }
        
        else if (semiFinal.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            semifinalADois.setIcon(iconeTime);
        }
        else if (semiFinal.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            semifinalADois.setIcon(iconeTime);
        }
        
        else if (semiFinal.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            semifinalADois.setIcon(iconeTime);
        }
        else if (semiFinal.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            semifinalADois.setIcon(iconeTime);
        } else if (semiFinal.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            semifinalADois.setIcon(iconeTime);
        }
    }
    
    private void iconeSemifinalTimeTres(){
        String semiFinal;
        semiFinal = semifinalBUm.getText();

        if (semiFinal.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            semifinalBUm.setIcon(produto_imagem);

        } else if (semiFinal.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            semifinalBUm.setIcon(produto_imagem);
        } else if (semiFinal.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            semifinalBUm.setIcon(produto_imagem);
        } else if (semiFinal.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            semifinalBUm.setIcon(produto_imagem);}
       
        else if (semiFinal.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            semifinalBUm.setIcon(iconeTime);
        }
       
        else if (semiFinal.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            semifinalBUm.setIcon(iconeTime);
            
        }
       
        else if (semiFinal.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            semifinalBUm.setIcon(iconeTime);
        }
        
        else if (semiFinal.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            semifinalBUm.setIcon(iconeTime);
        }
        else if (semiFinal.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            semifinalBUm.setIcon(iconeTime);
        }
        
        else if (semiFinal.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            semifinalBUm.setIcon(iconeTime);
        }
        else if (semiFinal.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            semifinalBUm.setIcon(iconeTime);
        } else if (semiFinal.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            semifinalBUm.setIcon(iconeTime);
        }
    }
    private void iconeSemifinalTimeQuatro(){
        String semiFinal;
        semiFinal = semifinalBDois.getText();

        if (semiFinal.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            semifinalBDois.setIcon(produto_imagem);

        } else if (semiFinal.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            semifinalBDois.setIcon(produto_imagem);
        } else if (semiFinal.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            semifinalBDois.setIcon(produto_imagem);
        } else if (semiFinal.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            semifinalBDois.setIcon(produto_imagem);}
       
        else if (semiFinal.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            semifinalBDois.setIcon(iconeTime);
        }
       
        else if (semiFinal.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            semifinalBDois.setIcon(iconeTime);
            
        }
       
        else if (semiFinal.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            semifinalBDois.setIcon(iconeTime);
        }
        
        else if (semiFinal.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            semifinalBDois.setIcon(iconeTime);
        }
        else if (semiFinal.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            semifinalBDois.setIcon(iconeTime);
        }
        
        else if (semiFinal.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            semifinalBDois.setIcon(iconeTime);
        }
        else if (semiFinal.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            quartasDDois.setIcon(iconeTime);
        } else if (semiFinal.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            semifinalBDois.setIcon(iconeTime);
        } else if (semiFinal.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            semifinalBDois.setIcon(iconeTime);
        }
    }
    
    
    
    private void iconeFinalTimeUm(){
        String finals;
        finals = finalTimeUm.getText();

        if (finals.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            finalTimeUm.setIcon(produto_imagem);

        } else if (finals.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            finalTimeUm.setIcon(produto_imagem);
        } else if (finals.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            finalTimeUm.setIcon(produto_imagem);
        } else if (finals.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            finalTimeUm.setIcon(produto_imagem);}
       
        else if (finals.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            finalTimeUm.setIcon(iconeTime);
        }
       
        else if (finals.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            finalTimeUm.setIcon(iconeTime);
            
        }
       
        else if (finals.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            finalTimeUm.setIcon(iconeTime);
        }
        
        else if (finals.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            finalTimeUm.setIcon(iconeTime);
        }
        else if (finals.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            finalTimeUm.setIcon(iconeTime);
        }
        
        else if (finals.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            finalTimeUm.setIcon(iconeTime);
        }
        else if (finals.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            finalTimeUm.setIcon(iconeTime);
        } else if (finals.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            finalTimeUm.setIcon(iconeTime);
        }
    }
    
    
    
    private void iconeFinalTimeDois(){
        String finals;
        finals = finalTimeDois.getText();

        if (finals.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            finalTimeDois.setIcon(produto_imagem);

        } else if (finals.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            finalTimeDois.setIcon(produto_imagem);
        } else if (finals.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            finalTimeDois.setIcon(produto_imagem);
        } else if (finals.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            finalTimeDois.setIcon(produto_imagem);}
       
        else if (finals.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            finalTimeDois.setIcon(iconeTime);
        }
       
        else if (finals.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            finalTimeDois.setIcon(iconeTime);
            
        }
       
        else if (finals.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            finalTimeDois.setIcon(iconeTime);
        }
        
        else if (finals.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            finalTimeDois.setIcon(iconeTime);
        }
        else if (finals.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            finalTimeDois.setIcon(iconeTime);
        }
        
        else if (finals.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            finalTimeDois.setIcon(iconeTime);
        }
        else if (finals.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            finalTimeDois.setIcon(iconeTime);
        } else if (finals.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            finalTimeDois.setIcon(iconeTime);
        }
    }
    
    
    
    private void iconeVencedor(){
        String vencedor;
        vencedor = timeCampeao.getText();

        if (vencedor.equals("Catar")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\qatar_icon_127877.png");
            timeCampeao.setIcon(produto_imagem);

        } else if (vencedor.equals("Equador")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\ecuador_icon_127819.png");
            timeCampeao.setIcon(produto_imagem);
        } else if (vencedor.equals("Senegal")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\senegal_icon_127802.png");
            timeCampeao.setIcon(produto_imagem);
        } else if (vencedor.equals("Holanda")) {
            Icon produto_imagem = new ImageIcon("src\\imagens\\seleções\\netherlands_icon_127838.png");
            timeCampeao.setIcon(produto_imagem);}
       
        else if (vencedor.equals("França")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\france_icon_127830.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Austrália")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\australia_icon_127744.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Dinamarca")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\denmark_icon_127836.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Tunísia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\tunisia_icon_127788.png");
            timeCampeao.setIcon(iconeTime);
        }
       
        else if (vencedor.equals("Argentina")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\argentina_icon_127814.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Arábia Saudita")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\saudi_arabia_icon_127908.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("México")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\mexico_icon_127947.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Polônia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\poland_icon_127852.png");
            timeCampeao.setIcon(iconeTime);
            
        }
       
        else if (vencedor.equals("Bélgica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\belgium_icon_127865.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Canadá")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\canada_icon_127925.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Marrocos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\morocco_icon_127773.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Croácia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\croatia_icon_127840.png");
            timeCampeao.setIcon(iconeTime);
        }
        
        else if (vencedor.equals("Espanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\spain_icon_127825.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Costa Rica")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\costa_rica_icon_127928.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Alemanha")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\Germany_29761.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Japão")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\jpjapanflag_111832.png");
            timeCampeao.setIcon(iconeTime);
        }
        else if (vencedor.equals("Portugal")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\portugal_icon_127827.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Gana")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\ghana_icon_127776.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Uruguai")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\uyuruguayflag_111803.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Coreia do Sul")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\south_korea_icon_127918.png");
            timeCampeao.setIcon(iconeTime);
        }
        
        else if (vencedor.equals("Brasil")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\brazil_icon_127818.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Sérvia")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\serbia_icon_127829.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Suíça")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\switzerland_icon_127871.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Camarões")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\cameroon_icon_127792.png");
            timeCampeao.setIcon(iconeTime);
        }
        else if (vencedor.equals("Inglaterra")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbengenglandflag_111695.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Irã")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\iran_icon_127909.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("Estados Unidos")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\united_states_icon_127943.png");
            timeCampeao.setIcon(iconeTime);
        } else if (vencedor.equals("País de Gales")) {
            Icon iconeTime = new ImageIcon("src\\imagens\\seleções\\gbwlswalesflag_111786.png");
            timeCampeao.setIcon(iconeTime);
        }
    }

    
    
}
