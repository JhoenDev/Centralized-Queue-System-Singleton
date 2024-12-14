public class CentralQue {
	private static CentralQue instance;
	private int queNum;

	private CentralQue() {
	}

	public static synchronized CentralQue getInstance() {
		if (instance == null) {
			instance = new CentralQue();
		}
		return instance;
	}

	public synchronized void resetQue() {
		queNum = 0;
	}

	public synchronized void addQueNum() {
		queNum++;
	}

	public synchronized int getCurrentQue() {
		return queNum;
	}

}
