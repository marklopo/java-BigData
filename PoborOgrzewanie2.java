package start;

import java.awt.Color;

import javax.swing.JTextField;

public class PoborOgrzewanie2 {

	public static void poborOgrzewanie2(JTextField temp_a, JTextField temp_p, double pobor) {

		
		
		Color o21 = Menu.o21.getBackground();
		Color o22 = Menu.o22.getBackground();
		Color o23 = Menu.o23.getBackground();
		Color o24 = Menu.o24.getBackground();
		Color o25 = Menu.o25.getBackground();

		String ta = temp_a.getText();
		String tp = temp_p.getText();

		double ta1 = Double.valueOf(ta);
		double tp1 = Double.valueOf(tp);
		double su = ta1;
		if (ta1 < tp1 && o21.equals(Color.red) && o22.equals(Color.red) && o23.equals(Color.red)
				&& o24.equals(Color.red) && o25.equals(Color.red)) {
			su = su + ((pobor / 100) * 5* 100d) / 100d;

		} else if (ta1 < tp1
				&& (o21.equals(Color.red) && o22.equals(Color.red)
						|| o23.equals(Color.red) && o24.equals(Color.red))
				|| o25.equals(Color.red) || (o22.equals(Color.red) && o24.equals(Color.red)
						|| o21.equals(Color.red) && o23.equals(Color.red))) {

			su = su + ((pobor / 100) * 2* 100d) / 100d;
		} else if (ta1 < tp1 && (o25.equals(Color.red) || o21.equals(Color.red) || o22.equals(Color.red)
				|| o23.equals(Color.red) || o24.equals(Color.red))) {

			su = su + ((pobor / 100) * 1* 100d) / 100d;
		}
		String ss = Double.toString(su);
		temp_a.setText(ss);

	}
}

