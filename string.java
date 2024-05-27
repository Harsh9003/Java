public class string {
    public static void main(String[] args) {
        String name = "CompileTimeError", nstr="";
        char ch;
        int length = name.length();
        System.out.println("Original string: "+name);
        for(int i=0; i<length; i++){
            ch = name.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println("Reverse of string: "+nstr);
    }
}
