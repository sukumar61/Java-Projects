import java.util.Scanner;
public class Studentgrade {
    public static void main(String[] args) {
        System.out.println("enter number of subjects: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int numofsubjects=sc.nextInt();
        int[]subjectmarks=new int[numofsubjects];
        double totalmarks=0;
        String grade;
        int i=0;
        while (i<subjectmarks.length) {
            System.out.println("Enter marks for "+(i+1)+" 'st Subject");
            subjectmarks[i]=sc.nextInt();
            totalmarks+= subjectmarks[i];
            i++;
        }
        double averagepercentage=(totalmarks/n)*100;
        if(averagepercentage>=90){
            grade="A+";

        }
        else if(averagepercentage>=80){
            grade="A";
        }
        else if(averagepercentage>=70){
            grade="B+";
        }
        else if(averagepercentage>=60){
            grade="B";
        }
        else if(averagepercentage>=50){
            grade="C";
        }
        else if(averagepercentage>=40){
            grade="D";
        }
        else{
            grade="F";
        }
        System.out.println("   Results Obtained   ");
        System.out.println("Total Marks obtained: "+ totalmarks);
        System.out.println("Average Percentage Marks: "+averagepercentage);
        System.out.println("Grade: "+grade);

    }
    
}
