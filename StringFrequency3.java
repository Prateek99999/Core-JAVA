import java.util.Scanner;
class StringFrequency3
{
public static void main(String args[])throws Exception
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the string");
String s=sc.nextLine();

int k;
//s.toUpperCase();
for(char c='A';c<='z';c++)
   {
   k=0;
	for(int j=0;j<s.length();j++)
	{
	if(c==s.charAt(j))
	k++;
   }
   
   if(k>0)
   System.out.println("frequency of "+c+" is ::"+k);
   }
  


}
}	
