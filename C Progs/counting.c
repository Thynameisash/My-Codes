#include <stdio.h>
int main()
{
    int arr[] = {4, 3, 5, 4, 6, 3, 6, 3, 7, 8, 5, 3};
    int size = 12;
    int max = arr[0];
    int outarr[size];
    int i, j;
    for (i = 0; i < size; i++)
    {
        if (max < arr[i])
        {
            max = arr[i];
        }
    }
    int freqsize = 10;
    int freqarr[freqsize];
    int cumlativecount[freqsize];

    // initializing count array with 0s
    for (i = 0; i < freqsize; i++)
    {
        freqarr[i] = 0;
        cumlativecount[i] = 0;
    }

    printf("max number is %d \n", max);

    // increment value at index in frequency array of current iterated element
    for (i = 0; i < size; i++)
    {
        freqarr[arr[i]]++;
    }

    for (i = 0; i < freqsize; i++)
    {
        printf(" %d ", freqarr[i]);
    }

    int sum = 0;
    for (i = 0; i < freqsize; i++)
    {
        sum += freqarr[i];
        cumlativecount[i] = sum;
    }
    printf("\n");
    for (i = 0; i < 10; i++)
    {
        printf(" %d ", cumlativecount[i]);
    }

    printf("\n");

    for (i = size - 1; i >= 0; i--)
    {
        cumlativecount[arr[i]] -= 1;
        outarr[cumlativecount[arr[i]]] = arr[i];
    }

    printf("\n Output array\n");
    for (i = 0; i < size; i++)
    {
        printf(" %d ", outarr[i]);
    }
    return 0;
}