package assignmentone;


import java.time.LocalDate;
import java.time.Period;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author albert
 */
public class Person {
    /**Set variables
     * 
     */
    private String firstName, lastName, streetAddress, city, province, postalCode;
    private LocalDate birthDate;
    private int age;
    
    /**Person class
     * 
     * @param firstName
     * @param lastName
     * @param address
     * @param city
     * @param province
     * @param postalCode
     * @param dob 
     */
    public Person(String firstName, String lastName, String streetAddress, String city, String province, String postalCode, LocalDate dob)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.province = province;
        setPostalCode(postalCode);
        this.birthDate = dob;
         
    /** End of Person Constructor
     * 
     */ 
    } 
    
    /**Getters and Setters 
     * 
     * @return 
     */
     public String getPostalCode(){
      return postalCode; 
     }
 
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getStreetAddress(){
        return streetAddress;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getProvince(){
        return province;
    }
     
    public LocalDate getBirthdate() {
        return birthDate;
    }
    
     public int getYearBorn() {
        
        return birthDate.getYear();
    }
    /**getAge method that takes LocalDate birthDate as an argument and returns age in years
     * 
     * @param birthDate
     * @return 
     */
    public int getAge(){
       LocalDate today = LocalDate.now();
       age = Period.between(birthDate,today).getYears();
       return age;
    }
    /**Method fullAddress returns address, city, province, and postalCode as a String
     * 
     * @param address
     * @param city
     * @param province
     * @param postalCode
     * @return 
     */
    public String getFullAddress(){
        
        String fullAddress = streetAddress + ", " + city + ", " + province+ ", " + postalCode;
        return fullAddress;
    }
    
    public void setFirstName(String firstName)
    {
    this.firstName = firstName;
    }
    
     public void setLastName(String lastName)
    {
    this.lastName = lastName;
    }
     
     public void setStreetAddress(String address)
    {
    this.streetAddress = address;
    }
     
     public void setCity(String city)
    {
    this.city = city;
    }
    
     public void setProvince(String province)
    {
    this.province = province;
    }
     
     public void setBirthDate(LocalDate birthDate)
     {
    this.birthDate = birthDate;
     }
    /**Method that validates postalCode
     * 
     * @param postalCode 
     */ 
    public void setPostalCode(String postalCode)
     {
         
     if(postalCode.length() == 6) {
            this.postalCode = postalCode; 
        } else {
            throw new IllegalArgumentException("Postal Code must be six characters long");
        }      
     }
    /**Method that changes address 
     * 
     * @param address
     * @param city
     * @param province
     * @param postalCode 
     */
    public void changeAddress(String address, String city, String province, String postalCode){
        this.streetAddress = address;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }
    
    
       
    
    
    
    
    //End of person class
    }
