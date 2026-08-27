public class TrappingRainWater {
    public static void water(int height[]){
        int totalTP=0;
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            if(leftmax[i-1]>=height[i]){
                leftmax[i]=leftmax[i-1];
            }else{
                leftmax[i]=height[i];
            }
        }
        // for(int i=0;i<hight.length;i++){
        //     System.out.print(leftmax[i]);
        // }
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            if(rightmax[i+1]>=height[i]){
                rightmax[i]=rightmax[i+1];
            }else{
                rightmax[i]=height[i];

            }
        }
        // for(int i=0;i<hight.length;i++){
        //      System.out.print(rightmax[i]);
        // }
        for(int i=0;i<height.length;i++){
            int trappwater=Math.min(leftmax[i],rightmax[i])-height[i];
            totalTP+=trappwater;
        }
        System.out.println("Total Trapping Rain Water = "+totalTP);
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        water(height);
    }
    
}
