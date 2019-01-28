import java.util.*;
public class clientCode {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Student client = new Student();
        System.out.println("What is the student's name?");
        String clientName = input.next();
        client.getName(clientName);
        System.out.println("What grade is the student in?");
        String studentGrade = input.next();
        client.getGrade(studentGrade);
        System.out.println("How many classes is the student taking?");
        int numClasses = input.nextInt();
        ArrayList<Double> studentGrades = new ArrayList<Double>(numClasses);
        client.newGrades(studentGrades);
        System.out.println(client.toString());
        for (int i = 1; i <= numClasses; i++){
            System.out.print("Input current grade of class " + i + ": ");
            client.addGrades(input.nextDouble());
        }
        if (client.passingOrFailing(studentGrades)){
            System.out.println(client.toString() + " and is passing based off of his average grade from his " + numClasses + " classes!");
        } else {
            System.out.println(client.toString() + " and needs to study more in each of his " + numClasses + " classes.");
        }


    }
}
