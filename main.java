

import java.util.Arrays;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lengthDemo.main(args);
		IsEmptyExample.main(args);
		StringTrimExample.main(args);
		concatDemo.main(args);
		Main.main(args);
		CompareToExample.main(args);
		substringDemo.main(args);
		TestStringComparison.main(args);
		Teststringcomparison2.main(args);
		Teststringcomparison3.main(args);
		
	}

}

class lengthDemo{
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "";
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("Java".length());
		System.out.println("Java\n".length());
		System.out.println("Learn Java".length());
	}
}

class IsEmptyExample{
	public static void main(String args[]){
		String s1="";
		String s2="hello";
		System.out.println(s1.isEmpty());    
		System.out.println(s2.isEmpty());    
		}
}

class StringTrimExample{
	public static void main(String args[]) {
		String s1="  hello   "; 
		System.out.println(s1+"how are you");       
		System.out.println(s1.trim()+"how are you");
	}
}

class StringLowerExample{
	 public static void main(String args[]){
	    String s1="HELLO HOW Are You?";
	    String s1lower=s1.toLowerCase();
	    System.out.println(s1lower);
	    }
}

class concatDemo {
	   public static void main(String[] args) {

	       String str1 = "Learn ";
	       String str2 = "Java";

	       System.out.println(str1.concat(str2));


	       System.out.println(str2.concat(str1));

	       String s3 =  "hello";
	       String s4 = "Learners";

	          String s5 = s3 + s4;



	       String message = "Welcome " + "to " + "Java";


	       String s = "Chapter" + 2;


	       String s1 = "Supplement" + 'B';
	   }
}



class Main {
  public static void main(String[] args) {
    String vowels = "a::b::c::d:e";

  
    String[] result = vowels.split("::");

    System.out.println("result = " + Arrays.toString(result));
  }
}

class ConcatDemo {
	   public static void main(String[] args) {
	   String message = "Welcome to Java";
	   System.out.println("The first character in the message is " + message.charAt(0));
	 }
}

class CompareToExample{
public static void main(String args[]){
	String s1="hello";
	String s2="hello";
	String s3="hemlo";
	String s4="flag";
	System.out.println(s1.compareTo(s2)); 
	System.out.println(s1.compareTo(s3));
	System.out.println(s1.compareTo(s4)); 
	}
}

class substringDemo{
	  public static void main(String[] args) {
	    String str1 = "java is fun";

	    
	    System.out.println(str1.substring(0, 4));

	  }
}

class findString {
	   public static void main(String[] args) {
	       String str1 = "Java is fun";
	       int result;

	       result = str1.indexOf('s');

	       System.out.println(result); 

	       result = str1.lastIndexOf('J');
	       System.out.println(result); 

	       result = str1.lastIndexOf('a');
	       System.out.println(result);

	       result = str1.lastIndexOf('j');
	       System.out.println(result);

	       result = str1.lastIndexOf("ava");
	       System.out.println(result); 

	       result = str1.lastIndexOf("java");
	       System.out.println(result); 
	   }
}

class ContainExample {
	  public static void main(String[] args) {
	    String str1 = "Learn Java";
	    Boolean result;

	    result = str1.contains("Java");
	    System.out.println(result); 
	
	    result = str1.contains("Python");
	    System.out.println(result); 

	   
	    result = str1.contains("");

	    System.out.println(result);  
	  }
	}

class ReplaceDemoMain {
	  public static void main(String[] args) {
	    String str1 = "abc cba";

	    System.out.println(str1.replace('a', 'z'));  

	    System.out.println("Lava".replace('L', 'J'));  

	    System.out.println("Hello".replace('4', 'J')); 

	    System.out.println(str1.replace("C++", "Java"));  

	    System.out.println("aa bb aa zz".replace("aa", "zz"));

	    System.out.println("Java".replace("C++", "C")); 
	  }
	}

class DemoReplaceAll {
	  public static void main(String[] args) {
	    String str1 = "Java123is456fun";
   
	    String regex = "\\d+";

	    System.out.println(str1.replaceAll(regex, " "));
	  }
	}

class TestStringComparison {
	   public static void main(String args[]){
	       String s1="PerScholas";
	       String s2="PerScholas";
	       String s3=new String("PerScholas");
	       String s4="Teksystem";
	       System.out.println(s1.equals(s2));
	       System.out.println(s1.equals(s3));
	       System.out.println(s1.equals(s4));
	   }
	}

class Teststringcomparison2 {
	   public static void main(String args[]){
	       String s1="Perscholas";
	       String s2="Perscholas";
	       String s3=new String("Perscholas");
	       System.out.println(s1==s2);
	       System.out.println(s1==s3);
	   }
	}

class Teststringcomparison3 {
	   public static void main(String args[]){
	       String s1="Perscholas";
	       String s2="Perscholas";
	       String s3="Perschola";
	       String s4="PerscholasX";
	       System.out.println(s1.compareTo(s2));  
	       System.out.println(s1.compareTo(s3));  
	       System.out.println(s1.compareTo(s4));  
	   }
	}
