package start;

import java.sql.PreparedStatement;

import start.Menu;

public class ZapiszOgrzewanie {
	public static void zapisz(String id, String rok, String data, String poziom, String obiekt,
			double pobor) {
		rok = Menu.a_rok.getText();

		data = Menu.a_miesiac.getText();

		try {
			String prad = "insert into cieplo values (?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement st = Menu.polaczenie.prepareStatement(prad);
			st.setString(1, id);
			st.setString(2, rok);
			st.setString(3, data);
			st.setString(4, poziom);
			st.setString(5, obiekt);
			st.setDouble(6, pobor);
			st.executeUpdate();

			st.close();
		} catch (Exception e2) {

			e2.printStackTrace();
		}

	}
}
