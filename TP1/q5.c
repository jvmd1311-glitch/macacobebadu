#include  <stdio.h>

int soma(int num){
        int soma=0;

        // Vai pegando e somando um algarismo por vez
        while(num!=0){
            // Pega o último algarismo do número
            soma += num % 10;

            // Remove o último algarismo para continuar
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