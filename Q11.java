import java.util.*;
class Q11
{
     public static boolean isfim(String str){
        return (str.length()>=3 && str.charAt(0)=='F' && str.charAt(1)=='I' && str.charAt(2)=='M');
     }
    public static String inverterString(String str, int n)
    {
        if (n == 0) {
            return "";
        }

        return str.charAt(n - 1) + inverterString(str, n - 1);
    }
    public static String inverter(String str)
    {
        return inverterString(str, str.length());
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while(!(isfim(str))){
            System.out.println(inverter(str));
            str = sc.nextLine();
        }
    }
}