package start;

import java.awt.Color;

public class MenuUstawienia {
	
	static Color a = Color.WHITE;
	static Color b = new Color(47, 79, 79);
	
	public void menuUstawienia() {

		Menu.panel_start.setBackground(b);
		Menu.lbl_start.setForeground(a);
		Menu.panel_ustawienia.setBackground(a);
		Menu.lbl_ustawienia.setForeground(b);
		Menu.panel_wyloguj.setBackground(b);
		Menu.lbl_wyloguj.setForeground(a);
		Menu.panel_admin.setBackground(b);
		Menu.lbl_admin.setForeground(a);
		Menu.p_start.setVisible(false);
		Menu.p_ustawienia.setVisible(true);
		Menu.p_admin.setVisible(false);
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
