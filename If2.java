import java.util.Scanner;
class If2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a character");
char c=sc.next().charAt(0);

if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
{
System.out.println(c+" is a vowel");
}

else
{
System.out.println(c+" isn't a vowel and is a consonant");
}

}
}