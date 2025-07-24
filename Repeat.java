public class Repeat {
    public static String Repeat(String s){
        if(s.length()==1){
            return s;
        }
        else if((s.length()==2)&&((s.substring(0,1)).equals((s.substring(1))))){
            return s.substring(0,1);
        }
        else if(((s.substring(0,1)).equals((s.substring(1,2))))){
            return Repeat(s.substring(1));
        }
        else{
            return s.substring(0,1)+Repeat(s.substring(1));
        }
        //return s;
    }
    public static void main(String[] args) {
        System.out.println(Repeat("abbbcdd"));
    }
}
