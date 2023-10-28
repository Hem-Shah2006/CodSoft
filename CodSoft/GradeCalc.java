import java.util.Scanner;
public class GradeCalc 
{
    public static void main(String args[]) 
	{
        	Scanner sc = new Scanner(System.in);
        	int TotalMarks=0;
        	int TotalSubs;
        	double AvgPercentage;
        	System.out.println("Enter Number Of Subjects : ");
        	TotalSubs=sc.nextInt();
        	for(int i=1;i<=TotalSubs;i++) 
		{
            		System.out.println("Enter Marks Obtained In Subject " + i + " (Out of 100): ");
            		int Marks=sc.nextInt();
            		if (Marks<0 || Marks>100) 
					{
               		System.out.println("Invalid Marks! Marks Should Be Between 0 And 100.");
                	i--;
                	continue;
           			}
            	TotalMarks=TotalMarks+Marks;
        }
        AvgPercentage=(double)TotalMarks/TotalSubs;
        String Grade;
        if (AvgPercentage>=90) 
		{
            Grade="Congratulations, You Have Achieved Grade A. You Are A Topper !";
        } 
	else if (AvgPercentage>=80) 
		{
            Grade="Conratulations, You Have Achieved Grade B. You Can Be A Topper";
        } 
	else if (AvgPercentage>=70) 
		{
            Grade="Congratulations, You Have Achieved Grade C. Study Little More.";
        } 
	else if (AvgPercentage>=60) 
		{
            Grade="Congratulations, You Have Achieved Grade D. Focus On Your Target.";
        } 	
	else if (AvgPercentage>=50) 
		{
            Grade="Congratulations, You Have Achieved Grade E. Study More Else You Will Fail.";
        } 
	else 
		{
            Grade="Better Luck Next Time !";
        }
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + TotalMarks);
        System.out.println("Average Percentage: " + AvgPercentage + "%");
        System.out.println(Grade);
    }
}