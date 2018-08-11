import java.util.Arrays;
public class ABubble
{

static void bubble(int a[])
{
int temp=0;
for(int i=0;i<a.length;i++)
{ 
System.out.println("start i = "+i);
for(int j=i;j<a.length-1;j++)
{
System.out.println("start j = "+j);

if(a[j]>a[j+1])
{
 temp = a[j];
a[j] = a[j+1];
a[j+1] = temp;
}
System.out.println("in inner"+Arrays.toString(a));
}
System.out.println("in outer"+Arrays.toString(a));
}

}


public static void main(String[] ar)
{
int[] i = {5,4,3,2,1};
ABubble.bubble(i);
System.out.println("in main"+Arrays.toString(i));
}


}