import java.util.*;

class Q12{
        public static int somar(int num){
                if(num/10==0){
                     return num;
                }
                
                return num%10 + somar(num/10);
        }

        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int num;
                num=sc.nextInt();
                while(num!=250){
                        System.out.println(somar(num));
                        num=sc.nextInt();
                }       
        
                System.out.println(somar(250));
        }
}