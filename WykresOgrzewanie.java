package start;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.jdbc.JDBCPieDataset;

public class WykresOgrzewanie {
	public static void wykres_o() {

		String query = (String) (Menu.comboBox_1).getSelectedItem();
		try {

			String sql = "select " + query + ", SUM(Razem) from cieplo group by " + query + "";
			JDBCPieDataset baza = new JDBCPieDataset(Menu.polaczenie, sql);
			JFreeChart chart = ChartFactory.createPieChart("Ogrzewanie ", baza);

			ChartFrame frame = new ChartFrame("Wykres kosztów generowany wed³ug rekordu " + query + "", chart);

			frame.setVisible(true);
			frame.setBounds(1155, 220, 350, 350);

		} catch (Exception e3) {
			
		}

	}
}
