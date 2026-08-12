/*Question 1 :Write a Java method to compute the averageof three numbers.. */
import java.util.Scanner;

public class functionsolution {
    public static double average(double a,double b, double c){
        double avg=(a+b+c)/3;
        return avg;
    }
    /*WriteamethodnamedisEventhatacceptsanintargument.
    Themethodshouldreturntrueiftheargumentiseven
    ,orfalseotherwise.Alsowriteaprogramtotestyourmethod. */
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{ 
            return false;
        }
        
    }
    public static void test(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the num : ");
            int num=sc.nextInt();
            System.out.println("The num is : "+isEven(num));
        }
     /*Question 5 :Write a Java method to compute the sum of the digits in an integer. */
     public static int issum(int n){
        int sum=0;
        while(n>0){
            int last=n%10;
            sum+=last;
            n/=10;
        }
        return sum;
        
     }   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num : ");
        double a =sc.nextDouble();
        System.out.print("Enter first num : ");
        double b =sc.nextDouble();
        System.out.print("Enter first num : ");
        double c =sc.nextDouble();
        System.out.println("the average of 3 numbers is : "+ average(a,b,c));
        test();
        System.out.print("enter the digit : ");
        int n =sc.nextInt();
        System.out.println("The sum of the digit is : "+issum(n));
        

    }
    
}
