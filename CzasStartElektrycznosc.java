package start;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;


public class CzasStartElektrycznosc {
	/**
	 * This class is responsible for putting data into the database when the power is turned on.
	 *
	 */
	public static void czas_start(String czas, String obiekt, String id) {

		try {
			String czasedit = "update elektrycznosc set S=? where Obiekt=? and Id=?";
			PreparedStatement st = Menu.polaczenie.prepareStatement(czasedit);

			st.setString(1, czas);
			st.setString(2, obiekt);
			st.setString(3, id);
			st.executeUpdate();

			st.close();
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "B³¹d.");

		}

		RaportOdswiezElektrycznosc.odswiezElektrycznoscRaport();
	}
}
