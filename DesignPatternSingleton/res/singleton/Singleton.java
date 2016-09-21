
public class Singleton {
	private static Singleton uniqInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (uniqInstance == null) {
		synchronized(this) {
			if (uniqInstance == null)
				uniqInstance = new Singleton();
			}
		}
		return uniqInstance;
	}
	// other useful methods here
}
