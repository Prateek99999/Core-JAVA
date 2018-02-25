class Room
{
int a,b,c;

void setvalues(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;

System.out.println("length :"+a+" breadth :"+b+" height :"+c);
}


int area()
{
return a*b;
}

int volume()
{
return a*b*c;
}

}

class Answer2
{
public static void main(String args[])
{
Room r=new Room();

r.setvalues(10,20,30);
System.out.println("area is "+r.area());

System.out.println("volume is "+r.volume());

}
}