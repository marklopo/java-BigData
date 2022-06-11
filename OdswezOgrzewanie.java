package start;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.proteanit.sql.DbUtils;

public class OdswezOgrzewanie {
	public static void odswiez() {

		String query = "select * from c  where Status='W£¥CZONY' order by Status desc";

		try {

			PreparedStatement p = Menu.polaczenie.prepareStatement(query);
			ResultSet rs = p.executeQuery();

			Menu.table_ogrzewanie.setModel(DbUtils.resultSetToTableModel(rs));
			p.close();
			rs.close();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}

	}
}
