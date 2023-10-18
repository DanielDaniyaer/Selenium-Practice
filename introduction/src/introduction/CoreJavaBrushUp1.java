package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.lang.*;
import java.io.*;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		int[] arr1 = new int [5];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		arr1[3]=4;
		arr1[4]=5;
		
		int[] arr2 = {1,2,3,4,5};
		
//		for(int i =0; i<arr2.length;i++) {
//			System.out.println(arr1[i]);
//			
//		}
//		
		for (int z:arr2) {
			System.out.println(z);
	}
//
//		int[] arr3 = {1,2,4,5,6,7,8,9,10,122};
//		
//		for (int x=0;x<arr3.length;x++) {
//			if(arr3[x]%2 == 0) {
//				System.out.println(arr3[x]);
//			}
//			else {
//				System.out.println(arr3[x]+" is not");
//}				
				
		ArrayList<String> a = new ArrayList<String>();
		a.add("Abc");
		a.add("Bcd");
		a.add("123");
		a.add("lol");
//		a.remove("123");
//		a.remove(2);
//		
//		System.out.println(a);
//				
//		for(int q=0;q<a.size();q++) {
//			System.out.println(a.get(q));
//		}
//		System.out.println("*********");
//		for(String val:a) {
//			System.out.println(val);
//		}
//		System.out.println(a.contains("12"));
//		System.out.println("****");
//		String[] name = {"abc","bcd","efg","fhi"};
//		List<String> nameArrayList = Arrays.asList(name); 
//		System.out.println(nameArrayList.contains("abc"));
		
		String s = "abc def jpg";
		String[] splittedString = s.split(" ");
		for(String i:splittedString) {
			System.out.println(i);
		}
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);

		System.out.println("******");
		
		for(int j= s.length()-1;j>=0;j--) {
			System.out.println(s.charAt(j));
		}
		
		System.out.println("***");
//			
//		for(int x=splittedString.length-1;x>=0;x--) {
//			for(int y=s.length()-1;y>=0;y--) {
//				System.out.println(s.charAt(y));
//			}
//		}
		String nstr ="";
		char ch;
		for(int x=0;x<s.length();x++) {
			ch = s.charAt(x);
			nstr = ch+nstr;
		}
		System.out.println(nstr);

	}
		
//		String named ="Daniyar";
//		char[] a = named.toCharArray();
//		for(int w=named.length();w>=0;w--) {
//			System.out.println(a[w]);
//		}

}
