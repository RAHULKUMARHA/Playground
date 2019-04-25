import java.util.Scanner;
class Main{
  
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(greatest_of_3no(n1,n2,n3));
    }
 public static int  greatest_of_3no(int n1,int n2,int n3)
  {
   int temp;
    if(n1>n2&&n1>n3)
    {
      temp=n1;
    }
   else if(n2>n1&&n2>n3)
   {
     temp=n2;
   }
   else
   {
     temp = n3;
   }
 
  return temp;
}
}