#include <stdio.h>
void main()
{
    int i, j, c[10][10];
    int a[2][2] = {{4, 5},
                   {1, 2}};
    int b[2][2] = {{4, 5},
                   {1, 2}};
    printf("Addition : \n");
    for (i = 0; i < 2; i++)
    {
        for (j = 0; j < 2; j++)
        {
            c[i][j] = a[i][j] + b[i][j];
        }
    }
    for (i = 0; i < 2; i++)
    {
        for (j = 0; j < 2; j++)
        {
            printf("%d  ", c[i][j]);
        }
        printf("\n");
    }
}