#include<stdio.h>
void main(){
    int weight[4];
    int profit[4];
    float ratio[4];

    printf("Enter weights:\n");
    for (int i=0;i<4;i++){
        scanf("%d",&weight[i]);
    }
    
    printf("Enter profit:\n");
    for (int i=0;i<4;i++){
        scanf("%d",&profit[i]);
    }

    int count=0;
    while(count<4){
        ratio[count]=profit[count]/weight[count];
        count++;
    }
    

    //  Bub sort
    int size = sizeof(ratio) / sizeof(ratio[0]);
     for (int step = 0; step < size - 1; ++step) 
     {
        for (int i = 0; i < size - step - 1; ++i) 
        {
            if (ratio[i] < ratio[i + 1]) 
            {
                int temp = ratio[i];
                ratio[i] = ratio[i + 1];
                ratio[i + 1] = temp;

                int temp2 = weight[i];
                weight[i] = weight[i + 1];
                weight[i + 1] = temp;

                int temp3 = profit[i];
                profit[i] = profit[i + 1];
                profit[i + 1] = temp;

            }
        }
    }

    for (int i=0;i<4;i++){
        printf("Profit : %d ",profit[i]);
        printf("Weight: %d ",weight[i]);
        printf("Ratio: %f ,",ratio[i]);
        printf("\n");
    }
    
    
}
