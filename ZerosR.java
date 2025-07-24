import java.util.*;
public class ZerosR {
    public static int Zeros(int n){
        int count=0;
        if(n==0){
            count=1;
        }
        else if(n<10){
            count=0;
        }
        else if(n%10==0){
            count=Zeros(n/10)+1;
        }
        else{
            count=Zeros(n/10);
        }
        //n=n/10;
        return count;
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=300450;
        System.out.println(Zeros(n));
    }
}
