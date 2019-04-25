import java.util.Scanner;
class Main {
	public static void main (String[] args) {
   Scanner in = new Scanner(System.in);
      int number=in.nextInt();
     int second=number%100;
      int sd = second/10;
      System.out.println(sd);
	
	}
}