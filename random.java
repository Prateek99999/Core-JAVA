class Random
{
public static void main(String args[])
{
int i=(int)(Math.random()*1000);
int j=(int)(Math.random()*1000);
int k=(int)(Math.random()*1000);

System.out.println("nos. generated are::"+i+","+j+","+k);

int result=(i>j)?((i>k)?i:k):((j>k)?j:k);

System.out.println("maxm. among them is :"+result);

}}