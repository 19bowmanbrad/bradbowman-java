import java.util.*;
public class Student {


    String studentName;
    String studentGrade;
    ArrayList<Double> grades;


    public void getName(String newName){
        studentName = newName;
    }
    public void getGrade(String newGrade){
        studentGrade = newGrade;
    }
    public void newGrades(ArrayList<Double> newGrades){
        grades = newGrades;
    }


    public boolean passingOrFailing(ArrayList<Double> myGrades){
        double sum = 0;
        double grade;
        for (int i = 0; i < myGrades.size(); i ++){
            sum += myGrades.get(i);
        }
        double average = (sum/myGrades.size());
        if (average > 65.0){
            return true;
        } else {
            return false;
        }
    }
    public int numClasses(){
        return grades.size();
    }
    public String studentName(){
        return studentName;
    }
    public String yearGrade(){
        return studentGrade;
    }
    public void addGrades(Double newGrade){
        grades.add(newGrade);
    }
    public String toString(){
        return studentName + " is a " + studentGrade;
    }




}