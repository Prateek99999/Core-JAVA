import java.util.Scanner;
class Gcd
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
while(y!=z)
{
if(y>z)
y-=z;
else
z-=y;
}

System.out.println(" gcd is "+y);

}


}
