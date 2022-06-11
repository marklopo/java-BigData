package start;

import java.awt.Color;

import javax.swing.JTextField;

public class PoborOgrzewanie0 {

	public static void poborOgrzewanie0(JTextField temp_a, JTextField temp_p, double pobor) {

		Color o01 = Menu.o01.getBackground();
		Color o02 = Menu.o02.getBackground();
		Color o03 = Menu.o03.getBackground();
		Color o04 = Menu.o04.getBackground();
		String ta = temp_a.getText();
		String tp = temp_p.getText();

		double ta1 = Double.valueOf(ta);
		double tp1 = Double.valueOf(tp);
		double su = ta1;
		if (ta1 < tp1 && o01.equals(Color.red) && o02.equals(Color.red) && o03.equals(Color.red)
				&& o04.equals(Color.red)) {
			su = su + ((pobor / 100) * 4* 100d) / 100d;

		} else if (ta1 < tp1
				&& (o01.equals(Color.red) && o02.equals(Color.red) || o03.equals(Color.red) && o04.equals(Color.red))
				|| (o02.equals(Color.red) && o04.equals(Color.red) || o01.equals(Color.red) && o03.equals(Color.red))) {

			su = su + ((pobor / 100) * 2* 100d) / 100d;
		} else if (ta1 < tp1
				&& (o01.equals(Color.red) || o02.equals(Color.red) || o03.equals(Color.red) || o04.equals(Color.red))) {

			su = su + ((pobor / 100) * 1* 100d) / 100d;
		}
		String ss = Double.toString(su);
		temp_a.setText(ss);

	}
}
