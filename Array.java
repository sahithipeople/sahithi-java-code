package com.user.prog;
import java.util.Scanner;
public class Array {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]=new int[5];
     Scanner s=new Scanner(System.in);
     for(int i=0;i<5;i++) {
    	 a[i]=s.nextInt();
     }
     System.out.println("output");
     for(int i=0;i<5;i++) {
    	 System.out.println(a[i]);
     }
	}

}
