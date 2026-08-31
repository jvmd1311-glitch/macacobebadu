import java.util.*;
class Q2 {
    // Verifica se a entrada e o marcador de fim.
    public static boolean isFim(String str) {
        return (str.length() == 3 && str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(2) == 'M');
             
    }

    // Substitui uma letra aleatoria por outra em toda a string.
    public static String trocar(String str, Random gerador) {
        char sorteio = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
        char novaletra = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
        String resposta = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sorteio) {
                resposta += novaletra;
            } else {
                resposta += str.charAt(i);
            }
        }

        return resposta;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        // Mantem os sorteios reproduziveis.
        gerador.setSeed(4);
        String str = sc.nextLine();
        // Processa as entradas ate encontrar "FIM".
        while (!isFim(str)) {
            System.out.println(trocar(str, gerador));
            str = sc.nextLine();
        }
    }   
}