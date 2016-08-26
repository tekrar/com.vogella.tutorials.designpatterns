
public class Singleton {
	private static Singleton uniqInstance;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (uniqInstance == null) {
			uniqInstance = new Singleton();
		}
		return uniqInstance;
	}
	// other useful methods here
}
