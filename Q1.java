import java.util.*;

class Q1 {
	public static boolean isFim(String s) {
    return s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M';
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.nextLine();
        
        // Testa se a linha lida é "FIM"
       while (!(isFim(str1))) {
            String fstr = "";
            int n = str1.length(); // Pega o tamanho da String
            
            for (int i = 0; i < n; i++) {
                fstr += (char) (str1.charAt(i) + 3); // Cifra de César
            }
            
            System.out.println(fstr);
            
            // Lê a próxima linha para a próxima iteração
            str1 = sc.nextLine();
        }
    }
}

