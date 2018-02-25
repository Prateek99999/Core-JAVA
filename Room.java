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
