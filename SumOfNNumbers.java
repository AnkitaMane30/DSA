class SumOfNNumbers{
    public static int clacSum(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = clacSum(n - 1);
        int sn = n + snm1;
        return sn;
    }
    public static void main(String args[]){
        int n = 10;
        System.out.print("sum of numbers : "+clacSum(n));
    }
}