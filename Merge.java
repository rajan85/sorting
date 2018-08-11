import java.util.Arrays;
public class Merge
{
static void mergeSort(int a[] , int l , int r)
{
if(l<r)
{
int m = (l+r)/2;
mergeSort(a,l,m);
mergeSort(a,m+1,r);
merge(a,l,m,r);
}

}

static void merge(int a[] , int l , int m , int r)
{
int n1,n2;
n1 = m-l+1;
n2 = r-m;

int[] la = new int[n1];
int ra[] = new int[n2];

for(int i=0;i<n1;i++)
	la[i] = a[l+i];
for(int i=0;i<n2;i++)
	ra[i] = a[m+i+1];

int i=0,j=0,k=l;
while(i<n1 && j<n2)
{
if(la[i]<ra[j]){
	a[k] = la[i];
	i++;
}
else {
	a[k] = ra[j];
	j++;
}
k++;

}

while(i<n1){
	a[k++] = la[i++];
}
while(j<n2)
{
	a[k++] = ra[j++];
}

}


public static void main(String[] ar)
{
int[] i = {5,4,3,2,1};
Merge.mergeSort(i,0,4);
System.out.println("in main"+Arrays.toString(i));
}
}