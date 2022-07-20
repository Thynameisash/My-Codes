#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
    struct node *prev;
};
void display(struct node *head)
{
    struct node *temp;
    temp = head;
    if (head == NULL)
    {
        printf("LL is empty");
    }
    else
    {
        while (temp->next != head)
        {
            printf("%d ", temp->data);
            temp = temp->next;
        }
        printf("%d", temp->data);
    }
}
struct node *insertbeg(struct node *head)
{
    struct node *temp, *newnode, *tail;
    int ch;
    tail = NULL;
    do
    {
        newnode = (struct node *)malloc(sizeof(struct node));
        printf("Enter Data : ");
        scanf("%d", &newnode->data);
        if (head == NULL)
        {
            head = newnode;
            newnode->next = head;
            newnode->prev = head;
        }
        else
        {
            temp = head;
            while (temp->next != head)
                temp = temp->next;
            temp->next = newnode;
            newnode->prev = temp;
            newnode->next = head;
            head->prev = newnode;
            head = newnode;
        }
        printf("Add More ? : ");
        scanf("%d", &ch);
    } while (ch == 1);
    return head;
}
struct node *insertend(struct node *head)
{
    struct node *temp, *newnode, *tail;
    int ch;
    tail = NULL;
    do
    {
        newnode = (struct node *)malloc(sizeof(struct node));

        printf("Enter the data : ");
        scanf("%d", &newnode->data);
        if (head == NULL)
        {
            newnode->next = head;
            newnode->prev = head;
            temp = newnode;
            head = newnode;
        }
        else
        {
            temp = head;
            while (temp->next != head)
            {
                temp = temp->next;
            }
            newnode->prev = temp;
            temp->next = newnode;
            newnode->next = head;
            head->prev = newnode;
        }

        printf("Add more ? : ");
        scanf("%d", &ch);

    } while (ch == 1);

    return head;
}
struct node *insertpos(struct node *head)
{
    struct node *temp = head, *newnode, *tail;
    int i = 1, pos;
    tail = NULL;
    printf("Enter the pos to enter data ");
    scanf("%d", &pos);
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data : ");
    scanf("%d", &newnode->data);
    if (head == NULL)
    {
        head = newnode;
        newnode->next = head;
        newnode->prev = head;
    }
    else if (pos == 1)
    {
        temp = head;
        while (temp->next != head)
            temp = temp->next;
        temp->next = newnode;
        newnode->prev = temp;
        newnode->next = head;
        head->prev = newnode;
        head = newnode;
    }
    else
    {
        while (i < pos - 1)
        {
            temp = temp->next;
            i++;
        }
        if (temp->next != head)
        {
            while (i < pos - 1)
            {
                temp = temp->next;
                i++;
            }
            newnode->next = temp->next;
            temp->next->prev = newnode;
            newnode->prev = temp;
            temp->next = newnode;
        }
        else
        {
            temp = head;
            while (temp->next != head)
            {
                temp = temp->next;
            }
            newnode->prev = temp;
            temp->next = newnode;
            newnode->next = head;
            head->prev = newnode;
        }
    }
    return head;
}
struct node *delbeg(struct node *head)
{
    struct node *temp;
    if (head == NULL)
    {
        printf("LL is already empty");
    }
    else
    {
        temp = head;
        while (temp->next != head)
        {
            temp = temp->next;
        }
        temp->next = head->next;
        head->next->prev = temp;
        head = head->next;
    }
    return head;
}
struct node *delpos(struct node *head)
{
    int i = 1, pos;
    struct node *ptr, *temp, *temp2;
    temp = head;
    if (head == NULL)
    {
        printf("LL is Empty");
    }
    else
    {
        printf("Enter the pos of element to delete : ");
        scanf("%d", &pos);
        if (pos == 1)
        {
            temp = head;
            while (temp->next != head)
            {
                temp = temp->next;
            }
            temp->next = head->next;
            head->next->prev = temp;
            head = head->next;
        }
        else
        {
            while (i < pos - 1)
            {
                temp = temp->next;
                i++;
            }
            if (temp->next == NULL)
            {
                temp->prev->next = head;
                head->prev = temp->prev;
                free(temp);
            }
            else
            {
                ptr = temp->next;
                temp->next->next->prev = temp;
                temp->next = temp->next->next;
                free(ptr);
            }
        }
    }
    return head;
}
struct node *delend(struct node *head)
{
    struct node *temp;
    if (head == NULL)
    {
        printf("LL is Empty");
    }
    else
    {
        temp = head;
        while (temp->next != head)
        {
            temp = temp->next;
        }
        temp->prev->next = head;
        head->prev = temp->prev;
        free(temp);
    }
    return head;
}
struct node *count(struct node *head)
{
    struct node *temp;
    int count = 0;
    temp = head;
    while (temp != NULL)
    {
        temp = temp->next;
        count++;
    }
    printf("No. of nodes is : %d", count);
}
void search(struct node *head)
{
    struct node *temp;
    int ele, count = 0;
    printf("Enter the element to search : ");
    scanf("%d", &ele);
    temp = head;
    if (head == NULL)
    {
        printf("LL is empty");
    }
    else
    {
        while (temp != NULL)
        {

            if (temp->data == ele)
            {
                printf("Element found at pos %d", count);
                return;
            }
            else
            {
                printf("Element not found");
            }
            temp = temp->next;
            count++;
        }
    }
}
struct node *sort(struct node *head)
{
    printf("Sorting Done");
    struct node *curr = head, *nexnode = NULL;
    int temp;

    while (curr->next != head)
    {
        nexnode = curr->next;
        while (nexnode != head)
        {
            if (curr->data > nexnode->data)
            {
                temp = curr->data;
                curr->data = nexnode->data;
                nexnode->data = temp;
            }
            nexnode = nexnode->next;
        }
        curr = curr->next;
    }
    return head;
}
struct node *revll(struct node *head)
{
    struct node *temp = head, *currnode = head, *prevnode = NULL;
    while (currnode != NULL)
    {
        temp = currnode->next;
        currnode->next = prevnode;
        prevnode = currnode;
        currnode = temp;
    }
    head = prevnode;
    return head;
}
struct node *insertsort(struct node *head)
{
    head = sort(head);
    int data;
    printf("\nEnter the data to insert: ");
    scanf("%d", &data);
    struct node *temp = head;
    struct node *prev = NULL;
    struct node *newnode = (struct node *)malloc(sizeof(struct node *));
    newnode->data = data;
    while (temp->next != head && temp->data < newnode->data)
    {
        prev = temp;
        temp = temp->next;
    }
    if (prev == NULL)
    {
        newnode->next = head;
        head->prev = newnode;
        head = newnode;
    }
    else
    {
        prev->next = newnode;
        newnode->next = temp;
        newnode->prev = prev;
        if (temp != NULL)
        {
            temp->prev = newnode;
        }
    }
    return head;
}

void main()
{
    char c;
    int choice;
    struct node *head;
    head = NULL;
    do
    {
        printf("What you want to do ?\n"
               "0. Display LL\n"
               "1. Insertion at Beg.\n"
               "2. Insertion at End\n"
               "3. Insert at Specific Pos.\n"
               "4. Delete beg. node\n"
               "5. Delete last node\n"
               "6. Delete specific node\n"
               "7. Count no. of nodes\n"
               "8. Search an element\n"
               "9. Sort LL\n"
               "10. Reverse LL\n"
               "11. Insert in sorted LL\n"
               "Enter your Choice : ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 0:
            display(head);
            break;
        case 1:
            head = insertbeg(head);
            break;
        case 2:
            head = insertend(head);
            break;
        case 3:
            head = insertpos(head);
            break;
        case 4:
            head = delbeg(head);
            break;
        case 5:
            head = delend(head);
            break;
        case 6:
            head = delpos(head);
            break;
        case 7:
            head = count(head);
            break;
        case 8:
            search(head);
            break;
        case 9:
            head = sort(head);
            break;
        case 10:
            head = revll(head);
            break;
        case 11:
            head = insertsort(head);
            break;
        default:
            break;
        }
        printf("\nDo you want to go to main menu ? y/n : ");
        scanf(" %c", &c);
    } while (c == 'y');
}