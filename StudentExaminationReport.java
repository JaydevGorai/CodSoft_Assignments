import java.util.*;

public class StudentExaminationReport 
{
    public static void main(String[] args) 
    {
        Scanner ss = new Scanner(System.in);

        System.out.print("Please enter the number of the subjects of the student: ");
        int nsub = ss.nextInt();

        int totalMarks = 0;
        String grade;
        
        for(int i = 1; i <= nsub; i++) 
        {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = ss.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / nsub;
        
        if(averagePercentage >= 90.0) 
             grade = "A+";
        else if(averagePercentage >= 80.0) 
            grade = "A";
        else if(averagePercentage >= 70.0) 
            grade = "B";
        else if(averagePercentage >= 60.0) 
            grade = "C";
        else if(averagePercentage >= 50.0)
            grade = "D";
        else 
            grade = "F";
       

        System.out.println("Total Marks Obtained by the Student: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

        
    }
}
