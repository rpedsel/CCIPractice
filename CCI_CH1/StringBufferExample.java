class StringBufferExample{
    public static void main(String[] args){
        String[] words = new String[3];
        words[0] = "first";
        words[1] = "second";
        words[2] = "third";

        String s = joinWords(words);
        System.out.println(s);
    }
    static String joinWords(String[] words){
        StringBuffer sentence = new StringBuffer();
        for(String w: words){
            sentence.append(w);
            sentence.append(" ");
        }
        return sentence.toString();
    }
}
