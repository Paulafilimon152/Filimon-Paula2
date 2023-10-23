public class Laborator4 {
    public static void main(String[] args)
    {
        problema1();
        problema2();
        problema3();
        problema4();
    }

    private static void problema1() {
        String[] array1={"scoala","copil","caine"};
        String[] array2={"caine","pisica","ecran"};
        System.out.println("elemente identice sunt:");
        for(String element: array1) {
            for (String element2 : array2) {
                if (element.equals(element2)) {
                    System.out.println(element + " ");
                }
            }
        }


    }
    private static void problema2(){
        int [] array={1,5,7,10};
                int a=0;
        for(int j:array)
        {   a=0;
            for(int i=2;i<=j/2;i++)
            {
                if(j%i==0);
                    a=a+1;
            }
            if(a==0) {
                System.out.println(j + " ");
            }
        }

    }
    private static void problema3()
    {
        int s=0;
        int i=0;
        int n=15;
        int j=1;
        while(s<=n)
        {
            System.out.println(s + " ");
            s=i+j;
            i=j;
            j=s;
        }
    }
    private static void problema4()
    {
      int n=252;
      int n2=n;
      int s=0;
      int r=0;
      while(n2!=0)
      {
          r=n2%10;
          n2=n2/10;
          s=s*10+r;
      }
      if(s==n)
          System.out.println("palindrom");

    }
}


