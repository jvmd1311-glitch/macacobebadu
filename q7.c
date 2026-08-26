#include <stdio.h> 
void substring(char str[], int n){
    int cont=0;
    int temp, j;
    for(int i=0; i<n-1; i++){
        j= i+1;
        while(str[i]!=str[j]){
            cont++;
            j++;
        }
        temp = cont;
        if(cont>temp){
            temp = cont;
        }
        cont = 0;
    }
    printf("%d\n", temp);
}
int main(){
    char str[100];
    int tam=0;
    fgets(str, 100, stdin);
     while(!(str[0]=='F' && str[1]=='I' && str[2]=='M' && str[3]=='\0')){
        while(str[tam]!='\0'){
            tam++;
        }    
     substring(str,tam);
     fgets(str, 100, stdin);
    }
}