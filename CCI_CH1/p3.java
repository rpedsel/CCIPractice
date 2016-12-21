import java.util.Arrays;
class p3{
    public static void main(String[] args){
        String str1 = "tt,se";
        String str2 = "test,";
        System.out.println(ComparePermutation(str1,str2));
    }

    static boolean ComparePermutation(String str1, String str2){
        if (str1.length() != str2.length()) return false;
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        return Arrays.equals(charArr1,charArr2);
    }
}
