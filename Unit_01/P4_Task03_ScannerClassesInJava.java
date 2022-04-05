package Unit_01;

import java.util.Scanner;

public class P4_Task03_ScannerClassesInJava {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		Scanner ob1=new Scanner(System.in);
		String name=ob.next();
		System.out.println("name - "+name);
		String name2=ob1.nextLine();

		System.out.println("name2 - "+name2);
		
		boolean b=ob1.nextBoolean();
		System.out.println(b+"\n");
		
		ob.close();
		ob1.close();
	}

}
