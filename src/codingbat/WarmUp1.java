package codingbat;

public class WarmUp1 {
	public boolean sleepIn(boolean weekday, boolean vacation) {

		return !weekday || vacation;

	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}

	public int sumDouble(int a, int b) {
		int sum = a + b;

		sum = (a == b) ? sum * 2 : sum;

		return sum;
	}

	public int diff21(int n) {
		int diff = 21 - n;
		diff = (n > 21) ? diff * 2 : diff;
		diff = (diff < 0) ? -diff : diff;
		return diff;
	}

}
