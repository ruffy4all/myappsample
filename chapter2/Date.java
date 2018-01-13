package chapter2;

public class Date {
	public static void main(String[] args) {
		
		String day,month;
    	int date;
    	int year;
    	date=16;
    	day ="Thursday,"; 
    	month=" July ";
    	year= 2015;
    	
    	
    	
    	System.out.println("American Format:");

    	System.out.println(day + month +date+", "+ year+"\n");
    	
    	System.out.println("European Format:");

    	System.out.println(day +" "+ date + month +" "+ year);
		
}

}
