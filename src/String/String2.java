package String;

public class String2 {
	public static void main (String [] args)  {
      String s0 = "SHINGES";
      String s1 = new String("SHINGE") ;
      
      String s2 = "shi";
      //no of char present in string
      System.out.println(s1.length());
      //to uppercase
      System .out.println(s0.toUpperCase());
      //to lowercase
      System.out.println(s1.toLowerCase());
      //equal two string
      System.out.println(s1.equals(s0));
     //join two string
      System.out.println(s0.concat(s2));
      //separate two string
      System.out.println(s1.substring(2));
      //startwith
      System.out.println(s1.startsWith(s0));
      //index
      System.out.println(s1.indexOf('S'));
      //char
      System.out.println(s1.charAt(2));
      //endwith
      System.out.println(s1.endsWith("GE"));
      //start with
      System.out.println(s1.startsWith("SH"));
	
	
	
	}
}