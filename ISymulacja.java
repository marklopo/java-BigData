package start;

public interface ISymulacja {
	/*
	 * This interface is responsible
	 *  for converting values ​​in the form of string to integer.
	 * */
	default int temperatura1() {
		int t1 = Integer.valueOf((String) Menu.combo_sym_temp1.getSelectedItem());
		return t1;
		
	}
	default int temperatura2() {
		int t2 = Integer.valueOf((String) Menu.combo_sym_temp2.getSelectedItem());
		return t2;
		
	}
	default int wilgotnosc1() {
		int w = Integer.valueOf((String) Menu.combo_sym_wilg.getSelectedItem());
		return w;
		
	}
	default int wilgotnosc2() {
		int wp = Integer.valueOf((String) Menu.meteo_wilg.getText());
		return wp;
		
	}
	
	default int temperatura3() {
		int tp = Integer.valueOf((String) Menu.meteo_temp.getText());
		return tp;
		
	}
	
}
