package com.cognixia.jump.classandobjects;


// This class is intended to uncover some of the usual behaviors of the String class
//and String objects, compared to primitives and 
// Because some of the general rules of Class / Objects are seemingly broken by Strings in Java
public class StringDemoDriver {

	public static void main(String[] args) {
		
		
				String str1 = "str1";
				String str2 = "str2";
				String str3 = str1;
				String str4 = new String("str1");
				String str5 = new String("str5");
				String str6 = "str1";
				String str8 = str4;
				
				
System.out.println("variable str1 == str2" + (str1 == str2));
System.out.println("variable str1 == str3" + (str1 == str3));
System.out.println("variable str2 == str3" + (str2 == str3));
System.out.println("variable str1 == str4" + (str1 == str4) + "str1=" + str1 + " ,str4=" +str4);
System.out.println("variable str4 == str5" + (str4 == str5));
System.out.println("variable str6 == str1" + (str6 == str1));
System.out.println("variable str8 == str4" + (str8 == str4) + "str8=" +str8 +" ,str4=" +str4);

	}


}
