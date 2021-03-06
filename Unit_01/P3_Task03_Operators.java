package Unit_01;

import java.util.Scanner;

public class P3_Task03_Operators {
	static void unary_operator(int a,int b) {
		int c,d,e,f;
		c=a++;
		d=b++;
		e=c++;
		f=d++;
		System.out.println("values are ..."+c+" "+d+" "+e+" "+f);
	}
	static void assignment_operators() {
		//create variables
		int a=4;
		int var;
		// assign value using =
		var=a;
		System.out.println("var using = : "+var);
		//assign value using =+
		var+=a;
		System.out.println("var using += : "+var);
		//assign value using =*
		var*=a;
		System.out.println("var using *= : "+var);
	}
	static void arithmetic_operators(int a,int b) {
		System.out.println("sum : "+(a+b));
		System.out.println("difference : "+(a-b));
		System.out.println("multiplication : "+(a*b));
		System.out.println("division : "+(a/b));
	}
	static void bitwise_operator(int a,int b) {
		int x=a&b;
		int y=a|b;
		int z=a^b;
		System.out.println("These values are ..."+x+" "+y+" "+z);
	}
	static void relational_operators() {
		int a=7,b=11;
		System.out.println("a is "+a+" and b is "+b);
		System.out.println(a=b); // false
		System.out.println(a!=b); // rue
		System.out.println(a>b); //false
		System.out.println(a<b); //true
		System.out.println(a>=b); //false
		System.out.println(a<=b); //true
	}
	static void logical_operator() {
		// && operator
		System.out.println((5>3) && (8<5)); //true
		System.out.println((5>3) && (8<5)); //false
		// || operator
		System.out.println((5<3) || (8>5)); //true
		System.out.println((5>3) || (82<5)); //true
		System.out.println((5<3) || (8<5)); //false
		// !operator
		System.out.println(!(5==3)); //true
		System.out.println(!(5>3)); //false
	}
	public static void main(String[] args) {
		int x,y;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		unary_operator(x,y);
		bitwise_operator(x,y);
		assignment_operators();
		logical_operator();
		arithmetic_operators(x,y);
		relational_operators();
	}

}
