package chap11.textbook.s111203;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		Integer value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		int i = Integer.valueOf("30");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
	}
}
