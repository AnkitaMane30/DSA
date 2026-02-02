import java.util.*;
class Anagram{
    public static boolean isAnagram(String str, String str2){
        str = str.toLowerCase();
        str2 = str.toLowerCase();

        if(str.length() != str2.length())
            return false;
        
        char[] strCharArray = str.toCharArray();
        char[] str2CharArray = str.toCharArray();

        Arrays.sort(strCharArray);
        Arrays.sort(str2CharArray);
        
        return Arrays.equals(strCharArray, str2CharArray);
    }
    public static void main(String args[]){
        String str = "race";
        String str2 = "care";
        System.out.println("Strings are Anagram "+isAnagram(str,str2));
    }
}