
import java.util.*;

public class Zeros {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        //int t=n;
        int count=0;
        while(n>0){
            if(n%10==0){
                count++;
            }
            n=n/10;
        }
        System.out.println("No.of Zeros:"+count);
    }
}
