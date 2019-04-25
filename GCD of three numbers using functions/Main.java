import java.util.Scanner;
class Main{
  
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(gcd_3no(n1,n2,n3));
    }
 public static int  gcd_3no(int n1,int n2,int n3)
  {
   int temp;
   int gcd;
    if(n1<n2&&n1<n3)
    {
      temp=n1;
    }
   else if(n2<n1&&n2<n3)
   {
     temp=n2;
   }
   else
   {
     temp = n3;
   }
 
  while(temp>=1)
  {
    if((n1%temp==0)&&(n2%temp==0))
    {
      gcd=temp;
      break;
    }
    temp--;
  }
   return temp;
	}
}