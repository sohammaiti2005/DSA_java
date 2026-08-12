
import java.util.Scanner;

public class method {
    public static void printhello(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static void calculate(){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=a+b;
        System.err.println(sum);
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
         System.out.println(a);
    System.out.println(b);
    }
    public static int multiply(int a, int b){
        int multi=a*b;
        return multi;
    }
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bincoff(int n ,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);
        int bc=n_fact/(r_fact*nmr_fact);
        return bc;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static float sum (float a,float b){
        return a+b;
    }
    // public static boolean isprime(int n){
    //     boolean isprime=true;
    //     //  if(n==2){
    //     //     isprime=true;
    //     // }else{
    //     //     for(int i=2;i<=n-1;i++){
    //     //         if(n%i==0){
    //     //             isprime=false;
    //     //         }
     
    //     // }
    // // }
    //  for(int i=2;i<=n-1;i++){
    //      if(n%i==0){
    //          isprime=false;
    //          break;
    //      }
    //  }
    //     return isprime;
    // }
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
             if(n%i==0){
                return false;
            }
        }
           
            return true;
    }
    public static void primes(int n){
        for(int i=2;i<=n;i++){
            isprime(i);
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }


    public static void main(String args[]){
    // int a =3;
    // int b =5;
    //  int prod=multiply(a,b);
    // System.out.println(prod);
    // int mul=multiply(10,15);
    // System.out.println(mul);
    // int fact=factorial(5);
    // System.out.println(fact);
    // int bico=bincoff(5,3);
    // System.out.println(bico);
    // System.out.println(sum(3,5,7));
    // System.out.println(sum(3,5));
    // System.out.println(sum(2.3f,3.5f));
    primes(20);
    
   

    }
    
}
