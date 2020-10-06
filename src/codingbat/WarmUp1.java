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

}
