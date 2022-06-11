package start;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class FiltrO {
	/**
	 * This class is responsible for retrieving data from the database.
	 */
	public static void filtrowanie() {

		String rok = (String) (Menu.rok_o).getSelectedItem();

		String miesiac = (String) Menu.miesiac_o.getSelectedItem();

		String obiekt = (String) Menu.obiekt_o.getSelectedItem();

		String a = "select Rok, Data as Miesi¹c, Obiekt, Pobor as [Pobór (kW)], S as [Czas start], "
				+ "ST as [Czas stop],Suma as [Czas poboru (h)], Zuzycie as Zu¿ycie, Koszt as [Cena z³/kWh], Razem as Koszt"
				+ " from cieplo where  Rok = '" + rok + "' and Data = '" + miesiac + "' and Obiekt = '" + obiekt
				+ "' order by Rok desc";

		try {

			PreparedStatement p = Menu.polaczenie.prepareStatement(a);
			ResultSet rs = p.executeQuery();
			Menu.table_ogrzewanie_r.setModel(DbUtils.resultSetToTableModel(rs));
			rs.close();
			p.close();
		} catch (SQLException e1) {

			JOptionPane.showMessageDialog(null, "B³¹d");
			e1.printStackTrace();
		}

	}
}
