/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentone;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author albert
 */
public class Student extends Person{
    
    /**
     * Instantiate variables
     */
    private int yearEnrolled, yearsAtCollege, studentNumber,howOld;
    private String reinstateStudent, suspendStudent, major;
    private LocalDate birthday;
    private boolean inGoodStanding;
    
    /**
     * Constructor for Student class
     * @param firstName
     * @param lastName
     * @param streetAddress
     * @param city
     * @param province
     * @param postalCode
     * @param dob 
     */
    

    public Student(String firstName, String lastName, String streetAddress, String city, String province, String postalCode, LocalDate dob, String major, int studentNumber, LocalDate yearEnrolled) {
        super(firstName, lastName, streetAddress, city, province, postalCode, dob); // calls the constructor of the parent class
        
    
    this.major = major;
    setBirthday(birthday);
    setStudentNumber(studentNumber);
    this.yearEnrolled = yearEnrolled.getYear();
    }
    
    public int getYearEnrolled(){
        return yearEnrolled;
    }
    
    public int getYearsAtCollege(){
        double tempYear;
       tempYear = LocalDate.now().getYear() - yearEnrolled;
       tempYear = Math.floor(yearEnrolled);
       Double d = new Double(tempYear);
       yearsAtCollege = d.intValue();
       
        return yearsAtCollege;
    }
    
    public boolean inGoodStanding(){
        if(inGoodStanding){
        return true;}
        else{return false;}
    }
    
    public LocalDate getBirthday(){
        return birthday;
    }
    
    public String getMajor(){
     return major;
    }
    
    public void setBirthday(LocalDate birthday){
       LocalDate today = LocalDate.now();
       howOld = Period.between(birthday,today).getYears();
       
       if(howOld<=90 && howOld<=14){
         this.birthday = birthday;  
       }else{
           throw new IllegalArgumentException("Age must be between 14-90 years");
       } 
    }
    
     public void setStudentNumber(int studentNumber){
     
     if(studentNumber <= 0){
         this.studentNumber = studentNumber;
     } else {
            throw new IllegalArgumentException("Numbers entered must be greater than 0");
       }
     }
     
     public void setMajor(){
      this.major = major;
     }
    
     
     public void reinstateStudent(){
         inGoodStanding = true;
     }
     
     public void suspendStudent(){
         inGoodStanding = false;
     }
     
     public void toString(String firstName,String lastName){
         
         this.firstName = firstName; 
         this.lastName = lastName;
         this.studentNumber = studentNumber;
         
     }
}
