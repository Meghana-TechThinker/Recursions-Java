import java.util.*;
public class Fibo {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=3;i<=n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        //System.out.println(a+""+""+b);
    }
}
