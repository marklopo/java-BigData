package start;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class CzasStopElektryczno?? {
	public static void czasStop(String stop, double suma, double koszt1, String obiekt, String id) {
		/**
		 * This class is responsible for putting data into 
		 * the database when the power is turned off.
		 *
		 */
		try {
			String czasedit = "update elektrycznosc set ST=?, Suma=?, Koszt=? where Obiekt=? and Id=?";

			PreparedStatement st = Menu.polaczenie.prepareStatement(czasedit);
			st.setString(1, stop);
			st.setDouble(2, suma);
			st.setDouble(3, koszt1);
			st.setString(4, obiekt);
			st.setString(5, id);
			st.executeUpdate();
			st.close();

		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "B??d - czas stop.");

		}
		try {
			String czasedit = "update elektrycznosc set Zuzycie = (Pobor * Suma*100)/100 where Obiekt=? and Id=?";
			PreparedStatement st = Menu.polaczenie.prepareStatement(czasedit);

			st.setString(1, obiekt);
			st.setString(2, id);
			st.executeUpdate();
			st.close();

		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "B??d - czas stop.");

		}
		try {
			String czasedit = "update elektrycznosc set Razem = ROUND((Zuzycie * Koszt),2) where Obiekt=? and Id=?";
			PreparedStatement st = Menu.polaczenie.prepareStatement(czasedit);

			st.setString(1, obiekt);
			st.setString(2, id);
			st.executeUpdate();
			st.close();

		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "B??d - czas stop.");

		}

		RaportOdswiezElektrycznosc.odswiezElektrycznoscRaport();
	}

}
