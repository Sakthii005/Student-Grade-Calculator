import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int sub=sc.nextInt();
        int[] marks=new int[sub];
        int totalMarks=0;
        for (int i=0;i<sub;i++) {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i]=sc.nextInt();
            totalMarks+=marks[i];
        }
        float avgPercent=(float)totalMarks/sub;
        char grade;
        if(avgPercent>=90) {
            grade='A';
        } 
        else if(avgPercent>=80) {
            grade='B';
        } 
        else if(avgPercent>=70) {
            grade='C';
        } 
        else if(avgPercent>=60) {
            grade='D';
        } 
        else {
            grade='F';
        }
        System.out.println("Results:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercent + "%");
        System.out.println("Grade: " + grade);
    }
}
