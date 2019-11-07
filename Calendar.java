
public class Calendar {

	public static void main(String[] args) {
		
		int startDay=3;
		int daysOfMonth=31;
		System.out.println("=======================");
		System.out.println("   일    월     화     수     목     금     토");
		System.out.println("=======================");
		int day ;
		int date = 1;
		
		for(int x= 0; x <=5; x++) {
			for(day =0; day<=7;day++) {
				if(day ==7) {
				System.out.println();
			}	else  {
			if (x== 0 && day <startDay) {
				System.out.printf("    ");
			} else if (date<10) {
				System.out.printf("  %d " ,date++);
			} else 
				
				System.out.printf(" %d ",date++);
				
			 if (date>=daysOfMonth) {
				break;	
}
}
}		
}
		System.out.println();
		System.out.println("Program End...");
}
}