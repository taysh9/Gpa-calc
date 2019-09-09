package GPAcalc;

import java.util.Scanner;

public class Calculator {
    private SinglyLinkedList<String>grades;
    private int [] hours;
    private int index; 
    private SinglyLinkedList<Double> convertedGrades;
   
    
    public Calculator() 
    
    {
       
        index = 0;
        convertedGrades = new SinglyLinkedList<Double>();
        grades = new SinglyLinkedList<String>();
        hours = new int [15];
    }
    
    
    public SinglyLinkedList<String> getGradesList() 
    {
        return grades; 
        
    }
    
    
    public int [] getHoursList()
    {
        return hours;
    }
    
    public SinglyLinkedList<Double> getConvert()
    {
        return convertedGrades;
    }
    
    public void addHours(int hour)
    {
        hours[index] = hour;
        index++;
        
    }
    
    public int totalHours()
    {
        int sum = 0;
        for(int i =0; i<hours.length; i++)
        {
            sum+=hours[i];
        }
        return sum;
    }
    
    public void addGrade(String letter, int hours)
    {
        this.addHours(hours);
        grades.add(letter);
    }
    
    public double gpa()
    {
        double total = 0;
        this.convert(grades);
       for(int i =0; i<this.convertedGrades.size(); i++)
       {
           total += this.convertedGrades.get(i)*(double)this.hours[i];
       }
        
        
        
       return total/this.totalHours();
        
        
    }
    
    
  
    
    public void convert(SinglyLinkedList<String> list)
    {
      
        for(int i= 0; i<list.size(); i ++)
        {
            if(list.get(i).contentEquals("A"))
            {
                convertedGrades.add(i, 4.0);
            }
            else if(list.get(i).contentEquals("A-"))
            {
                convertedGrades.add(i, 3.7);
            }
            else if(list.get(i).contentEquals("B+"))
            {
                convertedGrades.add(i, 3.3);
            }
            else if(list.get(i).contentEquals("B"))
            {
                convertedGrades.add(i, 3.0);
            }
            else if(list.get(i).contentEquals("B-"))
            {
                convertedGrades.add(i, 2.7);
            }
            else if(list.get(i).contentEquals("C+"))
            {
                convertedGrades.add(i, 2.3);
            }
            else if(list.get(i).contentEquals("C"))
            {
                convertedGrades.add(i, 2.0);
            }
            else if(list.get(i).contentEquals("C-"))
            {
                convertedGrades.add(i, 1.7);
            }
            else if(list.get(i).contentEquals("D+"))
            {
                convertedGrades.add(i, 1.3);
            }
            else if(list.get(i).contentEquals("D"))
            {
                convertedGrades.add(i, 1.0);
            }
            else if(list.get(i).contentEquals("D-"))
            {
                convertedGrades.add(i, 0.7);
            }
            else {
                convertedGrades.add(i, 0.0);
            }
        }
        
        
        
       
        
    }
    
    
    

}
