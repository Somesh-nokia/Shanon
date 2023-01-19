package String;

public class String_methods {
	public static void main(String[] args) {
		String s = "SOMESHWAR";
		String s1 = "someshwar";
		String s2 = "SOMESH";
		
		//length
		System.out.println(s.length());
		//toUppercase ()
		System.out.println(s1.toUpperCase());
		//toLowercase()
		System.out.println(s.toLowerCase());
		//equal()
		System.out.println(s.equals(s1));
		//equalEgnorecases()
		System.out.println(s.equalsIgnoreCase(s1));
		//contains()
		System.out.println(s.contains(s2)); //false
		//contain()
	    System.out.println(s.contains(s1)); //true
	    //charAt()
	    System.out.println(s.charAt(8));
	    //indexOf()
	    System.out.println(s.indexOf('R'));
	    //conCat()
	    System.out.println(s.concat(s1));
	    //substring()
	    System.out.println(s1.substring(5));
	    //startsSwitch()
	    System.out.println(s2.startsWith("SO"));
	    //endsSwitch()
	    System.out.println(s2.endsWith("SH"));
	    
	}
	

}
