#include <stdio.h>
int main()
{
	int i;
	int arr[]= {1,2,3,4};
	for(i=0; i<4; i++)
	{
		printf("%d ",arr[i]);
	}
	for(i=0; i<4; i++)
	{
		printf("\b\b   ");
	}
	
	printf("\n");
	return 0;
}