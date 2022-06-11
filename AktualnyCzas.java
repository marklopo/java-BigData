package start;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;


public class AktualnyCzas {
	/**
	 * This class contains methods that can 
	 * help you determine the current date and time.
	 *
	 */
	Timer wynik = null;

	public static void czas() {

		Timer wynik = new Timer();
		wynik.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				Date aktualnaData = new Date();
				Locale lokalizacja = Locale.GERMAN;
				SimpleDateFormat formatowanie = new SimpleDateFormat("HH:mm:ss  dd-MM-yyyy", lokalizacja);

				Menu.lbl_czas.setText(formatowanie.format(aktualnaData));
			}
		}, 1000, 10);

	}

	public static void czasRok() {

		Date aktualnaData = new Date();
		Locale lokalizacja = Locale.GERMAN;
		SimpleDateFormat formatowanie = new SimpleDateFormat("yyyy", lokalizacja);

		Menu.a_rok.setText(formatowanie.format(aktualnaData));
		 
		

	}

	public static void czasMiesiac() {

		Date aktualnaData = new Date();
		Locale lokalizacja = Locale.GERMAN;
		SimpleDateFormat formatowanie = new SimpleDateFormat("MM", lokalizacja);

		Menu.a_miesiac.setText(formatowanie.format(aktualnaData));

	}
}
