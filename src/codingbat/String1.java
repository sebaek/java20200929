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

}
