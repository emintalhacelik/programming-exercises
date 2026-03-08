#include <stdio.h>

int main(){
     int numbers[10];
     int sum = 0;
     for(int i = 0; i < 10; i++){
        printf("Enter %dth number:" , i + 1 );
        scanf("%d ", & numbers[i]);
        sum += numbers[i];
     } 
     float average = sum / 10.0;

     printf("Sum of all numbers: %d\n", sum);
     printf("Average of all numbers: %.2f \n", average);

return 0;
}
