#include #stdio.h>
int cesarRecursivo(char str[], int i){
        if(str[i] == '/0'){
            return str;
        }
        str[i] = str[i] + 3;
        cesarRecursivo(str, i + 1);
    }


int main(){
    char str[100];
    fgets(str, 100, stdin);
    while (!(str[0] == 'F' && str[1] == 'I' && str[2] == 'M' && str[3] == '\0')) {
        cesarRecursivo(str, 0);
        printf("%s\n", str);
        fgets(str, 100, stdin);
    }
}