package start;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

public class ZamykanieAutomatyczne implements ISymulacja {
	Timer timer2 = null;
	static Color zamkniete = new Color(153, 51, 0);
	static Color otwarte = new Color(102, 204, 255);

	public void automatyczneZamykanie() {
		Timer timer2 = new Timer();

		timer2.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				int t1 = temperatura1();
				int t2 = temperatura2();
				int w = wilgotnosc1();
				int wp = wilgotnosc2();
				int tp = temperatura3();

				if (Menu.sym_1.getText().equals("STOP")) {
					Menu.front_okno11.setBackground(otwarte);
					Menu.front_okno12.setBackground(otwarte);
					Menu.front_okno01.setBackground(otwarte);
					Menu.front_drzwi11.setBackground(otwarte);
					Menu.okno02.setBackground(otwarte);
					Menu.okno03.setBackground(otwarte);
					Menu.okno04.setBackground(otwarte);
					Menu.okno05.setBackground(otwarte);
					Menu.drzwi01.setBackground(otwarte);
					Menu.okno13.setBackground(otwarte);
					Menu.okno14.setBackground(otwarte);
					Menu.okno15.setBackground(otwarte);
					Menu.okno16.setBackground(otwarte);
					Menu.sym.setText("START");
					Menu.sym.setVisible(true);
					Menu.sym_1.setVisible(false);
					Menu.sym_1.setText("");
					timer2.cancel();
					ZabezpieczeniaOtwarte.pokarzOtwarte();
				} else if (wp >= w) {
					Menu.front_okno11.setBackground(zamkniete);
					Menu.front_okno12.setBackground(zamkniete);
					Menu.front_okno01.setBackground(zamkniete);
					Menu.front_drzwi11.setBackground(zamkniete);
					Menu.front_okno11.setBackground(zamkniete);
					Menu.front_okno12.setBackground(zamkniete);
					Menu.front_okno01.setBackground(zamkniete);
					Menu.front_drzwi11.setBackground(zamkniete);
					Menu.okno02.setBackground(zamkniete);
					Menu.okno03.setBackground(zamkniete);
					Menu.okno04.setBackground(zamkniete);
					Menu.okno05.setBackground(zamkniete);
					Menu.drzwi01.setBackground(zamkniete);
					Menu.okno13.setBackground(zamkniete);
					Menu.okno14.setBackground(zamkniete);
					Menu.okno15.setBackground(zamkniete);
					Menu.okno16.setBackground(zamkniete);

				} else if (tp >= t1) {
					Menu.front_okno11.setBackground(zamkniete);
					Menu.front_okno12.setBackground(zamkniete);
					Menu.front_okno01.setBackground(zamkniete);
					Menu.front_drzwi11.setBackground(zamkniete);
					Menu.okno02.setBackground(zamkniete);
					Menu.okno03.setBackground(zamkniete);
					Menu.okno04.setBackground(zamkniete);
					Menu.okno05.setBackground(zamkniete);
					Menu.okno13.setBackground(zamkniete);
					Menu.okno14.setBackground(zamkniete);
					Menu.okno15.setBackground(zamkniete);
					Menu.okno16.setBackground(zamkniete);
					Menu.drzwi01.setBackground(zamkniete);

				} else if (tp >= t2) {
					Menu.front_okno11.setBackground(zamkniete);
					Menu.front_okno12.setBackground(zamkniete);
					Menu.front_drzwi11.setBackground(zamkniete);
					Menu.front_okno01.setBackground(otwarte);
					Menu.okno02.setBackground(otwarte);
					Menu.okno03.setBackground(otwarte);
					Menu.okno04.setBackground(otwarte);
					Menu.okno05.setBackground(otwarte);
					Menu.drzwi01.setBackground(otwarte);
					Menu.okno13.setBackground(zamkniete);
					Menu.okno14.setBackground(zamkniete);
					Menu.okno15.setBackground(zamkniete);
					Menu.okno16.setBackground(zamkniete);
				}

				else {
					Menu.front_okno11.setBackground(otwarte);
					Menu.front_okno12.setBackground(otwarte);
					Menu.front_okno01.setBackground(otwarte);
					Menu.front_drzwi11.setBackground(otwarte);
					Menu.okno02.setBackground(otwarte);
					Menu.okno03.setBackground(otwarte);
					Menu.okno04.setBackground(otwarte);
					Menu.okno05.setBackground(otwarte);
					Menu.drzwi01.setBackground(otwarte);
					Menu.okno13.setBackground(otwarte);
					Menu.okno14.setBackground(otwarte);
					Menu.okno15.setBackground(otwarte);
					Menu.okno16.setBackground(otwarte);

				}
			}

		}, 1000, 1000);
	}

}
