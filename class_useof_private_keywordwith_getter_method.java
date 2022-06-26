class human{


    public static void main(String args[])
    { Alien obj1 =new Alien();
        System.out.println("shiva");
//        System.out.println(obj1.name);
        obj1.getsetter("harsh");
//        System.out.println(obj1.name);
     Alien obj2 =new Alien();
//        System.out.println(obj2.name); // due to private keyword we are unable to access name variable
        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
    }

}

class Alien{
    private String name="shiva";
   int age=14;

    public Alien()
   {
       System.out.println("Constructor");

   }

    void getsetter(String nam)
    {
        name=nam;
    }

    String getName()
    {
        return name;
    }

    int getAge()
    {
        return age;
    }

}
