import java.util.Scanner;
class LabeledFor
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

a:for(int i=0;i<10;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(j);
if(i%3!=0)
continue a;

System.out.print("*");
}

System.out.println();
}
sc.close();

}
}
