
// import java.util.Scanner;

// public class live3 {
//     public static boolean palindrom(int n){
//         int revnum=0;
//         int num=n;
//         while(n>0){
//             int rem=n%10;
//             revnum=revnum*10+rem;
//             n/=10;
//         }
//         return (num==revnum);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n =sc.nextInt();
//         if(palindrom(n)){
//             System.out.println("The number is palindrom");
//         }else{
//             System.out.println("Ops its not a palindrom number");
//         }
        
//     }
    
// }
import java.util.Scanner;
public class live3{
    public static void main(String args[]) {
    System.out.println("Please Enter a number :");
    Scanner sc=new Scanner(System.in);
    int palindrome=sc.nextInt();
    if(isPalindrome(palindrome)) {
        System.out.println("Number : "+palindrome+" is a palindrome");
    }else{System.out.println("Number : "+palindrome+" is not a palindrome");

    }
}
public static boolean isPalindrome(int number){
    int palindrome=number;// copied number intovariable
    int reverse=0;
while(palindrome!=0) {
    int remainder=palindrome%10;
    reverse=reverse*10+remainder;
    palindrome=palindrome/10;
}
if(number==reverse) {
    return true;
} return false; 
}
}