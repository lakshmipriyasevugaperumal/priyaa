#include <stdio.h>

int main(void) {
	// your code goes here
	int a[20];
	int i=0,j=0,n,temp=0;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
for(i=0;i<n;i++)
{
 for(j=i+1;j<n;j++)
 {
  if(a[j]>a[i])
 {
  temp=a[i];
  a[i]=a[j];
  a[j]=temp;
 }
 }
}
j=-1;
for(i=0;i<n;i++)
{
	if(a[i]==a[i+1])
	{
		printf("\n%d",a[i]);
		
	}
}
	
	return 0;
}
