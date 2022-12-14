package code;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class Icone {

    public void InserirIcone(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/iconetaca.png"));
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
