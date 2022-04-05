package Unit_01;

/*
The Wrapper class in Java provides the mechanism to convert primitive into object 
Why?
Because we want to use predefined methods of those objects
-boolean data types -> Boolean obj; ->obj.toString();
 */

public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {
		int a=20;
		String s=""+a+"";
		Integer i=Integer.valueOf(a);
		Integer j=a; //autoboxing 
		
		System.out.println(a+" "+i+" "+j);
		System.out.println(i.toString());
		
		byte b=10;
		Byte byteobj=b; //Autoboxing
		System.out.println(byteobj);
		
		// Unboxing:Converting objects to Primitives
		byte bytevalue=byteobj;
		System.out.println(bytevalue);
	}

}
