package start;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Polaczenie {

	static Connection polaczenie = null;

	public static Connection database() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:dom.sqlite");

			return con;

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "B��d po��czenia z baz� danych");
			return null;
		}
	}
}
