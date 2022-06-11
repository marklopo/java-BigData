package start;

import java.awt.Color;

public class MenuWyloguj {
	
	static Color a = Color.WHITE;
	static Color b = new Color(47, 79, 79);
	
	public static void menuWyloguj() {

		Menu.panel_start.setBackground(b);
		Menu.lbl_start.setForeground(a);
		Menu.panel_ustawienia.setBackground(b);
		Menu.lbl_ustawienia.setForeground(a);
		Menu.panel_wyloguj.setBackground(a);
		Menu.lbl_wyloguj.setForeground(b);
		Menu.panel_admin.setBackground(b);
		Menu.lbl_admin.setForeground(a);
		Menu.p_start.setVisible(false);
		Menu.p_ustawienia.setVisible(false);
		Menu.p_admin.setVisible(false);
		Menu.p_wyloguj.setVisible(true);
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
