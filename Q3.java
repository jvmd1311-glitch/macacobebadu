import java.util.*;

class Q3 {

    public static boolean ehLetra(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static boolean vogal(String string, int tam) {
        for (int i = 0; i < tam; i++) {
            char c = string.charAt(i);
            if (!ehLetra(c) || !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {

                return false;
            }
        }
	return true; 
    }

    public static boolean consoante(String string, int tam) {
        for (int i = 0; i < tam; i++) {
            char c = string.charAt(i);
            boolean ehVogal = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');

            
            if (!ehLetra(c) || ehVogal) {
                return false;
            }
        }
	return true; 
    }
      public static boolean inteiro(String string, int tam) {
	for(int i=0; i<tam ; i++){
		char c = string.charAt(i);
		if(c >=0 && c <=9){
			return true ;
	}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        int tam = entrada.length();
	if(vogal(entrada,tam)){
	System.out.print("SIM ");
	}
	if(!vogal(entrada,tam)){
		System.out.print("NAO ");
	}
	if(consoante(entrada,tam)){
          System.out.print("SIM ");
          }
          if(!consoante(entrada,tam)){
                 System.out.print("NAO ");
          }

       	}
}
