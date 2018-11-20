#include <stdio.h>
#include <time.h>

int main()
{
	int c = 5;
	printf("%x", &c);
	clock_t startTime = clock();
	
	while(clock() < startTime + 5000)
		;
}