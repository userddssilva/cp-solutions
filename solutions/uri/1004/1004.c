#include <stdio.h>
#include <stdlib.h>

int main(){
    int a, b;
    while(scanf("%i %i", &a, &b) != EOF){
        printf("PROD = %i\n", a * b);
    }
    return(0);
}
