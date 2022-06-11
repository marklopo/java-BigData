package start;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class StatusOgrzewanie {
	public static void statusO(String obiekt, String status) {

		try {
			String query = "select * from c where Obiekt=? and Status=? ";
			PreparedStatement st2 = Menu.polaczenie.prepareStatement(query);
			st2.setString(1, obiekt);
			st2.setString(2, status);
			ResultSet set = st2.executeQuery();

			if (set.next() == true) {
				JOptionPane.showMessageDialog(null, "Obiekt " + obiekt + " ma ju¿ status " + status + ".");

				set.close();
				st2.close();
			}

			else {

				try {
					String query2 = "update c set Status=? where Obiekt=?";
					PreparedStatement st = Menu.polaczenie.prepareStatement(query2);

					st.setString(1, status);
					st.setString(2, obiekt);

					st.executeUpdate();
					st.close();

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "B³¹d zapisu.");

				}

			}
		}

		catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "B³¹d zapisu.");
		}

	}
}
