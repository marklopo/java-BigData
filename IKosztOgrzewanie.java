package start;




public interface IKosztOgrzewanie {
	/**
	 * This interface converts the entered string
	 *  value to double and rounds it to two decimal places.
	 *
	 */
	default double koszt() {
	
	String k1 = Menu.u_cieplo_koszt.getText();
	double koszt = Math.round(Double.valueOf(k1) * 100d) / 100d;
	return koszt;
}}
