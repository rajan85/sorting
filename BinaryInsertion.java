import java.util.Arrays;

public class BinaryInsertion
{
static void insertion(int a[])
{
int n = a.length;
int j,k;
for(int i=1;i<n;i++)
{
int key = a[i];

 j = BinaryInsertion.binaryGet( a ,i , key);
for( k = i;k>j;k--)
	a[k] = a[k-1];

a[j] = key;

}
}


static int binaryGet(int[] a , int size , int key)
{
int begin = 0;
int end = size-1;

while(begin<end)
{
int mid = (begin+end)/2;
if(a[mid]==key)
	return mid+1;
if((end-begin)==1)
	return end+1;
if(key>a[mid])
	begin = mid+1;
if(key<a[mid])
	end = mid-1;
	
}
return 0;

}
public static void main(String[] ar)
{
int[] i = {30,2,1,0,-1};
BinaryInsertion.insertion(i);
System.out.println("in main"+Arrays.toString(i));
}



}