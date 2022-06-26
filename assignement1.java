//For TELUSKO Patten
class muskan
{
    public static void main(String args[])
    {int i,j;
        for(i=1;i<=7;i++)
        {if(i==1)
        {for(j=1;j<=7;j++)

            System.out.print("* ");}
        else
        {for(j=1;j<=3;j++)
            System.out.print("  ");
            if(j==4)
                System.out.print("*");
        }

            System.out.print(" ");

            if(i==1||i==4||i==7)
                if(i==4||i==7)
                { for(j=1;j<=7;j++)
                    System.out.print(" ");
                    for(j=1;j<=7;j++)
                        System.out.print("* ");}
                else
                {for(j=1;j<=7;j++)
                    System.out.print("* ");
                }
            else
            {
                System.out.print("       "+"*");
            }


            System.out.print(" ");
            if(i==7)
            {
                for(j=1;j<=7;j++)
                    System.out.print("* ");
            }

            else
            {
                if(i!=1&&i!=4)
                {System.out.print(" ");
                    for(j=1;j<=12;j++)
                        System.out.print(" ");
                    System.out.print("*");
                }
                else
                {

                    System.out.print("* ");
                }
            }
            System.out.print(" ");
            if(i!=7)
            { for(j=1;j<=12;j++)
                System.out.print(" ");
                if(i!=1&&i!=4)
                    System.out.print(" ");
                System.out.print("*");

                for(j=1;j<=11;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else
            {
                for(j=1;j<=7;j++)
                    if(j!=7)
                        System.out.print("* ");
                    else
                        System.out.print("*");
            }

            System.out.print("  ");

            if(i==1||i==4||i==7)
                for(j=1;j<=7;j++)
                    if(j!=7)
                        System.out.print("* ");
                    else
                    {
                        System.out.print("*");
                    }
            else if(i==2||i==3)
                System.out.print("*");
            else
            {
                for(j=1;j<=12;j++)
                    System.out.print(" ");
                System.out.print("*");
            }

            System.out.print("  ");

            if(i<=4) {
                if(i==1||i==4)
                {System.out.print("*");
                    for (j = 1; j <= 7 - 2 * i; j++)
                        System.out.print(" ");
                    System.out.print("*");}
                else
                { for(j=1;j<=12;j++)
                    System.out.print(" ");
                    System.out.print("*");
                    for (j = 1; j <= 7 - 2 * i; j++)
                        System.out.print(" ");
                    System.out.print("*");
                }
            }
            else
            {System.out.print("*");
                for (j = 1; j <= 2 * (i - 1) - 7; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.print("  ");
            if(i==1||i==7)
                for(j=1;j<=7;j++)
                    System.out.print("* ");
            else
            {
                if(i==2||i==3||i==4)
                { for(j=1;j<=2*(i-1);j++)
                { if(i!=4)
                    System.out.print(" ");
                else
                {
                    if(j!=6)
                        System.out.print(" ");
                }
                }
                    System.out.print("*");
                    for(j=1;j<12;j++)
                        System.out.print(" ");
                    System.out.print("*");
                }
                else
                {
                    for(j=1;j<=14-2*i;j++)
                        System.out.print(" ");
                    System.out.print("*");
                    for(j=1;j<12;j++)
                        System.out.print(" ");
                    System.out.print("*");

                }

            }
            System.out.println();

        }
    }
}


//For INEURON Pattern

class garg
{
    public static void main(String args[])
    {
        int i, j;
        for(i=1;i<=7;i++)
        {if(i==1||i==7)
            for(j=1;j<=7;j++)
            {
                if (j != 7)
                    System.out.print("* ");
                else
                    System.out.print("*");
            }
        else
        {
            for(j=1;j<=6;j++)
                System.out.print(" ");
            System.out.print("*");
        }
            System.out.print("  ");
            if(i==1||i==7)
            {
                System.out.print("*");
                for (j = 1; j <= 11; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            else
            {
                for (j = 1; j <= 6; j++)
                    System.out.print(" ");
                System.out.print("*");
                for (j = 1; j <= 2 * (i - 1) - 1; j++)
                    System.out.print(" ");
                System.out.print("*");
                for(j=11-2*(i-1);j>=1;j--)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.print("  ");
            if(i==1||i==4||i==7)
                for(j=1;j<=7;j++)
                    if(j!=7)
                        System.out.print("* ");
                    else
                        System.out.print("*");
            else
                System.out.print("*");
            System.out.print("  ");

            if(i!=7) {
                if (i == 1 || i == 4)
                {

                    System.out.print("*");
                    for (j = 1; j <= 11; j++) {
                        System.out.print(" ");
                    }

                    System.out.print("*");
                }


                else{
                    for (j = 1; j <= 12; j++)
                        System.out.print(" ");
                    System.out.print("*");
                    for (j = 1; j <= 11; j++) {
                        System.out.print(" ");
                    }

                    System.out.print("*");
                }
            }
            else
            {
                for(j=1;j<=7;j++)
                    if(j!=7)
                        System.out.print("* ");
                    else
                        System.out.print("*");
            }

            System.out.print("  ");
            if(i==1||i==4)
                for(j=1;j<=4;j++)

                    if(j!=4)
                        System.out.print("* ");
                    else
                        System.out.print("*  ");

            else if(i==2||i==3)
            {
                System.out.print("*");
                for (j = 1; j <= 7; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            else
            {
                System.out.print("*");
                for(j=1;j<=2*i-9;j++)
                    System.out.print(" ");
                System.out.print("*");
                for(j=2*i-7;j<=8;j++)
                    System.out.print(" ");

            }
            System.out.print("  ");
            if(i==1||i==7)
                for(j=1;j<=7;j++)
                    if(j!=7)
                        System.out.print("* ");
                    else
                        System.out.print("*");
            else
            {
                System.out.print("*");
                for(j=1;j<=11;j++)
                    System.out.print(" ");
                System.out.print("*");
            }

            System.out.print("  ");
            if(i==1||i==7)
            {
                System.out.print("*");
                for (j = 1; j <= 11; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            else
            {

                System.out.print("*");
                for (j = 1; j <= 2 * (i - 1) - 1; j++)
                    System.out.print(" ");
                System.out.print("*");
                for(j=11-2*(i-1);j>=1;j--)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}