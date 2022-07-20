#include <stdio.h>
void main()
{
    int size, a[20];
    printf("Enter the size of array\n");
    scanf("%d", &size);
    printf("Add Elements\n");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("The array is : \n");
    for (int i = 0; i < size; i++)
    {
        printf("%d\t", a[i]);
    }
}