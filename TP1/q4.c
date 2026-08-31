#include <stdio.h>
   void inverter(char vetor[], int n){ // funcao para inverter a string
           char temp;
            for(int i=0; i<n/2; i++){
            temp = vetor[i];
           vetor[i] = vetor[n-i-1];
          vetor[n-i-1] = temp;
}
        }
  int main(){
  char str[150];
  int tam;
  fgets(str,150,stdin);
  while(!(str[0]=='F' && str[1]=='I' && str[2]=='M')){
          tam=0;
          while(str[tam]!='\0'){
                 tam++;
          }
              int realtam = tam; 
    if (str [tam - 1] == '\n'){  //tira a linha que esta em excesso
        realtam = tam - 1;
    }
          inverter(str, realtam);
          printf("%s",str);
          fgets(str,150,stdin);
  }
  }