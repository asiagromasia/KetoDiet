import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.*;


public class KetoF {

    public static void main(String[] args){
			    	
    	List<LocalDate> dates = getMondayDates(LocalDate.of(2019, Month.JULY, 31),LocalDate.of(2019, Month.NOVEMBER, 30));
        
		        for (LocalDate date : dates) {
		        	//System.out.println(date);
		        }
		         
    	List<Integer> weight = new ArrayList<Integer>();
    	int startWeight= 180;
    	int endWeight= 170;
    	int V = startWeight - endWeight;
    	System.out.println("You need "+ V + " weeks to loose desired weight.");
    	
		    	for (int i = startWeight; i > endWeight; i--) {
					weight.add(i);
					//System.out.println(i);
					
				}
		    
		          //  System.out.println("waga teraz" + weight);
		            
		       for (int n = 0; ((n <= weight.size()) || (n <= dates.size())); n++) {
		    	  //if (dates.size() >= weight.size()){
						LocalDate d = dates.get(n);
						Integer w = weight.get(n);
						System.out.println("On this Monday " + d + " your weight should be "+ w + "lbn");
				 
        	        } 
		      }
		       
     
			private static List<LocalDate> getMondayDates(LocalDate startDate, LocalDate endDate){
		        List<LocalDate> result = new ArrayList<LocalDate>();
		        for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1))
		        {
		            DayOfWeek day = date.getDayOfWeek();
		            // These could be passed in...
		            if (day == DayOfWeek.MONDAY)
		            {
		
		                result.add(date);
		                   
		            }
		        }
		    //    System.out.print("razem: "+ result);
		        long weeks = ChronoUnit.WEEKS.between(startDate, endDate);
				System.out.println("You have selected " + weeks + " weeks");
		        return result;
		    }   
   
}
