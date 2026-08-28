#include <stdio.h>

int substringMaior(char str[], int n) {
    int maior = 0;

    for (int i = 0; i < n; i++) {
        int cont = 0;
        int j = i + 1;

        while (j < n) {
            int k = i;

            while (k < j && str[k] != str[j]) {
                k++;
            }

            if (k == j) {
                cont++;
                j++;
            } else {
                j = n;
            }
        }

        if (cont > maior) {
            maior = cont;
        }
    }

    return maior;
}

int main() {
    char str[100];

        while (fgets(str, 100, stdin) != NULL &&
                     !(str[0] == 'F' && str[1] == 'I' && str[2] == 'M' && str[3] == '\n' || str[3] == '\0')) {
                        
        int tam = 0;

        while (str[tam] != '\0') {
            tam++;
        }

        printf("%d\n", substringMaior(str, tam));

    }
}
