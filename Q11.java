import java.util.*;
class Q11
{
    // Verifica se a entrada comeca com FIM
     public static boolean isfim(String str){
        return (str.length()>=3 && str.charAt(0)=='F' && str.charAt(1)=='I' && str.charAt(2)=='M');
     }
    public static String inverterString(String str, int n)
    {
        // Caso-base: todos os caracteres ja foram invertidos
        if (n == 0) {
            return "";
        }

        // Adiciona o ultimo caractere antes de continuar a recursao
        return str.charAt(n - 1) + inverterString(str, n - 1);
    }
    public static String inverter(String str)
    {
        // Inicia a inversao usando o tamanho total da string
        return inverterString(str, str.length());
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // Inverte as entradas ate encontrar FIM
        while(!(isfim(str))){
            System.out.println(inverter(str));
            str = sc.nextLine();
        }
    }
}