package chapter6;
import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		boolean result;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values of a,b,c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
result=isTriangle(a,b,c);
System.out.println(result);

	}
public static boolean isTriangle(int a,int b,int c){
	if(a>b+c || b>a+c || c>a+b){
	return false;
	}else{
		return true;
		}
	}
}
