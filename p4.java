#include<stdio.h>
int main(){
	int n,i=0,c[10],k,j,t;
	scanf("%d",&n);
	while(n!=0){
		c[i]=n%10;
		n=n/10;
		i++;
	}
	for(j=0;j<i-1;j++){
		for(k=0;k<i-j-1;k++){
			if(c[k]>c[k+1]){
				t=c[k];
				c[k]=c[k+1];
				c[k+1]=t;
			}
		}
	}
	printf("\n");
	for(k=0;k<i-3;k++){
		printf("%d",c[k]);
	}
        return 0;
}
