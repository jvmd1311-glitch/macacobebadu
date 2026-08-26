import java.util .*;
class Q3{
	public static boolean verificarletras(String string, int tam){
		for(int i=0 ; i<tam ; i++){
		 if((string.charAt(i) >='A'&& string.charAt(i)<= 'Z') ||string.charAt(i) >='a'&& string.charAt(i)<= 'z'){
			 return true;
		 }
		}
	public static boolean vogal(String string, int tam){
	 for(int i=0 ; i<tam ; i++){	       
		if(!(string.charAt(i) == 'a' ||string.charAt(i) == 'e' ||string.charAt(i) == 'i' ||string.charAt(i) == 'o' ||string.charAt(i) == 'u' string.charAt(i) == 'A' ||string.charAt(i) == 'E' ||string.charAt(i) == 'I' ||string.charAt(i) == 'O' ||string.charAt(i) == 'U'))
return false;
		 }
else return true;
}
	}
        public static boolean consoante(String string, int tam){
            for(int i=0 ; i<tam ; i++){
                   !vogal(string, tam);
  } 
}


     public static void main(String[] args){
	    Scanner sc = new Scanner(System.in); 
     }
