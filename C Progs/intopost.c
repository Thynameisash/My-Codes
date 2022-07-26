#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#define n 100

char stack[n];
int top = -1;

void push(char data)
{
    if (top >= n - 1)
    {
        printf("\nStack Overflow.");
    }
    else
    {
        top = top + 1;
        stack[top] = data;
    }
}

char pop()
{
    char data;
    if (top < 0)
    {
        printf("Stack underflow!!!\n");
    }
    else
    {
        data = stack[top];
        top = top - 1;
        return (data);
    }
}
int chk_operator(char op)
{
    if (op == '^' || op == '*' || op == '/' || op == '+' || op == '-')
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
int precedence(char op)
{
    if (op == '^')
    {
        return (3);
    }
    else if (op == '*' || op == '/')
    {
        return (2);
    }
    else if (op == '+' || op == '-')
    {
        return (1);
    }
    else
    {
        return (0);
    }
}
void InfixToPostfix(char infix[], char postfix[])
{
    int i, j;
    char data;
    char x;
    push('(');
    strcat(infix, ")");
    i = 0;
    j = 0;
    data = infix[i];
    while (data != '\0')
    {
        if (data == '(')
        {
            push(data);
        }
        else if (isdigit(data) || isalpha(data))
        {
            postfix[j] = data;
            j++;
        }
        else if (chk_operator(data) == 1)
        {
            x = pop();
            while (chk_operator(x) == 1 && precedence(x) >= precedence(data))
            {
                postfix[j] = x;
                j++;
                x = pop();
            }
            push(x);
            push(data);
        }
        else if (data == ')')
        {
            x = pop();
            while (x != '(')
            {
                postfix[j] = x;
                j++;
                x = pop();
            }
        }
        else
        {
            printf("\nInvalid infix Expression.\n");
        }
        i++;
        data = infix[i];
    }
    if (top > 0)
    {
        printf("\nInvalid infix Expression.\n");
    }
    if (top > 0)
    {
        printf("\nInvalid infix Expression.\n");
    }
    postfix[j] = '\0';
}

int main()
{
    char infix[n], postfix[n];

    printf("\nEnter Infix expression : ");
    gets(infix);
    InfixToPostfix(infix, postfix);
    printf("Postfix Expression: ");
    puts(postfix);
    return 0;
}