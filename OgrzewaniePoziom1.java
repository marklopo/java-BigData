package start;

import java.awt.Color;
import java.text.ParseException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class OgrzewaniePoziom1 implements IStatusOgrzewanie, IKosztOgrzewanie, IOpoznienie {
	public void ogrzewaj1(JPanel panel, String poziom, String obiekt, JTextField identyfikacja, double pobor,
			JTextField czasstart, JTextField czasstop, JTextField temp_a, JTextField temp_p) {
		AktualnyCzas.czasMiesiac();
		AktualnyCzas.czasRok();
		int opoznienie = opoznienie();
try {
		if (panel.getBackground().equals(Color.gray)) {
			panel.setBackground(Color.red);
			String status = statusWlaczony();
			StatusOgrzewanie.statusO(obiekt, status);
			OdswezOgrzewanie.odswiez();

			String i = UnikalneId.Id();
			identyfikacja.setText(i);
			ZapiszOgrzewanie.zapisz(i, null, null, poziom, obiekt, pobor);
			String czasSt = Menu.lbl_czas.getText();

			czasstart.setText(czasSt);
			CzasStartOgrzewanie.czasStartOgrzewanie(czasSt, obiekt, i);

			Timer timer = new Timer();

			timer.scheduleAtFixedRate(new TimerTask() {

				@Override
				public void run() {

					String id = identyfikacja.getText();
					double koszt1 = koszt();

					String czasSt1 = czasstart.getText();
					String temp = Menu.lbl_czas.getText();
					czasstop.setText(temp);
					String czasSp = czasstop.getText();
					double suma;
					try {
						suma = ZliczanieCzasu.zliczanieCzasu(czasSt1, czasSp);

						CzasStopOgrzewanie.czasStopOgrzewanie(czasSp, suma, koszt1, obiekt, id);
					} catch (ParseException e) {
						 
						e.printStackTrace();
					}
					PoborOgrzewanie1.poborOgrzewanie1(temp_a, temp_p, pobor);

					String ta = temp_a.getText();
					String tp = temp_p.getText();

					double ta1 = Double.valueOf(ta);
					double tp1 = Double.valueOf(tp);

					if (panel.getBackground().equals(Color.gray) || ta1 >= (tp1)) {
						timer.cancel();
						panel.setBackground(Color.gray);
						String status2 = "Wy³¹czony";
						StatusOgrzewanie.statusO(obiekt, status2);
						OdswezOgrzewanie.odswiez();
					}

				}
			}, 1000, opoznienie);

		} else if (panel.getBackground().equals(Color.red)) {
			String status2 = statusWylaczony();
			StatusOgrzewanie.statusO(obiekt, status2);
			OdswezOgrzewanie.odswiez();

			String id = identyfikacja.getText();
			double koszt = koszt();

			String czasSt1 = czasstart.getText();
			String temp = Menu.lbl_czas.getText();
			czasstop.setText(temp);
			String czasSp = czasstop.getText();

			double suma;
			try {
				suma = ZliczanieCzasu.zliczanieCzasu(czasSt1, czasSp);
				CzasStopOgrzewanie.czasStopOgrzewanie(czasSp, suma, koszt, obiekt, id);
			} catch (ParseException e) {
				 
				e.printStackTrace();
			}

			panel.setBackground(Color.gray);
		}
		RaportOdsiwezOgrzewanie.odsiwezOgrzewanieRaport();
	
} catch (Exception e) {

}
}}
