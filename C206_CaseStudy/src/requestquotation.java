
public class requestquotation {
	       
	       private String requestName; 
		   private String contactNumber; 
		   private String email; 
		   private String propertyType; 
		   private String renovationType; 
		   private String rooms; 
		   private String toilets; 
		   private String areaSize; 
		   private String renovationStyle; 
		   private String targetCompletionDate; 
		   private int budget; 
		   private String requestUrgency; 
		    
		  
		 
		  public requestquotation(String requestName, String contactNumber, String email, String propertyType,
		    String renovationType, String rooms, String toilets, String areaSize, String renovationStyle,
		    String targetCompletionDate, int budget, String requestUrgency) {
		   super();
		   this.requestName = requestName;
		   this.contactNumber = contactNumber;
		   this.email = email;
		   this.propertyType = propertyType;
		   this.renovationType = renovationType;
		   this.rooms = rooms;
		   this.toilets = toilets;
		   this.areaSize = areaSize;
		   this.renovationStyle = renovationStyle;
		   this.targetCompletionDate = targetCompletionDate;
		   this.budget = budget;
		   this.requestUrgency = requestUrgency;
		  }
		  public String getRequestName() {
		   return requestName;
		  }
		  public void setRequestName(String requestName) {
		   this.requestName = requestName;
		  }
		  public String getContactNumber() {
		   return contactNumber;
		  }
		  public void setContactNumber(String contactNumber) {
		   this.contactNumber = contactNumber;
		  }
		  public String getEmail() {
		   return email;
		  }
		  public void setEmail(String email) {
		   this.email = email;
		  }
		  public String getPropertyType() {
		   return propertyType;
		  }
		  public void setPropertyType(String propertyType) {
		   this.propertyType = propertyType;
		  }
		  public String getRenovationType() {
		   return renovationType;
		  }
		  public void setRenovationType(String renovationType) {
		   this.renovationType = renovationType;
		  }
		  public String getRooms() {
		   return rooms;
		  }
		  public void setRooms(String rooms) {
		   this.rooms = rooms;
		  }
		  public String getToilets() {
		   return toilets;
		  }
		  public void setToilets(String toilets) {
		   this.toilets = toilets;
		  }
		  public String getAreaSize() {
		   return areaSize;
		  }
		  public void setAreaSize(String areaSize) {
		   this.areaSize = areaSize;
		  }
		  public String getRenovationStyle() {
		   return renovationStyle;
		  }
		  public void setRenovationStyle(String renovationStyle) {
		   this.renovationStyle = renovationStyle;
		  }
		  public String getTargetCompletionDate() {
		   return targetCompletionDate;
		  }
		  public void setTargetCompletionDate(String targetCompletionDate) {
		   this.targetCompletionDate = targetCompletionDate;
		  }
		  public int getBudget() {
		   return budget;
		  }
		  public void setBudget(int budget) {
		   this.budget = budget;
		  }
		  public String getRequestUrgency() {
		   return requestUrgency;
		  }
		  public void setRequestUrgency(String requestUrgency) {
		   this.requestUrgency = requestUrgency;
		  } 
		  
		  public String toString() {
		   String output = String.format("%20s %-10s %-15s %-20s %-20s %-20s %-10s %-10d %-20s\n",
		     requestName,
		     contactNumber,
		     email,
		     propertyType,
		     renovationType,
		     rooms,
		     toilets,
		     areaSize,
		     renovationStyle,
		     targetCompletionDate,
		     budget,
		     requestUrgency
		     );
		     return output; 
		  }
		}


