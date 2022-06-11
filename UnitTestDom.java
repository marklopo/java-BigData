/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JPanel;

import org.junit.Before;
import org.junit.Test;

import start.AktualnyCzas;
import start.IKosztPrad;
import start.Menu;
import start.UnikalneId;
import start.ZliczanieCzasu;

/**
 * 
 *
 */
public class UnitTestDom {

	private String lokalizacja = "Wroc³aw";
	private String tryb = "Manualny";
	private String uzytkownik = "Administrator";
	private String r = "2022";
	private String m = "06";
	private String licznik = "0.17";
	private double liczba;

	@Test
	public void sprawdzeniePoprawnoœciLokalizacji() {
		Menu lok = new Menu();
		String result = lok.lblNewLabel_9.getText();

		assertEquals(lokalizacja, result);
	}

	@Test
	public void sprawdzenieTrybuPracy() {
		Menu praca = new Menu();
		String result = praca.lblNewLabel_8.getText();

		assertEquals(tryb, result);
	}

	@Test
	public void sprawdzenieUzytkownika() {
		Menu user = new Menu();
		String result = user.lbl_administrator.getText();

		assertEquals(uzytkownik, result);

	}

	@Test
	public void sprawdzenieLicznikaCzasu() throws ParseException {
		ZliczanieCzasu czas = new ZliczanieCzasu();

		double r = czas.zliczanieCzasu("12:00:00  12-02-2022", "12:10:00  12-02-2022");
		String result = String.valueOf(r);
		assertEquals(licznik, result);

	}

	@Test
	public void sprawdzenieDatyRok() {
		String rok = Menu.a_rok.getText();

		assertNotEquals(r, rok);

	}

	@Test
	public void sprawdzenieDatyMiesiac() {
		String miesiac = Menu.a_miesiac.getText();

		assertNotEquals(m, miesiac);

	}
	@Test
	public void sprawdzenieLiczbyDouble() {
		UnikalneId u = new UnikalneId();
		String l = u.Id();

		assertNotEquals(liczba, l);

	}
	
}
