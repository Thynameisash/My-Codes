#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
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
    struct node *temp, *newnode;
    int ch;
    struct node *tail = NULL;
    do
    {
        newnode = (struct node *)malloc(sizeof(struct node));
        printf("Enter Data : ");
        scanf("%d", &newnode->data);
        if (head == NULL)
        {
            head = newnode;
            newnode->next = head;
        }
        else
        {
            temp = head;
            while (temp->next != head)
                temp = temp->next;
            newnode->next = head;
            temp->next = newnode;
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
            head = newnode;
            newnode->next = head;
        }
        else
        {
            temp = head;
            while (temp->next != head)
            {
                temp = temp->next;
            }
            temp->next = newnode;
            newnode->next = head;
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
    }
    else if (pos == 1)
    {
        temp = head;
        while (temp->next != head)
            temp = temp->next;
        newnode->next = head;
        temp->next = newnode;
        head = newnode;
    }
    else
    {
        while (i < pos - 1)
        {
            temp = temp->next;
            i++;
        }
        newnode->next = temp->next;
        temp->next = newnode;
    }
    return head;
}
struct node *delbeg(struct node *head)
{
    struct node *t2, *temp;
    if (head == NULL)
    {
        printf("LL is already empty");
    }
    else
    {
        temp = head;
        while (temp->next != head)
            temp = temp->next;
        t2 = temp->next;
        temp->next = head->next;
        head = head->next;
        free(t2);
    }
    return head;
}
struct node *delpos(struct node *head)
{
    int i = 1, pos;
    struct node *t2, *temp, *temp2;
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
                temp = temp->next;
            t2 = temp->next;
            temp->next = head->next;
            head = head->next;
            free(t2);
        }
        else
        {
            while (i < pos - 1)
            {
                temp = temp->next;
                i++;
            }

            temp->next = temp->next->next;
        }
    }
    return head;
}
struct node *delend(struct node *head)
{
    struct node *ptr, *temp, *temp2;
    temp = head;
    if (head == NULL)
    {
        printf("LL is Empty");
    }
    else
    {
        temp = head;
        while (temp->next->next != head)
        {
            temp = temp->next;
        }
        ptr = temp->next;
        temp->next = head;
        free(ptr);
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
    struct node *temp = NULL;
    struct node *prev = NULL;
    struct node *curr = head;
    int ptr;
    while (curr->next != head)
    {
        temp = curr->next;
        while (temp != head)
        {
            if (curr->data > temp->data)
            {
                ptr = curr->data;
                curr->data = temp->data;
                temp->data = ptr;
            }
            temp = temp->next;
        }
        curr = curr->next;
    }
    return head;
}
struct node *revll(struct node *head)
{
    struct node *prev = NULL;
    struct node *curr = head;
    struct node *next;
    do
    {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    } while (curr != head);
    head->next = prev;
    head = prev;
    return head;
}
struct node *insertsort(struct node *head)
{
    head = sort(head);
    int count = 0, pos = 0;
    struct node *tail, *temp = head, *nextnode, *ele;
    ele = (struct node *)malloc(sizeof(struct node));
    printf("\nEnter element to insert : ");
    scanf("%d", &ele->data);
    while (temp->next != head)
    {
        temp = temp->next;
    }
    tail = temp;
    temp = head;
    if (head->data > ele->data)
    {
        tail->next = ele;
        ele->next = head;
        head = ele;
    }
    else if (tail->data < ele->data)
    {
        tail->next = ele;
        ele->next = head;
        tail = ele;
    }
    else
    {
        while (temp->next->data < ele->data)
        {
            temp = temp->next;
        }
        ele->next = temp->next;
        temp->next = ele;
    }
    return head;
}

void main()
{
    char c;
    int choice;
    struct node *head, *tail;
    head = NULL;
    tail = NULL;
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
