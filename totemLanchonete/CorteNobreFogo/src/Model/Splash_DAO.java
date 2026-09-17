package Model;

import View.Iniciar_GUI;
import View.Splash_GUI;
import static View.Splash_GUI.progresso;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities; 

public class Splash_DAO {

    public static void carrega(Splash_GUI splash) {

        new Thread() {
            public void run() {

                for (int i = 0; i < 101; i++) {
                    try {
                        sleep(60);

                        progresso.setValue(i);

                        if (progresso.getValue() == 10) {
                            // driver_conexao.carregardriver();
                            sleep(2000);

                        } else if (progresso.getValue() <= 30) {
                            sleep(100);

                        } else if (progresso.getValue() <= 99) {

                        } else {
                            sleep(3000);

                            // Executa abertura do Login_GUI na EDT
                            SwingUtilities.invokeLater(() -> {
                                new Iniciar_GUI().setVisible(true);
                                splash.dispose(); // Fecha o Splash_GUI
                            });
                        }

                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }

}
