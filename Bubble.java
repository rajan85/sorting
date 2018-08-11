import java.util.Arrays;
public class Bubble
{

static void bubble(int a[])
{
int temp=0;
for(int i=0;i<a.length-1;i++)
{ 
for(int j=i;j<a.length-i-1;j++)
{


if(a[j]>=a[j+1])
{
 temp = a[j];
a[j] = a[j+1];
a[j+1] = temp;
}

}
}

}

static void reverseBubble(int a[])
{
int temp=0;
for(int i=a.length-1;i>0;i--)
for(int j=a.length-1;j>=a.length-i;j--)
{
if(a[j]<a[j-1])
{
temp = a[j];
a[j] = a[j-1];
a[j-1] = temp;
}
}
}
public static void main(String[] ar)
{
int[] i = {5,4,3,2,1};
Bubble.bubble(i);
System.out.println("in main"+Arrays.toString(i));
}


}