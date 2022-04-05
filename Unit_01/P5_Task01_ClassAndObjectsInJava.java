package Unit_01;

public class P5_Task01_ClassAndObjectsInJava {

	public static void main(String[] args) {
		ABC obj=new ABC();
		obj.display2();
		ABC.display();
	}

}
class ABC{
	int a=10;
	static int b=10;
	static void display() {
		int b=10;
		b++;
		System.out.println(b);
	}
	void display2() {
		System.out.println(a);
	}
}