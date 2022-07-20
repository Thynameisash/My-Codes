#include <stdio.h>
void pairsum(int arr[], int n, int sum)
{
    int count = 0;
    for (int i = 0; i < n; i++)
        for (int j = i + 1; j < n; j++)
            if (arr[i] + arr[j] == sum)
                printf("%d , %d\n", arr[i], arr[j]);
}
void main()
{
    int arr[] = {8, 7, 2, 5, 3, 1};
    int n = 6;
    int sum = 10;
    pairsum(arr, n, sum);
}
