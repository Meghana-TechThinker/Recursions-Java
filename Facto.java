import java.util.*;
public class Facto {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println(factorial(n));
        if(factorial(n)==-1){
            System.out.println("Can't say");
        }
    }
    public static int factorial(int n){
        if(n>1){
            return n*factorial(n-1);
        }
        if(n<0){
            return -1;
        }
        else{
            return 1;
        }
    }
}
