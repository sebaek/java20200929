package codingbat;

public class String1 {
	public String helloName(String name) {
		return "Hello " + name + "!";
	}

	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public String makeOutWord(String out, String word) {
		return out.substring(0, 2) + word + out.substring(2);
	}

	public String extraEnd(String str) {
		int len = str.length();
		String last = str.substring(len - 2);

		return last + last + last;
	}

	public String firstTwo(String str) {
		int len = str.length();

		if (len > 2) {
			return str.substring(0, 2);
		}

		return str;
	}

	public String firstHalf(String str) {
		int len = str.length();
		return str.substring(0, len / 2);
	}

	public String withoutEnd(String str) {

		return str.substring(1, str.length() - 1);
	}

	public String comboString(String a, String b) {
		int lena = a.length();
		int lenb = b.length();

		if (lena < lenb) {
			return a + b + a;
		} else {
			return b + a + b;
		}
	}

	public String nonStart(String a, String b) {
		return a.substring(1) + b.substring(1);
	}

	public String left2(String str) {
		return str.substring(2) + str.substring(0, 2);
	}

	public String right2(String str) {
		int len = str.length();

		return str.substring(len - 2) + str.substring(0, len - 2);
	}

	public String theEnd(String str, boolean front) {
		String res = "";

		if (front) {
			res = str.substring(0, 1);
		} else {
			res = str.substring(str.length() - 1);
		}

		return res;
	}

	public String withouEnd2(String str) {
		if (str.length() < 3) {
			return "";
		} else {
			return str.substring(1, str.length() - 1);
		}
	}

	public String middleTwo(String str) {
		int mid = str.length() / 2;
		return str.substring(mid - 1, mid + 1);
	}

	public boolean endsLy(String str) {
		return str.endsWith("ly");
	}

	public String twoChar(String str, int index) {
		if (index + 2 > str.length() || index < 0) {
			return str.substring(0, 2);
		}

		return str.substring(index, index + 2);
	}

	public String middleThree(String str) {
		int mid = str.length() / 2;

		return str.substring(mid - 1, mid + 2);
	}

	public boolean hasBad(String str) {
		int idx = str.indexOf("bad");

		return idx == 0 || idx == 1;
	}

	public String atFirst(String str) {
		while (str.length() < 2) {
			str += "@";
		}
		return str.substring(0, 2);
	}

	public String lastChars(String a, String b) {
		a = at(a);
		b = at(b);

		int lena = a.length();
		int lenb = b.length();

		return a.substring(0, 1) + b.substring(lenb - 1);
	}

	private String at(String str) {
		while (str.length() < 1) {
			str += "@";
		}
		return str;
	}

	public String conCat(String a, String b) {
		int lena = a.length();
		int lenb = b.length();

		if (lena > 0 && lenb > 0) {
			if (a.charAt(lena - 1) == b.charAt(0)) {
				b = b.substring(1);
			}
		}
		return a + b;
	}

	public String lastTwo(String str) {

		int len = str.length();

		if (len < 2) {
			return str;
		}

		char last1 = str.charAt(len - 2);
		char last2 = str.charAt(len - 1);

		return str.substring(0, len - 2) + last2 + last1;
	}

	public String seeColor(String str) {
		if (str.startsWith("red")) {
			return "red";
		}

		if (str.startsWith("blue")) {
			return "blue";
		}

		return "";
	}

	public boolean frontAgain(String str) {
		int len = str.length();

		if (len < 2) {
			return false;
		}

		String front = str.substring(0, 2);
		String end = str.substring(len - 2);

		return front.equals(end);

	}

	public String minCat(String a, String b) {
		int lena = a.length();
		int lenb = b.length();

		int min = (lena < lenb) ? lena : lenb;

		return a.substring(lena - min) + b.substring(lenb - min);
	}

	public String extraFront(String str) {
		if (str.length() > 2) {
			String front = str.substring(0, 2);

			return front + front + front;

		} else {
			return str + str + str;
		}

	}

	public String without2(String str) {
		int len = str.length();

		if (len >= 2) {
			String front = str.substring(0, 2);
			String end = str.substring(len - 2);

			if (front.equals(end)) {
				return str.substring(2);
			}
		}
		return str;

	}

	public String deFront(String str) {
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && str.charAt(i) == 'a') {
				res += str.charAt(i);
			}

			if (i == 1 && str.charAt(i) == 'b') {
				res += str.charAt(i);
			}

			if (i >= 2) {
				res += str.charAt(i);
			}
		}

		return res;
	}

	public String startWord(String str, String word) {
		int strLen = str.length();
		int wordLen = word.length();

		if (strLen < wordLen) {
			return "";
		}

		word = str.charAt(0) + word.substring(1);

		if (str.startsWith(word)) {
			return word;
		} else {
			return "";
		}
	}

	public String withoutX(String str) {
		String res = "";

		if (str.startsWith("x")) {
			res = str.substring(1);
		} else {
			res = str;
		}

		if (res.endsWith("x")) {
			res = res.substring(0, res.length() - 1);
		}

		return res;
	}

	public String withoutX2(String str) {
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			if (i > 1 || str.charAt(i) != 'x') {
				res += str.charAt(i);
			}
		}

		return res;
	}

}
