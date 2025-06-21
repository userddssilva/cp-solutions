#include <stdio.h>
#include <stdlib.h>

int main(){
    double raio;
    double area;
    while(scanf("%lf", &raio) != EOF){
        area = raio*raio*3.14159;
        printf("A=%.4lf\n", area);
    }
    return(0);
}
