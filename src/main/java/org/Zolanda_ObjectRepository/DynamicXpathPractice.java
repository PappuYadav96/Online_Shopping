package org.Zolanda_ObjectRepository;

import java.util.Scanner;

public class DynamicXpathPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("Enter the name");
String st = sc.next();
String s = "My name is %s";
String finalData = String.format(s, st);
System.out.println(finalData);

	}

}
