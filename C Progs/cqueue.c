#include <stdio.h>
#include <stdlib.h>
#define size 5
int q[size], front = -1, rear = -1;

void enq()
{
    int ele;
    printf("Enter the element to insert : ");
    scanf("%d", &ele);
    if ((front == 0 && rear == size - 1) || (front == rear + 1))
        printf("\nQueue is Full!\n");
    else
    {
        if (rear == size - 1 && front != 0)
            rear = -1;
        rear++;
        q[rear] = ele;
        printf("\nInsertion Success!!!\n");
        if (front == -1)
            front = 0;
    }
}
void deq()
{
    if (front == -1)
    {
        printf("Queue Underflown");
        return;
    }

    else
    {
        printf("\nDeleted element : %d\n", q[front]);
        front++;
        if (front == size)
            front = 0;
        if (front - 1 == rear)
            front = rear = -1;
    }
}
void display()
{
    int i;
    for (i = front; i != rear; i = (i + 1) % size)
    {
        printf("%d ", q[i]);
    }
    printf("%d ", q[i]);
}
void peek()
{
    printf("%d", q[front]);
}
void main()
{
    int choice;
    while (choice != 5)
    {
        printf("\n1.Insert\n2.Delete\n3.Display\n4.Peek\n");
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
