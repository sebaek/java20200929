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

	int countXX(String str) {
		int cnt = 0;
		int len = str.length();

		// String sub = str.substring(0, 2);
		// str.substring(len-2, len);

		for (int i = 0; i <= len - 2; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals("xx")) {
				cnt++;
			}
		}

		return cnt;
	}

}
