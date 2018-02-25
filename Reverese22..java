class Reverese22
{
public static void main(String args[])
{
int n;
System.out.println("enter a no.");
n=sc.nextInt();

int rev=0;

while(n!=0)
{

int m=n%10;
rev=rev+m*10;
n=n/10;

}


System.out.println("rev :"+rev);

}

}