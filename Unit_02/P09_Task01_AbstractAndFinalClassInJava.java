package Unit_02;

abstract class Bike{
	int a;
	Bike(){
		System.out.println("Inside Bike Constructor: "+a+"\n");
	}
	abstract void run(); // abstract method
	void display() {
		System.out.println("This is display method!");
	}
}

class Honda4 extends Bike{

	@Override
	void run() {
		System.out.println("run called");
	}
	
}

public class P09_Task01_AbstractAndFinalClassInJava {

	public static void main(String[] args) {
		Bike obj=new Honda4();
		obj.run();
		obj.display();
		// can not be instantiated
		// BIke obj2 =new Bike();
	}

}

final class Super{
	public int data=30;
	void display() {
		System.out.println(data);
	}
}
//public class Sub extends Super{
//	void display2() {
//		display();
//	}
//}
