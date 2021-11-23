/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oracle.jdbc.pkg19c;

/**
 *
 * @author Muhammad Shaheer
 */
public class Customer {
    
   private int customerId; 
   private String firstName,lastName,CNIC,password;
   private long contactNum;
   
   public Customer(int customerId,String firstName,String lastName,String CNIC,long contactNum,String password) {
       this.customerId = customerId;
       this.firstName = firstName;
       this.lastName = lastName;
       this.CNIC = CNIC;
       this.contactNum = contactNum;
       this.password = password;
   }
   
   public long getcontactNum() {
       return contactNum;
   }
   public int getCustomerId() {
       return customerId;
   }
   public String getFirstName() {
       return firstName;
   }
   public String getLastName() {
       return lastName;
   }
   public String getCNIC() {
       return CNIC;
   }
   public String getPassword() {
       return password;
   }
    
}
