import java.util.*;
public class Quick
{
static void quickSort(int[] a , int low , int high)
{
int pi;  		//pi is the the element which is at proper postiton
			//after the partitioning
if(low<high)
{
pi = partition(a,low,high);
quickSort(a,low,pi-1);
quickSort(a,pi+1,high);
}
}

static int partition(int[] a, int low ,int high)
{
int pivot = a[high]; 	//taking last element as pivot
int i=low-1;

for(int j=low;j<high;j++)
{
if(a[j]<=pivot)
{
i++;
int temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}

int temp = a[i+1];
a[i+1] =a[high];
a[high] = temp;

System.out.println("in fun"+Arrays.toString(a));

System.out.println(i);
return i+1;
}

public static void main(String[] ar)
{
int[] i = {3,8,4,6,7,1,2,5};
Quick.quickSort(i,0,7);
System.out.println("in main"+Arrays.toString(i));
}

}