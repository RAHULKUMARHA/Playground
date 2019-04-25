import java.util.Scanner;
class Main
{
  public static int multiply(int m)
   {
  int multi=0;
    if(m!=0)
    {
      multi=m*m;
    }
      return multi;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
    int sum=multiply(n);
     System.out.println(sum); //result printed here
   }
}