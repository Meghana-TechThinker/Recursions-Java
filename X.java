public class X {
    public static String X(String s){
        String r="";
        if(s=="x"){
            return "y";
        }
        else if(s.startsWith("x")){ //&& (s.substring(1)!="x")){
            r="y"+X(s.substring(1));
            return r;
        }
        /*else if(s.charAt(0)=='x'){
            r="y"+X(s.substring(1));
            return r;
        }*/
        else if(s.contains("x")){
            int a=s.indexOf("x");
            r=X(s.substring(0,a))+"y"+X(s.substring(a+1));
            return r;
        }
        return s;
    }
    public static void main(String[] args){
        System.out.println(X("xxterx"));
    }
}
