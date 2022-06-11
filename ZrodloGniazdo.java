package start;

import java.awt.Color;
import java.text.ParseException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class ZrodloGniazdo implements IKosztPrad, IStatusElektrycznosc {
	public void zrodlo_gniazdo(JPanel panel, String poziom, String obiekt, JTextField identyfikacja, double pobor,
			JTextField czasstart, JTextField czasstop) {
		AktualnyCzas.czasMiesiac();
		AktualnyCzas.czasRok();
		try {

			if (panel.getBackground().equals(Color.LIGHT_GRAY)) {
				String i = UnikalneId.Id();
				identyfikacja.setText(i);
				ZapiszElektrycznosc.zapisz(i, null, null, poziom, obiekt, pobor);

				String czSt = Menu.lbl_czas.getText();
				czasstart.setText(czSt);
				CzasStartElektrycznosc.czas_start(czSt, obiekt, i);

				panel.setBackground(Color.green);
				String status = statusWlaczony();
				Timer timer = new Timer();
				timer.scheduleAtFixedRate(new TimerTask() {

					@Override
					public void run() {
						String id = identyfikacja.getText();

						double koszt1 = koszt();

						String czasSt = czasstart.getText();
						String temp = Menu.lbl_czas.getText();
						czasstop.setText(temp);
						String czasSp = czasstop.getText();
						double suma;
						try {
							suma = ZliczanieCzasu.zliczanieCzasu(czasSt, czasSp);
							CzasStopElektrycznoœæ.czasStop(czasSp, suma, koszt1, obiekt, id);
						} catch (ParseException e) {

							e.printStackTrace();
						}

						if (panel.getBackground().equals(Color.LIGHT_GRAY)) {
							timer.cancel();
						}

					}
				}, 1000, 1000);
				StatusElektrycznosc.statusEl(obiekt, status);
				OdswiezElektrycznosc.odswiez();

			} else if (panel.getBackground().equals(Color.green)) {
				String id = identyfikacja.getText();

				double koszt = koszt();

				String czasSt = czasstart.getText();
				String temp = Menu.lbl_czas.getText();
				czasstop.setText(temp);
				String czasSp = czasstop.getText();

				double suma = ZliczanieCzasu.zliczanieCzasu(czasSt, czasSp);

				CzasStopElektrycznoœæ.czasStop(czasSp, suma, koszt, obiekt, id);
				panel.setBackground(Color.LIGHT_GRAY);
				String status = statusWylaczony();
				StatusElektrycznosc.statusEl(obiekt, status);
				OdswiezElektrycznosc.odswiez();

			}
		} catch (Exception e) {

		}
	}
}
