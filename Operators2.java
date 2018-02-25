class Operators2
{
public static void main(String args[])
{
int x=10;
System.out.println(x);
System.out.println(x++);
System.out.println(x);

System.out.println(x);
System.out.println(++x);
System.out.println(x);


int y=10;
int z=y++;
System.out.println("y = "+y);
System.out.println("z = "+z);  /*	z=y
								y=y+1
										*/

int w=10;
int v=++w;
System.out.println("w = "+w);
System.out.println("v = "+v);

										}
}

