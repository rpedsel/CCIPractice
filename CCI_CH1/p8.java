class p8{
    public static void main(String[] args){
        String str1 = "defcon";
        String str2 = "condef";
        p8 p = new p8();
        System.out.println(p.RotateString(str1,str2));
    }

    public boolean RotateString(String str1, String str2){
        if(str1.length()==str2.length() && str1.length() > 0){
            String s1s1 = str1+str1;
            return isSubstring(s1s1,str2);
        }

        else return false;
    }

    static boolean isSubstring(String str1, String str2){
        return str1.contains(str2);
    }
}
