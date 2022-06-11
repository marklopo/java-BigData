package start;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Pogodynka {
	public static void symulacjaPogody() {

		List<String> temp = new ArrayList<String>();

		temp.removeAll(temp);
		temp.add("21");
		temp.add("22");
		temp.add("23");
		temp.add("24");
		temp.add("25");
		temp.add("26");
		temp.add("27");
		temp.add("28");
		temp.add("29");
		temp.add("30");

		List<String> cis = new ArrayList<String>();

		cis.removeAll(cis);
		cis.add("1010");
		cis.add("1013");
		cis.add("1016");
		cis.add("1018");
		cis.add("1021");

		List<String> zach = new ArrayList<String>();

		zach.removeAll(zach);
		zach.add("40");
		zach.add("50");
		zach.add("60");
		zach.add("70");
		zach.add("80");
		zach.add("90");
		zach.add("100");

		List<String> w = new ArrayList<String>();

		w.removeAll(w);
		w.add("5");
		w.add("6");
		w.add("8");
		w.add("10");
		w.add("12");

		List<String> wilg = new ArrayList<String>();
		wilg.removeAll(wilg);
		wilg.add("55");
		wilg.add("65");
		wilg.add("60");
		wilg.add("70");
		wilg.add("75");

		Timer timer1 = new Timer();

		timer1.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				String temperatura = temp.get(new Random().nextInt(temp.size()));
				String cisnienie = cis.get(new Random().nextInt(cis.size()));
				String zachmurzenie = zach.get(new Random().nextInt(zach.size()));
				String wilgotnosc = wilg.get(new Random().nextInt(wilg.size()));
				String wiatr = w.get(new Random().nextInt(w.size()));
				Menu.meteo_temp.setText(temperatura);
				Menu.meteo_cisn.setText(cisnienie);
				Menu.meteo_zachm.setText(zachmurzenie);
				Menu.meteo_wilg.setText(wilgotnosc);
				Menu.meteo_wiatr.setText(wiatr);
				if (Menu.meteo_zachm.getText().equals("100")) {
					Menu.meteo_opad.setText("2");
					Menu.meteo_wilg.setText("100");

				} else {
					Menu.meteo_opad.setText("0");

				}

			}
		}, 1000, 5000);

	}
}
