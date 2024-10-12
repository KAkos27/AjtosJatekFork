package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import modell.AjtosJatek;
import nezet.GuiNezet;

public class AjtosJatekVezerlo {

    private final GuiNezet nezet;
    private final AjtosJatek modell;

    public AjtosJatekVezerlo() {

        this.nezet = new GuiNezet();
        this.modell = new AjtosJatek();

        this.guiBeallitas();
        this.esemenykezlesekMeghivasa();
        this.ujrakezdesEsemenykezeles();
    }

    private void esemenykezlesekMeghivasa() {

        JButton gomb;

        gomb = nezet.getAjto1_btn();
        this.valasztasEsemenykezeles(gomb, 0);

        gomb = nezet.getAjto2_btn();
        this.valasztasEsemenykezeles(gomb, 1);

        gomb = nezet.getAjto3_btn();
        this.valasztasEsemenykezeles(gomb, 2);

    }

    private void gombElerhetosegKezeles(boolean elerheto) {

        JButton gomb;

        gomb = nezet.getAjto1_btn();
        gomb.setEnabled(elerheto);

        gomb = nezet.getAjto2_btn();
        gomb.setEnabled(elerheto);

        gomb = nezet.getAjto3_btn();
        gomb.setEnabled(elerheto);
    }

    private void ujrakezdesEsemenykezeles() {

        JButton gomb = nezet.getUjra_btn();

        gomb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                gombElerhetosegKezeles(true);
                modell.alapertekBeallitas();
            }

        });
    }

    private void valasztasEsemenykezeles(JButton gomb, int ajtoSzam) {

        gomb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                modell.setValasztas(ajtoSzam);
                int ajtoCsere = nezet.elsoVisszajelzesKiiras(modell.uresAjtotMegmutat());

                nezet.veglegesVisszajelzes(modell.veglegesValasztas(ajtoCsere));

                JTextField csereltStat = nezet.getCsereltStat_txf();
                JTextField nemCsereltStat = nezet.getNemCsereltStat_txf();

                JTextField nyertCserevel = nezet.getNyertCserevel_txf();
                JTextField nyertCsereNelkuk = nezet.getNyertCsereNelkul_txf();

                csereltStat.setText("" + modell.getAjtoCserek());
                nemCsereltStat.setText("" + modell.getEredetiAjtok());

                nyertCserevel.setText("" + modell.getAjtoCsereGyozelmek());
                nyertCsereNelkuk.setText("" + modell.getEredetiAjtoGyozelmek());

                gombElerhetosegKezeles(false);

            }
        });
    }

    private void guiBeallitas() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiNezet.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiNezet.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiNezet.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiNezet.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                nezet.setVisible(true);
            }
        });
    }
}
