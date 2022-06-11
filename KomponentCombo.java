package start;

import javax.swing.DefaultComboBoxModel;

public class KomponentCombo {
	@SuppressWarnings("unchecked")
	public static void wyznacz() {
		Menu.status.setModel(new DefaultComboBoxModel<Object>(new String[] { "--Status--", "OTWARTE", "Zamkniête", }));
		if (Menu.widok.getSelectedItem().equals("FRONT") && Menu.poziom.getSelectedItem().equals("0")) {
			Menu.obiekt.setModel(new DefaultComboBoxModel<Object>(new String[] { "--Obiekt--", "BRAK", }));

		} else if (Menu.widok.getSelectedItem().equals("FRONT") && Menu.poziom.getSelectedItem().equals("1")) {
			Menu.obiekt.setModel(new DefaultComboBoxModel<Object>(new String[] { "--Obiekt--", "Okno 11", }));

		} else if (Menu.widok.getSelectedItem().equals("FRONT") && Menu.poziom.getSelectedItem().equals("2")) {
			Menu.obiekt.setModel(
					new DefaultComboBoxModel<Object>(new String[] { "--Obiekt--", "Okno 21", "Okno 22", "Drzwi 21" }));

		} else if (Menu.widok.getSelectedItem().equals("PO£UDNIE") && Menu.poziom.getSelectedItem().equals("0")) {
			Menu.obiekt.setModel(new DefaultComboBoxModel<Object>(new String[] { "--Obiekt--", "BRAK", }));

		} else if (Menu.widok.getSelectedItem().equals("PO£UDNIE") && Menu.poziom.getSelectedItem().equals("1")) {
			Menu.obiekt.setModel(new DefaultComboBoxModel<Object>(new String[] { "--Obiekt--", "Okno 12", }));

		} else if (Menu.widok.getSelectedItem().equals("PO£UDNIE") && Menu.poziom.getSelectedItem().equals("2")) {
			Menu.obiekt.setModel(new DefaultComboBoxModel<Object>(new String[] { "--Obiekt--", "Okno 23", }));

		} else if (Menu.widok.getSelectedItem().equals("TY£") && Menu.poziom.getSelectedItem().equals("0")) {
			Menu.obiekt.setModel(new DefaultComboBoxModel<Object>(new String[] { "--Obiekt--", "BRAK", }));

		} else if (Menu.widok.getSelectedItem().equals("TY£") && Menu.poziom.getSelectedItem().equals("1")) {
			Menu.obiekt.setModel(
					new DefaultComboBoxModel<Object>(new String[] { "--Obiekt--", "Okno 13", "Okno 14", "Drzwi 11", }));

		} else if (Menu.widok.getSelectedItem().equals("TY£") && Menu.poziom.getSelectedItem().equals("2")) {
			Menu.obiekt.setModel(new DefaultComboBoxModel<Object>(new String[] { "--Obiekt--", "Okno 24", "Okno 25" }));

		} else if (Menu.widok.getSelectedItem().equals("PÓ£NOC") && Menu.poziom.getSelectedItem().equals("0")) {
			Menu.obiekt.setModel(new DefaultComboBoxModel<Object>(new String[] { "--Obiekt--", "BRAK", }));

		} else if (Menu.widok.getSelectedItem().equals("PÓ£NOC") && Menu.poziom.getSelectedItem().equals("1")) {
			Menu.obiekt.setModel(new DefaultComboBoxModel<Object>(new String[] { "--Obiekt--", "Okno 15" }));

		} else if (Menu.widok.getSelectedItem().equals("PÓ£NOC") && Menu.poziom.getSelectedItem().equals("2")) {
			Menu.obiekt.setModel(new DefaultComboBoxModel<Object>(new String[] { "--Obiekt--", "Okno 26" }));

		}
	}
}
