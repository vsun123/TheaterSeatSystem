package seat;

import java.util.List;
import java.util.Scanner;

import data.Layout;
import data.Request;
import search.SeatingSearch;

/**
 * The Class Seats.
 *
 * @author vsun
 */
public class Seats {

	 
      /**
       * The main method.
       *
       * @param args the arguments
       */
      public static void main(String[] args) {
   
    	String line;
		boolean isLayoutFinished = false;
	    StringBuilder layout = new StringBuilder();
        StringBuilder ticketRequests = new StringBuilder();
          
        try{
        System.out.println("Please enter Theater Layout, Ticket Requests then enter 'end'.\n");
        
        Scanner input = new Scanner(System.in);

        while((line = input.nextLine()) != null && !line.equals("end")){
            
            if(line.trim().length() == 0){
                
                isLayoutFinished = true;
                continue;
                
            }
            
            if(!isLayoutFinished){
                
            	layout.append(line + System.lineSeparator());
                
            }else{
                ticketRequests.append(line + System.lineSeparator());
                
            }
            
        }
        input.close();
        SeatingSearch service = new SeatingSearch();
        
  
        
            Layout theaterLayout = service.getTheaterLayout(layout.toString());
            
            List<Request> requests = service.getTicketRequests(ticketRequests.toString());
            
            service.processTicketRequests(theaterLayout, requests);
            
        }catch(NumberFormatException nfe){
            
            System.out.println(nfe.getMessage());
            
        }catch(Exception e){
            
            e.printStackTrace();
            
        }
       
    }
    
}
