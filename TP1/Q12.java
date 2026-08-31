import java.util.*;

class Q12{
        // Soma recursivamente os algarismos do numero
        public static int somar(int num){
                // Caso-base da recursao.
                if(num/10==0){
                     return num;
                }

                // Soma o ultimo algarismo aos demais
                return num%10 + somar(num/10);
        }

        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int num;
                num=sc.nextInt();
                // Processa os numeros ate encontrar 250
                while(num!=250){
                        System.out.println(somar(num));
                        num=sc.nextInt();
                }       
        
                System.out.println(somar(250));
        }
}