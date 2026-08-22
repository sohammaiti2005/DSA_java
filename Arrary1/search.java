import java.util.Scanner;

public class search {
    public static int linersearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }

        }
        return -1;

    }
    public static int largest(int numbers[]){
        int large= Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>large){
                large=numbers[i];
            }
            if(small>numbers[i]){
                small=numbers[i];
                System.out.println("smallest value is : "+small);
            }


        }
        return large;
    }
    public static int kk(String alpha[],String target){
        
    }

    public static void main (String args[]){
        int numbers[]={2,4,6,3,5};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a key : ");
        int key=sc.nextInt();
        int index= linersearch(numbers, key);
        if(index==-1){
            System.out.print("THe number is not found ");
        }else{
            System.out.print("The number is at index : "+index);
        }
        System.out.println();
        int number=largest(numbers);
        System.out.print("The largest in the list is : "+number);
        String alpha[]={"apple","banana","mango"};
        String target="banana";
    }
    
}
