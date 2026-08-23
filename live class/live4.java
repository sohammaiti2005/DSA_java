import java.util.*;

public class live4 {
    public static boolean isp(int num){
        int org=num;
        int rev=0;
        while(num>0){
        int last=num%10;
        rev=rev*10+last;
        num/=10;
        }
         if(org==rev){
            return true;
        }
        return false;
      }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        System.out.println(isp(num));
        
    }
}

