package start;

import java.awt.Color;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class ZrodloSwiatlo implements IStatusElektrycznosc, IKosztPrad {
	public void zrodlo_swiatlo(JPanel panel, String poziom, String obiekt, JTextField identyfikacja, double pobor,
			JTextField czasstart, JTextField czasstop)  {
		AktualnyCzas.czasMiesiac();
		AktualnyCzas.czasRok();


		if (panel.getBackground().equals(Color.gray)) {
			panel.setBackground(Color.YELLOW);
			String status = statusWlaczony();
			StatusElektrycznosc.statusEl(obiekt, status);
			OdswiezElektrycznosc.odswiez();

			String i = UnikalneId.Id();
			identyfikacja.setText(i);
			ZapiszElektrycznosc.zapisz(i, null, null, poziom, obiekt, pobor);

			String czasSt = Menu.lbl_czas.getText();
			czasstart.setText(czasSt);
			CzasStartElektrycznosc.czas_start(czasSt, obiekt, i);

			Timer timer = new Timer();

			timer.scheduleAtFixedRate(new TimerTask() {

				@Override
				public void run() {
					String id = identyfikacja.getText();
					double koszt1 = koszt();

					String czasSt = czasstart.getText();
					String czasTemp = Menu.lbl_czas.getText();
					czasstop.setText(czasTemp);
					String czasSp = czasstop.getText();
					double suma;
					try {
						suma = ZliczanieCzasu.zliczanieCzasu(czasSt, czasSp);
						CzasStopElektrycznoœæ.czasStop(czasSp, suma, koszt1, obiekt, id);
					} catch (ParseException e) {
						
						e.printStackTrace();
					}
					
					RaportOdswiezElektrycznosc.odswiezElektrycznoscRaport();
					
					if (panel.getBackground().equals(Color.gray)) {
						timer.cancel();
					}
					
				}
			}, 1000, 1000);
//			
//				

		} else if (panel.getBackground().equals(Color.yellow)) {
			String status2 = statusWylaczony();
			StatusElektrycznosc.statusEl(obiekt, status2);
			OdswiezElektrycznosc.odswiez();

			String id = identyfikacja.getText();
			double koszt = koszt();
			String czasSt = czasstart.getText();
			String czasTemp = Menu.lbl_czas.getText();
			czasstop.setText(czasTemp);
			String czasSp = czasstop.getText();
			double suma;
			try {
				suma = ZliczanieCzasu.zliczanieCzasu(czasSt, czasSp);
				CzasStopElektrycznoœæ.czasStop(czasSp, suma, koszt, obiekt, id);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			

			panel.setBackground(Color.gray);
		}
RaportOdswiezElektrycznosc.odswiezElektrycznoscRaport();
	}
}
