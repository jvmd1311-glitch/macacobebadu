   import java.util.*
   class caixa
   {
           public static void inserir(int x){
           if(primeiro == ultimo){
                   throw new exception("Error");
           }
           str[ultimo] = x;
           ultimo = (ultimo + 1) % str.lenght();
          public static int remover(){
          if(primeiro == ultimo ){
                  throw new Exception("Error");
          }
          int tmp = primeiro;
          primeiro= (primeiro +1)%str.length();
          return tmp;
          }
          public static void descarregar(){
          if(str[i]%2==0)
          remover(str[i]);
          }
          public static void main(Strings[] args){
          int tam; 
          int descarregar;
          Scanner sc = new Scanner(...);
          tam = sc.nextInt();
          descarregar = sc.nextInt();
        int str[];
         str = new int[tam+1];
          for(int i=0; i<tam ; i++){
         str[i]=sc.nextLine();
         }
          int primeiro=0;'
          int ultimo=0;
            for(int i=primeiro ; i!=ultimo ; i= (i+1)%str.length()){
          inserir(str[i]);
                                                                                                            17,2-9       Topo
