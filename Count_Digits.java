import java.util.Scanner;
class Count_Digits
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);

System.out.println("enter a no.");

int n=sc.nextInt();
int count=0;
while(n!=0)
{
n/=10;
count++;
}

System.out.println("total digits are"+count);

}
}