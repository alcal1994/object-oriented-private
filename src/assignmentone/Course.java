/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package assignmentone;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author albert
 */
public class Course {
    
    private  int duration, maxStudents, numberOfStudentsEnrolled;
    private double averageStudentTimeAtCollege;
    private String courseCode, courseName, description, roomLocation, toString;
    private LocalTime startTime;
    private DayOfWeek courseDay;
    private ArrayList<Student> studentsRegistered = new ArrayList<>();
    private Instructor instructor;
    /**
     * constructor for course class
     * @param courseCode
     * @param courseName
     * @param description
     * @param roomLocation
     * @param instructor
     * @param courseDay
     * @param startTime
     * @param duration
     * @param maxStudents 
     */
    public Course(String courseCode, String courseName, String description, String roomLocation, Instructor instructor, DayOfWeek courseDay, LocalTime startTime, int duration, int maxStudents){
            
       
       this.courseCode = courseCode;
       this.courseName = courseName;
       this.description = description;
       this.roomLocation = roomLocation;
       this.instructor = instructor;
       this.courseDay = courseDay;
       this.startTime = startTime;
       this.duration = duration;
       setMaxNumberOfStudents(maxStudents);
            
       
        
        
        
      
        
        
        
     }
/**
 * accepts student object, and adds student
 * @param studentObject 
 */
public void addStudent(Student studentObject){
    
    if(studentObject.inGoodStanding() && getNumberOfStudentsEnrolled() <= getMaxNumberOfStudents()){
           studentsRegistered.add(studentObject);
    }else{
        
    }
 
}
/**
 * returns double of average student time at college method
 * @return 
 */
public double averageStudentTimeAtCollege(){
 averageStudentTimeAtCollege = duration * numberOfStudentsEnrolled / numberOfStudentsEnrolled;
 return averageStudentTimeAtCollege;
}
/**
 * getters and setters
 * @return 
 */
public String getCourseCode(){
    return courseCode;
}

public void setCourseName(String courseName){
    this.courseName = courseName;
}
public String getCourseName(){
    return courseName;
}
/**
 * method to validate days of the week and set courseDay
 * @param dayOfWeek 
 */
public void setDayOfClass(DayOfWeek dayOfWeek){
    /* The Value of days of week are Monday = 1 and Sunday = 7 */
    if(dayOfWeek.getValue() >= 1 && dayOfWeek.getValue() <= 5){
        this.courseDay = dayOfWeek;
    }else{
        throw new IllegalArgumentException("The day must be between Monday and Friday");
    }
    
}
public DayOfWeek getDayOfClass(){
    return courseDay;
}

public String getDescription(){
    return description;
}

public int getDuration(){
    return duration;
}

public int getMaxNumberOfStudents(){
    
    return maxStudents;
}

public int getNumberOfStudentsEnrolled(){
    return numberOfStudentsEnrolled;
}



public String getRoom(){
   return roomLocation;
}

public LocalTime getStartTime(){
    return startTime;
}
public ArrayList<Student> getStudents() {
        
      return studentsRegistered;
}

public void setDayOfClass(){
    
}
/**
 * validates max number of students is between 10 and 50 and sets maxStudents variable
 * @param maxStudents 
 */
public void setMaxNumberOfStudents(int maxStudents){
   if (maxStudents>= 10 && maxStudents<= 50){
       this.maxStudents = maxStudents; 
   }else{
       throw new IllegalArgumentException("Number of students must be between 10 and 50");
   }
}
/**
 * sets prof to true if instructor courses equal teachable courses
 * @param instructor 
 */
public void setProf(Instructor instructor){
    boolean isTeachable = false;
    
    for(int i = 0; i< instructor.getTeachableCourses().size(); i++){
        
        if(getCourseCode().matches(instructor.getTeachableCourses().get(i))){
            isTeachable = true;
        }//if course we are searching for exists in teachers teachable courses
        //set isteachable to true
        
        
    }//loop
    
    if(isTeachable){
        System.out.println("This course is teachable by this Prof");
        
    }else{
        throw new IllegalArgumentException("The professor cannot teach this course");
    }
    
    
}

public Instructor getProf(){
    return instructor;
}
        
 /**
  * method to validate start time
  * @param startTime 
  */       
public void setStartTime(LocalTime startTime){
    if(startTime.getHour() >= 8 && startTime.getHour()<=18){
    this.startTime = startTime;
}else{
    throw new IllegalArgumentException("Start time must be between 8:00 am and 6:00 pm");
    }
    
}
/**
 * method to return string of class list
 * @return 
 */
public String showClassList(){
    String classList = "" ; 
     for(int i = 0; i<= numberOfStudentsEnrolled; i++){
         
         classList += studentsRegistered.get(i).toString() + System.lineSeparator();
         
     }
     return classList;
     
}
/**
 * method to return string with courseName and courseCode
 * @return 
 */
public String toString(){
    toString = getCourseName() + " " + getCourseCode();
  return toString;
}

}
