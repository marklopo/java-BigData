package start;

public interface IStatusZabezpieczenia {
default boolean pobierzStatusZ() {
	boolean z = Menu.status.getSelectedItem().equals("Zamkni�te");
	
	return z;
}
default boolean pobierzStatusO() {
	
	boolean o = Menu.status.getSelectedItem().equals("OTWARTE");
	return o;
	
}

}
