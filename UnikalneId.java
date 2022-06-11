package start;

public class UnikalneId {
	public static String Id() {
		double id = Math.random();

		String uniId = Double.toString(id);

		return uniId;
	}
}
