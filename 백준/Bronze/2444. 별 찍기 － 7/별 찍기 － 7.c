#include <stdio.h>

int main() {

	int n;
	scanf("%d", &n);

	for(int i = 1; i <= n; i++) {
		for(int k = 0; k < n - i; k++)
			printf(" ");
		for(int k = 0; k < i + (i - 1); k++)
			printf("*");

		printf("\n");
	}

	for(int i = n - 1; i > 0; i--) {
		for(int k = 0; k < n - i; k++)
						printf(" ");
		for(int k = 0; k < i + (i - 1); k++)
			printf("*");

		printf("\n");
	}

	return 0;
}