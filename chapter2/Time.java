package chapter2;

public class Time {
	 
	
	public static void main(String[] args){
		
	int hour=14;
	int minute=20;
	int second=50;
	
	double mins=(double)minute;
	
	System.out.println("The current time is ");
     System.out.print(hour);
     System.out.print(":");
     System.out.print(minute);
     
     System.out.print(":");
     System.out.print(second);
     System.out.print("\n Number of minutes since midnight: ");
     System.out.println(hour * 60 + minute);

     
     System.out.print("Fraction of the day that has passed: ");
     System.out.println(mins / 60);

     System.out.print("Percent of the hour that has passed: ");
     System.out.println(mins * 100 / 60);

	}
}

