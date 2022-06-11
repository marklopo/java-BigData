package start;

import java.sql.SQLException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.jdbc.JDBCPieDataset;

public class WykresElektrycznosc {
	public static void wykres() throws SQLException {

		String query = (String) Menu.comboBox.getSelectedItem();

		String sql = "select " + query + ", SUM(Razem) from elektrycznosc group by " + query + "";
		JDBCPieDataset baza = new JDBCPieDataset(Menu.polaczenie, sql);
		JFreeChart chart = ChartFactory.createPieChart("Elektrycznoœæ ", baza);

		ChartFrame frame = new ChartFrame("Wykres kosztów generowany wed³ug rekordu " + query + "", chart);

		frame.setVisible(true);
		frame.setBounds(1155, 220, 350, 350);

	}
}
