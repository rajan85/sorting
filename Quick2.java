import java.util.*;
public class Quick2
{

static void quickSort(int[] a , int low , int high)
{
int i = low;
int j = high;

int pivot = (low + (low+high)/2);

while(i<=j)
{

while(a[i]<a[pivot])
i++;

while(a[j]>a[pivot])
j--;
 if(i<=j)
{
int temp = a[i];
a[i] = a[j];
a[j] = temp;
i++;
j--;
}

}

if(low<j)
quickSort(a,low,j);
if(i<high)
quickSort(a,i,high);




}

public static void main(String[] ar)
{
int[] i = {3,8,4,6,7,1,2,5};
Quick2.quickSort(i,0,7);
System.out.println("in main"+Arrays.toString(i));
}

}