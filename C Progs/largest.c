#include <stdio.h>
void main()
{
    int size, a[20], max, max2;
    printf("Enter the size of array\n");
    scanf("%d", &size);
    printf("Add Elements\n");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &a[i]);
    }
    max = max2 = a[0];
    for (int i = 0; i < size; i++)
    {
        if (a[i] > max)
            max = a[i];
    }
    for (int i = 0; i < size; i++)
    {
        if (a[i] != max && a[i] > max2)
        {
            max2 = a[i];
        }
    }
    printf("Max Ele: %d\n", max);
    printf("Second Max Ele: %d\n", max2);
}
