#include <stdio.h>

int ehVogal(char c) {
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        
        return 1;
    }
    return 0;
}
    int vogalRec(char texto[], int i) {
        if (texto[i] == '\n' || texto[i] == '\0') {
            return 1;
        }
        if (ehVogal(texto[i])) {
            return vogalRec(texto, i + 1);
        }

        return 0;
    }

    int vogal(char texto[]) {
        return vogalRec(texto, 0);
    }

    int consoanteRec(char texto[], int i) {
        if (texto[i] == '\n' || texto[i] == '\0') {
            return 1;
        }

        if (!ehVogal(texto[i]) &&((texto[i] >= 'a' && texto[i] <= 'z') || (texto[i] >= 'A' && texto[i] <= 'Z'))) {
             
            
            return consoanteRec(texto, i + 1);
        }

        return 0;
    }

    int consoante(char texto[]) {
        return consoanteRec(texto, 0);
    }

    int inteiroRec(char texto[], int i) {
        if (texto[i] == '\n' || texto[i] == '\0') {
            return 1;
        }

        if (texto[i] >= '0' && texto[i] <= '9') {
            return inteiroRec(texto, i + 1);
        }

        return 0;
    }

    int inteiro(char texto[]) {
        return inteiroRec(texto, 0);
    }

    int realRec(char texto[], int i, int temPonto) {
        if (texto[i] == '\n' || texto[i] == '\0') {
            return 1;
        }

        if (texto[i] >= '0' && texto[i] <= '9') {
            return realRec(texto, i + 1, temPonto);
        }

        if ((texto[i] == ',' || texto[i] == '.') && temPonto == 0 && i > 0 && texto[i + 1] >= '0' && texto[i + 1] <= '9') {
            
            return realRec(texto, i + 1, 1);
        }

        return 0;
    }

    int real(char texto[]) {
        return realRec(texto, 0, 0);
    }

    int main() {
        char texto[1000];

        fgets(texto, 1000, stdin);

        while (!(texto[0] == 'F' && texto[1] == 'I' && texto[2] == 'M' && (texto[3] == '\n' || texto[3] == '\0'))) {
             
            if (vogal(texto)) {
                printf("SIM ");
            } else {
                printf("NAO ");
            }

            if (consoante(texto)) {
                printf("SIM ");
            } else {
                printf("NAO ");
            }

            if (inteiro(texto)) {
                printf("SIM ");
            } else {
                printf("NAO ");
            }

            if (real(texto)) {
                printf("SIM\n");
            } else {
                printf("NAO\n");
            }

            fgets(texto, 1000, stdin);
        }
    }

