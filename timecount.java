class timecount
{
public static void main(String args[])
{

int start=java.lang.System.currentTimeMillis();

count(1000);

int end=java.lang.System.currentTimeMillis();

System.out.println("counting to 1000 takes time :"+(end-start));


}


}

public static void count(int x)
{
for(int i=0;i<x;i++);
}


