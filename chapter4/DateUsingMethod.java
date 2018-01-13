package chapter4;

public class DateUsingMethod {

	public static void AmericanTime(String day, int date,String month, int year){
		
    	System.out.println("American Format:\n");

    	System.out.println(day + month +date+", "+ year+"\n");
		
	}
public static void EuropeanTime(String day, int date,String month, int year){

	System.out.println("European Format:\n");

	System.out.println(day +" "+ date + month +" "+ year);
		
	}
	
	public static void main(String [] args){
		
		
    	String day,month;
    	int date;
    	int year;
    	date=16;
    	day ="Thursday,"; 
    	month=" July ";
    	year= 2015;
    	
    	EuropeanTime(day, date, month, year);
		AmericanTime( day,  date, month, year);
    	
    	
    
    	
	}
	
}
