import java.util.*;
class Counting
{
static void countSort(int a[] , int k)
{
int n = a.length;
int count[] = new int[k+1];	//for range 0-9 , if k=9,+1 tp include 0 also

for(int i=0;i<n;i++)
{
count[a[i]]++;
}

for(int i=1;i<k+1;i++)
count[i] = count[i]+count[i-1];

int[] output = new int[n];

for(int i=n-1;i>=0;i--)
{
output[count[a[i]]-1] = a[i];
count[a[i]]--;
}

for(int i=0;i<n;i++)
{
a[i] = output[i];
}
}


public static void main(String[] ar)
{
int[] i = {1, 4, 1, 2, 0, 4, 2};
Counting.countSort(i,4);
System.out.println("in main"+Arrays.toString(i));
}
}