#include <stdio.h>
//Converte as letras pra minuscula pra ficar com o mesmo valor na tabela ASCII
void Minuscula(char str[], int tam) {
    for (int i = 0; i < tam; i++) {
        if (str[i] >= 'A' && str[i] <= 'Z') {
            str[i] = str[i] + 32;
        }
    }
}
//Implementei o bubblesort para ordenar as strings com a tabela ASCII
void bubbleSort(char str[], int tam) {
    for (int i = 0; i < tam - 1; i++) {
        for (int j = 0; j < tam - 1 - i; j++) {
            if (str[j] > str[j + 1]) {
                char temp = str[j];
                str[j] = str[j + 1];
                str[j + 1] = temp;
            }
        }
    }
}

int main() {
    char str1[100];
    char str2[100];
//Ler a primeira string e comparar com EOF e roda enquanto for diferente de EOF
    while (scanf("%s", str1) == 1 && !(str1[0] == 'F' && str1[1] == 'I' && str1[2] == 'M' && str1[3] == '\0')) {
        
        scanf("%s", str2);
//Pega o tamanho da string 1
        int tam1 = 0;
        while (str1[tam1] != '\0') {
            tam1++;
        }
//Pega o tamanho da string 2
        int tam2 = 0;
        while (str2[tam2] != '\0') {
            tam2++;
        }
//para se nao for o memso tamanho e se for cai na verificacao
        if (tam1 != tam2) {
            printf("NAO\n");
        } else {
            Minuscula(str1, tam1);
            Minuscula(str2, tam2);

            bubbleSort(str1, tam1);
            bubbleSort(str2, tam2);

            int ehanagrama = 1;
            for (int i = 0; i < tam1; i++) {
                if (str1[i] != str2[i]) {
                    ehanagrama = 0;
                    break; //i=tam1 usei o break para ficar mais facil de entender.
                }
            }

            if (ehanagrama == 1) {
                printf("SIM\n");
            } else {
                printf("NAO\n");
            }
        }
    }
    return 0 ;
}