package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modell.AjtosJatek;
import nezet.GuiNezet;

public class AjtosJatekVezerlo {

    private GuiNezet nezet;
    private AjtosJatek modell;

    public AjtosJatekVezerlo() {

        this.nezet = new GuiNezet();
        this.modell = new AjtosJatek();

        this.guiBeallitas();
        this.valasztas();
    }

    private void valasztas() {
        JButton gomb1 = nezet.getAjto1_btn();

        gomb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modell.valasztas(0);
            }
        });

        JButton gomb2 = nezet.getAjto2_btn();

        gomb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modell.valasztas(1);
            }
        });

        JButton gomb3 = nezet.getAjto3_btn();

        gomb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modell.valasztas(2);
            }
        });
    }

    private void guiBeallitas() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiNezet().setVisible(true);
            }
        });
    }
}
