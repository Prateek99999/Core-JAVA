import java.util.Scanner;
class pattern4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no. of rows");
int n=sc.nextInt();

for(int i=(n-1);i>=0;i--)
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


}

}