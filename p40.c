#include<stdio.h>

int main()
{
	int a,b,sum;
	
	scanf("%d %d",&a,&b);
	if(a>0&&b>0)
	{
	sum=(a-1)+(b-1);
	
	printf("%d",sum);				
	}
	else
	{
		printf("\nInvalid input");
	}
	return 0;
}
