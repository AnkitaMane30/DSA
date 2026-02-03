class BitOperations{
    //Get ith bit
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    //Set ith bit
    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    //clear ith bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    //Update ith bit
    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 0){
            return clearIthBit(n , i);
        }
        else{
            return setIthBit(n, i);
        }
    }

    //clear last i bits
    public static int clearIBits(int n, int i){
        int bitMask = (~0) << 1;
        return n & bitMask;
    }

    //clear range of bits
    public static int clearRangeOfBits(int n, int i, int j){
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(getIthBit(15, 2));
        System.out.println(setIthBit(10,2));
        System.out.println(clearIthBit(10,1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearIBits(15, 2));
        System.out.println(clearRangeOfBits(10, 2, 4));

    }
}