import java.util.Scanner;
class Lcm
{

public static void  main(String args[])throws Exception

{

Scanner sc=new Scanner(System.in);
int y,z;



System.out.println("enter two nos.");

y=sc.nextInt();
z=sc.nextInt();

y=(y>0)?y:-y;
z=(z>0)?z:-z;

int max=(y>z)?y:z;


while(true)
{

if(y%max==0&&z%max==0)
{
System.out.println("Lcm of "+y+"and"+z+"is : "+max);
++max;
}

}



}
}



