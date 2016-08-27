#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,i[50],j[50],n,t;
clrscr();
scanf("\n %d",&n);
for(a=0;a<n;i++)
{
scanf("\n %d",&i[a]);
i[a]=j[a];
}
for(b=0;b<n;b++)
{
scanf("\n %d",&i[b]);
}
for(a=0;a<n;a++)
{
for(b=0;b<n;b++)
{
if(j[a]>j[b])
{
t=i[a];
i[a]=i[b];
i[b]=t;
t=j[a];
j[a]=j[b];
j[b]=t;
}
else if(j[a]==j[j+1])
{
if(i[a]>i[b])
{
t=i[a];
i[a]=i[b];
i[b]=t;
}
}
}
}
for(a=0;a<n;a++)
{
printf("\n %d",i[a]);
}
getch();
}
