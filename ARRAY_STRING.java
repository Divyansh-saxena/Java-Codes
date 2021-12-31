import java.util.*;
class ARRAY_STRING
{
    public static void main()
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter five words:");
        String a[]=new String[6];
        int i,o,j=0;
        for(i=1;i<=5;i++)
        {
            a[i]=n.nextLine();
            a[i]=a[i].toLowerCase();
        }

        //for(i=0;i<5;i++)
        //{
        //  System.out.println(a[i]);
        //}

        for(o=1;o<10;o++)
        {
            
            for(i=1;i<5;i++)
            {
                j=0;
                char p=a[i].charAt(j);
                char q=a[i+1].charAt(j);

                if (p>q)
                {
                    String c=a[i+1];
                    a[i+1]=a[i];
                    a[i]=c;
                    break;
                }

                if (p==q)
                {
                    do
                    {
                        j=j+1;
                        p=a[i].charAt(j);
                        q=a[i+1].charAt(j);
                        if (p>q)
                        {
                            String c=a[j];
                            a[j]=a[i];
                            a[i]=c;
                            break;
                        }
                        q=a[i].charAt(j+1);
                        p=a[i].charAt(j);
                    }while(p>q);
                }
            }
        }
        for(i=1;i<6;i++)
        {
            System.out.println(a[i]);
        }
    }
}
