import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
       int number = in.nextInt();
      if(number>0 && number<5)
      {
        if(number==1)
        System.out.println("One");
        else if(number==2)
        System.out.println("Two");
        else if(number==3)
        System.out.println("Three");
        else if(number==4)
        System.out.println("Four");
        else if(number==5)
        System.out.println("Five");
      }
      else
        System.out.println("Invalid");
	}
}