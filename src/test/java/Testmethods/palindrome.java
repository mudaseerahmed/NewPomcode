package Testmethods;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ab123%$%321aa";


String rev=" ";
for(int i=s.length()-1;i>=0;i--) {
	rev=rev+s.charAt(i);
}
if(s.equals(rev)) {
	System.out.println(s+"is palindrome");
}
else {
	System.out.println(s+"is not palindrome");
}
	}

}
