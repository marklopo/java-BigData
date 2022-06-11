package start;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.proteanit.sql.DbUtils;

public class RaportOdsiwezOgrzewanie {
	public static void odsiwezOgrzewanieRaport() {

		String a = "select Rok, Data as Miesi¹c, Obiekt, Pobor as [Pobór (kW)], S as [Czas start], "
				+ "ST as [Czas stop],Suma as [Czas poboru (h)], Zuzycie as Zu¿ycie, Koszt as [Cena z³/kWh], Razem as Koszt"
				+ " from cieplo order by Rok desc";

		try {

			PreparedStatement p = Menu.polaczenie.prepareStatement(a);
			ResultSet rs = p.executeQuery();

			Menu.table_ogrzewanie_r.setModel(DbUtils.resultSetToTableModel(rs));
			p.close();
			rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
