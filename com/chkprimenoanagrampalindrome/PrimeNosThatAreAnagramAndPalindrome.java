package com.chkprimenoanagrampalindrome;
import java.util.Arrays;

public class PrimeNosThatAreAnagramAndPalindrome {

	public static void main(String[] args) {

		System.out.println("Prime Numbers that are Palindrome As well As Anagram ");
		for(int i = 2 ; i <= 1000 ; i++) {
			if(isPrime(i) == true && isPalindrome(i)) {
				boolean result = isAnagram(String.valueOf(i), String.valueOf(i));
				if(result == true) {
					System.out.println(" "+i);
				}
			}
		}
	}

	public static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrome(int num) {
		int r, sum = 0;
		int temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}
}
