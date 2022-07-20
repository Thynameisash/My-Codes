#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
void showMenu()
{
    printf("******************\n");
    printf("Singly Linked List\n");
    printf("******************\n");
    printf("1. Insert at beginning\n");
    printf("2. Insert at end\n");
    printf("3. Insert at specific position\n");
    printf("4. Deletion at beginning\n");
    printf("5. Deletion at end\n");
    printf("6. Deletion at specific postion\n");
    printf("7. Length of linked list\n");
    printf("8. Search Data\n");
    printf("9, Sort Linked list\n");
    printf("10. Insertion in sorted list\n");
    printf("11. Reverse linked list\n");
    printf("12. Display linked list\n");
}
void displayLinkedList(struct node *head)
{
    struct node *temp = head;
    while (temp != NULL)
    {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}
struct node *insertAtStart(struct node *head)
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node *));
    printf("********************\n");
    printf("Insert at beginning\n");
    printf("********************\n");
    printf("Enter data in node => ");
    scanf("%d", &newnode->data);
    newnode->next = head;
    return newnode;
}
void insertAtLast(struct node *tail)
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node *));
    printf("********************\n");
    printf("Insert at end\n");
    printf("********************\n");
    printf("Enter data in node => ");
    scanf("%d", &newnode->data);
    newnode->next = NULL;
    tail->next = newnode;
}
void insertAtSpecificPosition(struct node *head)
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node *));
    printf("********************\n");
    printf("Insert at specific position\n");
    printf("********************\n");
    printf("Enter data in node => ");
    scanf("%d", &newnode->data);
    printf("Enter position => ");
    int position;
    scanf("%d", &position);
    struct node *temp = head;
    int posi = 1;
    while (posi != position - 1)
    {
        temp = temp->next;
        posi++;
    }
    struct node *curr_next = temp->next;
    temp->next = newnode;
    newnode->next = curr_next;
}
struct node *deleteAtStart(struct node *head)
{
    printf("********************\n");
    printf("Delete from start\n");
    printf("********************\n");
    struct node *temp = head;
    head = head->next;
    free(temp);
    return head;
}
void deleteFromEnd(struct node *head)
{
    printf("********************\n");
    printf("Delete from end\n");
    printf("********************\n");
    struct node *temp = head;
    while (temp->next->next != NULL)
    {
        temp = temp->next;
    }
    struct node *curr_next = temp->next;
    temp->next = NULL;
    free(curr_next);
}
void deleteAtSpecificPosition(struct node *head)
{
    printf("********************\n");
    printf("Delete at specific position\n");
    printf("********************\n");
    printf("Enter position => ");
    int position;
    scanf("%d", &position);
    struct node *temp = head;
    int posi = 1;
    while (posi != position - 1)
    {
        temp = temp->next;
        posi++;
    }
    struct node *curr_next = temp->next;
    temp->next = curr_next->next;
    free(curr_next);
}
void lengthOfLinkedList(struct node *head)
{
    int length = 0;
    struct node *temp = head;
    while (temp != NULL)
    {
        temp = temp->next;
        length++;
    }
    printf("Length of linked list is %d\n", length);
}
void searchDataInLinkedList(struct node *head)
{
    printf("********************\n");
    printf("Search data in linked list\n");
    printf("********************\n");
    printf("Enter data to search => ");
    int data;
    int idx = 1;
    scanf("%d", &data);
    struct node *temp = head;
    while (temp != NULL)
    {
        if (temp->data == data)
        {
            printf("Data found at position %d\n", idx);
            return;
        }
        temp = temp->next;
        idx++;
    }
    printf("Data not found\n");
}
struct node *reverseLinkedList(struct node *head)
{
    printf("********************\n");
    printf("Reversed Linked List\n");
    printf("********************\n");
    struct node *prev = NULL;
    struct node *curr = head;
    struct node *next;
    while (curr != NULL)
    {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
    return head;
}
struct node *sortLinkedList(struct node *head)
{
    printf("********************\n");
    printf("Sorted Linked List\n");
    printf("********************\n");
    struct node *temp = head;
    struct node *prev = NULL;
    struct node *curr = head;
    struct node *next;
    while (curr != NULL)
    {
        next = curr->next;
        while (next != NULL)
        {
            if (curr->data > next->data)
            {
                int temp_data = curr->data;
                curr->data = next->data;
                next->data = temp_data;
            }
            next = next->next;
        }
        curr = curr->next;
    }
    return head;
}
void insertInSortedLinkedList(struct node *head)
{
    head = sortLinkedList(head);
    printf("********************\n");
    printf("Insert in sorted linked list\n");
    printf("********************\n");
    printf("Enter data in node => ");
    int data;
    scanf("%d", &data);
    struct node *temp = head;
    struct node *prev = NULL;
    struct node *curr = head;
    struct node *next;
    while (curr != NULL)
    {
        next = curr->next;
        if (curr->data > data)
        {
            break;
        }
        prev = curr;
        curr = next;
    }
    struct node *newnode = (struct node *)malloc(sizeof(struct node *));
    newnode->data = data;
    newnode->next = curr;
    if (prev == NULL)
    {
        head = newnode;
    }
    else
    {
        prev->next = newnode;
    }
}
int main()
{
    int choice = 1;
    int data;
    struct node *head = NULL, *tail = NULL, *temp = NULL, *newnode = NULL;
    while (choice == 1)
    {
        newnode = (struct node *)malloc(sizeof(struct newnode *));
        printf("Enter data in node => ");
        scanf("%d", &data);
        newnode->data = data;
        newnode->next = NULL;
        if (head == NULL)
        {
            head = newnode;
            tail = newnode;
        }
        else
        {
            tail->next = newnode;
            tail = newnode;
        }
        printf("Want to enter new data 1 (YES) / 2 (NO) => ");
        scanf("%d", &choice);
    }
    int exitCode = 1;
    while (exitCode == 1)
    {
        showMenu();
        printf("Enter your choice => ");
        int choice;
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            head = insertAtStart(head);
            break;
        case 2:
            insertAtLast(tail);
            break;
        case 3:
            insertAtSpecificPosition(head);
            break;
        case 4:
            head = deleteAtStart(head);
            break;
        case 5:
            deleteFromEnd(head);
            break;
        case 6:
            deleteAtSpecificPosition(head);
            break;
        case 7:
            lengthOfLinkedList(head);
            break;
        case 8:
            searchDataInLinkedList(head);
            break;
        case 9:
            head = sortLinkedList(head);
            break;
        case 10:
            insertInSortedLinkedList(head);
            break;
        case 11:
            head = reverseLinkedList(head);
            break;
        case 12:
            displayLinkedList(head);
            break;
        default:
            printf("Invalid choice\n");
            break;
        }
    }
    return 0;
}
