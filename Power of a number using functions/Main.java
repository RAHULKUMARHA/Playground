import java.util.Scanner;
class Main{
  public static int power(int base,int exp)
  {
    if(exp!=0)
    {
      return(base*power(base,exp-1));
             }
    else
      return 1;
            
  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int base=in.nextInt();
    int exp = in.nextInt();
    System.out.println(power(base,exp));
  }
}
             