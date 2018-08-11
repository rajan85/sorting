import java.util.Arrays;
public class Selection
{

static void stableSelection(int a[])
{
int n = a.length;
for(int i=0;i<n-1;i++)
{
int min =i;
for(int j=i+1;j<n;j++)
if(a[j]<a[min])
min = j;
int value = a[min];

while(min>i)
{
a[min] = a[min-1];
min--;
}
a[min] = value;
}
}

static void selection(int a[])
{
int n = a.length;
 for(int i=0;i<n-1;i++)
{
int min = i;
for(int j=i+1;j<n;j++)
if(a[j]<a[min])
min = j;

int temp = a[i];
a[i] = a[min];
a[min] = temp;
}
}

public static void main(String[] ar)
{
int[] i = {5,4,3,2,1};
Selection.stableSelection(i);
System.out.println("in main"+Arrays.toString(i));
}

}
