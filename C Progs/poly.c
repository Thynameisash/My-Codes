#include <stdio.h>
#include <stdlib.h>

struct Polynomial
{
    int coeff;
    int power;
    struct Polynomial *nextVal;
};
struct Polynomial *First = NULL;
void createPoly(int coeff, int power)
{
    struct Polynomial *newPoly;
    struct Polynomial *temp = NULL;
    newPoly = (struct Polynomial *)malloc(sizeof(struct Polynomial));
    newPoly->coeff = coeff;
    newPoly->power = power;
    newPoly->nextVal = NULL;
    if (First == NULL)
    {
        First = newPoly;
    }
    else
    {
        temp = First;
        while (temp->nextVal != NULL)
        {
            temp = temp->nextVal;
        }
        temp->nextVal = newPoly;
    }
}
void printPolynomial()
{
    struct Polynomial *temp = First;
    while (temp->nextVal != NULL)
    {
        printf("%dx^%d+", temp->coeff, temp->power);
        temp = temp->nextVal;
    }
    printf("%d\n", temp->coeff);
}
int main()
{
    createPoly(6, 1);
    createPoly(3, 3);
    createPoly(2, 0);
    printPolynomial();
    return 0;
}