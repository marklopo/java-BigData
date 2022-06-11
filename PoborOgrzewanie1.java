package start;

import java.awt.Color;

import javax.swing.JTextField;

public class PoborOgrzewanie1 {

	public static void poborOgrzewanie1(JTextField temp_a, JTextField temp_p, double pobor) {

		
		Color o11 = Menu.o11.getBackground();
		Color o12 = Menu.o12.getBackground();
		Color o13 = Menu.o13.getBackground();
		Color o14 = Menu.o14.getBackground();
		Color o15 = Menu.o15.getBackground();
		Color o16 = Menu.o16.getBackground();
		String ta = temp_a.getText();
		String tp = temp_p.getText();

		double ta1 = Double.valueOf(ta);
		double tp1 = Double.valueOf(tp);
		double su = ta1;
		if (ta1 < tp1 && o11.equals(Color.red) && o12.equals(Color.red) && o13.equals(Color.red)
				&& o14.equals(Color.red) && o15.equals(Color.red) && o16.equals(Color.red)) {
			su = su + ((pobor / 100) * 6* 100d) / 100d;

		} else if (ta1 < tp1
				&& (o11.equals(Color.red) && o12.equals(Color.red)
						|| o13.equals(Color.red) && o14.equals(Color.red))
				|| o15.equals(Color.red) && o16.equals(Color.red)
				|| (o12.equals(Color.red) && o14.equals(Color.red)
						|| o11.equals(Color.red) && o13.equals(Color.red))) {

			su = su + ((pobor / 100) * 2* 100d) / 100d;
		} else if (ta1 < tp1 && (o15.equals(Color.red) || o16.equals(Color.red) || o11.equals(Color.red)
				|| o12.equals(Color.red) || o13.equals(Color.red) || o14.equals(Color.red))) {

			su = su + ((pobor / 100) * 1* 100d) / 100d;
		}
		String ss = Double.toString(su);
		temp_a.setText(ss);

	}

	
}
