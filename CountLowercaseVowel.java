class CountLowercaseVowel{
    public static int countVowel(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char vowel = str.charAt(i);
            if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'){
                count++;
            }
        } 
        return count;
    }
    public static void main(String args[]){
        String str = "Ankita";
        System.out.print("Count of lowercase vowels"+countVowel(str));
    }
}