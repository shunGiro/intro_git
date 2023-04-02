package pack;

public class SampleVariable {
	public static void main(String[] args) {
		System.out.println("いったん全削除");

		System.out.println(message());
	}

	/**
	 * @return
	 */
	static String message() {
		return "いったん全削除後に追加:こんにちわ";
	}
}
