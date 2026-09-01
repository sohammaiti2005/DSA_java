public class inveroarr {
    public static int invertedRoted(int nums[],int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i+1]-nums[i]<0){
                int start=0,end=i;
                while (start<end) {
                    int mid=(start+end)/2;
                    if(nums[mid]==target){
                        return mid;
                    }
                    else if(nums[mid]<target){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                    
                }
            }
                int start=i+1,end=nums.length-1;
                while (start<end) {
                    int mid=(start+end)/2;
                    if(nums[mid]==target){
                        return mid;
                    }
                    else if(nums[mid]<target){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                    
                }
            }
            return -1;
        }
    
    public static void main(String[] args) {
        int nums[]={4,5,6,6,0,1,2};
        int target=0;
       System.out.println(invertedRoted(nums, target)); 
    }
    
}
