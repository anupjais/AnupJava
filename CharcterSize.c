#include<stdio.h>
int main()
{
	int a,i;
	printf("Enter a value : ");
	scanf("%d",&a);
	for(i=0; i<a; i++){
		printf("%d : %c\t",i,i);
		if(i%10==0)
			printf("\n");
	}
	printf("\n");
}