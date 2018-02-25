class DemoArray2

{
public static void main(String args[])
{
//int arr[]=new int[(int)(Math.random()*20)];
int arr[]=new int[(int)(Math.random()*20)];

int len=arr.length;

System.out.println("length of arr is"+len);

for(int i=0;i<len;i++)
{
arr[i]=(int)(Math.random()*200)+1;
System.out.println("arr ["+i+"] :"+arr[i]);
}

}
}