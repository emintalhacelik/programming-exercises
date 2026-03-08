#include <stdio.h>


int main(){
    int numbers[10];
    int sum = 0;
    
    // Loop to input 10 numbers
    for(int i = 0; i < 10; i++) {
        printf("Enter %dth number: ", i + 1);  // Printing the message correctly
        scanf("%d", &numbers[i]);  // Corrected scanf syntax
        sum += numbers[i];
    } 
    
    // Calculate the average, ensuring floating point division
    float average = sum / 10.0;

    // Print the sum and average
    printf("Sum of all numbers: %d\n", sum);
    printf("Average of all numbers: %.2f\n", average);

    return 0;

}
