package Unit_01;

import java.util.Scanner;
import java.time.*;
import java.util.Date;
import java.util.Date;
public class P7_SwitchStatement {
	public static void main(String[] args) {
		SwitchStatements obj=new SwitchStatements();
		obj.switchStatements();
	}

}
class SwitchStatements {
	void switchStatements() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice:\n1.year\n2.month\n3.day");
		int choice=sc.nextInt();
		Date d=new Date();
		switch(choice) {
		case 1:
			int year=d.getYear()+1900;
			System.out.println("Current year : "+year);
			break;
		case 2:
			int month=d.getMonth();
			System.out.println("Current month : "+month);
			break;
		case 3:
			int day=d.getDay();
			System.out.println("Current day : "+day);
			break;
		case 4:
			System.out.println("Not applicable");
		default:
			break;
		}
	}
}
