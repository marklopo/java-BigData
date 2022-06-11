package start;

public interface IKosztPrad {
	/**
	 * This interface converts the entered string
	 *  value to double and rounds it to two decimal places.
	 *
	 */
default double koszt() {
	
	String k = Menu.u_prad_koszt.getText();
	double koszt = Math.round(Double.valueOf(k) * 100d) / 100d;
	return koszt;
}
}
