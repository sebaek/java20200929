package codingbat;

public class WarmUp2 {
	public String stringTimes(String str, int n) {
		String res = "";

		for (int i = 0; i < n; i++) {
			res += str;
		}

		return res;
	}

	public String frontTimes(String str, int n) {
		String res = "";

		String front = str;

		if (str.length() > 3) {
			front = str.substring(0, 3);
		}

		for (int i = 0; i < n; i++) {
			res += front;
		}

		return res;
	}

}
