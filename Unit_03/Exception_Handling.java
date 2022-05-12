package Unit_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) {
		BasicException1();
		BasicException2();
		BasicException3();
		BasicException4(1);
		BasicException5();
	}
	static void BasicException1() {
		int a=100,ans=0;
		try {
			ans=a/0;
		}catch(ArithmeticException e){
			System.out.println("divide by zero");
		}		
	}
	static void BasicException2() {
		int a;
		Scanner sc=new Scanner(System.in);
		try {
			a=sc.nextInt();			
		}catch(InputMismatchException e) {
			System.out.println("Wrong Input");
		}	
	}
	static void BasicException3() {
		
	}
	static void BasicException4(int a) {
		try {
			while(a>0) {
				a++;BasicException4(a);
			}
		}catch(Exception e){
			System.out.println("error");
		}

	}
	static void BasicException5() {
		int arr[]=new int[3];
		arr[0]=1;arr[1]=2;arr[2]=3;
		try {
			System.out.println(arr[10]);
		}catch(IndexOutOfBoundsException e){
			System.out.println("Out of bounds");
		}
	}
	
}
