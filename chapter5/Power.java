package chapter6;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r=power(4,2);
System.out.println(r);
	}
	
	
public static int power(double n,int m){
	
	double r;
	double m2=(double)m;
	
	if(Math.pow(n,m2)==1){
		return 1;
	}else
	{
		
		return (int)n*power(n,m-1);
	}
	
	
	
	
	
	
	
}
}
