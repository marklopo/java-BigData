package start;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class ZabezpieczeniaOtwarte {
	public static void pokarzOtwarte() {
	try {
		String query = "update zabezpieczenia set Status='OTWARTE'";
		PreparedStatement st = Menu.polaczenie.prepareStatement(query);
		st.executeUpdate();
		st.close();

	} catch (Exception e2) {
		JOptionPane.showMessageDialog(null, "B³¹d edycji.");

	}
	OdswiezZabezpieczenia.odswiezZabezpieczenia();
}}
