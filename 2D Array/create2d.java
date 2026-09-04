import java.util.*;
public class create2d {
    public static void maxmin(int matrix[][]){
        int MAX=Integer.MIN_VALUE;
        int MIN=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                MAX=Math.max(MAX,matrix[i][j]);
                MIN=Math.min(MIN,matrix[i][j]);
            }
        }
        System.out.println("max number is :"+MAX);
        System.out.println("MIN NUMBER IS :"+MIN);
    }
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Found the element at index: ("+i+","+j+")");
                    return true;
                }

            }
        }
        System.out.println("Element not found");
        return false;
    }
    public static void main(String args[]){

        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of the metrix : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] =sc.nextInt();
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 0);
        maxmin(matrix);
    }
    
}
