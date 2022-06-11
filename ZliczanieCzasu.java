package start;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ZliczanieCzasu {
	public static double zliczanieCzasu(String pierwsza, String druga) throws ParseException {
		
		Date pierwszaData = null;
		Date drugaData = null;
		
		SimpleDateFormat formatowanie = new SimpleDateFormat("HH:mm:ss  dd-MM-yyyy");
		
		pierwszaData = formatowanie.parse(pierwsza);
		drugaData = formatowanie.parse(druga);
		

		double roznica = drugaData.getTime() - pierwszaData.getTime();
		
		double roznicaWGodzinach = roznica / (60 * 60 * 1000);

		double zaokraglenie = Math.round(roznicaWGodzinach * 100d) / 100d;

		return zaokraglenie;
	}
}
