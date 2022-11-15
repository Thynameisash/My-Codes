#include<stdio.h>
#include<string.h>

struct activity{
    int start;
    int finish;
    char name[5];
};

int main()
{
    struct activity act[7]={0,0};
    struct activity selected[7]={0,0};
    int count=0;
    for (int i = 0; i <7;i++)
    {
        printf("Enter the start and finish time for activities\n");
        scanf("%s%d%d",&act[i].name, &act[i].start,&act[i].finish);
    }
    for (int i = 0; i <7;i++)
    {
        printf("%s : %d : %d\n",act[i].name, act[i].start, act[i].finish);
    }
    int i=0;
    strcpy(selected[0].name,act[0].name);
    selected[0].start=act[0].start;
    selected[0].finish=act[0].finish;
    count++;
    while (i<7){
        if (selected[count-1].finish <= act[i].start)
        {
                strcpy(selected[count].name,act[i].name);
                selected[count].start=act[i].start;
                selected[count].finish=act[i].finish;
                count++;
        }
        i++;
    }
    for (int i = 0; i <=count-1;i++)
    {
        printf("Selected Activities are:\n%s : %d : %d\n",selected[i].name, selected[i].start, selected[i].finish);
    }
}
