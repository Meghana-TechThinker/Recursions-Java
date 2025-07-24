import java.util.*;
class P1{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int fact=1;
        if((n==0 )|| (n==10)){
            System.out.println("1");
        }
        else{
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
        }
        System.out.println(fact);
    }
}