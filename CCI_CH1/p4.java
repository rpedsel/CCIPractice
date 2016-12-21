class p4{
    public static void main(String[] args){
        String string = "A deal is a deal.";
        p4 p = new p4();
        char[] str = {'s','o','m','e',' ','d','a','y','1','1','\0'};
        p.Replace(str, 8);
        System.out.println(str);
    }

    public void Replace(char[] str, int length){
        int space = 0;
        for (int i=0;i<length;i++) if(str[i] == ' ') space++;
        int newLength = length+space*2;
        str[newLength] = '\0';
        for (int i = length-1;i>=0;i--) {
            if (str[i] == ' '){
                str[newLength-3] = '%';
                str[newLength-2] = '2';
                str[newLength-1] = '0';
                newLength -= 3;
            }
            else{
                str[newLength-1] = str[i];
                newLength = newLength-1;
            }
        }
    }
}
