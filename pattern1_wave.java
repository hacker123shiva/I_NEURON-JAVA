class hello{
    public static void main(String args[])
    {int i=0,j;
        int  arr[][]={{2,3,4,5}, {3,4,5,1} ,{8,1,6,7}};
        for(j=0;j<=3;j++)
            if(j%2==0)
                for(i=0;i<=2;i++)
                    System.out.print(arr[i][j]+" ");
            else 
                for(i=3-1;i>=0;i--)
                    System.out.print(arr[i][j]+" ");
//   enhanced for loop multidimension array
for(int x[] : arr)
    for(int y: x)
    System.out.print(y+" ");
    }
}
