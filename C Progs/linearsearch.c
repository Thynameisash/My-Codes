#include <stdio.h>

void main()
{
    int size, a[20], ele;
    printf("Enter the size of array\n");
    scanf("%d", &size);
    printf("Add Elements\n");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("Enter element to search\n");
    scanf("%d", &ele);
    for (int i = 0; i < size; i++)
    {
        if (a[i] == ele)
            printf("Element found at position %d", i + 1);
    }
}