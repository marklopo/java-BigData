package start;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.proteanit.sql.DbUtils;

public class OdswiezZabezpieczenia {
	public static void odswiezZabezpieczenia() {

		String query = "select * from zabezpieczenia where Status='Zamkniête' order by Status desc";

		try {

			PreparedStatement p = Menu.polaczenie.prepareStatement(query);
			ResultSet rs = p.executeQuery();

			Menu.table.setModel(DbUtils.resultSetToTableModel(rs));
			p.close();
			rs.close();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}

	}
}
