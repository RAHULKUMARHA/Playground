import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
      int number=in.nextInt();
      int fd = number/100;
     int sd = (number/10)%10;
      int td = number%10;
      int sum = (td*100)+(sd*10)+(fd*1);
      System.out.println(sum);
  }
}