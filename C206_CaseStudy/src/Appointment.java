public class Appointment {
 private String customerName;
 private String dateOfAppointment;
 private double timeOfAppointment;
 private String designerName;
 private String address;
 
 
 public Appointment(String customerName,String dateOfAppointment, double timeOfAppointment, String designerName, String address) {
  this.customerName = customerName;
  this.dateOfAppointment = dateOfAppointment;
  this.timeOfAppointment = timeOfAppointment;
  this.designerName = designerName;
  this.address = address;
 }
 
 
 public String getCustomerName() {
  return customerName;
 }


 public void setCustomerName(String customerName) {
  this.customerName = customerName;
 }


 public String getDateOfAppointment() {
  return dateOfAppointment;
 }
 public void setDateOfAppointment(String dateOfAppointment) {
  this.dateOfAppointment = dateOfAppointment;
 }
 public double getTimeOfAppointment() {
  return timeOfAppointment;
 }
 public void setTimeOfAppointment(double timeOfAppointment) {
  this.timeOfAppointment = timeOfAppointment;
 }
 public String getDesignerName() {
  return designerName;
 }
 public void setDesignerName(String designerName) {
  this.designerName = designerName;
 }
 public String getAddress() {
  return address;
 }
 public void setAddress(String address) {
  this.address = address;
 }
 
}