import java.util.Arrays;

public class Insertion
{
static void insertion(int a[])
{
int n = a.length;
int j;
for(int i=1;i<n;i++)
{
int key = a[i];

for(j=i-1;j>=0 && a[j]>key ;j--)
{
a[j+1] = a[j];
}
a[j+1] = key;

}
}



public static void main(String[] ar)
{
int[] i = {5,4,3,2,1};
Insertion.insertion(i);
System.out.println("in main"+Arrays.toString(i));
}
}