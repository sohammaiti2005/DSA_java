import java.util.*;
public class solution {
    public static void printA(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        
    }
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int maxpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[maxpos]<arr[j]){
                    maxpos=j;
                }
             
            }
            int temp=arr[maxpos];
            arr[maxpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void counting(int arr[]){
        int MAX=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            MAX=Math.max(MAX,arr[i]);
        }
        int count[]=new int[MAX+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        Integer arr[]={3,6,2,1,8,7,4,5,3,1};
        // bubble(arr);
        // selection(arr);
        // insertion(arr);
        // counting(arr);
        // Arrays.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        printA(arr);
    }
    
}
