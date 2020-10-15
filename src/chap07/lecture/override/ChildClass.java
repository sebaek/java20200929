package chap07.lecture.override;

public class ChildClass extends ParentClass {
	void method2() {
		System.out.println("child method");
	}
	// 주석.....
	
	@Override
	void method1() {
		System.out.println("child method1!!!!!!!!");
	}
}
