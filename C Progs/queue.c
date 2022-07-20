#include <stdio.h>
#define size 5
int q[size], front = -1, rear = -1;
void enq()
{
    int ele;
    printf("Enter the element to insert : ");
    scanf("%d", &ele);
    if (front == -1 && rear == -1)
    {
        front = 0;
        rear = 0;
        q[rear] = ele;
    }
    else if (front == 0 &&rear = size - 1)
    {
        printf("Queue is Full !! ");
    }
    else
    {
        rear++;
        q[rear] = ele;
    }
}
void deq()
{
    if (front == -1 && rear == -1)
    {
        printf("Queue is empty");
    }
    else if (front == rear)
    {
        front = -1;
        rear = -1;
        printf("Deleted");
    }
    else
    {
        front++;
        printf("Deleted from front");
    }
}
void display()
{
    int i;
    for (i = front; i <= rear; i++)
    {
        printf("%d ", q[i]);
    }
}
void peek()
{
    printf("%d", q[front]);
}
void main()
{
    int ch, c;
    do
    {
        printf("Enter what you want\n1. Insert\n2. Delete\n3. Display \n4. Peek\n");
        scanf("%d", &ch);
        switch (ch)
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
        }
        printf("\nMain Menu ? ");
        scanf("%d", &c);
    } while (c == 1);
}