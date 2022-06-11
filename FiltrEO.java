package start;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;
import start.Menu;

public class FiltrEO {
	/**
	 * This class is responsible for retrieving data from the database.
	 */
	public static void filtrujEO() {

		String a2 = "select Rok, ROUND(SUM(Razem),2) as [Koszt (z³)]" + " from elektrycznosc group by Rok";
		String a3 = "select Data as Miesi¹c, ROUND(AVG(Razem),2) as [Œredni koszt (z³)]"
				+ " from elektrycznosc group by Data";
		String a4 = "select Obiekt, ROUND(SUM(Razem),2) as [Koszt (z³)]" + " from elektrycznosc group by Obiekt";
		String a5 = "select COUNT(Id) as [Liczba Pomiarów], ROUND(SUM(Razem),2) as [Koszt (z³)]"
				+ " from elektrycznosc ";
		String a6 = "select Rok, ROUND(SUM(Razem),2) as [Koszt (z³)]" + " from cieplo group by Rok";
		String a7 = "select Data as Miesi¹c, ROUND(AVG(Razem),2) as [Œredni koszt (z³)]" + " from cieplo group by Data";
		String a8 = "select Obiekt, ROUND(SUM(Razem),2) as [Koszt (z³)]" + " from cieplo group by Obiekt";
		String a9 = "select COUNT(Id) as [Liczba Pomiarów], ROUND(SUM(Razem),2) as [Koszt (z³)]" + " from cieplo ";
		try {

			PreparedStatement p = Menu.polaczenie.prepareStatement(a2);
			ResultSet rs = p.executeQuery();
			Menu.koszty_rok.setModel(DbUtils.resultSetToTableModel(rs));
			rs.close();
			p.close();
		} catch (SQLException e1) {
			 

			JOptionPane.showMessageDialog(null, "B³¹d");
			e1.printStackTrace();
		}
		try {

			PreparedStatement p = Menu.polaczenie.prepareStatement(a3);
			ResultSet rs = p.executeQuery();
			Menu.koszty_miesiac.setModel(DbUtils.resultSetToTableModel(rs));
			rs.close();
			p.close();
		} catch (SQLException e1) {
			 

			JOptionPane.showMessageDialog(null, "B³¹d");
			e1.printStackTrace();
		}
		try {

			PreparedStatement p = Menu.polaczenie.prepareStatement(a4);
			ResultSet rs = p.executeQuery();
			Menu.koszty_obiekt.setModel(DbUtils.resultSetToTableModel(rs));
			rs.close();
			p.close();
		} catch (SQLException e1) {
			 

			JOptionPane.showMessageDialog(null, "B³¹d");
			e1.printStackTrace();
		}
		try {

			PreparedStatement p = Menu.polaczenie.prepareStatement(a5);
			ResultSet rs = p.executeQuery();
			Menu.pomiary.setModel(DbUtils.resultSetToTableModel(rs));
			rs.close();
			p.close();
		} catch (SQLException e1) {
			 

			JOptionPane.showMessageDialog(null, "B³¹d");
			e1.printStackTrace();
		}
		try {

			PreparedStatement p = Menu.polaczenie.prepareStatement(a6);
			ResultSet rs = p.executeQuery();
			Menu.koszty_rok_o.setModel(DbUtils.resultSetToTableModel(rs));
			rs.close();
			p.close();
		} catch (SQLException e1) {
			 

			JOptionPane.showMessageDialog(null, "B³¹d");
			e1.printStackTrace();
		}
		try {

			PreparedStatement p = Menu.polaczenie.prepareStatement(a7);
			ResultSet rs = p.executeQuery();
			Menu.koszty_miesiac_o.setModel(DbUtils.resultSetToTableModel(rs));
			rs.close();
			p.close();
		} catch (SQLException e1) {
			 

			JOptionPane.showMessageDialog(null, "B³¹d");
			e1.printStackTrace();
		}
		try {

			PreparedStatement p = Menu.polaczenie.prepareStatement(a8);
			ResultSet rs = p.executeQuery();
			Menu.koszty_obiekt_o.setModel(DbUtils.resultSetToTableModel(rs));
			rs.close();
			p.close();
		} catch (SQLException e1) {
			 

			JOptionPane.showMessageDialog(null, "B³¹d");
			e1.printStackTrace();
		}
		try {

			PreparedStatement p = Menu.polaczenie.prepareStatement(a9);
			ResultSet rs = p.executeQuery();
			Menu.pomiary_o.setModel(DbUtils.resultSetToTableModel(rs));
			rs.close();
			p.close();
		} catch (SQLException e1) {
			 

			JOptionPane.showMessageDialog(null, "B³¹d");
			e1.printStackTrace();
		}

		RaportOdsiwezOgrzewanie.odsiwezOgrzewanieRaport();
	}

}
