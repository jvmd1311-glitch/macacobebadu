#include  <stdio.h>

int soma(int num){
        int num;
        int soma=0;
        while(num!=0){
            soma += num % 10;
           num /= 10 ;
        }
    return soma;
}
int main(){
        int v;
         while (scanf("%d", &v) != EOF) {
        printf("%d\n", soma(v));
    }
        }