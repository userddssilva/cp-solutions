#include <stdio.h>
#include <stdlib.h>

int main(){
    int cell[7] = {100, 50, 20, 10, 5, 2, 1};
    int num;
    int amount;
    int i;
    scanf("%i", &num);
    printf("%i\n", num);
    for (i = 0; i < 7; i++){
        amount = (int) num / cell[i];
        num = (int) num % cell[i];
        printf("%i nota(s) de R$ %i,00\n", amount, cell[i]);
    }
    return (0);
}
