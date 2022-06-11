package start;

import java.awt.Color;

public class MenuAdmin {
	
	static Color a = Color.WHITE;
	static Color b = new Color(47, 79, 79);
	
	public void menuAdmin() {

		Menu.panel_start.setBackground(b);
		Menu.lbl_start.setForeground(a);
		Menu.panel_ustawienia.setBackground(b);
		Menu.lbl_ustawienia.setForeground(a);
		Menu.panel_wyloguj.setBackground(b);
		Menu.lbl_wyloguj.setForeground(a);
		Menu.panel_admin.setBackground(a);
		Menu.lbl_admin.setForeground(b);
		Menu.p_start.setVisible(false);
		Menu.p_ustawienia.setVisible(false);
		Menu.p_admin.setVisible(true);
		Menu.p_wyloguj.setVisible(false);
		FiltrE.filtrowanie();
		FiltrO.filtrowanie();
		FiltrEO.filtrujEO();
			OdswiezZabezpieczenia.odswiezZabezpieczenia();
			RaportOdswiezElektrycznosc.odswiezElektrycznoscRaport();
			OdswiezElektrycznosc.odswiez();
			OdswezOgrzewanie.odswiez();
			Wyszukiwanie.filtruj();
	}
}
