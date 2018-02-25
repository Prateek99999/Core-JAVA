import java.util.Scanner;
class IfGrades
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

	System.out.println("enter no. of subjects");
	int n=sc.nextInt();

	int marks[]=new int[n];
	float sum=0;
	System.out.println("enter marks of each subject one by one");
	for(int i=0;i<n;i++)
	{
		marks[i]=sc.nextInt();
		sum+=marks[i];
	}

	float avg=sum/n;
	
	System.out.println("sum ::"+sum);
	System.out.println("average ::"+avg);
	
	System.out.println("Your Grade is:");	
	if(avg>=85)
		System.out.println("A");
	if(avg>65&&avg<85)
	{	
		System.out.println("B");
	}
	if(avg>45&&avg<=65)
	{
		System.out.println("C");
	}
	if(avg>40&&avg<=45)
	{
		System.out.println("D");
	}
	if(avg<=40)
	{
		System.out.println("Try hard next time");
	}
	
	
	
}
}