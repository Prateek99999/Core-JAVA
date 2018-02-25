import java.util.Scanner;
class Input2D
{
public  static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("enter order of first matrix");
int a=sc.nextInt();
int b=sc.nextInt();

System.out.println("enter order of second matrix");
int m=sc.nextInt();
int n=sc.nextInt();

int arr[][]=new int[a][b];
int arr2[][]=new int[m][n];


System.out.println("array 1:");

System.out.println("enter elements of array 1 :");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
arr[i][j]=sc.nextInt();
}}

System.out.println("enter elements of array 2 :");
System.out.println("array 2:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{

arr2[i][j]=sc.nextInt();
}}


System.out.println("array 1:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{

System.out.print(arr[i][j]);
System.out.print(" ");
}
System.out.println();
}



System.out.println("array 2:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(arr2[i][j]);
System.out.print(" ");
}
System.out.println();
}



for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
arr2[i][j]=arr[i][j]+arr2[i][j];
}
}


System.out.println("product is :");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(result[i][j]);
System.out.print(" ");
}
System.out.println();
}

sc.close();
}}
