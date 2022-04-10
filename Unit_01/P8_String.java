package Unit_01;

public class P8_String {

	public static void main(String[] args) {
		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);
	}
}
class QuestionsOnString {

	void palindromeOrNot(String s) {
		int l=s.length()-1;
		for(int i=0;i<=l;i++) {
			if(s.charAt(i)!=s.charAt(l-i)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	void reverseOfAString(String s) {
		int l=s.length()-1;
		StringBuilder str=new StringBuilder(s);
		for(int i=0;i<=l;i++) {
			char c=str.charAt(i);
			str.setCharAt(i, str.charAt(l-i));
			str.setCharAt(l-i,c);
		}
		String st=new String(str);
		s=st;
		System.out.println(s);
	}
	
	void stringEqualOrNot(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			System.out.println("No");
			return;
		}
		int l=s1.length();
		for(int i=0;i<l;i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
