import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

//OPTION 1 == MANAGE CUSTOMER 
	//ANJALI 
	private Admin u1;
	private Admin u2;
	private Admin admin2;
	private Admin admin3;
	private Admin admin4;
	private Admin admin5;
	
	private ArrayList<Admin> userList ; 
	public C206_CaseStudyTest() {
		super();
	}
	@Test
	public void C206_test() {
		assertTrue("C206_CaseStudy test",true);
	}
	@Before
	public void setUp() throws Exception { 
	u1 = new Admin("admin1", "User", "user@mail.com", "Pa$$word","NEW");   
	u2 = new Admin("admin2", "User", "user@mail.com", "Pa$$word","NEW");   
	userList = new ArrayList<Admin>();
	}
	@Test
	public void testAddCustomer() {
		assertNotNull("Test if there is a valid customer arraylist to add to",userList);
		
		C206_CaseStudy.addCustomer(userList,u1);
		assertEquals("Test if that customer arraylist size is 1?",1,userList.size());
		
		assertSame("Test that customer added is the same as the userlist?",u1, userList.get(0));
	
		//C206_CaseStudy.addCustomer(userList,u1);
		C206_CaseStudy.addCustomer(userList,u2);

		assertEquals("Test that customer arraylist size is 2?",2, userList.size());
		assertSame("Test that customer added is the same as items in the userList?",u2, userList.get(1));
	}
	@Test
	public void testViewAll() {
		assertNotNull("Test if there is a valid customer arraylist to add to",userList);
		
		String allUsers = C206_CaseStudy.ViewAll(userList);
		String testOutput="";
		assertEquals("Check that ViewAllUserList",testOutput, allUsers);
		
		C206_CaseStudy.addCustomer(userList,u1);
		C206_CaseStudy.addCustomer(userList,u2);

		assertEquals("Test that customer arraylist size is 2?",2, userList.size());
		
		allUsers=C206_CaseStudy.ViewAll(userList);
		
	    testOutput+= String.format("%-10s %-20s %-20s %-30s %-10s\n","admin1", "User", "user@mail.com", "Pa$$word","NEW");
	    testOutput+= String.format("%-10s %-20s %-20s %-30s %-10s\n","admin2", "User", "user@mail.com", "Pa$$word","NEW");


		assertEquals("Check that ViewAllUserList",testOutput, allUsers);
	}
	@Test
	public void deleteUsers() {
		assertNotNull("Test if there is a valid customer arraylist to add to",userList);
		C206_CaseStudy.addCustomer(userList,u1);
		C206_CaseStudy.addCustomer(userList,u2);
		assertEquals(2, userList.size());
		C206_CaseStudy.deleteUsers(userList,u1.getName());
		
		
		assertEquals("Test if deleting a ‘valid account’ will decrease the arrayList by 1",1,userList.size());
		
	}
		
	@After
	public void tearDown() throws Exception {
		/*admin1=null;
		admin2=null;
		admin3=null;
		admin4=null;
		admin5=null;
		
		userList=null;*/
	}
	
}
//OPTION 2== REQUEST QUOTATION  
//AGNES  

private RequestQuotation1 qq1; 
private RequestQuotation1 qq2; 
private ArrayList<RequestQuotation1> requestQuotationList; 


@Before   
 
qq1 = new RequestQuotation1("HDB", 890, "Merlion", 78789067, "Merlion@gmail.com", 50000, "29-9-2022", "kitches", 1, 0, null, null); 
qq2 = new RequestQuotation1("HDB", 908, "Tylok", 56789045, "Tylok@gmail.com", 100000, "1-10-2022", "toilet", 0, 1, null, null); 
requestQuotationList = new ArrayList<RequestQuotation1>(); 
} 
@Test 
public void testAddRequestQuotation() { 
 

    assertNotNull("Test if there is valid Request For Quotation arraylist to add to", requestQuotationList); 
 
 
    C206_CaseStudy.addRequestQuotation(requestQuotationList, qq1);     
assertEquals("Test if that Request For Quotation arraylist size is 1?", 1, requestQuotationList.size()); 
 
 
assertSame("Test that Request For Quotation is added same as 1st item of the list?", qq1, requestQuotationList.get(0)); 
 
 
C206_CaseStudy.addRequestQuotation(requestQuotationList, qq2); 
assertEquals("Test that Request For Quotation arraylist size is 2?", 2, requestQuotationList.size()); 
assertSame("Test that Request For Quotation is added same as 2nd item of the list?",qq2, requestQuotationList.get(1)); 
} 

@Test 
public void testRetrieveAllRequestQuotation() { 

    assertNotNull("Test if there is valid Request For Quotation arraylist to retrieve item", requestQuotationList); 

     
    String allRequestQuotation= C206_CaseStudy.retrieveAllRequestQuotation(requestQuotationList); 
    String testOutput = ""; 
    assertEquals("Check that ViewAllRequestQuotationlist", testOutput, allRequestQuotation); 

   
    C206_CaseStudy.addRequestQuotation(requestQuotationList, qq1); 
    C206_CaseStudy.addRequestQuotation(requestQuotationList, qq2); 
    assertEquals("Test that Request For Quotation arraylist size is 2", 2, requestQuotationList.size()); 

      
    allRequestQuotation= C206_CaseStudy.retrieveAllRequestQuotation(requestQuotationList); 
    testOutput = String.format("%-15s %-10.1f %-20s %-20d %-25s %-10.1f %-25s %-20s %-20d %-20d %-20s %-20s\n","HDB", 170.00, "Lee Jackson", 87500650, "kokpop1090@gmail.com", 50000.00, "10-8-2022", "kitches", 1, 0, null, null); 
    testOutput += String.format("%-15s %-10.1f %-20s %-20d %-25s %-10.1f %-25s %-20s %-20d %-20d %-20s %-20s\n","HDB", 170.00, "KOKPOP", 98716488, "cbbawe1090@gmail.com", 100000.00, "20-8-2022", "toilet", 0, 1, null, null); 

    assertEquals("Test that ViewAllRequestQuotationlist", testOutput, allRequestQuotation); 
} 

@Test 
public void testRemoveRequestQuotation1() { 
 
assertNotNull("Test if there is valid Request For Quotation arraylist to retrieve item", requestQuotationList); 
 
 
    C206_CaseStudy.addRequestQuotation(requestQuotationList, qq1); 
    C206_CaseStudy.addRequestQuotation(requestQuotationList, qq2); 

 
String nameToRemove = qq1.getRequestorName(); 
boolean test = C206_CaseStudy.findRequestorName(requestQuotationList, nameToRemove); 
assertTrue("Check package exists in Request For Quotation array list", test); 
 
 
C206_CaseStudy.doRemoveRequestQuotation(requestQuotationList, nameToRemove); 
assertEquals("Check that Request For Quotation arraylist size is 1", 1, requestQuotationList.size());   
 
} 
} 

//OPTION 3 == MANAGE QUOTATION  
//JOVAN  


//OPTION 4 == MANAGE APPOINTMENT 
//DZIKRI  

private Appointment appt1; 
private Appointment appt2; 
private Appointment appt3; 

private ArrayList<Appointment> apptList; 


@Before 
public void setUp1() throws Exception { 
appt1 = new Appointment("Jack", "10/10/2022", 13.30,  "Tim", "Hougang Ave 8"); 
appt2 = new Appointment("Dzik", "12/10/2022", 14.45,  "Wilson", "Bukit Panjang View"); 
appt3 = new Appointment("Hong", "23/10/2022", 18.30,  "Adam", "Rivervale Drive"); 

apptList = new ArrayList<Appointment>(); 

} 

@After 
public void tearDown1() throws Exception { 
appt1 = null; 
appt2 = null; 
appt3 = null; 
apptList = null; 

} 

@Test 
public void c206_test() { 
//fail("Not yet implemented");  
assertTrue("C206_CaseStudy_SampleTest ",true); 
} 

public void testaddAppointment() { 
// appointment list is not null, so that can add a new item - boundary 
assertNotNull("Check if there is valid Appointment arraylist to add to", apptList); 
//Given an empty list, after adding 1 item, the size of the list is 1 - normal 
//The item just added is as same as the first item of the list 
C206_CaseStudy.addAppointment(apptList, appt1); 
assertEquals("Check that Appointment arraylist size is 1", 1, apptList.size()); 
assertSame("Check that Appointment is added", appt1, apptList.get(0)); 

//Add another item. test The size of the list is 2? -normal 
//The item just added is as same as the second item of the list 
C206_CaseStudy.addAppointment(apptList, appt2); 
assertEquals("Check that Appointment arraylist size is 2", 2, apptList.size()); 
assertSame("Check that Appointment is added", appt2, apptList.get(1)); 
} 

public void testRetrieveAllAppointment() { 
// Test if appointment list is not null but empty -boundary 
assertNotNull("Test if there is valid Camcorder arraylist to retrieve item", apptList); 

//test if the list of Appointment retrieved from the C206_CaseStudy is empty - boundary 
String allAppointment= C206_CaseStudy.retreiveAllAppointment(apptList); 
String testOutput = ""; 
assertEquals("Check that ViewAllAppointment", testOutput, allAppointment); 

//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal 
C206_CaseStudy.addAppointment(apptList, appt1); 
C206_CaseStudy.addAppointment(apptList, appt2); 
assertEquals("Test that Appointment arraylist size is 2", 2, apptList.size()); 

//test if the expected output string same as the list of appointment retrieved from the C206_CaseStudy  
allAppointment= C206_CaseStudy.retreiveAllAppointment(apptList); 
testOutput = String.format("%-10s %-30s %-10s %-20s\n","10/10/2022", 13.30,  "Tim", "Hougang Ave 8"); 
testOutput += String.format("%-10s %-30s %-10s %-20s\n","12/10/2022", 14.45,  "Wilson", "Bukit Panjang View"); 
testOutput += String.format("23/10/2022", 18.30,  "Adam", "Rivervale Drive"); 

assertEquals("Test that ViewAllapptlist", testOutput, allAppointment); 

} 

public void testDodeleteAppointment() { 
//boundary 

assertNotNull("Test if there is an existing appointment apptList to delete ", apptList); 
C206_CaseStudy.addAppointment(apptList, appt1); 
 C206_CaseStudy.doDeleteAppointment(apptList, appt1.getCustomerName()); 
 assertEquals("Test if that appointment arraylist size is 2?", 2, apptList.size()); 
 C206_CaseStudy.addAppointment(apptList, appt2); 
 C206_CaseStudy.doDeleteAppointment(apptList, appt2.getCustomerName()); 
 assertEquals("Test that apptList arraylist size is 1?", 1, apptList.size()); 
 C206_CaseStudy.addAppointment(apptList, appt3); 
 C206_CaseStudy.doDeleteAppointment(apptList, appt3.getCustomerName()); 
 assertEquals("Test that apptList arraylist size is 0?", 0, apptList.size()); 
} 

}