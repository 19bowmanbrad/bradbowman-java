import java.util.*;
import java.util.ArrayList;
public class Student {

    String studentName;
    String studentGrade;

    private void getName(String newName){
        studentName = newName;
    }
    private void getGrade(String newGrade){
        studentGrade = newGrade;
    }

    ArrayList<Double> grades = new ArrayList<>();
    grades.add(98.5)

    private boolean passingOrFailing(ArrayList<Double> myGrades){
        double sum = 0;
        double grade;
        for (int i = 0; i < myGrades.size(); i ++){
            sum += myGrades.get(i);
        }
        double average = (sum/myGrades.size());
        if (average > 65){
            return true;
        } else {
            return false;
        }
    }
    private int numClasses(ArrayList<Double> myGrades){

    }




}
