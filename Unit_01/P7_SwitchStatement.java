package Unit_01;

import java.util.Scanner;
import java.time.*;

public class P7_SwitchStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			LocalDate year=java.time.LocalDate.now();
			String y=toString(year);
			break;
		case 2:
			System.out.println("April");
			break;
		case 3:
			System.out.println("");
		}

	}

}
