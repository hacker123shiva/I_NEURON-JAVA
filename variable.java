class Alien{

    public static void main(String args[]){
    int a=5;
    char ch='a';
    boolean check =true;
    float b=4.5f;
    double c=4.5;
    byte d=3;
    long e=300000000000000l;
    short f=345;

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(ch);
System.out.println(check);

System.out.println("int size is: "+a.SIZE/8);
System.out.println("float size is: "+b.SIZE/8);
System.out.println("double size is: "+c.SIZE/8);
System.out.println("byte size is: "+d.SIZE/8);
System.out.println("long size is: "+e.SIZE/8);
System.out.println("short size is: "+f.SIZE/8);
System.out.println("char size is: "+ch.SIZE/8);
System.out.println("boolean size is: "+check.SIZE/8);

/*System.out.println("int size is: "+4.SIZE/8);
System.out.println("float size is: "+3.4f.SIZE/8);
System.out.println("double size is: "+3.4.SIZE/8);
System.out.println("byte size is: "+1.SIZE/8);
System.out.println("long size is: "+3000000000000000.SIZE/8);
System.out.println("short size is: "+5.SIZE/8);
System.out.println("char size is: "+'a'.SIZE/8);
System.out.println("boolean size is: "+true.SIZE/8);*/
    }

}