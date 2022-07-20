#include <stdio.h>
void main()
{
    int size, a[20], odd[30], even[30], evencount = 0, oddcount = 0;
    printf("Enter the size of array\n");
    scanf("%d", &size);
    printf("Add Elements\n");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &a[i]);
    }
    for (int i = 0; i < size; i++)
    {
        odd[i] = 0;
        even[i] = 0;
    }
    for (int i = 0; i < size; i++)
    {
        if (a[i] % 2 == 0)
        {
            even[evencount] = a[i];
            evencount++;
        }
        else
        {
            odd[oddcount] = a[i];
            oddcount++;
        }
    }
    printf("Odd Array :\n");
    for (int i = 0; i < oddcount; i++)
    {
        printf(" %d", odd[i]);
    }
    printf("\nEven Array :\n");
    for (int i = 0; i < evencount; i++)
    {
        printf(" %d", even[i]);
    }
}
