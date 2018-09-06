/**
*This is a program testing Strings.
*I picked the replace and matches methods as my optional methods
*"replace" replaces every character in parameter 1 to the character specified at param 2
*"matches" is a boolean that returns true if the String param matches the String
* @author Cameron Deputy
* 
*/




public class StringFun {
	public static void main(String args[]) {
		String s = "thatString";
		String otherString = "otherString";
		String anotherString = "anotherString";
		System.out.println(s.length());
		System.out.println(s.equals(otherString));
		System.out.println(s.substring(0,3));
		System.out.println(s.trim());
		System.out.println(s.indexOf("otherString"));
		System.out.println(s.charAt(3));
		System.out.println(otherString.replace("o","i"));
		System.out.println(otherString.matches(anotherString));
	}
}