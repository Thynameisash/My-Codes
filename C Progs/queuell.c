#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
} * newnode, *temp = NULL, *front = NULL, *rear = NULL;

void enq()
{
    int ele;
    printf("Enter the element to insert : ");
    struct node *newnode = malloc(sizeof(struct node));
    scanf("%d", &newnode->data);
    newnode->next = NULL;
    if (front == NULL && rear == NULL)
    {
        front = newnode;
        rear = newnode;
    }
    else
    {
        rear->next = newnode;
        rear = newnode;
    }
}
void deq()
{
    if (front == NULL)
    {
        printf("Underflow !! \n");
    }
    else
    {
        temp = front;
        front = front->next;
        free(temp);
    }
}

void display()
{
    temp = front;
    while (temp != NULL)
    {
        printf("%d\n", temp->data);
        temp = temp->next;
    }
}
void peek()
{
    printf("%d\n", front->data);
}
void main()
{
    int choice;
    while (choice != 5)
    {
        printf("1.Insert\n2.Delete\n3.Display\n4.Peek\n");
        printf("\nEnter your choice : ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            enq();
            break;
        case 2:
            deq();
            break;
        case 3:
            display();
            break;
        case 4:
            peek();
            break;
        default:
            printf("\nWrong Choice\n");
        }
    }
}
