
public class View {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++){
			Thread numThread = new Controller();
			numThread.start();
		}
	}

}
