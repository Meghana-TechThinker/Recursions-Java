public class Pii {
    public static String Pii(String s){
        String s1="";
        if(s.length()<2){
            return s;
        }
        else if((s.length()==2) && (s=="pi")){
            return "3.14";
        }
        else if(s.startsWith("pi")){
            int a=s.indexOf('i');
            s1="3.14"+Pii(s.substring(a+1));
            return s1;
        }
        if((s.indexOf('p')+1)==(s.indexOf('i'))){
            s1=Pii(s.substring(0,s.indexOf('p')))+"3.14"+Pii(s.substring(s.indexOf('i')+1));
            return s1;
        }
        s1=s;
        return s;
    }
    public static void main(String[] args){
        System.out.println(Pii("pivgypihgg"));
    } 
}
