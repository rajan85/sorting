import java.util.Arrays;
public class QuickSortDemo
{
static void start(int a[])
{
sort(a	,0,7);
}

public static void sort(int a[],int low , int high)
{
int i=low;
int j = high;
int t;
int pivot = a[(low+high)/2];

while(i<=j)
{
while(a[i]<pivot)
i++;
while(a[j]>pivot)
j--;

if(i<=j)
{
System.out.println("swapping "+a[i]+" at "+i+" and "+a[j]+" at "+j);
t = a[i];
a[i] = a[j];
a[j] = t;
i++;
j--;
}


}
System.out.println("i = "+i+"    j = "+j);
if(low<j)
{
System.out.println("calling sort(a,"+low+","+j+")");
sort(a,low,j);
}
if(i<high)
{

System.out.println("calling sort(a,"+i+","+high+")");
sort(a,i,high);
}
}
public static void main(String[] ar)
{
int[] i = {3,8,4,6,7,1,2,5};
QuickSortDemo.start(i);
System.out.println("in main"+Arrays.toString(i));
}

}