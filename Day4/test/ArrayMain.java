package com.cdac.acts.test;
import com.cdac.acts.dev.ArrayPrinter;

public class ArrayMain {
	public static void main(String[] args) {
		int arr[] = {10, 11, 22, 55, 99, 14, 66, 37, 98};
		String str[] = {"Ramayan", "Mahabharat", "Bhagwat Gita", "RamcharitManas"};
		
		ArrayPrinter arp = new ArrayPrinter();
		arp.printArray(arr);
		arp.printArray(str);
	}
}
