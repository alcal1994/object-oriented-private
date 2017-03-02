/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentone;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author albert
 */
public class Instructor extends Person {
    /**
     * instance variables
     */
    private String listOfSubjectsCertifiedToTeach, courseCode;
    private int employeeNumber, yearsAtCollege, howOld, hire;
    private LocalDate hireDate, birthday;
    private ArrayList<String> course = new ArrayList<>();
/**
 * constructor Instructor
 * @param firstName
 * @param lastName
 * @param streetAddress
 * @param city
 * @param province
 * @param postalCode
 * @param dob
 * @param employeeNum
 * @param hireDate 
 */
    public Instructor(String firstName, String lastName, String streetAddress, String city, String province, String postalCode, LocalDate dob, int employeeNum, LocalDate hireDate){
        super(firstName, lastName, streetAddress, city, province, postalCode, dob);
        
        setBirthday(birthday);
        this.employeeNumber = employeeNumber;
        setHireDate(hireDate);
        
        
        
         }  
    /**
     *getters and setters methods
     * @return 
     */
    public String courseCode(){
     return courseCode;
    }
    /**
     * method to accept courseCode and convert it into uppercase and add it to array list
     * @param courseCode 
     */
    public void addTeachableCourse(String courseCode){
        courseCode.toUpperCase();
        course.add(courseCode);
        
     }
     //starts off false, if the courseCode is contained in the arraylist slots,
    //isTrue is set to true and returned as is
    /**
     * method canTeach to return true or false if instructor matches list of teachable subjects 
     * @param courseCode
     * @return 
     */
    public boolean canTeach(String courseCode){
        boolean isTrue = false;
        for(int i=0;i<course.size();i++){
            if(course.get(i).equalsIgnoreCase(courseCode)){
                isTrue = true;
            }//end of if statement
        }//end of for loop
        return isTrue;
     }//end of method
     
    public int getYearsAtCollege(){
         return yearsAtCollege;
     }
    
    public LocalDate getBirthday(){
        return birthday;
    }
    public LocalDate getHireDate(){
        return hireDate;
    }
    public int getEmployeeNum(){
        return employeeNumber;
    }
     
    public String listOfSubjectsCertifiedToTeach(){
     
        
        return listOfSubjectsCertifiedToTeach;
      }
    
    public void addCourseToAbilities(){
        
    }
    public void setEmployeeNumber(){
       this.employeeNumber = employeeNumber;
    }
    /**
     * method setBirthday to validate age is between 18, and 100 years old
     * @param birthday 
     */
     public void setBirthday(LocalDate birthday){
       LocalDate today = LocalDate.now();
       howOld = Period.between(birthday,today).getYears();
       
       if(howOld<=100 && howOld<=18){
         this.birthday = birthday;  
       }else{
           throw new IllegalArgumentException("Age must be between 18-100 years old.");
       } 
    }
    /**
     * method setHireDate, to validate hire date is between 1 and 80 years
     * @param hireDate 
     */
    public void setHireDate(LocalDate hireDate){
    LocalDate today = LocalDate.now();
    hire = Period.between(hireDate,today).getYears();
        
    if(hire <= 80 && hire >1){
        this.hireDate = hireDate;
    }else{
            throw new IllegalArgumentException("Hire date must be between 1 and 80");
     
            }
           
    
    
    }
    /**
     * method toString updates first name, last name, and employee number
     * @param firstName
     * @param lastName
     * @param employeeNumber 
     */
    public void toString(String firstName, String lastName, int employeeNumber){
     this.firstName = firstName;
     this.lastName = lastName;
     this.employeeNumber = employeeNumber;
    }
     /**
      * method getTeachableCourses to return courses
      * @return 
      */
    public ArrayList<String> getTeachableCourses() {
        
      return course;
      
      
    }
    
    
    }
