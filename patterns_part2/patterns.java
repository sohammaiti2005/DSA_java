public class patterns {
    public static void HelloRec(int NR,int NC){
        for(int r=1;r<=NR;r++){
            for(int c=1;c<=NC;c++){
                if(r==1||r==NR||c==1||c==NC){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inveroHapyra(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inver(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if(r+c<=n+1){
                    System.out.print(c+" ");
                }
            }
            System.out.println();
        }
    }
    public static void floydtri(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            // for(int j=1;j<=i;j++){
            //     System.out.print(num);
            //     num++;
            // }
            for(int j=1;j<=n;j++){
                if(i>=j){
                    System.out.print(num+" ");
                    num++;
                }
                
            }
            System.out.println();
        }
    }
    public static void tri(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i-j)>=0 && (i-j)%2==0){
                    System.out.print(1+" ");
                }
                if((i-j)>=0 && (i-j)%2==1){
                    System.out.print(0+" ");
                }

                }
                System.out.println();
            }
        }
        public static void butterfly(int n){
            //first half
            for(int i=1;i<=n;i++){
                // star print
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                //space
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");

                }
                //star
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
        
            }
            //second half
            for(int i=n;i>=1;i--){
                // star print
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                //space
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");

                }
                //star
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
        
            }

            
        }

    
    public static void main(String args[]){
        // HelloRec(4,5);
        // inver(4);
        // floydtri(5);
        // tri(5);
        butterfly(4);

    }
    
}
