class p5{
    public static void main(String[] args){
        p5 p = new p5();
        String string = "aabcd";
        String cpRes = p.Compress(string);
        System.out.println(cpRes);
    }

    public String Compress(String str){
        StringBuffer cpStr = new StringBuffer();
        char last = str.charAt(0);
        int count = 1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == last) count++;
            else{
                cpStr.append(last);
                cpStr.append(count);
                last = str.charAt(i);
                count = 1;
            }
        }
        cpStr.append(last);
        cpStr.append(count);

        String newStr = cpStr.toString();
        if(newStr.length() >= str.length()) return str;
        else return newStr;
    }
}
