#include <stdio.h>
int missing(int a[], int n)
{
    int i, total;
    total = (n + 1) * (n + 2) / 2;
    for (i = 0; i < n; i++)
        total -= a[i];
    return total;
}
int main()
{
    int a[] = {1, 2, 4, 5, 6};
    int miss = missing(a, 5);
    printf("Missing number is : %d", miss);
}
