package Unit_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P14_Exception_Handling {

	public static void main(String[] args) {
		BasicException1();
		BasicException2();
		BasicException3();
		BasicException4();
		BasicException5(1);
		BasicException6();
	}
	static void BasicException1() {
		int a=100,ans=0;
		ans=a/0;
	}
	static void BasicException2() {
		int a=100,ans=0;
		try {
			ans=a/0;
		}catch(ArithmeticException e){
			System.out.println("divide by zero");
		}		
	}
	static void BasicException3() {
		int a=100,ans=0;
		try {
			ans=a/0;
		}catch(ArithmeticException e){
			System.out.println("divide by zero");
		}finally {
			System.out.println("Final block");
		}
	}
	static void BasicException4() {
		int a;
		Scanner sc=new Scanner(System.in);
		try {
			a=sc.nextInt();			
		}catch(InputMismatchException e) {
			System.out.println("Wrong Input");
		}	
	}
	static void BasicException5(int a) {
		try {
			while(a>0) {
				a++;BasicException5(a);
			}
		}catch(Exception e){
			System.out.println("error");
		}
		
	}
	static void BasicException6() {
		int arr[]=new int[3];
		arr[0]=1;arr[1]=2;arr[2]=3;
		try {
			System.out.println(arr[10]);
		}catch(IndexOutOfBoundsException e){
			System.out.println("Out of bounds");
		}
	}

}
