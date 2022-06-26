class hello {
    public static void main(String args[])
    {
        int nums[][]=new int[5][];
        nums[0]=new int[5];
        nums[1]=new int[4];
        nums[2]=new int[3];
        nums[3]=new int[2];
        nums[4]=new int[1];
        for(int x[]: nums)
           {for(int y: x)
                System.out.print(y+" ");
           System.out.println();
           }
        
    }
}
