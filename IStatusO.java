package start;

public interface IStatusO {
	default String pobierzObiekt() {
		
		String obiekt = (String) Menu.obiekt.getSelectedItem();
		return obiekt;
		
	}
	default String pobierzStatus() {
		
		String status = (String) Menu.status.getSelectedItem();
		return status;
		
	}
}
