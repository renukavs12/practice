import java.time.LocalDate; 
import java.time.LocalTime;
public class DateTimeApi {    
  public static void main(String[] args) {    
    LocalDate date = LocalDate.now(); 
    LocalTime time = LocalTime.now();
    
    LocalDate yesterday = date.minusDays(1);    
    LocalDate tomorrow = yesterday.plusDays(2);    
    System.out.println("Today date: "+date);    
    System.out.println("Yesterday date: "+yesterday);    
    System.out.println("Tomorrow date: "+tomorrow);  
    System.out.println(time);
  }    
}
