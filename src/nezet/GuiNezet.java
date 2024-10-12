package nezet;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GuiNezet extends javax.swing.JFrame {

    public GuiNezet() {

        initComponents();
    }

    public JButton getAjto1_btn() {

        return ajto1_btn;
    }

    public JButton getAjto2_btn() {

        return ajto2_btn;
    }

    public JButton getAjto3_btn() {

        return ajto3_btn;
    }

    public JTextField getCsereltStat_txf() {

        return csereltStat_txf;
    }

    public JTextField getNemCsereltStat_txf() {

        return nemCsereltStat_txf;
    }

    public JTextField getNyertCsereNelkul_txf() {

        return nyertCsereNelkul_txf;
    }

    public JTextField getNyertCserevel_txf() {

        return nyertCserevel_txf;
    }

    public int elsoVisszajelzesKiiras(String visszajelzes) {

        return JOptionPane.showOptionDialog(
                rootPane,
                visszajelzes,
                "Válassz!",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Nem", "Igen"},
                "Nem"
        );

    }

    public void veglegesVisszajelzes(String visszajelzes) {
        JOptionPane.showMessageDialog(rootPane, visszajelzes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cim_lbl = new javax.swing.JLabel();
        ajto1_pnl = new javax.swing.JPanel();
        ajto1_btn = new javax.swing.JButton();
        ajtoKep1_lbl = new javax.swing.JLabel();
        ajto2_pnl = new javax.swing.JPanel();
        ajto2_btn = new javax.swing.JButton();
        ajtoKep2_lbl = new javax.swing.JLabel();
        ajto3_pnl = new javax.swing.JPanel();
        ajto3_btn = new javax.swing.JButton();
        ajtoKep3_lbl = new javax.swing.JLabel();
        statisztika_pnl = new javax.swing.JPanel();
        jatCserelt_lbl = new javax.swing.JLabel();
        jatNemCserelt_lbl = new javax.swing.JLabel();
        csereltStat_txf = new javax.swing.JTextField();
        nemCsereltStat_txf = new javax.swing.JTextField();
        jatCserevelNyert_lbl = new javax.swing.JLabel();
        nyertCserevel_txf = new javax.swing.JTextField();
        jatCsereNelkulNyert_lbl = new javax.swing.JLabel();
        nyertCsereNelkul_txf = new javax.swing.JTextField();
        ujra_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajtók");
        setResizable(false);

        cim_lbl.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cim_lbl.setText("Ajtós játék");

        ajto1_pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        ajto1_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ajto1_btn.setText("Ajtó 1");
        ajto1_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ajtoKep1_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Kapu.png"))); // NOI18N
        ajtoKep1_lbl.setText("jLabel2");

        javax.swing.GroupLayout ajto1_pnlLayout = new javax.swing.GroupLayout(ajto1_pnl);
        ajto1_pnl.setLayout(ajto1_pnlLayout);
        ajto1_pnlLayout.setHorizontalGroup(
            ajto1_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajto1_pnlLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ajto1_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajto1_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ajto1_pnlLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ajtoKep1_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        ajto1_pnlLayout.setVerticalGroup(
            ajto1_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajto1_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ajto1_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ajtoKep1_lbl)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        ajto2_pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        ajto2_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ajto2_btn.setText("Ajtó 2");

        ajtoKep2_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Kapu.png"))); // NOI18N
        ajtoKep2_lbl.setText("jLabel2");

        javax.swing.GroupLayout ajto2_pnlLayout = new javax.swing.GroupLayout(ajto2_pnl);
        ajto2_pnl.setLayout(ajto2_pnlLayout);
        ajto2_pnlLayout.setHorizontalGroup(
            ajto2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajto2_pnlLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ajto2_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(ajto2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ajto2_pnlLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(ajtoKep2_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );
        ajto2_pnlLayout.setVerticalGroup(
            ajto2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajto2_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ajto2_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(ajto2_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ajto2_pnlLayout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(ajtoKep2_lbl)
                    .addContainerGap(71, Short.MAX_VALUE)))
        );

        ajto3_pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        ajto3_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ajto3_btn.setText("Ajtó 3");

        ajtoKep3_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Kapu.png"))); // NOI18N
        ajtoKep3_lbl.setText("jLabel2");

        javax.swing.GroupLayout ajto3_pnlLayout = new javax.swing.GroupLayout(ajto3_pnl);
        ajto3_pnl.setLayout(ajto3_pnlLayout);
        ajto3_pnlLayout.setHorizontalGroup(
            ajto3_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajto3_pnlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ajto3_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ajto3_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ajtoKep3_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        ajto3_pnlLayout.setVerticalGroup(
            ajto3_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajto3_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ajto3_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ajtoKep3_lbl)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jatCserelt_lbl.setText("Játékos cserélt:");

        jatNemCserelt_lbl.setText("Játékos nem cserélt:");

        csereltStat_txf.setEditable(false);

        nemCsereltStat_txf.setEditable(false);

        jatCserevelNyert_lbl.setText("Játékos nyert cserével:");

        nyertCserevel_txf.setEditable(false);

        jatCsereNelkulNyert_lbl.setText("Játékos nyert csere nélkül:");

        nyertCsereNelkul_txf.setEditable(false);

        ujra_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ujra_btn.setText("Újra");

        javax.swing.GroupLayout statisztika_pnlLayout = new javax.swing.GroupLayout(statisztika_pnl);
        statisztika_pnl.setLayout(statisztika_pnlLayout);
        statisztika_pnlLayout.setHorizontalGroup(
            statisztika_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisztika_pnlLayout.createSequentialGroup()
                .addGroup(statisztika_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nyertCsereNelkul_txf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(statisztika_pnlLayout.createSequentialGroup()
                        .addGroup(statisztika_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(csereltStat_txf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(statisztika_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(statisztika_pnlLayout.createSequentialGroup()
                                    .addGap(66, 66, 66)
                                    .addComponent(nemCsereltStat_txf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(statisztika_pnlLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(statisztika_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jatNemCserelt_lbl)
                                        .addComponent(jatCserelt_lbl)))))
                        .addGroup(statisztika_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(statisztika_pnlLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(nyertCserevel_txf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(statisztika_pnlLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(statisztika_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jatCsereNelkulNyert_lbl)
                                    .addComponent(jatCserevelNyert_lbl))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(ujra_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        statisztika_pnlLayout.setVerticalGroup(
            statisztika_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisztika_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statisztika_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jatCserelt_lbl)
                    .addComponent(jatCserevelNyert_lbl))
                .addGroup(statisztika_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statisztika_pnlLayout.createSequentialGroup()
                        .addGroup(statisztika_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(csereltStat_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nyertCserevel_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(statisztika_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jatNemCserelt_lbl)
                            .addComponent(jatCsereNelkulNyert_lbl)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statisztika_pnlLayout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(ujra_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statisztika_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nemCsereltStat_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nyertCsereNelkul_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statisztika_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ajto1_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ajto2_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ajto3_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cim_lbl)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cim_lbl)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajto2_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajto1_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajto3_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(statisztika_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajto1_btn;
    private javax.swing.JPanel ajto1_pnl;
    private javax.swing.JButton ajto2_btn;
    private javax.swing.JPanel ajto2_pnl;
    private javax.swing.JButton ajto3_btn;
    private javax.swing.JPanel ajto3_pnl;
    private javax.swing.JLabel ajtoKep1_lbl;
    private javax.swing.JLabel ajtoKep2_lbl;
    private javax.swing.JLabel ajtoKep3_lbl;
    private javax.swing.JLabel cim_lbl;
    private javax.swing.JTextField csereltStat_txf;
    private javax.swing.JLabel jatCsereNelkulNyert_lbl;
    private javax.swing.JLabel jatCserelt_lbl;
    private javax.swing.JLabel jatCserevelNyert_lbl;
    private javax.swing.JLabel jatNemCserelt_lbl;
    private javax.swing.JTextField nemCsereltStat_txf;
    private javax.swing.JTextField nyertCsereNelkul_txf;
    private javax.swing.JTextField nyertCserevel_txf;
    private javax.swing.JPanel statisztika_pnl;
    private javax.swing.JButton ujra_btn;
    // End of variables declaration//GEN-END:variables
}
