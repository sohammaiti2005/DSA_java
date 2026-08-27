public class maxsum {
    public static void MaxSubArraySum(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        // calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                
                // tp=0;
                // for(int k=i;k<=j;k++){
                //     int num=arr[k];
                    // System.out.print(num+" ");
                    
                }
                
                System.out.println();
                // System.out.println("total : "+tp);
                if(currsum>maxsum){
                    maxsum=currsum;
                }
                
            }
            System.out.println("Maximum subarray sum : "+maxsum);
        
    }
    public static void kadanes(int numbers[]){
        int cs=0,ms=0;
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("max sum = "+ms);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        // MaxSubArraySum(arr);
        kadanes(numbers);

    }
    
}
