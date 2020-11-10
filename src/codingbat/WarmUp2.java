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

	boolean doubleX(String str) {
		int xinx = str.indexOf("x");
		int xxinx = str.indexOf("xx");

		if (xinx == -1) {
			return false;
		}

		if (xinx == xxinx) {
			return true;
		}

		return false;
	}

	public String stringBits(String str) {
		String res = "";

		for (int i = 0; i < str.length(); i += 2) {
			res += str.charAt(i);
		}

		return res;
	}

	public String stringSplosion(String str) {
		String res = "";

		for (int i = 1; i <= str.length(); i++) {
			res += str.substring(0, i);
		}

		return res;
	}

	public int last2(String str) {
		int len = str.length();
		if (len >= 2) {
			int cnt = 0;
			String last2 = str.substring(len - 2, len);
			for (int i = 0; i < len - 1; i++) {
				String sub = str.substring(i, i + 2);
				if (sub.equals(last2)) {
					cnt++;
				}
			}
			return cnt - 1;
		}
		return 0;
	}

	public int arrayCount9(int[] nums) {
		int cnt = 0;
		for (int n : nums) {
			if (n == 9) {
				cnt++;
			}
		}

		return cnt;
	}

	public boolean arrayFront9(int[] nums) {
		for (int i = 0; i < nums.length && i < 4; i++) {
			if (nums[i] == 9) {
				return true;
			}
		}

		return false;
	}

	public boolean array123(int[] nums) {
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] == 2) {
				if (nums[i - 1] == 1 && nums[i + 1] == 3) {
					return true;
				}
			}
		}

		return false;
	}

	public int stringMatch(String a, String b) {
		int lena = a.length();
		int lenb = b.length();

		int loop = Math.min(lena, lenb) - 1;

		int cnt = 0;
		for (int i = 0; i < loop; i++) {
			String suba = a.substring(i, i + 2);
			String subb = b.substring(i, i + 2);

			if (suba.equals(subb)) {
				cnt++;
			}
		}
		return cnt;
	}

	public String stringX(String str) {
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (i == 0 || i == str.length() - 1) {
				res += c;
				continue;
			}
			if (c != 'x') {
				res += c;
			}
		}

		return res;
	}

}
