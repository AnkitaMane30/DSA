class Solution{
    public static void main(String args[]){
        String str = "ShradhaDidi";
        String str2 = "ApanaCollege";
        String str3 = "ShradhaDidi";
        System.out.println(str.equals(str2)+" "+str.equals(str3));
        String replaceStr = str2.replace("l"," ");
        System.out.println(replaceStr);
    }
}