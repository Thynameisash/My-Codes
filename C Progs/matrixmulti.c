#include <stdio.h>
void main()
{
    int i, j, k, c[10][10];
    int a[2][2] = {{4, 5},
                   {1, 2}};
    int b[2][2] = {{4, 5},
                   {1, 2}};
    // printf("Addition : \n");
    for (i = 0; i < 2; i++)
    {
        for (j = 0; j < 2; j++)
        {
            c[i][j] = 0;
            for (k = 0; k < 2; k++)
            { // k < q WILL ALSO WORK
                c[i][j] += a[i][k] * b[k][j];
            }
        }
    }
    printf("Product Matrix AB\n");

    for (i = 0; i < 2; i++)
    {
        for (k = 0; k < 2; k++)
        {
            printf("%d ", c[i][k]);
        }
        printf("\n");
    }
}