

public class diagonalsum {
    public static int diagosum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            sum+=matrix[i][matrix.length-1-i];
        }
        if(matrix.length%2!=0){
            sum-=matrix[matrix.length/2][matrix.length/2];
        } 
         return sum;
    }
    public static void main(String args[]){
         int matrix[][]={{1,2,3},
                         {5,6,7},
                         {9,10,11}
                        //  
                        };
        System.out.print(diagosum(matrix));                 
    }
    
}
