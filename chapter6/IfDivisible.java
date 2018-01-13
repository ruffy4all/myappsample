package chapter6;

import java.util.Scanner;
public class Ifdivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		boolean answ;
Scanner sc = new Scanner(System.in);
System.out.println("enter value for a");
a=sc.nextDouble();
System.out.println("enter value for b");
b=sc.nextDouble();
answ=isDivisible(a,b);
System.out.println(answ);

	}
public static boolean  isDivisible(double n,double m){
	
	if (n>0 && m>0){
		return true;
	}else{
	
		return false;
	
	}
}
}
