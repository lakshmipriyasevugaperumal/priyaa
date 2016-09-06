#include<stdio.h>
#include<math.h>
int main()
{
  int arr[10],n,i,count;
  printf("Enter how many distance");
  scanf("%d",&n);
  printf("Enter the distance to be reached");
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<n;i++)
  {
    if(arr[i]<0)
    {
      printf("The distance can't be reached");
    }
    count=0;
    j=0;
    while(j<10)
    {
      if((2^j)==arr[i])
      {
        printf("True");
        count=1;
      }
    }
    if(count==0)
    {
      printf("False");
    }
  }
  return 0;
}
