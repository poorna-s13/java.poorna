package poorna;

import java.util.Scanner;

public class conditional {

	public static void main(String[] args) {
		
//		1. write a java program to accept two numbers m and n where m>n, and find
//		      the quotient and remainder
		
		int m = 20;
		int n = 6;
		
		if(m>n) {
			System.out.println("quotient:"+m/n);
			System.out.println("remainder:"+m%n);
		}
		else {
			System.out.println("m is greater than n");
		}
		
		
//		2. write a java program to accept five subject marks and display the grade
//		      based on the average
		
		int m1 = 80;
		int m2 = 75;
		int m3 = 90;
		int m4 = 85;
		int m5 = 60;
		
		int average = ((m1 + m2 + m3 + m4 + m5)/5);
		System.out.println("average:"+average);
		
		if(average >= 80) {
			System.out.println("grade A :");
		}
		else if(average >= 75) {
			System.out.println("grade A");
		}
		else if(average >= 90) {
			System.out.println("grade B");
		}
		else if(average >= 85) {
			System.out.println("grade C");
		}
		else if(average >= 60) {
			System.out.println("grade D");
		}
		else {
			System.out.println("fail");
		}
		
//	  3. (a) whether a number is positive or negative
		
		int num1 = 25;
		int num2 = -35;
		
		if(num2 >= 0) {
			System.out.println("positive");
		}
		else {
			System.out.println("negative");
		}
		
//		(b) whether a number is odd or even
		
		int a = 5;
		
		if(a%2 == 0) {
			System.out.println("a is even number");
		}
		else {
			System.out.println("a is odd number");
		}
		
//		 (c) whether a student pass or fail based on marks
		
		int b = 50;
		
		if(b>=70) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
//		(d) whether a year is a leap year or not 
		
		int d = 2023;
		
		if(d%4 == 0) {
			System.out.println(d+" is leap year ");
		}
		else {
			System.out.println(d+" is not leap year ");
		}
		
//		4. whether a character is a vowel or consonant
		
		char ch = 'e';
		
		if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch =='u') {
			System.out.println(" vowel");
		}
		else {
			System.out.println(" consonant ");
		}
		
//		5. to find the maximum and minimum among three numbers
		
		int e = 15;
		int f = 8;
		int g = 2;
		
		if(e>=f && e>=g) {
			System.out.println("maximum:"+e);
		}
		else if(f>=e && f>=g) {
			System.out.println("maximum:"+f);
		}
		else {
			System.out.println("maximum:"+g);
		}
		
		
		int h = 3;
		int i = 8;
		int j = 2;
		
		if(h>=i && h>=j) {
			System.out.println("minimum:"+e);
		}
		else if(i>=h && i>=j) {
			System.out.println("minimum:"+f);
		}
		else {
			System.out.println("minimum:"+g);
		}
		
		
//		6. to display the season based on the given month and day
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("enter the month:");
//		String mon = scan.next();
//		
//		if(mon.equals("march")||mon.equals("april")||mon.equals("may")) {
//			System.out.println(mon+" is spring season ");
//		}
//		else if(mon.equals("june")||mon.equals("july")||mon.equals("august")) {
//			System.out.println(mon+" is summer season ");	
//		}
//		else if(mon.equals("september")||mon.equals("october")||mon.equals("november")) {
//			System.out.println(mon+" is autumn season ");	
//		}
//		else if(mon.equals("december")||mon.equals("january")||mon.equals("feburary")) {
//			System.out.println(mon+" is winter season ");	
//		}
//		else {
//			System.out.println("invalid month");
//		}
		
		
//		7.to find the number of days in a given month
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("enter the month:");
		String months = Scan.next();
		
		if(months.equals("july")||months.equals("january")||months.equals("march")) {
			System.out.println(months+"is a 31 days");
		}
		else if (months.equals("feburary")) {
			System.out.println(months+"is a 28 days ");
		}
		else {
			System.out.println(months+" is 30 days");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
