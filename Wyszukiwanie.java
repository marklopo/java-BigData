package start;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;


public class Wyszukiwanie {
	/**
	 * This class contains 
	 * the methods used to sort the data from the database during the filtering process.
	 *
	 */
	
	public static void filtruj() {
		Menu.rok_e.removeAllItems();
		Menu.miesiac_e.removeAllItems();
		Menu.obiekt_e.removeAllItems();

		try {
			String sql = "select Rok from elektrycznosc group by Rok";
			PreparedStatement st = Menu.polaczenie.prepareStatement(sql);
			ResultSet rs1 = st.executeQuery();

			while (rs1.next()) {
				String rok = rs1.getString("Rok");
				Menu.rok_e.addItem(rok);

			}
			rs1.close();
			st.close();

		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "B³¹d odczytu");

		}
		try {
			String sql = "select Data from elektrycznosc group by Data";
			PreparedStatement st = Menu.polaczenie.prepareStatement(sql);
			ResultSet rs1 = st.executeQuery();

			while (rs1.next()) {
				String miesiac = rs1.getString("Data");
				Menu.miesiac_e.addItem(miesiac);

			}

			st.close();
			rs1.close();
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "B³¹d odczytu");

		}

		try {
			String sql = "select Obiekt from elektrycznosc group by Obiekt";
			PreparedStatement st = Menu.polaczenie.prepareStatement(sql);
			ResultSet rs1 = st.executeQuery();

			while (rs1.next()) {
				String obiekt = rs1.getString("Obiekt");
				Menu.obiekt_e.addItem(obiekt);

			}
			rs1.close();
			st.close();

		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "B³¹d odczytu");

		}
		Menu.rok_o.removeAllItems();
		Menu.miesiac_o.removeAllItems();
		Menu.obiekt_o.removeAllItems();
		try {
			String sql = "select Rok from cieplo group by Rok";
			PreparedStatement st = Menu.polaczenie.prepareStatement(sql);
			ResultSet rs1 = st.executeQuery();

			while (rs1.next()) {
				String rok = rs1.getString("Rok");
				Menu.rok_o.addItem(rok);

			}
			rs1.close();
			st.close();

		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "B³¹d odczytu");

		}
		try {
			String sql = "select Data from cieplo group by Data";
			PreparedStatement st = Menu.polaczenie.prepareStatement(sql);
			ResultSet rs1 = st.executeQuery();

			while (rs1.next()) {
				String miesiac = rs1.getString("Data");
				Menu.miesiac_o.addItem(miesiac);

			}

			st.close();
			rs1.close();
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "B³¹d odczytu");

		}
		try {
			String sql = "select Obiekt from cieplo group by Obiekt";
			PreparedStatement st = Menu.polaczenie.prepareStatement(sql);
			ResultSet rs1 = st.executeQuery();

			while (rs1.next()) {
				String obiekt = rs1.getString("Obiekt");
				Menu.obiekt_o.addItem(obiekt);

			}
			rs1.close();
			st.close();

		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "B³¹d odczytu");

		}
	}

}
