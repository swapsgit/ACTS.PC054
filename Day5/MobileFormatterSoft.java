package com.cdac.acts.assignmets;

import java.util.Scanner;

public class MobileFormatterSoft {
	static StringBuilder sb ;
	/*
	 * Expected output+91-988-162-8598 Input+91-988-162-8598 Input+919881628598
	 * 
	 * Input 9881628598 Input 988162859 Error for less than 10 char
	 */
	static String mobileFormatter(String str) {
		
		if(str.length() >= 10 && str.length() < 17) {
			sb = new StringBuilder();
			if(str.length() == 10) {
				sb.append("+91");
			}
			sb.append(str);
			
			if(sb.charAt(0) != '+') {
				sb.insert(0, '+');
			}
			if(sb.charAt(1) != '9') {
				sb.insert(1, '9');
			}
			if(sb.charAt(2) != '1') {
				sb.insert(2, '1');
			}
			if(sb.charAt(3) != '-') {
				sb.insert(3, '-');
			}
			if(sb.charAt(7) != '-') {
				sb.insert(7, '-');
			}
			if(sb.charAt(11) != '-') {
				sb.insert(11, '-');
			}
		}else {
			System.out.println("Please enter valid 10 digit no");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {

		
		String str = "1234567845";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your mobile no and get formatted to standard.");
		
		str = sc.nextLine();
		System.out.println(MobileFormatterSoft.mobileFormatter(str));
		
	}

}
