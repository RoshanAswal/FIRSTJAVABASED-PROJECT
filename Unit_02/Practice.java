package Unit_02;

import java.util.Scanner;
class Practice {
  public static void main(String[] args) {
//	  SDT s=new SDT();
//	  s.display();
	  C10 c=new C10();
	  c.display();
  }

}
class A10{
	int a;
	A10(){
		a=10;
	}
}
class B10 extends A10{
	int a;
	B10(){
		a=super.a;
		
	}
}
class C10 extends B10{
	int a;
	C10(){
		a=12;
	}
	void display() {
		System.out.println(super.a);
	}
}
interface t{
	int a=10;
}
interface temp2{
	int b=11;
}
class SDT implements t,temp2{
	void display() {
		System.out.println(a);
	}
	
}