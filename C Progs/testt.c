#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
} main()
{
    int choice = 1;
    struct node *newnode, *temp, *start;
    while (choice)
    {
        newnode = (struct node *)malloc(sizeof(struct node));
        printf("Enter the data ");
        scanf("%d", &newnode->data);

        if (start == NULL)
        {
            start = newnode;
            newnode->next = NULL;
        }
        else
        {
            newnode->next = start;
            start = newnode;
        }
        printf("Do you wish to enter more nodes? ");
        scanf("%d", &choice);
    }
    temp = start;
    while (temp != NULL)
    {
        printf("Data is %d->", temp->data);
        temp = temp->next;
    }
}