import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int number=in.nextInt();
      int fd = number/10;
      int ld = number%10;
      int sum = fd+ld;
      System.out.println(sum);

   
	}
}