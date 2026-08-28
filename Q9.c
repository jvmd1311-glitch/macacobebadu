#include <stdio.h>

void cesarRecursivo(char str[], int i){
    if(str[i] == '\0'){
        return;
    }

    // Troca o caractere atual pelo caractere 3 posições a frente
    str[i] = str[i] + 3;

    // Vai para o proximo caractere e repete o processo
    cesarRecursivo(str, i + 1);
}

// Começa a recursao no primeiro caractere da string
void cesar(char str[]){
        cesarRecursivo(str,0);
}

int main(){
    char str[100];
    int i;
    fgets(str, 100, stdin);
    // Continua lendo ate a entrada ser FIM
    while (!(str[0] == 'F' && str[1] == 'I' && str[2] == 'M' && str[3] == '\n')) {
        cesar(str);
        printf("%s\n", str);
        fgets(str, 100, stdin);
        }
    }
