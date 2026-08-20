import java.util.Scanner;

public class binary {
    public static int binary(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
        int mid=(start+end)/2;
        if(numbers[mid]==key){
            return mid;
        }
         if(numbers[mid]<key){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
    return -1;

    }
    public static void main(String args[]){
        int numbers[]={2,4,5,8,10,12,14};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the key : ");
        int key=sc.nextInt();
        if(binary(numbers, key)==-1){
            System.out.print("Not found");

        }else{
            System.out.print("Number is at index : "+binary(numbers, key));
        }

    }

    
}
