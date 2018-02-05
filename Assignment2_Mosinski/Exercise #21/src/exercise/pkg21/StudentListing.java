/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg21;

/**
 *
 * @author nmosinski
 */

// Class that creates StudentListing (an array of students)
public class StudentListing {
    
    private Student[] studentListing;
    
    public StudentListing(Student firstStudent)
    {
        this.studentListing = new Student[1];
        this.studentListing[0] = firstStudent;
    }
    
    public void print()
    {
        for(Student student: this.studentListing)
        {
            System.out.println(student.getName());
        }
    }
    
    public void insert(Student student, int position)
    {
        // Adding a studentListing to array students
        if(this.studentListing.length == 0 && position == 0)          // If students array is empty, 
        {
            this.studentListing = new Student[1];                     // Create a new array with a length of 1 and assign it to students
        
            this.studentListing[0] = student;                         // set index[0] of students array equal to the new studentListing that was passed in
            return;
        }
        
        // Must insert student into a valid array positon.
        if(position < 0 || position > this.studentListing.length)
            return;
        
        Student[] newStudents = new Student[this.studentListing.length + 1];            // Creates a second array that is 1 index greater in size
                                                                                        // than the current students array
        for(int i = 0; i < this.studentListing.length + 1; i++)
        {
            if(i < position)
                newStudents[i] = this.studentListing[i];
            else if (i > position)
                newStudents[i] = this.studentListing[i - 1];
            else
                newStudents[i] = student;
        }
        
        this.studentListing = newStudents;        
    }
    public void delete(int position)
    {        
        if(this.studentListing.length == 0 && position == 0)
        {
            System.out.println("There are no elements in the array.");
        }
        
        Student[] newStudentListing = new Student[this.studentListing.length - 1];       
        
        for(int i = 0; i < this.studentListing.length; i++)
        {
            if(i == position)
            {                                
                for(int j = i; j < studentListing.length - 1; j++)
                {
                    newStudentListing[j] = studentListing[j + 1];
                }
                for(int j = 0; j < i; j++)
                {
                    newStudentListing[j] = studentListing[j];
                }
                this.studentListing = newStudentListing;
                break;
            }
        }
    }           
}
