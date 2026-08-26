#include <stdio.h>
int main(){
    int soma=0;
    int num;
    int c,d,u;
    while(scanf("%d", &num) !=EOF){
c = num / 100;
d = (num / 10) %10;
u = num % 10;
soma = c + d + u;
printf("%d\n", soma);
}
}