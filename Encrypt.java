import java.util.*;
//import java.util.function.ObjDoubleConsumer;
public class Encrypt {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        int target=3;
        String res="";
        s.toLowerCase();
        for(int i=0;i<s.length();i++){
            res+=(char)((int)s.charAt(i)+target);
        }
        System.out.println(res);
    }
}

