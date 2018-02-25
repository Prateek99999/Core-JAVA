import java.util.Scanner;
class pattern5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no. of rows");
int n=sc.nextInt();

for(int i=(n-1);i>=1;i--)
{
for(int j=i;j<(n-1);j++)
{
System.out.print(" ");
}
for(int k=1;k<=(2*i+1);k++)
{
System.out.print("*");
}
System.out.println();
}

for(int i=0;i<n;i++)
{
for(int j=n;j>i-1;j--)
{
System.out.print(" ");
}
for(int k=0;k<(2*i+1);k++)
{
System.out.print("*");
}
System.out.println();
}


}

}