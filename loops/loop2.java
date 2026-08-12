
import java.util.*;







public class loop2 {
    public static void main(String args[]){
        // Scanner  sc=new Scanner(System.in);
        // System.out.println("Enter num : ");
        // int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     System.out.println("Hello World");    
        // }
        // for(int line=1;line<=4;line++){
        //     System.out.println("****");
        // }
        // int n=10899;
        // int rev=0;
        // while(n>0){
        //     // int lastDigit=n%10;
        //     // System.out.print(lastDigit + " ");
        //     // n=n/10;//n/=10
        //     int lastdigit=n%10;
        //     rev=(rev*10)+lastdigit;
        //     n/=10;

        // }
        // System.out.println(rev);
        Scanner sc=new Scanner(System.in);
         System.out.print("enter a num :");
              int n = sc.nextInt();
             
              if(n==2){
                 System.out.print("the num is prime");
              }else{
                 boolean isprime=true;
              for(int i =2;i<=Math.sqrt(n);i++){
                 if(n%i==0){
                     isprime=false;
                 }
             }
            
             if(isprime==true){
                     System.out.println("the num is prime");
                 }else{
                     System.out.println("the num is not prime");
                 }

             
             }
        // do { 
            // System.out.print("enter a num :");
            //  int i = sc.nextInt();
        //      if(i%10==0){
        //         continue;
        //      }
        //      System.out.println(i);
        //  } while (true);
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number");
        // int n=sc.nextInt();
        // boolean isprime=true;
        // for(int i=2;i<=Math.sqrt(n);i++){
        //     if(n%i==0){
        //         isprime=false;
        //     }
        // }
        // if(isprime==)
    }
    
}
