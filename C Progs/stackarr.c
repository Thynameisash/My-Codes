#include <stdio.h>
int stack[100], choice, n, top, x, i;
void push();
void pop();
void peek();
void display();
int main()
{
    top = -1;
    printf("\nEnter the size :");
    scanf("%d", &n);
    printf("\t1.Push\n\t2.Pop\n\t3.Display\n\t4.Exit");
    do
    {
        printf("\nEnter the Choice:");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
        {
            push();
            break;
        }
        case 2:
        {
            pop();
            break;
        }
        case 3:
        {
            peek();
            break;
        }
        case 4:
        {
            display();
            break;
        }
        case 5:
        {
            printf("\n\tExit..");
            break;
        }
        default:
        {
            printf("\n\tInvalid Choice");
        }
        }
    } while (choice != 5);
    return 0;
}
void push()
{
    if (top >= n - 1)
    {
        printf("\n\tOverflow !!");
    }
    else
    {
        printf("Enter a value :");
        scanf("%d", &x);
        top++;
        stack[top] = x;
    }
}
void pop()
{
    if (top <= -1)
    {
        printf("\nUnderflow !!");
    }
    else
    {
        printf("\nThe popped element is %d", stack[top]);
        top--;
    }
}
void peek()
{
    if (top >= 0)
    {
        printf("Top most element is : %d", stack[top]);
    }
    else
    {
        printf("\nStack empty");
    }
}
void display()
{
    if (top >= 0)
    {
        printf("\nThe elements in stack are :");
        for (i = top; i >= 0; i--)
            printf("\n%d", stack[i]);
        printf("\nNext Choice : ");
    }
    else
    {
        printf("\nStack empty");
    }
}