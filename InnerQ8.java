import java.util.*;
class InnerQ8{
    // verifica o fim da entrada
    public static boolean isFim(String s) {
    return s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M';
}
    public static boolean validar(String senha , int tam) {
        int cap = 0, num = 0, esp = 0, min= 0;

        if (senha.length() < 8 ) {
            return false;
        }

        for (int i = 0; i < tam; i++) {
            char c = senha.charAt(i);

            if(c >= 'A' && c <= 'Z'){
             cap++;
            }

            if(c >= 'a' && c <= 'z'){
             min++;
            }

            if(c >= '0' && c <= '9'){
                num++;
             }

            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9')) {
                esp++;
            }  

        }

        // precisa ter maiuscula, minuscula, numero e caractere especial
        if(cap < 1 || num < 1 || esp < 1 || min < 1){
        return false;
        }
        return true;
    }
    public static void main (String[] args){
        int tam;
        Scanner sc = new Scanner(System.in);

        String senha = sc.nextLine(); 

            // repete ate encontrar FIM
      while (!(isFim(entrada))) {
            tam = senha.length();

            if (validar(senha, tam)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }

        }
        
    }
}  