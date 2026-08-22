public class pair {
    public static void pairs(int numbers[]) {
        int TP=0;
        for(int i=0;i<numbers.length;i++){
            int first=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+first+","+numbers[j]+")");
                TP++;

            }
            System.out.println();
        }
        System.out.println();
        System.out.print("total pair"+TP);
    }
    public static void subarr(int numbers[]){
        int MAX=Integer.MIN_VALUE;
        int MIN=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            // System.out.print(numbers[i]);
            // System.out.print("  ");
            for(int j=i;j<numbers.length;j++){
                int total=0;
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]);
                    total=total+numbers[k];
                }
                System.out.println();
                 System.out.println("Total ="+total);
                 System.out.println();
                 if(MAX<total){
                    MAX=total;
                 }
                 if(MIN>total){
                    MIN=total;
                 }
                // return total;
            }
            System.out.println();
        }
        System.out.println("mx total = "+MAX);
        System.out.println("mn total = "+MIN);
    }
    
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        // pairs(numbers);
        subarr(numbers);

    }
    
}
