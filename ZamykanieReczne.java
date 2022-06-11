package start;

import java.awt.Color;

public class ZamykanieReczne implements IStatusZabezpieczenia,IStatusO {

	public void reczneZamykanie() {

		boolean stat_o = pobierzStatusO();
		boolean stat_z = pobierzStatusZ();
		String obiekt = pobierzObiekt();

		Color zamkniete = new Color(153, 51, 0);
		Color otwarte = new Color(102, 204, 255);

		if (obiekt.equals("Okno 11") && stat_z) {

			Menu.front_okno01.setBackground(zamkniete);

		}
		if (obiekt.equals("Okno 11") && stat_o) {

			Menu.front_okno01.setBackground(otwarte);

		}
		if (obiekt.equals("Okno 21") && stat_z) {

			Menu.front_okno11.setBackground(zamkniete);

		}
		if (obiekt.equals("Okno 21") && stat_o) {

			Menu.front_okno11.setBackground(otwarte);

		}
		if (obiekt.equals("Okno 22") && stat_z) {

			Menu.front_okno12.setBackground(zamkniete);

		}
		if (obiekt.equals("Okno 22") && stat_o) {

			Menu.front_okno12.setBackground(otwarte);

		}
		if (obiekt.equals("Drzwi 21") && stat_z) {

			Menu.front_drzwi11.setBackground(zamkniete);

		}
		if (obiekt.equals("Drzwi 21") && stat_o) {

			Menu.front_drzwi11.setBackground(otwarte);

		}
		if (obiekt.equals("Okno 12") && stat_z) {

			Menu.okno02.setBackground(zamkniete);

		}
		if (obiekt.equals("Okno 12") && stat_o) {

			Menu.okno02.setBackground(otwarte);

		}
		if (obiekt.equals("Okno 13") && stat_z) {

			Menu.okno03.setBackground(zamkniete);

		}
		if (obiekt.equals("Okno 13") && stat_o) {

			Menu.okno03.setBackground(otwarte);

		}
		if (obiekt.equals("Okno 14") && stat_z) {

			Menu.okno04.setBackground(zamkniete);

		}
		if (obiekt.equals("Okno 14") && stat_o) {

			Menu.okno04.setBackground(otwarte);

		}
		if (obiekt.equals("Okno 23") && stat_z) {

			Menu.okno13.setBackground(zamkniete);

		}
		if (obiekt.equals("Okno 23") && stat_o) {

			Menu.okno13.setBackground(otwarte);

		}
		if (obiekt.equals("Okno 24") && stat_z) {

			Menu.okno14.setBackground(zamkniete);

		}
		if (obiekt.equals("Okno 24") && stat_o) {

			Menu.okno14.setBackground(otwarte);

		}
		if (obiekt.equals("Drzwi 12") && stat_z) {

			Menu.drzwi01.setBackground(zamkniete);

		}
		if (obiekt.equals("Drzwi 12") && stat_o) {

			Menu.drzwi01.setBackground(otwarte);

		}

	}

}
