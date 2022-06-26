class hello {
    public static void main(String args[])
    {
//        Jagged array (Ragged array) in Java
        int nums[][]=new int[5][];
        nums[0]=new int[5];
        nums[1]=new int[4];
        nums[2]=new int[3];
        nums[3]=new int[2];
        nums[4]=new int[1];
        for(int x[]: nums) {
            for (int y : x)
                System.out.print("*"+" ");
           System.out.println();

//           find length of array
            System.out.println(nums.length);
            System.out.println(nums[0].length);
            System.out.println(nums[1].length);
            System.out.println(nums[2].length);
        }
        bye obj1= new bye();
        bye obj2= new bye();
        System.out.print(obj1.name+" ");
        obj1.code();
        obj2.name="harsh";
        System.out.print(obj2.name);
        obj2.weight=5;
    }
}
class bye {

        String name = "shiva";
        int age = 20;
        String village = "Thamanpura";
        int weight;
void code()
{
    System.out.println("Reusing Code from StackOverflow");

}


}
