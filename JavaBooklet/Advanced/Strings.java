// Using Recursion
// Seems very slow...
// NOT MY CODE
public class Strings {
	public static void main(String[] args) {
		System.out.println(stringFinder("diukdcwfk", "wedwiwcek")/*.length()*/);
	}

	public static String stringFinder(String a, String b) {
		int aLength = a.length();
		int bLength = b.length();
		if (aLength == 0 || bLength == 0)
			return "";
		
		else if (a.charAt(aLength - 1) == b.charAt(bLength - 1))
			return stringFinder(a.substring(0, aLength - 1), b.substring(0, bLength - 1)) + a.charAt(aLength - 1); 	
		
		else {
			String x = stringFinder(a, b.substring(0, bLength - 1));
			String y = stringFinder(a.substring(0, aLength - 1), b);
			if(x.length() > y.length()) return x;
			else return y;
		}
	}
}