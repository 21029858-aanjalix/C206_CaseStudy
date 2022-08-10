import java.time.LocalDate;
import java.util.ArrayList;

public class C206_CaseStudy {
 private static final int OPTION_ADD=1; 
 private static final int OPTION_VIEW=2; 
 private static final int OPTION_DELETE=3; 
 private static final int OPTION_QUIT=4; 
 public static void main(String[] args) {
	 
	 
//OPTION 1 = MANAGE CUSTOMER 
//ANJALI 
	 
	 
	 ArrayList<Admin> userList = new ArrayList<Admin>(); 
 Admin u1 = new Admin("admin1", "User", "user@mail.com", "Pa$$word","NEW") ; 
 Admin u2 = new Admin("admin2", "User", "user@mail.com", "Pa$$word","NEW");   
 	userList.add(u1) ;
 	userList.add(u2) ;
 }
  
  //================================= Option 1 Add =================================
 public static void addCustomer(ArrayList<Admin> userList, Admin ad) {
		userList.add(ad) ; 
		}
 public static Admin inputUsers() {
   String username= Helper.readString("Enter New User Name:");
   String password=Helper.readString("Enter Password:");
   String role=Helper.readString("Enter Role:"); 
   String email=Helper.readString("Enter Email:");
   String status = Helper.readString("Enter customer :") ; 
 Admin a = new Admin(username, role, email, password,status ); 
 return a ; 
  }
 
//============================Option 2 View All========================================
 public static String ViewAll(ArrayList<Admin> userList) {
     String output = "";
     for(int i  = 0; i < userList.size(); i++) {

         String name = userList.get(i).getName();
         String role = userList.get(i).getRole();
         String password = userList.get(i).getPassword();
         String email = userList.get(i).getEmail();
         String status = userList.get(i).getStatus();
         

         output += String.format("%-10s %-20s %-20s %-30s %-10s\n", name ,role, email, password, status) ;
     }
     return output;
 }
 public static void viewAllUser(ArrayList<Admin> userList) {
     String output = String.format("%-10s %-20s %-20s %-30s %-10s\n", "NAME","ROLE ","EMAIL", "PASSWORD", "STATUS");
     output += ViewAll(userList);
     System.out.println(output);
 }

	
//====================Option 3 Delete user by name=====================================
 public static boolean deleteUsers(ArrayList<Admin> userList2, Admin u2) {
		return false;
	}
 
 public static void inputDeleteCustomer(ArrayList<Admin> userList) {
     String User = Helper.readString("Enter the username: ") ;

     deleteUsers (userList, User);
 }
 public static void deleteUsers(ArrayList<Admin> userList, String User) {
 for (int i = 0 ; i< userList.size() ; i ++ ) {
     if (userList.get(i).getName().equalsIgnoreCase(User)) {
             userList.remove(i) ;
         } else {
             System.out.println("Delete failed") ;
         }
 }
 }
//OPTION 2 =  REQUEST QUOTATION  
//AGNES  

public static ArrayList<Package> packageList = new ArrayList<Package>(); 
public static ArrayList<RequestQuotation1> requestQuotationList = new ArrayList<RequestQuotation1>() 

requestQuotationList.add(new RequestQuotation1("HDB", 890, "Merlion", 78789067, "Merlion@gmail.com", 50000, "29-9-2022", "kitches", 1, 0, null, null)); 
requestQuotationList.add(new RequestQuotation1("HDB", 908, "Tylok", 56789045, "Tylok@gmail.com", 100000, "1-10-2022", "toilet", 0, 1, null, null)); 
 
 
int option = 0; 

while (option != OPTION_QUIT) { 

  C206_CaseStudy.menu(); 
  option = Helper.readInt("Enter an option > "); 

  switch (option) { 
   
  case 1:  //Customer view: Request Quotation, Add appointment     
    customerMenu(); 
    int customerOption = Helper.readInt("Enter an option > "); 
     
    switch (customerOption) { 
    case 1:  //Request for quotation 
      RequestQuotation1 userrq = inputRequestQuotation(); 
      C206_CaseStudy.addRequestQuotation(requestQuotationList, userrq); 
      System.out.println("Quotation Requested"); 
      break; 
    case 2: // Make appointment 
    } 
    break; 
     
     
  case 2:  //Admin view: Add/Delete/View Package, Add/View/Deleteete Appointment,View/Delete request quotation
	  
	  adminMenu(); 
	     int adminOption = Helper.readInt("Enter an option > "); 
	      
	     switch (adminOption) { 
	      
	     case 1:  //Manage Package 
	       adminPackageOption();           
	       break; 
	        
	     case 2:  //Manage Appointment 
	       break; 
	      
	     case 3:  //Manage Quotation Requests 
	       adminReqQuoOption(); 
	       break; 
	        
	     }//end of adminOption 
	     break; 
	 
	    
	      
	   case OPTION_QUIT: 
	     System.out.println("Bye!"); 
	     option = 4; 
	     break; 
	      
	   default: 
	     System.out.println("Invalid input"); 
	     break;     
	   } 
	 }//end of while loop 
	  
	} 
	} 
	public static void menu() { 
	 setHeader("Renovation ACE Website"); 
	 System.out.println("1. Enter as a Customer"); 
	 System.out.println("2. Enter as an Admin"); 
	 System.out.println("3. Enter as an Designer"); 
	 System.out.println("4. Quit"); 
	 Helper.line(80, "-"); 
	} 
	 
	public static void customerMenu() { 
	 setHeader("Customer"); 
	 System.out.println("1. Request For Quotation"); 
	 System.out.println("2. Make Appointment"); 
	 System.out.println("3. Quit"); 
	 Helper.line(80, "-"); 
	} 
	 
	public static void adminMenu() { 
	 setHeader("Admin"); 
	 System.out.println("1. Manage Package"); 
	 System.out.println("2. Manage Appointment"); 
	 System.out.println("3. Manage Quotation Requests"); 
	 System.out.println("4. Quit"); 
	 Helper.line(80, "-"); 
	} 
	 
	public static void designerMenu() { 
	 setHeader("Designer"); 
	 System.out.println("1. View Quotation"); 
	 System.out.println("2. Add Quotation"); 
	 System.out.println("3. Delete Quotation"); 
	 System.out.println("4. View Quotation Requests"); 
	 System.out.println("5. Quit"); 
	 Helper.line(80, "-"); 
	} 
	 
	public static void adminPackageMenu() { 
	 setHeader("Manage Package"); 
	 System.out.println("1. View Package"); 
	 System.out.println("2. Add Package"); 
	 System.out.println("3. Delete Package"); 
	 System.out.println("4. Quit"); 
	 Helper.line(80, "-"); 
	} 
	 
	public static void adminReqQuotMenu() { 
	 setHeader("Manage Quotation Requests"); 
	 System.out.println("1. View quotation request"); 
	 System.out.println("2. Delete quotation request"); 
	 System.out.println("3. Quit"); 
	 Helper.line(80, "-"); 
	} 
	 
	public static void adminAppointMenu() { 
	    setHeader("Manage Appointment"); 
	    System.out.println("1. View appointment"); 
	    System.out.println("2. Make appointment"); 
	    System.out.println("3. Delete appointment"); 
	    System.out.println("4. Quit"); 
	    Helper.line(80, "-"); 
	  } 
	 
	  public static void adminPackageOption(){ 
	    adminPackageMenu(); 
	    int adminPackageOption = Helper.readInt("Enter an option > "); 
	 
	    switch (adminPackageOption) { 
	    case OPTION_VIEW: 
	      viewAllPackage(packageList); 
	      break; 
	    case OPTION_ADD: 
	      Package userp = inputPackage(); 
	      addPackage(packageList, userp); 
	      System.out.println("Package added"); 
	      break; 
	    case OPTION_DELETE: 
	      removePackage(packageList); 
	      break; 
	    default: 
	      System.out.println("Invalid input"); 
	    } 
	  } 
	   
	  public static void adminReqQuoOption(){ 
	    adminReqQuotMenu(); 
	    int adminReqQuoOption = Helper.readInt("Enter an option > ");     
	 
	    switch (adminReqQuoOption) { 
	    case OPTION_VIEW: 
	      viewAllRequestQuotation(requestQuotationList); 
	      break; 
	    case 2: //Delete Quotation request 
	      removeRequestQuotation(requestQuotationList); 
	      break; 
	    case 3: 
	      break; 
	    default: 
	      System.out.println("Invalid input"); 
	      break; 
	    } 
	  } 
	   
	  public static void adminAppointOption(){ 
	    adminAppointMenu(); 
	    int adminAppointOption = Helper.readInt("Enter an option > "); 
	 
	    switch (adminAppointOption) { 
	    case OPTION_VIEW: 
	      viewAllPackage(packageList); 
	      break; 
	    case OPTION_ADD: 
	      Package userp = inputPackage(); 
	      addPackage(packageList, userp); 
	      System.out.println("Package added"); 
	      break; 
	    case OPTION_DELETE: 
	      removePackage(packageList); 
	      break; 
	    default: 
	      System.out.println("Invalid
	input"); 
	    } 
	  } 
	  private static void viewAllPackage(ArrayList<Package> packageList2) { 
		    // TODO Auto-generated method stub 
		     
		  } 
		 
		 
		  private static void addPackage(ArrayList<Package> packageList2, Package userp) { 
		    // TODO Auto-generated method stub 
		     
		  } 
		 
		 
		  private static Package inputPackage() { 
		    // TODO Auto-generated method stub 
		    return null; 
		  } 
		 
		 
		  private static void removePackage(ArrayList<Package> packageList2) { 
		    // TODO Auto-generated method stub 
		     
		  } 
		 
		 
		     
		 
		   
		   
		  public static void setHeader(String header) { 
		    Helper.line(80, "-"); 
		    System.out.println(header); 
		    Helper.line(80, "-"); 
		  } 
		     
		 
		   
		   
		 
		     
		  public static RequestQuotation1 inputRequestQuotation() { 
		 
		    String propertyType = Helper.readString("Enter Property type > "); 
		    Double areaSize = Helper.readDouble("Enter Area size > "); 
		    String name = Helper.readString("Enter requestor name > "); 
		    int no = Helper.readInt("Enter contact number > "); 
		    String email = Helper.readString("Enter requestor email > "); 
		    double budget = Helper.readDouble("Enter your budget > "); 
		    String date = Helper.readString("Target completion date > "); 
		    String type = Helper.readString("Enter your renovation type "); 
		    int numberOfRoom = Helper.readInt("Number of rooms to renovate "); 
		    int numberOfToilet = Helper.readInt("Number of toilets to renovate"); 
		    String style = Helper.readString("Renovation style"); 
		    String urgent = Helper.readString("Urgent request"); 
		     
		    RequestQuotation1 qq = new RequestQuotation1(propertyType, areaSize, name, no, email,budget, date, type, numberOfRoom, numberOfToilet,style, urgent); 
		    return qq; 
		  } 
		     
		  public static void addRequestQuotation(ArrayList<RequestQuotation1> requestQuotationList, RequestQuotation1 qq) { 
		    requestQuotationList.add(qq); 
		  } 
		 
		  public static String retrieveAllRequestQuotation(ArrayList<RequestQuotation1> requestQuotationList) { 
		    String output = ""; 
		 
		    for (int i = 0; i < requestQuotationList.size(); i++) { 
		 
		      output += String.format("%-207s", requestQuotationList.get(i).toString());           
		    } 
		    return output; 
		  } 
		  public static void viewAllRequestQuotation(ArrayList<RequestQuotation1> requestQuotationList) { 
		     C206_CaseStudy.setHeader("REQUEST FOR QUOTATION LIST"); 
		     String output = String.format("%-15s %-10s %-20s %-20s %-25s %-10s %-25s %-20s %-20s %-20s %-20s %-20s\n", "PROPERTY TYPE", "AREA SIZE", 
		         "REQUESTOR NAME", "CONTACT NUMBER","EMAIL", "BUDGET", "TARGET COMPLETION DATE","RENOVATION TYPE","NUMBER OF ROOMS","NUMBER OF TOILETS","RENOVATION STYLE","URGENT REQUST"); 
		      output += retrieveAllRequestQuotation(requestQuotationList);   
		     System.out.println(output); 
		   } 
		    
		   public static boolean findRequestorName(ArrayList<RequestQuotation1> requestQuotationList, String x) { 
		     boolean isExist = false; 
		      
		     for(RequestQuotation1 i : requestQuotationList) { 
		       if (x.equalsIgnoreCase(i.getRequestorName())) { 
		         isExist = true; 
		       } 
		     } 
		     return isExist; 
		   } 
		 
		   public static void doRemoveRequestQuotation(ArrayList<RequestQuotation1> requestQuotationList, String x) { 
		     for(RequestQuotation1 i : requestQuotationList) { 
		       if (x.equalsIgnoreCase(i.getRequestorName())) { 
		         requestQuotationList.remove(i); 
		       } 
		     } 
		   } 
		 
		   public static void removeRequestQuotation(ArrayList<RequestQuotation1> requestQuotationList) { 
		     String name = Helper.readString("Enter requestor name > "); 
		     boolean verify = findRequestorName(requestQuotationList, name); 
		 
		     if(verify == true) { 
		       doRemoveRequestQuotation(requestQuotationList, name);           
		       System.out.println("Request for quotation deleted"); 
		     }else { 
		       System.out.println("Invalid requestor name"); 
		     } 
		   } 
		 } 
		   
		//OPTION 3 = MANAGE QUOTATION  
		//JOVAN  
		 
		 
		//OPTION 4 = MANAGE APPOINTMENT  
		//DZIKRI  
		ArrayList<Appointment> apptList = new ArrayList<Appointment>(); 
		
		apptList.add(new Appointment("Jack", "10/10/2022", 13.30,  "Tim", "Hougang Ave 8")); 
		apptList.add(new Appointment("Dzik", "12/10/2022", 14.45,  "Wilson", "Bukit Panjang View")); 
		apptList.add(new Appointment("Hong", "23/10/2022", 18.30,  "Adam", "Rivervale Drive")); 
		 
		int option = 0; 
		 
		while (option != OPTION_QUIT) { 
		 C206_CaseStudy.menu(); 
		 option = Helper.readInt("Enter an option > "); 
		  
		 if (option == OPTION_VIEW) { 
		  // View all items 
		  C206_CaseStudy.viewAllAppointment(apptList); 
		   
		 } else if (option == OPTION_ADD) { 
		  // Add a new item 
		  C206_CaseStudy.setHeader("ADD"); 
		   
		  Appointment at = inputAppointment(); 
		  C206_CaseStudy.addAppointment(apptList, at); 
		  System.out.println("New Appointment added !"); 
		 } else if (option == OPTION_DELETE) { 
		  // Loan item 
		  C206_CaseStudy.setHeader("DELETE"); 
		  C206_CaseStudy.retreiveAllAppointment(apptList); 
		   
		  System.out.println(" Appointment Deleted !"); 
		   
		 } else if (option == OPTION_QUIT) { 
		  System.out.println("Thank You Bye!"); 
		 } else { 
		  System.out.println("Invalid option"); 
		 } 
		} 
		} 
		 
		} 
		public static void menu1() { 
		   C206_CaseStudy.setHeader("APPOINTMENT SITE"); 
		      System.out.println("1. Add appointments"); 
		      System.out.println("2. View appointments"); 
		      System.out.println("3. Delete appointment"); 
		      System.out.println("4. Quit"); 
		      Helper.line(80, "-"); 
		  } 
		 /* public static void setHeader(String header) { 
		   Helper.line(80, "-"); 
		   System.out.println(header); 
		   Helper.line(80, "-"); 
		  } 
		   */ 
		 
		  private static void menu() { 
		 // TODO Auto-generated method stub 
		  
		} 
		 
		 //================================= Option 1 View (CRUD - Read) ================================= 
		   public static String retreiveAllAppointment(ArrayList<Appointment> apptList) { 
		     // TODO Auto-generated method stub 
		     String output = ""; 
		      
		     for (int i = 0; i<apptList.size(); i++) { 
		      output += String.format("%-15s %-20s %-20.2f %-20s %-10s\n", 
		        apptList.get(i).getCustomerName(), 
		        apptList.get(i).getDateOfAppointment(), 
		        apptList.get(i).getTimeOfAppointment(), 
		        apptList.get(i).getDesignerName(), 
		        apptList.get(i).getAddress()); 
		       
		     } 
		     return output; 
		    } 
		   public static void viewAllAppointment(ArrayList<Appointment> apptList) { 
		    C206_CaseStudy.setHeader("APPOINTMENT LIST"); 
		    String output = String.format("%-15s %-20s %-20s %-20s %-20s\n","CUSTOMER NAME", "DATE OF APPOINTMENT", "TIME OF APPOINTMENT", 
		      "DESIGNER NAME", "ADDRESS"); 
		     output += retreiveAllAppointment(apptList);  //retrieve appointment 
		    System.out.println(output); 
		   } 
		   private static void setHeader(String string) { 
		  // TODO Auto-generated method stub 
		   
		 } 
		 
		 //================================= Option 2 Add (CRUD - Create)================================= 
		   public static Appointment inputAppointment() { 
		    String customerName = Helper.readString("Enter Customer Name > "); 
		    String dateOfAppointment = Helper.readString("Enter date of appointment > "); 
		    double timeOfAppointment = Helper.readDouble("Enter time of appointment > "); 
		    String designerName = Helper.readString("Enter name of designer > "); 
		    String address = Helper.readString("Enter address > "); 
		     
		    Appointment at = new Appointment(customerName, dateOfAppointment, timeOfAppointment, designerName, address); 
		    return at; 
		     
		   } 
		   public static void addAppointment(ArrayList<Appointment> aptList, Appointment at) { 
		     
		    aptList.add(at); 
		   } 
		    
		 //================================= Option 3 Delete student (CRUD- Remove) =================================  
		   public static boolean doDeleteAppointment(ArrayList<Appointment> apptList, String name) { 
		    // write your code here 
		    boolean isDelete = false; 
		 
		    for (int i = 0; i < apptList.size(); i++) { 
		   } 
		   } 
		   }
	 
	  