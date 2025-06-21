#include <stdio.h>
#include <stdlib.h>

int main(){
    double a, b;
    while(scanf("%lf %lf", &a, &b) != EOF){
        printf("MEDIA = %.5lf\n", (a * 3.5 + b * 7.5)/2);
    }
    return(0);
}
