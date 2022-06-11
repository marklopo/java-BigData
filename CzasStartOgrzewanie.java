package start;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class CzasStartOgrzewanie {
	public static void czasStartOgrzewanie(String czas, String obiekt, String id) {
		/**
		 * This class is responsible for putting the data into the 
		 * database when the heating is turned on.
		 *
		 */
		try {
			String czasedit = "update cieplo set S=? where Obiekt=? and Id=?";
			PreparedStatement st = Menu.polaczenie.prepareStatement(czasedit);

			st.setString(1, czas);
			st.setString(2, obiekt);
			st.setString(3, id);
			st.executeUpdate();

			st.close();
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "B³¹d - czas start.");

		}

		RaportOdsiwezOgrzewanie.odsiwezOgrzewanieRaport();
	}

}
