package Unit_01;

public class P6_Task02_StringInJava {

	public static void main(String[] args) {
		StringInJava obj=new StringInJava();
		obj.StringDefinition();
		obj.charAndString();
	}

}
class StringInJava{
	void StringDefinition() {
		String s="Hello There!";
		String s1=new String("hey");
		System.out.println(s);
		
		System.out.println(s.length());
		
		for(int i=0;i<s.length();i++)
			System.out.println(s.charAt(i));
		
		String first="Roshan";
		String second="Aswal";
		
		String third=first+second;
		System.out.println(third);
		
		boolean result1=first.equals(second);
		System.out.println(result1);
		
		String fourth="Roshan";
		String fifth=new String("Aswal");
	}
	void charAndString() {
		char[] ch= {'h','e','l','l','o',' ','T','h','e','r','e'};
		char[] ch2= {'!','!'};
		
		System.out.println(ch);
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]);
		String s1=new String(ch);
		System.out.println(s1);
		ch[0]='h';
		s1=s1+'a';
		String s2="GEEKS";
		char[] ch4=s2.toCharArray();
		char[] a2= {'A','K','A'};
		String s3=new String(a2);
	}
}
