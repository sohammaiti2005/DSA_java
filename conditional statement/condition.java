
import java.util.Scanner;


// //         // int age = 22;
// //         // if(age>=18){
// //         //     System.out.println("adult : vote,drive");
            
// //         // }
// //         // else{
// //         //         System.out.println("Not adult");
// //         //     }
// //         // int a =2,b=5;
// //         // if (a>=b){
// //         //     System.out.println("a is greater");
// //         // } else{
// //         //     System.out.println("b is greater");
// //         // }
// //         Scanner sc = new Scanner(System.in);
// //         // int number= sc.nextInt();
// //         // if(number%2==0){
// //         //     System.out.println("even");
// //         // }else{
// //         //     System.out.println("odd");
// //         // }
// //         int income=sc.nextInt();
// //         int tax;
// //         if(income<500000){
// //             System.out.println("tax is 0");
// //         }else if(income>=500000 && income<1000000){
// //             System.out.println("tax is "+(int)(income*0.2));
// //         }else{
// //             System.out.println("tax is "+(int)(income*0.3));

// //         }
// //     }
// // }
// public class condition {
//     public static void main(String args[]){
//         int num = 5;
//         // using ternary operator
//         String type=((num%2)==0)?"even":"odd";
//         System.out.println(type);
//     }
// }
public class condition {
    public static void main(String[] args) {
        // System.out.print("Enter Your Marks : ");
        // Scanner sc=new Scanner(System.in);
        // int marks=sc.nextInt();
        // String result=(marks>=33)?"Pass":"Fail";
        // System.out.println("Result : "+result);
        // 
        // Scanner sc= new Scanner(System.in);
        // System.out.print("Enter a : ");
        // int a =sc.nextInt();
        // System.out.print("Enter b : ");
        // int b = sc.nextInt();
        // System.out.print("Enter operator : ");
        // char ope = sc.next().charAt(0);
        // switch(ope){
        //     case '+': System.out.println("REsult : "+(a+b));
        //         break;
        //     case '-' : System.out.println("REsult : "+(a-b));
        //          break;

        //     case '*' : System.out.println("REsult : "+(a*b));
        //           break;
        //     case '/' : System.out.println("REsult : "+(a/b));
        //           break;
        //     case '%' : System.out.println("REsult : "+(a%b));
        //         break;
        //     default : System.out.println("Wrong Operator");    


        // }
        // double temp = 103.5;
        // String fever=(temp>100)?"Fever":"Normal";
        // System.out.println(fever);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        // switch(num){
        //     case 1 : System.out.println("sunday");
        //     break;
        //     case 2 : System.out.println("monday");
        //     break;
        //     case 3 : System.out.println("tue");
        //     break;
        //     case 4 : System.out.println("wed");
        //     break;
        //     case 5 : System.out.println("thu");
        //     break;
        //     case 6 : System.out.println("Fri");
        //     break;
        //     case 7 : System.out.println("sat");
        //     break;
        //     default : System.out.println("lol");  
        // }
        if((((num%4)==0)&&(num%100 !=0))||((num%400)==0)){
            System.out.println("the year is leap year");
        }else{
            System.out.println("not leap year");
        }

    

    }
}