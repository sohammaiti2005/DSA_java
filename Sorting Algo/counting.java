public class counting{
    public static void count(int arr[]){
        int MAX=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            MAX=Math.max(MAX,arr[i]);
        }
        int freq[]=new int[MAX+1];
        for(int  i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                arr[j]=i;
                j++;
                freq[i]--;
            }
        }
    } 
    public static void main(String args[]){
        int arr[]={7,6};
        count(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    
}
