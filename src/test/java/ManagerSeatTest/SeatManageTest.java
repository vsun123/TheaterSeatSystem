package ManagerSeatTest;


import java.util.List;

import org.junit.*;

import data.Layout;
import data.Request;
import search.SeatingSearch;

/**
 * The Class SeatManageTest.
 */
public class SeatManageTest {

	/** The layout. */
	StringBuilder layout = new StringBuilder();
    
    /** The requests. */
    StringBuilder requests = new StringBuilder();


    /**
     * Setup set layout.
     */
    @Before
    public void SetupSetLayout() {
        System.out.println("@Before - SetupSetLayout");
   
        layout.append("6 6" + System.lineSeparator());
        layout.append("3 5 5 3" + System.lineSeparator());
        layout.append("4 6 6 4" + System.lineSeparator());
        layout.append("4 6 6 4" + System.lineSeparator());
        layout.append("2 8 8 2" + System.lineSeparator());
        layout.append("6 6" + System.lineSeparator());
    }

    /**
     * Test seat order.
     */
    @Test 
    public void testSeatOrder() {
        System.out.println("@Test - testSeatOrder");

        requests.append("Smith 2" + System.lineSeparator());
        requests.append("Jones 5" + System.lineSeparator());
        requests.append("Davis 6" + System.lineSeparator());
        requests.append("Wilson 100" + System.lineSeparator());
        requests.append("Johnson 3" + System.lineSeparator());
        requests.append("Williams 4" + System.lineSeparator());
        requests.append("Brown 8" + System.lineSeparator());
        requests.append("Miller 12" + System.lineSeparator());
        
        SeatingSearch service = new SeatingSearch();
        
               
        Layout theaterLayout = service.getTheaterLayout(layout.toString());
        
        List<Request> requestList = service.getTicketRequests(requests.toString());
        
        service.processTicketRequests(theaterLayout, requestList);

    }


}