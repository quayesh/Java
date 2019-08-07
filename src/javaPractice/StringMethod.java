package javaPractice;

public class StringMethod {

	public static void main(String[] args) {
		
		String s="Welcome";
		System.out.println(s.length());
		String s1="To Java";
		System.out.println(s.concat(s1));
		//Trimming the string
		s="   welcome    ";
		System.out.println("Before trimming string is :" +s);
		System.out.println("After trimming string is :" +s.trim());
		
		//charAt()
		s="welcome";
		System.out.println(s.charAt(3));//returns character based on index number,index starts from 0
		
		//contains()
		s="Welcome";
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("com"));
		
		//equals()
		s="Welcome";
		System.out.println(s.equals("Welcome"));//true
		System.out.println(s.equals("welcome"));//false
		System.out.println(s.equals("Wel come"));//false
		
		System.out.println(s.equalsIgnoreCase("welcome"));//true
		
		//replace()
		s="Welcome to Java";
		System.out.println(s.replace('0','i'));//welcome to java
		System.out.println(s.replace("Java","Selenium"));//Welcome to Selenium
		
		//substring()
		s="Welcome";
		System.out.println(s.substring(0,4));
		
		//converting case
		s="WELCOME";
		System.out.println(s.toLowerCase());
		s="welcome";
		System.out.println(s.toUpperCase());
		
		
		

	}

}
