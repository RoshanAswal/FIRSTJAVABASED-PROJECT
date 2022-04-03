package Unit_01;

public class P4_Task01_ControlAndConditionalStatementsInJava {

	public static void main(String[] args) {
		Statements obj=new Statements();
		obj.DecisionMakingStatements();
		obj.LoopStatements();
		obj.JumpStatements();
	}

}
class Statements{
	void DecisionMakingStatements() {
		int x=1,y=2;
		if(x+y<1)
			System.out.println("x+y is less than 1");
		else
			System.out.println("x+y is greater than 2");
		
		int num=20;
		//can we use char instead of int as num?
		switch(num) {
		case 0:
			System.out.println("number is 0");
			break;
		case 10:
			System.out.println("number is 10");
			break;
		default:
			System.out.println(num);
		}
	}
	void LoopStatements() {
		// For Loop
		int sum=0;
		for(int i=0;i<=10;i++)
			sum+=i;
		System.out.println("The sum of first 10 natural number is "+sum);
		
		// For each
		String[] names= {"C","C++","Python","Java"};
		System.out.println("Printing the content of array names :");
		for(String name:names) {
			System.out.println(name);
		}
		//do while 
		int i=0;
		System.out.println("Printing the list of first 10 even numbers");
		do {
			System.out.println(i);
			i+=2;
		}while(i<=10);
	}
	void JumpStatements() {
		//Break
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i==5)break;
		}
		//Continue
		for(int i=0;i<=10;i++) {
			if(i==5)continue;
			System.out.println(i);
		}
	}
}
