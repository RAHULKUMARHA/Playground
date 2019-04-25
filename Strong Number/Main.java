import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int last_digit,fact,i;
      int temp=num;
        int sum=0;
      while(num>0)
      {
        last_digit=num%10;
        fact=1;
        for(i=1;i<=last_digit;i++)
        {
          fact=fact*i;
        }
       sum= sum+fact;
        num=num/10;
      }
      if(temp==sum)
        System.out.println("Yes");
       else
        System.out.println("No");
      
      
	}
}