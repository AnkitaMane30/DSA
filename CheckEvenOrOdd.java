class CheckEvenOrOdd{
    public static void oddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("ODD number");
        }
    }
    public static void main(String args[]){
        oddEven(13);
    }
}