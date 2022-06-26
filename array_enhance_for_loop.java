//Array
class hello{
    public static void main(String args[])
    {
//int nums[]={5,6,7,8,9};
        int nums[]= new int[5];//assign size of 5 integer value
        int numms[][]=new int[3][2];
nums[0]=5;
nums[1]=6;
nums[2]=7;
nums[3]=8;
nums[4]=9;
System.out.print(nums[3]);
for(int i=0;i<=4;i++)
{
    System.out.println(nums[i]);
}
//new concept === enhance for loop
        for(int num: nums)
        {
            System.out.println(num);
        }
        numms[0][0]=5;
        numms[0][1]=2;
        numms[1][0]=3;
        numms[1][1]=4;
        numms[2][0]=7;
        numms[2][1]=1;

        for(int i=0;i<3;i++)
        {
            for(int j=0; j<2;j++)
                System.out.println(numms[i][j]);
        }
        System.out.println(numms[0]);

//System.out.print(nums[6]); got error ArrayIndexOutofBoundException

    }
}
