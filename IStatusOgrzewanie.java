package start;

public interface IStatusOgrzewanie {
	default String statusWlaczony() {
		
		String status = "W��CZONY";
		return status;
	}
	default String statusWylaczony() {
		
		String status = "Wy��czony";
		return status;
	}
}
