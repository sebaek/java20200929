package test;

class Car {
	
}

class Person {
	Person(Car c) {
		
	}
}

public class Test3 {
	public static void main(String[] args) {
//		Car a = new Car();
		Person p = new Person(new Car());
		
		Car a = new Car();
		Person p2 = new Person(a);
	}
}
