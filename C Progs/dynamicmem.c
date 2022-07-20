#include <stdio.h>
#include <stdlib.h>
void main()
{
    int *ptr, n, i, a[20][20];
    printf("Enter size of an array");
    scanf("%d", &n);
    ptr = (int *)calloc(n, sizeof(int));
    for (i = 0; i < n; i++)
    {
        scanf("%d", ptr + i);
    }
    for (i = 0; i < n; i++)
    {
        printf("%d", ptr + i);
    }
}